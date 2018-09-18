/*
 /*THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 /*IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 /*FITNESS FOR A PARTICULAR PURPOSE AND NON-INFRINGEMENT. IN NO EVENT SHALL THE
 /*AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 /*LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 /*OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 /*THE SOFTWARE.
 /*
 /*@author SIR HUGGINS
 /* 
 /*Copyright (c) 2000, OCTOPUS Incorporation
 /*All rights reserved.
 /*
 /* 
 /*You should have received a copy of the GNU Lesser General Public
 /*License along with this library; if not, email to the Free Software
 /*Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 /*OR to Solution Systems Pvt Ltd, 56 Milton Park, Harare
 /*Email: mafiguhuggins@gmail.com
 /*Cell: +263782326160
 /* 
 /*THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 /*AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 /*IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 /*ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
 /*LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 /*CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 /*SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 /*INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 /*CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 /*ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 /*POSSIBILITY OF SUCH DAMAGE.
 */
package octopushr.employees;

import java.net.URL;
//<<<<<<< HEAD
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import octopushr.Connexion;
import octopushr.Functions;
//import static org.apache.commons.lang3.text.WordUtils.capitalizeFully;
//=======
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
//////>>>>>>> f5c7a74c0fba43c1a593f4c9fd5c119e38b274d5

/**
 * FXML Controller class
 *
 * @author Support
 */
public class DesignationController implements Initializable {

    /**
     * Initializes the controller class.
     *
     */
//<<<<<<< HEAD
    @FXML
    TextField txtDesignationId;
    
    @FXML
    TextField txtDesignation;
     
    @FXML
    TextArea txtDesignationdescription;
    
    Connection connection;
    Connexion connexion = new Connexion();
    Functions functions = new Functions();
    
    Statement st;
    PreparedStatement ps;
    ResultSet rs;
    NewEmployeeController newEmployeeController = new NewEmployeeController();
    Alert alert;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            // TODO
            txtDesignationId.setEditable(false);
            txtDesignationId.setText("DG00"+Integer.toString(functions.getLastId("id","tbldesignation")));
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(DesignationController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @FXML
    public void addDesignation() throws SQLException, ClassNotFoundException{
        
        if(txtDesignation.getText().isEmpty()){
           functions.alertSuccessful(alert, "Designation cannot be empty");
            return;
        }
        connection = connexion.getConnetion();
        ps = connection.prepareStatement("INSERT INTO `tbldesignation`(`id`, `designationid`, `designation`, `notes`) "+
                                         "VALUES (?,?,?,?)");
        ps.setString(1, null);
        ps.setString(2, txtDesignationId.getText().toUpperCase());
        ps.setString(3, txtDesignation.getText().toUpperCase());
        ps.setString(4, txtDesignationdescription.getText().toUpperCase());
        ps.execute();
        
        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setTitle("Confirmation");
        alert.setHeaderText(null);
        alert.setContentText(txtDesignation.getText()+" added");
        //alert.showAndWait();
        Optional<ButtonType> result = alert.showAndWait();
        if(result.get() == ButtonType.OK){
            txtDesignationId.clear();
            txtDesignationId.setText("DG00"+Integer.toString(functions.getLastId("id","tbldesignation")));
            txtDesignation.clear();
            txtDesignationdescription.clear();
        }
    }
    
    @FXML
    public void loadDesignation() throws SQLException, ClassNotFoundException{
            connection = connexion.getConnetion();
            st = connection.createStatement();
            rs = st.executeQuery("SELECT `id`, `departmentid`,`departmentname` FROM `tbldepartments` ORDER BY `id`");
            newEmployeeController.cmbselectDepartment.getItems().removeAll(newEmployeeController.cmbselectDepartment.getItems());
            while(rs.next()) {
               newEmployeeController.cmbselectDepartment.getItems().addAll(rs.getString("departmentname"));
            }
            st.close();
            rs.close();
    }
    
    @FXML
    public void closeThisStage(Event event){
       // newEmployeeController.loadDesignationAndDepartment();
        functions.closeWindow(event);
      
    }
//=======

//////>>>>>>> f5c7a74c0fba43c1a593f4c9fd5c119e38b274d5
}
