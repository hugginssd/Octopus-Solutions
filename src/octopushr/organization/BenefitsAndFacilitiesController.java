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
package octopushr.organization;

import java.net.URL;
//<<<<<<< HEAD
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import octopushr.Connexion;
import octopushr.Functions;
//=======
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
//>>>>>>> f5c7a74c0fba43c1a593f4c9fd5c119e38b274d5

/**
 * FXML Controller class
 *
 * @author Support
 */
public class BenefitsAndFacilitiesController implements Initializable {

    /**
     * Initializes the controller class.
     */
//<<<<<<< HEAD
    @FXML
    private TextField txtFacility;

    @FXML
    private Label lblFacilityid;

    @FXML
    private TextArea txtDescription;

    @FXML
    private Button btnEdit;

    @FXML
    private TableView<BenefitsConstructor> tblFacility;

    @FXML
    private TableColumn<BenefitsConstructor, String> colSno;

    @FXML
    private TableColumn<BenefitsConstructor, String> colFacility;

    @FXML
    private TableColumn<BenefitsConstructor, String> colDescription;

    @FXML
    private TableColumn<BenefitsConstructor, String> colId;

    @FXML
    private ObservableList<BenefitsConstructor> data;

    Functions functions = new Functions();
    Connexion connexion = new Connexion();
    Connection connection;
    Alert alert;
    Statement st;
    ResultSet rs;
    PreparedStatement pst;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO

        try {
            btnEdit.setVisible(false);
            lblFacilityid.setText("BF0" + Integer.toString(functions.getLastId("id", "tblbenefitsandfacilities")));
            setTableView();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(BenefitsAndFacilitiesController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    public void setTableView() throws SQLException, ClassNotFoundException {
        colId.setCellValueFactory(new PropertyValueFactory("id"));
        colSno.setCellValueFactory(new PropertyValueFactory("facilityid"));
        colFacility.setCellValueFactory(new PropertyValueFactory("facilities"));
        colDescription.setCellValueFactory(new PropertyValueFactory("description"));
        tblFacility.setItems(null);
        data = FXCollections.observableArrayList();
        connection = connexion.getConnetion();
        pst = connection.prepareStatement("SELECT * FROM `tblbenefitsandfacilities` WHERE `deleted`=?");
        pst.setInt(1, 0);
        rs = pst.executeQuery();
        while (rs.next()) {
            data.addAll(new BenefitsConstructor(rs.getInt("id"), rs.getString("faciltyid"), rs.getString("facilities"), rs.getString("description")));
        }
        tblFacility.setItems(data);
    }

    @FXML
    public void addNewFacilities() throws SQLException, ClassNotFoundException {
        if (txtFacility.getText().isEmpty() || txtFacility.getText().length() < 3 || txtDescription.getText().isEmpty()) {
            functions.alertSuccessful(alert, "Facility details cannot be invalid");
        }
        connection = connexion.getConnetion();
        pst = connection.prepareStatement("INSERT INTO `tblbenefitsandfacilities`(`faciltyid`, `facilities`, `description`) VALUES (?,?,?)");
        pst.setString(1, lblFacilityid.getText().toUpperCase());
        pst.setString(2, txtFacility.getText().toUpperCase());
        pst.setString(3, txtDescription.getText().toUpperCase());
        pst.execute();
        functions.alertSuccessful(alert, "Successfuly added");
        setTableView();
        lblFacilityid.setText("BF0" + Integer.toString(functions.getLastId("id", "tblbenefitsandfacilities")));
        txtFacility.clear();
        txtDescription.clear();
    }

    @FXML
    public void updateFacilities() throws SQLException, ClassNotFoundException {
        if (lblFacilityid.getText().isEmpty() || txtFacility.getText().isEmpty() || txtFacility.getText().length() < 3) {
            functions.alertSuccessful(alert, "Facility id cannot be invalid");
        }
        connection = connexion.getConnetion();
        pst = connection.prepareStatement("UPDATE `tblbenefitsandfacilities` SET `facilities`=?,`description`=? WHERE `faciltyid`=?");
        pst.setString(1, txtFacility.getText().toUpperCase());
        pst.setString(2, txtDescription.getText().toUpperCase());
        pst.setString(3, lblFacilityid.getText().toUpperCase());
        pst.execute();
        functions.alertSuccessful(alert, "Successfully updated");
        setTableView();
        lblFacilityid.setText("BF0" + Integer.toString(functions.getLastId("id", "tblbenefitsandfacilities")));
        txtFacility.clear();
        txtDescription.clear();
    }

    @FXML
    public void deleteFacilities() throws SQLException, ClassNotFoundException {
        if (lblFacilityid.getText().isEmpty()) {
            functions.alertSuccessful(alert, "Facility id cannot be invalid");
        }
        connection = connexion.getConnetion();
        pst = connection.prepareStatement("UPDATE `tblbenefitsandfacilities` SET `deleted`=? WHERE `faciltyid`=?");
        pst.setInt(1, 1);
        pst.setString(2, lblFacilityid.getText().toUpperCase());
        pst.execute();
        functions.alertSuccessful(alert, "Successfully deleted");
        setTableView();
        lblFacilityid.setText("BF0" + Integer.toString(functions.getLastId("id", "tblbenefitsandfacilities")));
        txtFacility.clear();
        txtDescription.clear();
    }

    @FXML
    public void reset() throws SQLException, ClassNotFoundException {
        setTableView();
        lblFacilityid.setText("BF0" + Integer.toString(functions.getLastId("id", "tblbenefitsandfacilities")));
        txtFacility.clear();
        txtDescription.clear();
    }

    @FXML
    public void showInTextField() {
        BenefitsConstructor benefitsConstructor = tblFacility.getSelectionModel().getSelectedItem();
        if (benefitsConstructor == null) {
            functions.alertSuccessful(alert, "Nothing selected");
        } else {
            btnEdit.setVisible(true);
            lblFacilityid.setText(benefitsConstructor.getFacilityid().toUpperCase());
            txtFacility.setText(benefitsConstructor.getFacilities().toUpperCase());
            txtDescription.setText(benefitsConstructor.getDescription().toUpperCase());
        }
    }

    @FXML
    public void closeThisStage(Event event) {
        functions.closeWindow(event);
    }
//=======
  

//>>>>>>> f5c7a74c0fba43c1a593f4c9fd5c119e38b274d5
}
