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
 /*Copyright (c) 2016, OCTOPUS Incorporation
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
package octopushr.leave;

//<<<<<<< HEAD
import java.io.IOException;
import java.net.UnknownHostException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import octopushr.Connexion;
import octopushr.Functions;
//=======
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import octopushr.closeQuit;
//>>>>>>> f5c7a74c0fba43c1a593f4c9fd5c119e38b274d5

/**
 * FXML Controller class
 *
 * @author Support
 */
public class EmployeeLeaveApplicationController implements Initializable {

    /**
     * Initializes the controller class.
     */
//<<<<<<< HEAD
    @FXML
    ComboBox cmbSelectDepartment, cmbSelectEmployee, cmbSelectLeaveType, cmbSelectleavestatus, cmbFilterbystatus;

    @FXML
    Label lblDepartmentId, lblLeaveid, lblPath, lblEmployeeName, lblDesignation, lblLeavetypeId;

    @FXML
    Stage stage;

    @FXML
    ImageView imgPerson;

    @FXML
    TextField txtSubject, txtApplicationfile, txtDaysencashed;

    @FXML
    TextArea txaDescription;

    @FXML
    DatePicker dtpLeavefrom, dtpLeavetill;

    Functions functions = new Functions();
    Connection connection;
    Connexion connexion = new Connexion(); 
    closeQuit closeQuit = new closeQuit();
    PreparedStatement pst;
    Statement st;
    ResultSet rs;
    Alert alert;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            // TODO
            loadDepartments();
            loadLeaveType();
            lblLeaveid.setVisible(false);
            lblLeavetypeId.setVisible(false);
            lblDepartmentId.setVisible(false);
            lblPath.setVisible(false);
            lblLeaveid.setText("LV0" + Integer.toString(functions.getLastId("id", "tblleave")));
            cmbFilterbystatus.getItems().addAll("PENDING", "APPROVED", "REJECTED", "LEAVE WITHOUT APPROVAL", "DID NOT INFORMED", "APPROVED AND CANCEL");
            cmbSelectleavestatus.getItems().addAll("LEAVE WITHOUT APPROVAL", "DID NOT INFORMED");
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(EmployeeLeaveApplicationController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    @FXML
    public void closeThisStage(Event event) {
//<<<<<<< HEAD
        functions.closeWindow(event);
    }

    @FXML
    public void loadDepartments() throws SQLException, ClassNotFoundException {
        connection = connexion.getConnetion();
        pst = connection.prepareStatement("SELECT `id`, `departmentid`, `departmentname`"
                + " FROM `tbldepartments`");
        rs = pst.executeQuery();
        while (rs.next()) {
            cmbSelectDepartment.getItems().add(rs.getString("departmentname"));
        }
        System.out.println("Started loading employees");

    }

    @FXML
    public void loadEmployees() throws SQLException, ClassNotFoundException {
        connection = connexion.getConnetion();
        pst = connection.prepareStatement("SELECT `id`,`employeeid`,`firstname`, `surname`, CONCAT(`firstname`,' ', `surname`) AS employee FROM `tblguards` WHERE `departmentid`=?");
        pst.setString(1, lblDepartmentId.getText().trim());
        rs = pst.executeQuery();
        cmbSelectEmployee.getItems().clear();
        System.out.println("clear employee list");
        while (rs.next()) {
            //cmbSelectEmployee.setItems(null);
            System.out.println("Loading employees");
            cmbSelectEmployee.getItems().addAll(rs.getString("employeeid"));
            //lblFirstname.setText( rs.getString("firstname"));
            //lblSurname.setText( rs.getString("surname"));
        }
    }

    @FXML
    public void loadDepartmentId() throws SQLException, ClassNotFoundException {
        connection = connexion.getConnetion();
        pst = connection.prepareStatement("SELECT `id`, `departmentid`, `departmentname` FROM `tbldepartments` WHERE `departmentname` = ?");
        pst.setString(1, cmbSelectDepartment.getValue().toString());
        rs = pst.executeQuery();
        while (rs.next()) {
            lblDepartmentId.setText(rs.getString("departmentid"));
        }
        loadEmployees();
    }

    @FXML
    public void selectEmployeeDetails() throws SQLException, ClassNotFoundException, IOException {
        connection = connexion.getConnetion();
        pst = connection.prepareStatement("SELECT `tblguards`.`id` AS id, `employeeid`, CONCAT(`firstname`, ' ', `surname`) AS employeename, `gender`, `dateofbirth`,"
                + " `placeofbirth`, `picture`, `appearancenotes`, `gradeid`, `idno`, `healthnotes`, `married`, `active`, `verified`, `bankid`,"
                + " `bankbranchid`, `branchid`, `tblguards`.`designationid` AS designationid,`designation`, `departmentid`, `datestarted`"
                + "FROM `tblguards`"
                + "INNER JOIN `tbldesignation`"
                + "ON `tbldesignation`.`designationid` = `tblguards`.`designationid`"
                + "WHERE `employeeid` = ?");
        functions.alertInformation(alert, cmbSelectEmployee.getValue().toString());
        pst.setString(1, cmbSelectEmployee.getValue().toString());
        rs = pst.executeQuery();
        while (rs.next()) {
            lblEmployeeName.setText(rs.getString("employeename"));
            functions.retrieveImage(imgPerson, rs);
            lblDesignation.setText(rs.getString("designation"));
        }
    }

    @FXML
    public void loadLeaveType() throws SQLException, ClassNotFoundException {
        connection = connexion.getConnetion();
        pst = connection.prepareStatement("SELECT `id`, `leavetypeid`, `name`, `active` FROM `tblleavetype`");
        rs = pst.executeQuery();
        cmbSelectLeaveType.getItems().clear();
        while (rs.next()) {
            cmbSelectLeaveType.getItems().addAll(rs.getString("name"));
        }

    }

    @FXML
    public void loadLeaveTypeId() throws SQLException, ClassNotFoundException {
        connection = connexion.getConnetion();
        pst = connection.prepareStatement("SELECT `id`, `leavetypeid`, `name`, `active` FROM `tblleavetype` WHERE `name` =?");
        pst.setString(1, cmbSelectLeaveType.getValue().toString());
        rs = pst.executeQuery();
        while (rs.next()) {
            lblLeavetypeId.setText(rs.getString("leavetypeid"));
            txtSubject.setText(rs.getString("leavetypeid"));
        }

    }

    @FXML
    public void addSkills() throws IOException {
        stage = new Stage();
        AnchorPane root = FXMLLoader.load(getClass().getResource("/octopushr/leave/employeeLeaveTypes.fxml"));
        Scene scene = new Scene(root);
        scene.getStylesheets().add("/resources/css/employeeleavetypes.css");
        stage.setTitle("Leave Types");
        stage.setResizable(false);
        stage.centerOnScreen();
        stage.setScene(scene);
        stage.showAndWait();
    }

    @FXML
    public void applyLeave() throws SQLException, ClassNotFoundException, UnknownHostException {
        if (cmbSelectLeaveType.getValue() == null
                || txtSubject.getText().isEmpty()
                || dtpLeavefrom.getValue() == null
                || dtpLeavetill.getValue() == null
                || cmbSelectleavestatus.getValue() == null
                || txaDescription.getText().isEmpty()) {
            functions.alertInformation(alert, "Invalid entry");
            return;
        }
        long date1 = dtpLeavefrom.getValue().toEpochDay();
        long date2 = dtpLeavetill.getValue().toEpochDay();
        int dif = (int) Math.abs(date1 - date2);

        connection = connexion.getConnetion();
        pst = connection.prepareStatement("INSERT INTO `tblleave`(`leaveid`, `employeeid`, `leavetypeid`, `startdate`, `expectedreturndate`,"
                + " `effectivedaystaken`, `daysencashed`, `notes`, `deleted`,"
                + " `datecreated`, `usercreated`, `machinecreatedon`) VALUES (?,?,?,?,?,?,?,?,?,CURDATE(),?,?)");
        pst.setString(1, lblLeaveid.getText().toUpperCase());
        pst.setString(2, cmbSelectEmployee.getValue().toString());
        pst.setString(3, lblLeavetypeId.getText().toUpperCase());
        pst.setString(4, dtpLeavefrom.getValue().getYear() + "-" + dtpLeavefrom.getValue().getMonthValue() + "-" + dtpLeavefrom.getValue().getDayOfMonth());
        pst.setString(5, dtpLeavetill.getValue().getYear() + "-" + dtpLeavetill.getValue().getMonthValue() + "-" + dtpLeavetill.getValue().getDayOfMonth());
        pst.setInt(6, dif);
        pst.setInt(7, Integer.parseInt(txtDaysencashed.getText()));
        pst.setString(8, txaDescription.getText().toUpperCase());
        pst.setBoolean(9, false);
        pst.setString(10, java.net.Inet4Address.getLocalHost().getHostName());
        pst.setString(11, java.net.Inet4Address.getLocalHost().getHostName());
        pst.execute();
        functions.alertSuccessful(alert, "Successfully applied");
        refreshControls();
    }

    @FXML
    public void refreshControls() throws SQLException, ClassNotFoundException {
        cmbSelectLeaveType.setValue(null);
        txtSubject.clear();
        dtpLeavefrom.setValue(null);
        dtpLeavetill.setValue(null);
        cmbSelectleavestatus.setValue(null);
        txaDescription.clear();
        lblLeaveid.setText("LV0" + Integer.toString(functions.getLastId("id", "tblleave")));
        txtDaysencashed.clear();

    }
}
