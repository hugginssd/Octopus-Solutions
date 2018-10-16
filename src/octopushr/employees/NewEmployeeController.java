/*
 *  DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 * 
 *  Contributor(s):
 *  
 *  The Original Software is NetBeans. The Initial Developer of the Original
 *  Software is Sun Microsystems, Inc. Portions Copyright 1997-2010 Sun
 *  Microsystems, Inc.
 *  The developer of this software is SIR HUGGINS
 *  
 *  
 *  If you wish your version of this file to be governed by only the CDDL
 *  or only the GPL Version 2, indicate your decision by adding
 *  "[Contributor] elects to include this software in this distribution
 *  under the [CDDL or GPL Version 2] license." If you do not indicate a
 *  single choice of license, a recipient has the option to distribute
 *  your version of this file under either the CDDL, the GPL Version 2 or
 *  to extend the choice of license to its licensees as provided above.
 *  However, if you add GPL Version 2 code and therefore, elected the GPL
 *  Version 2 license, then the option applies only if the new code is
 *  made subject to such option by the copyright holder.
 *  
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NON-INFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 *  THE SOFTWARE.
 *  
 *  @author SIR HUGGINS
 *  
 *  Copyright (c) 2016, Solution Systems Pvt Ltd
 *  All rights reserved.
 * 
 *  
 *  You should have received a copy of the GNU Lesser General Public
 *  License along with this library; if not, email to the Free Software
 *  Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 *  OR to Solution Systems Pvt Ltd, 56 Milton Park, Harare
 *  Email: mafiguhuggins@gmail.com
 *  Cell: +263782326160
 *  
 *  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 *  AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 *  IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 *  ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
 *  LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 *  CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 *  SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 *  INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 *  CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 *  ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 *  POSSIBILITY OF SUCH DAMAGE.
 * 
 */
package octopushr.employees;

import java.io.IOException;
import static java.lang.System.out;
import java.net.Inet4Address;
import java.net.URL;
import java.net.UnknownHostException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
//<<<<<<< HEAD
////>>>>>>> f5c7a74c0fba43c1a593f4c9fd5c119e38b274d5
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
//<<<<<<< HEAD
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
//=======
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
////>>>>>>> f5c7a74c0fba43c1a593f4c9fd5c119e38b274d5
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import octopushr.Connexion;
//<<<<<<< HEAD
import octopushr.Functions;
//=======
////>>>>>>> f5c7a74c0fba43c1a593f4c9fd5c119e38b274d5

/**
 * FXML Controller class
 *
 * @author Support
 */
public class NewEmployeeController implements Initializable {

    @FXML
//<<<<<<< HEAD
    TextField txtemployeeID;

    @FXML
    TextField txtlastEmployeeID;

    @FXML
    TextField txtfirstName;
//=======
    //private TextField txtemployeeID;

    @FXML
    private TextField txtlastemployeeID;

    // @FXML
    //private TextField txtfirstName;
////>>>>>>> f5c7a74c0fba43c1a593f4c9fd5c119e38b274d5
    @FXML
    private TextField txtmiddleName;

    @FXML
    private TextField txtlastName;

    @FXML
    private DatePicker dtpbirthDate;

    @FXML
//<<<<<<< HEAD
    ComboBox cmbselectDesignation;

    @FXML
    ComboBox cmbselectDepartment;

    @FXML
    ComboBox cmbGender;
//=======
//    private ComboBox cmbselectDesignation;
//
//    @FXML
//    private ComboBox cmbselectDepartment;
////>>>>>>> f5c7a74c0fba43c1a593f4c9fd5c119e38b274d5

    @FXML

    private TextField txtidNumber;

    @FXML

    private TextField txttotalExperience;

    @FXML

    private TextField txtexperienceWithUs;

    @FXML
//<<<<<<< HEAD
    private TextField txtmonthlySalary;

    @FXML
    Label lblDesignationId;

