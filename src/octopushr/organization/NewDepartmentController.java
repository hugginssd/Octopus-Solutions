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

//<<<<<<< HEAD
import java.net.URL;
import java.net.UnknownHostException;
import java.sql.Connection;
//>>>>>>> f5c7a74c0fba43c1a593f4c9fd5c119e38b274d5
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//<<<<<<< HEAD
import java.util.Optional;
//=======
//>>>>>>> f5c7a74c0fba43c1a593f4c9fd5c119e38b274d5
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.Event;
import javafx.fxml.FXML;
//<<<<<<< HEAD
import javafx.scene.control.ButtonType;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
//>>>>>>> f5c7a74c0fba43c1a593f4c9fd5c119e38b274d5
import javafx.stage.Stage;
import octopushr.Connexion;
import octopushr.Functions;

/**
 * FXML Controller class
 *
 * @author Support
 */
public class NewDepartmentController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    Button btnAddNew;

    @FXML
    Button btnEdit;

    @FXML
    Button btnDelete;

    @FXML
    Button btnAdd;

    @FXML
    Button btnCloseForm;

    @FXML
    TextField txtDepartment;

    @FXML
    TextField txtId;

    @FXML
    ListView<String> lstvDepartments;

    Stage stage;

    Connection connection;
    Statement statement;
    ResultSet rs;
//<<<<<<< HEAD
    PreparedStatement pst;

    Connexion connexion = new Connexion();
    Functions functions = new Functions();
    Alert alert;
//=======
    PreparedStatement ps;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            // TODO
//<<<<<<< HEAD
            btnEdit.setVisible(false);
            txtId.setText("DPT0" + Integer.toString(functions.getLastId("id", "tbldepartments")));
            txtId.setEditable(false);
            loadListView();
//=======
            txtId.setText(Integer.toString(functions.getRowCount("tbldepartment") + 1));
            txtId.setEditable(false);
            connection = connexion.getConnetion();