    @FXML
    Label lblDepartmentId;

    @FXML
    Stage stage;

    Connexion connexion = new Connexion();
    Functions functions = new Functions();
//=======

//    private TextField txtmonthlySalary;
//
//    @FXML
//    Stage stage;
//
//    Connexion connexion = new Connexion();
//>>>>>>> f5c7a74c0fba43c1a593f4c9fd5c119e38b274d5
    Statement st;
    PreparedStatement pst;
    ResultSet rs;
    Connection connection;
    Alert alert;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        try {
//<<<<<<< HEAD
            lblDesignationId.setVisible(false);
            lblDepartmentId.setVisible(false);
            //connection = connexion.getConnetion();
            txtlastEmployeeID.setEditable(false);
            txtemployeeID.setEditable(false);
            txtlastEmployeeID.setText("" + functions.getRowCount("tblguards") + 1);
            cmbGender.getItems().addAll("MALE", "FEMALE");
            txtemployeeID.setText("EMP00" + functions.getLastId("id", "tblguards"));
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(NewEmployeeController.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            //Load comboboxes
            loadDesignationAndDepartment();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(NewEmployeeController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    public void loadDesignationAndDepartment() throws ClassNotFoundException, SQLException {

        connection = connexion.getConnetion();
        st = connection.createStatement();
        rs = st.executeQuery("SELECT`id`, `departmentid`,`departmentname` FROM `tbldepartments` ORDER BY `id`");
        while (rs.next()) {
            cmbselectDepartment.getItems().addAll(rs.getString("departmentname"));
        }
        st.close();
        rs.close();

        st = connection.createStatement();
        rs = st.executeQuery("SELECT `id`, `designationid`, `designation` FROM `tbldesignation` ORDER BY `id`");
        while (rs.next()) {
            cmbselectDesignation.getItems().addAll(rs.getString("designation"));
        }
        st.close();
        rs.close();
    }

    @FXML
    public void saveQuickDetails() throws SQLException, UnknownHostException, InterruptedException, ClassNotFoundException {

        //validateTextboxes();
        if (txtfirstName.getText().isEmpty()) {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setContentText("First name cannot be empty");
            alert.showAndWait();
            return;
        }
        if (txtmiddleName.getText().isEmpty()) {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setContentText("Middle name cannot be empty");
            alert.showAndWait();
            return;
        }
        if (txtlastName.getText().isEmpty()) {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setContentText("Last name cannot be empty");
            alert.showAndWait();
            return;
        }
        if (cmbGender.equals("---Select Gender---")) {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setContentText("Last name cannot be empty");
            alert.showAndWait();
            return;
        }
        //insert workexperience
        insertInWorkExperience();

        connection = connexion.getConnetion();
        pst = connection.prepareStatement("INSERT INTO `tblguards`(`id`, `employeeid`, `firstname`, `middlename`, `surname`, `gender`,"
                + " `dateofbirth`, `idno`,`designationid`,`departmentid`, `datecreated`, `usercreated`, `machinecreatedon`,"
                + " `lastdatemodified`, `lastusermodified`, `lastmachinemodifedon`)"
                + " VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        pst.setString(1, null);
        pst.setString(2, txtemployeeID.getText().toUpperCase());
        pst.setString(3, txtfirstName.getText().toUpperCase());
        pst.setString(4, txtmiddleName.getText().toUpperCase());
        pst.setString(5, txtlastName.getText().toUpperCase());
        pst.setString(6, cmbGender.getSelectionModel().getSelectedItem().toString().toUpperCase());
        pst.setString(7, dtpbirthDate.getValue().getYear() + "-" + dtpbirthDate.getValue().getMonthValue() + "-" + dtpbirthDate.getValue().getDayOfMonth());
        pst.setString(8, txtidNumber.getText().toUpperCase());
        pst.setString(9, lblDesignationId.getText().trim().toUpperCase());
        pst.setString(10, lblDepartmentId.getText().trim().toUpperCase());
        pst.setDate(11, java.sql.Date.valueOf(LocalDate.now()));
        pst.setString(12, java.net.InetAddress.getLocalHost().getHostName().toUpperCase()); //usercreated
        pst.setString(13, java.net.InetAddress.getLocalHost().getHostName().toUpperCase()); //machinecreatedon
        pst.setDate(14, java.sql.Date.valueOf(LocalDate.now()));
        pst.setString(15, java.net.InetAddress.getLocalHost().getHostName().toUpperCase()); //lastusermodified
        pst.setString(16, java.net.InetAddress.getLocalHost().getHostName().toUpperCase()); //lastmachinemodifiedon
        pst.execute();
        functions.alertSuccessful(alert, "Successfully saved");

        //Load comboboxes
        loadDesignationAndDepartment();
        txtlastEmployeeID.setText("" + functions.getLastId("id", "tblguards"));
        txtemployeeID.setText("EMP00" + functions.getLastId("id", "tblguards"));
        resetControls();
    }

    
    @FXML
    public void resetControls(){
        txtfirstName.clear();
        txtmiddleName.clear();
        txtlastName.clear();
        dtpbirthDate.setValue(null);
        txtidNumber.clear();
        txttotalExperience.clear();
        txtexperienceWithUs.clear();
        txtmonthlySalary.clear();
        cmbselectDesignation.setValue(null);
        cmbselectDesignation.selectionModelProperty().setValue("---Select Designation---");
        cmbselectDepartment.selectionModelProperty().setValue("---Select Department---");
        cmbGender.selectionModelProperty().setValue("---Select Gender---");
    }
    @FXML
    public void validateTextboxes() {
        if (txtemployeeID.getText().isEmpty()) {
            Alert alerttextboxes = new Alert(Alert.AlertType.WARNING);
            alerttextboxes.setTitle("WARNING");
            alerttextboxes.setHeaderText(null);
            alerttextboxes.setContentText("Please fill in the input details");
            alerttextboxes.showAndWait();
            System.out.println("EMPLOYEE ID EMPTY");
            //  return;
//=======
            alert.setContentText("Record was successfully saved!");
            alert.showAndWait();

        }
    }

    @FXML
    public void validateIdNumber() {
//<<<<<<< HEAD
//        if (!txtidNumber.toString().startsWith("-", 3)) {
//            txtidNumber.clear();
//        }
//=======
        if (!txtidNumber.toString().startsWith("-", 3)) {
            //txtidNumber.clear();
        }
//>>>>>>> f5c7a74c0fba43c1a593f4c9fd5c119e38b274d5
    }

    @FXML
    public void closeThisStage(Event event) {
        functions.closeWindow(event);
    }

    @FXML
    public void openDesignation() throws IOException {
        stage = new Stage();
//<<<<<<< HEAD
        Pane root = FXMLLoader.load(getClass().getResource("/octopushr/employees/designation.fxml"));
        Scene scene = new Scene(root, 315, 400);
////=======
//        Pane root = FXMLLoader.load(getClass().getResource("designation.fxml"));
//        Scene scene = new Scene(root, 800, 440);
//>>>>>>> f5c7a74c0fba43c1a593f4c9fd5c119e38b274d5
        out.print("designation.fxml");
        scene.getStylesheets().add("/resources/css/designation.css");
        stage.setTitle("Add New Designation");
        stage.setResizable(false);
        stage.setScene(scene);
        //stage.setAlwaysOnTop(true);
        stage.show();

    }

    @FXML
    public void openDepartment() throws IOException {
        stage = new Stage();
//<<<<<<< HEAD
        Pane root = FXMLLoader.load(getClass().getResource("/octopushr/organization/newDepartment.fxml"));
//=======
        //Pane root = FXMLLoader.load(getClass().getResource("newDepartment.fxml"));
//>>>>>>> f5c7a74c0fba43c1a593f4c9fd5c119e38b274d5
        Scene scene = new Scene(root, 800, 440);
        out.print("newDepartment.fxml");
        scene.getStylesheets().add("/resources/css/newdepartment.css");
        stage.setTitle("Add New Department");
        stage.setResizable(false);
        stage.setScene(scene);
        //stage.setAlwaysOnTop(true);
        stage.show();

    }
//<<<<<<< HEAD

    @FXML
    public void loadSelectedDesignationId() throws SQLException, ClassNotFoundException {

        connection = connexion.getConnetion();
        pst = connection.prepareStatement("SELECT `designationid` FROM `tbldesignation` WHERE `designation`=?");
        pst.setString(1, cmbselectDesignation.getSelectionModel().getSelectedItem().toString());
        rs = pst.executeQuery();
        while (rs.next()) {
            lblDesignationId.setText(rs.getString("designationid"));
        }
        pst.close();
        rs.close();
    }

    @FXML
    public void loadSelectedDepartmentId() throws SQLException, ClassNotFoundException {
        connection = connexion.getConnetion();
        pst = connection.prepareStatement("SELECT `departmentid` FROM `tbldepartments` WHERE `departmentname`=?");
        pst.setString(1, cmbselectDepartment.getSelectionModel().getSelectedItem().toString());
        rs = pst.executeQuery();
        while (rs.next()) {
            lblDepartmentId.setText(rs.getString("departmentid"));
        }
        pst.close();
        rs.close();
    }

    public void insertInWorkExperience() throws SQLException, ClassNotFoundException, UnknownHostException {
        //INSERT INTO `tblworkexperience`(`id`, `employeeid`, `nameofemployer`, `addressofemployer`, `telephonenumber`, `datefrom`,"
        //" `dateto`, `title`, `totalexperience`, `experiencewithus`, `monthlysalary`, `monthlyincome`, `reasonforleaving`, `notes`) VALUES ([value-1],[value-2],[value-3],[value-4],[value-5],[value-6],[value-7],[value-8],[value-9],[value-10],[value-11],[value-12],[value-13],[value-14])
        connection = connexion.getConnetion();
        pst = connection.prepareStatement("INSERT INTO `tblworkexperience`(`employeeid`, `datefrom`,"
                + " `title`,`totalexperience`, `experiencewithus`, `monthlysalary`,"
                + "`datecreated`, `usercreated`, `machinecreatedon`, `lastdatemodified`,"
                + " `lastmachinemodifiedon`, `deleted`)"
                + " VALUES (?,?,?,?,?,?,CURDATE(),?,?,CURDATE(),?,?)");
        // pst.setString(1, null);
        pst.setString(1, txtemployeeID.getText().toUpperCase().trim());
        pst.setDate(2, java.sql.Date.valueOf(LocalDate.now()));
        pst.setString(3, cmbselectDesignation.getSelectionModel().getSelectedItem().toString());
        pst.setDouble(4, Double.parseDouble(txttotalExperience.getText().trim()));
        pst.setDouble(5, Double.parseDouble(txtexperienceWithUs.getText().trim()));
        pst.setDouble(6, Double.parseDouble(txtmonthlySalary.getText().trim()));
        pst.setString(7, Inet4Address.getLocalHost().getHostName());
        pst.setString(8, Inet4Address.getLocalHost().getHostName());
        pst.setString(9, Inet4Address.getLocalHost().getHostName());
        pst.setBoolean(10, false);
        pst.execute();
        functions.alertSuccessful(alert, "Work experience successfully created");
        System.out.println("Inserted experience");
    }
//`datecreated`, `usercreated`, `machinecreatedon`, `lastdatemodified`, `lastmachinemodifiedon`, `deleted`
//=======
//>>>>>>> f5c7a74c0fba43c1a593f4c9fd5c119e38b274d5
}