//>>>>>>> f5c7a74c0fba43c1a593f4c9fd5c119e38b274d5
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(NewDepartmentController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    public void addNewDepartment() throws SQLException, UnknownHostException, ClassNotFoundException {

        if (txtDepartment.getText().isEmpty()) {

//<<<<<<< HEAD
            alert = new Alert(AlertType.WARNING);
            alert.setTitle("Warning");
            alert.setHeaderText(null);
            alert.setContentText("Department name cannot be empty");
            alert.show();
        } else {
            //INSERT INTO `tbldepartments`(`id`, `departmentid`, `departmentname`) VALUES ([value-1],[value-2],[value-3])
            connection = connexion.getConnetion();
            pst = connection.prepareStatement("INSERT INTO `tbldepartments`(`departmentid`, `departmentname`) "
                    + "VALUES (?,?);");
            pst.setString(1, txtId.getText().toUpperCase());
            pst.setString(2, txtDepartment.getText().toUpperCase().trim());
            pst.execute();
            pst.clearParameters();

            lstvDepartments.getItems().addAll(txtId.getText() + "  " + txtDepartment.getText().toUpperCase());

            pst.close();
            alert = new Alert(AlertType.CONFIRMATION);
            alert.setTitle("Confirmation");
            alert.setContentText(txtId.getText().toUpperCase() + " " + txtDepartment.getText().toUpperCase() + " department added");
            //alert.show();

            Optional<ButtonType> result = alert.showAndWait();
            if (result.get() == ButtonType.OK) {
                txtId.setText(null);
                txtId.setText("DPT0" + Integer.toString(functions.getLastId("id", "tbldepartments")));
                txtDepartment.setText(null);
            }
        }

    }

    public void loadListView() throws SQLException, ClassNotFoundException {
        connection = connexion.getConnetion();
        pst = connection.prepareStatement("SELECT * FROM `tbldepartments`");
        rs = pst.executeQuery();
        lstvDepartments.getItems().clear();
        while (rs.next()) {
            lstvDepartments.getItems().addAll(rs.getString("departmentid").toUpperCase() + "  " + rs.getString("departmentname").toUpperCase());

        }
    }

    @FXML
    public void shoInReasearchField() {
        btnEdit.setVisible(true);
        String listViewSelected = lstvDepartments.getSelectionModel().getSelectedItem().toUpperCase();
        if (listViewSelected == null) {
            functions.alertSuccessful(alert, "Nothing selected");
        } else {

            String storeChar = "";
            for (int i = 0, n = listViewSelected.length(); i < n; i++) {
                String charAt = (String.valueOf(listViewSelected.charAt(i)));
                String replace = txtDepartment.getText().replace(charAt, "");
                storeChar += charAt;
                if (charAt.equals(" ")) {
                    txtId.clear();
                    txtId.setText(storeChar);
                } else {
                }
            }

        }
        txtDepartment.setText(listViewSelected);
    }

    @FXML
    public void updateDepartment() throws SQLException, ClassNotFoundException {
        if (txtDepartment.getText().isEmpty()) {
            functions.alertSuccessful(alert, "Nothing selected");
        }
        connection = connexion.getConnetion();
        pst = connection.prepareStatement("UPDATE `tbldepartments` SET `tbldepartments`=?, WHERE `departmentid`=?");
        pst.setString(1, txtDepartment.getText().toUpperCase());
        pst.setString(2, txtId.getText().toUpperCase());
        pst.execute();
        functions.alertSuccessful(alert, "Successfully updated");
        loadListView();
    }

    @FXML
    public void deleteDepartment() throws SQLException, ClassNotFoundException {
        connection = pst.getConnection();
        pst = connection.prepareStatement("DELETE FROM `tbldepartments`,`tblebusers` WHERE `departmentid`=?");
        pst.setString(1, txtId.getText().toUpperCase());
        pst.execute();
        functions.alertSuccessful(alert, "Succesfully deleted");
        loadListView();
        txtDepartment.clear();
        txtId.setText("DPT0" + Integer.toString(functions.getLastId("id", "tbldepartments")));

    }

    @FXML
    public void closeThisStage(Event event) {
        functions.closeWindow(event);
    }



////=======
//            Alert alert = new Alert(AlertType.WARNING);
//            alert.setTitle("Warning");
//            alert.setContentText("Department name cannot be empty");
//            alert.show();
//        } else {
//
//            ps = connection.prepareStatement("INSERT INTO `tbldepartment`(`id`, `department_id`,`emp_id`, `departmentname`, "
//                    + "`useredit`, `lastmachinetoedit`, `datecreated`, `lastdateedited`, `timecreated`) VALUES "
//                    + "(?,?,?,?,?,?,?,?,?)");
//            ps.setString(1, null);
//            ps.setInt(2, functions.getRowCount("tbldepartment") + 334);
//            ps.setString(3, "ta5566".toUpperCase());
//            ps.setString(4, txtDepartment.getText().toUpperCase());
//            ps.setString(5, "HUGGINS".toUpperCase());
//            ps.setString(6, InetAddress.getLocalHost().getHostName().toUpperCase());
//            ps.setDate(7, Date.valueOf(LocalDate.now().toString().toUpperCase()));
//            ps.setDate(8, Date.valueOf(LocalDate.now().toString().toUpperCase()));
//            ps.setTime(9, Time.valueOf(LocalTime.now()));
//            ps.execute();
//            ps.clearParameters();
//
//            lstvDepartments.getItems().addAll(txtDepartment.getText().toUpperCase());
//
//            ps.close();
//            Alert alert = new Alert(AlertType.CONFIRMATION);
//            alert.setTitle("Confirmation");
//            alert.setContentText(txtDepartment.getText() + " department added");
//            alert.show();
//        }

    //}
//
//    @FXML
//    public void closeThisStage(Event event) {
//
//        closeQuit closeQuit = new closeQuit();
//        closeQuit.qiutScene(event);
//
//    }

}
//>>>>>>> f5c7a74c0fba43c1a593f4c9fd5c119e38b274d5
