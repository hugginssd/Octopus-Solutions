package octopushr.employees;

//<<<<<<< HEAD
/*
 *  DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 * 
 *  Contributor(s):
 *  
 *  The Original Software is NetBeans. The Initial Developer of the Original
 *  Software is Sun Microsystems, Inc. Portions Copyright 1997-2010 Sun
 *  Microsystems, Inc.
 *  The developer of this software is HUGGINS
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
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.Inet4Address;
import java.net.InetAddress;
//=======
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.file.Files;
import java.sql.Connection;
import java.sql.Date;
//>>>>>>> f5c7a74c0fba43c1a593f4c9fd5c119e38b274d5
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Optional;
import javafx.beans.binding.Bindings;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import octopushr.documents.SubmitIssuedDocuments;
//=======
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.embed.swing.SwingFXUtils;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.FileChooser;
import javafx.util.Callback;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import octopushr.Connexion;
import octopushr.Functions;
//>>>>>>> f5c7a74c0fba43c1a593f4c9fd5c119e38b274d5

public class UpdateEmployeeDetailsController implements Initializable {

    @FXML
    private TextField txtfirstname;

    @FXML
    private TextField txtmiddlename;

    @FXML
    private TextField txtlastname, txtemployeId;

    @FXML
    private DatePicker dtpbirthDate;

    @FXML
//<<<<<<< HEAD
    private TextArea txaidentificationDetails, txtEmergencyAddress, txtAddress, txtAddres, txaOtherDetails;

    @FXML
    private ComboBox cmbselectDesignation;

    @FXML
    private ComboBox cmbselectDepartment;

    @FXML
//<<<<<<< HEAD
    private DatePicker dtpJoiningDate, dtpCompletionYear, dtpFrom, dtpTo, dtpSubmittedIssuedDate, dtpExpirationDate;

    @FXML
    private ComboBox cmbJobStatus;

    @FXML
    private ComboBox cmbWorkShift;

    @FXML
    private TextField txtTotalExperience;

    @FXML
    private TextField txtExperienceWithUs;

    @FXML
    private TextField txtmonthlySalary;

    @FXML
    private ComboBox cmbverifiedEmployee;

    @FXML
    private ComboBox cmbActivatedEmployee;

    @FXML
//<<<<<<< HEAD
    private ImageView imgUpdate, imageViewSmall, imgAddDocumentType;

    @FXML
    private ImageView imgselectTimeSlot;

    @FXML
    private ImageView imgchangeOrganisation;

    @FXML
    private Button btnselectImage;

    @FXML
    private TextField txtbankName;

    @FXML
    private TextField txtaccountHolder;

    @FXML
    private TextField txtaccountNumber;

    @FXML
//<<<<<<< HEAD
    private TextArea txaotherDetails, txaDependanceNotes, txtSchoolName, txaReasonsForLeaving, txaAddressOfEmployer;

    @FXML
    private TextField txtovertimeCostPerHour;

    @FXML
    private TextField txthourlyCostPerHour;

    @FXML
    private Button btnUpdate;

    @FXML
//<<<<<<< HEAD
    private ComboBox cmbselectTimeSlot, cmbCountry, cmbCountr;

    @FXML
    private Button btnAllocate, _btn_Add;

    @FXML
    private Button btnsaveLocation;

    @FXML
//<<<<<<< HEAD
    private Button btnchangeOrganisation, btnPaySalary;

    @FXML
    private TextField txtcurrentLocation, txtEmployeeID, txtFirstname, txtMiddlename, txtSurname, txtEmployeeIdq, txtMonthlySalary,
            txtexperienceWithUs, txttotalExperience, txtFathername, txtMothername, txtLanguage, txtLanguageWrite, txtFacebook,
            txtBloodGroup, txtDependantName, txtRelationship, txtNumberOfDependance, txtWorkPhone, txtWorkEmail, txtHomePhone, txtCellMobile,
            txtPersonalEmail, txtPersonname, txtRelationShip, txtHomePhon, txtEmail, txtState,
            txtStat, txtZipPinCod, txtZipPinCode, txtDegree, txtCompanyName, txtDesignation, txtTelephone, txtSelectDocument;

    @FXML
    private CheckBox chkSameAsCAddress;
    @FXML
    private ComboBox cmbchangeOrganisation;

    @FXML
    private ComboBox cmbFilterByDepartments;

    @FXML
    private ComboBox cmbDesignation;

    @FXML
    public ComboBox cmbselectDepartment1, cmbSelectEducationLevel, cmbSkills, cmbLevel, cmbExperience, cmbMonths;

    @FXML
    private ComboBox cmbSelectEmployee, cmbGender, cmbEthnicOrigin, cmbDocumentType;

    @FXML
    private Label lblDepartmentId, lblDesignationIdDetails, lblDepartmentIdDetails, lblBankId, lblId, lblSelectId, lblDocumentId, lblPath, lblSkillId, lblEmployeeId, lblFirstname, lblMiddlename, lblDesignationId, lblLastEmployeeId, lblLevel, lblsetEmployeeid, lblbsetDepartment;

    @FXML
    private PieChart pieLeave;

    @FXML
    private ObservableList<PieChart.Data> piechartData;
    Connexion connexion = new Connexion();
    Connection connection;

    @FXML
    ObservableList<Dependance> data = FXCollections.observableArrayList();

    @FXML
    private TableView<Dependance> tableView;

    @FXML
    private TableView<Qualifications> tableQualifications;

    @FXML
    private TableColumn<Qualifications, ?> sno;

    @FXML
    private TableColumn<Qualifications, ?> educationalLevel;

    @FXML
    private TableColumn<Qualifications, ?> school;

    @FXML
    private TableColumn<Qualifications, ?> degree;

    @FXML
    private TableColumn<Qualifications, ?> completionYear;

    @FXML
    private ObservableList<Qualifications> data1 = FXCollections.observableArrayList();

    @FXML
    private TableView<WorkExperience> tableWorkExperience;

    @FXML
    private TableColumn<WorkExperience, ?> id;

    @FXML
    private TableColumn<WorkExperience, ?> companyName;

    @FXML
    private TableColumn<WorkExperience, ?> designation;

    @FXML
    private TableColumn<WorkExperience, ?> from;

    @FXML
    private TableColumn<WorkExperience, ?> to;

    @FXML
    private TableColumn<WorkExperience, ?> otherDetails;

    @FXML
    private TableColumn<WorkExperience, ?> colReasonsForLeaving;

    @FXML
    private TableColumn<WorkExperience, ?> colAddressOfEmployer;

    @FXML
    private TableColumn<WorkExperience, ?> colTelephone;

    @FXML
    ObservableList<WorkExperience> data2 = FXCollections.observableArrayList();

    @FXML
    ObservableList<Skills> dataSkills = FXCollections.observableArrayList();

    @FXML
    ObservableList<SimilarSkills> dataSimilarSkills = FXCollections.observableArrayList();

    @FXML
    ObservableList<SubmitIssuedDocuments> dataSubmitIssuedDocuments = FXCollections.observableArrayList();

    @FXML
    ObservableList<SubmitIssuedDocuments> dataIssuedDocuments = FXCollections.observableArrayList();

    @FXML
    TableView<SimilarSkills> tableSimilarSkills;

    @FXML
    private TableColumn<SimilarSkills, ?> colName;

    @FXML
    private TableColumn<SimilarSkills, ?> colEmployeeId;

    @FXML
    private TableColumn<SimilarSkills, ?> colDesignation;

    @FXML
    private TableColumn<SimilarSkills, ?> colDepartment;

    @FXML
    private TableView<Skills> tableNewSkills;

    @FXML
    private ObservableList<TableColumn<Skills, ?>> columns;

//tableview for submitted documents
    @FXML
    private TableView<SubmitIssuedDocuments> tableSubmittedDocuments;

    @FXML
    private TableColumn<SubmitIssuedDocuments, ?> colId;

    @FXML
    private TableColumn<SubmitIssuedDocuments, ?> colDocumentName;

    @FXML
    private TableColumn<SubmitIssuedDocuments, ?> colDocumentType;

    @FXML
    private TableColumn<SubmitIssuedDocuments, ?> colSubmittedDate;

    @FXML
    private TableColumn<SubmitIssuedDocuments, ?> colExpiredOn;

    @FXML
    private TableColumn<SubmitIssuedDocuments, ?> colOriginalDuplicate;

    //tableview for issued documents
    @FXML
    private TableView<SubmitIssuedDocuments> tableIssuedDocuments;

    @FXML
    private TableColumn<SubmitIssuedDocuments, ?> colI;

    @FXML
    private TableColumn<SubmitIssuedDocuments, ?> colDocumentNam;

    @FXML
    private TableColumn<SubmitIssuedDocuments, ?> colDocumentTyp;

    @FXML
    private TableColumn<SubmitIssuedDocuments, ?> colSubmittedDat;

    @FXML
    private TableColumn<SubmitIssuedDocuments, ?> colExpiredO;

    @FXML
    private TableColumn<SubmitIssuedDocuments, ?> colOriginalDuplicat;

    @FXML
    private RadioButton rdbOriginal, rdbDuplicate, rdbYes, rdbNo;

    Statement st;
    PreparedStatement pst;
    ResultSet rs;
    Alert alert;
    Functions functions = new Functions();
    @FXML
    private Stage stage;
    SkillsController skillsController;
    @FXML
    ObservableList parentList = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
//<<<<<<< HEAD
            lblDocumentId.setVisible(false);
            lblPath.setVisible(false);
            cmbSelectEducationLevel.getItems().addAll("CERTIFICATE", "DIPLOMA", "DEGREE", "ASSOCIATE DEGREE", "MASTERS", "PHD");
            //cmbSkills.getItems().addAll(elements);
            cmbLevel.getItems().addAll("BEGINNER", "INTERMEDIATE", "EXPERT");
            cmbExperience.getItems().addAll(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25);
            cmbMonths.getItems().addAll(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
            connection = connexion.getConnetion();
            st = connection.createStatement();
            rs = st.executeQuery("SELECT DISTINCT `departmentname` FROM `tbldepartments` ORDER BY `departmentname`");
            while (rs.next()) {
                cmbselectDepartment.getItems().addAll(rs.getString("departmentname"));
                cmbselectDepartment1.getItems().addAll(rs.getString("departmentname"));
                cmbFilterByDepartments.getItems().addAll(rs.getString("departmentname"));
            }
            st.close();
            rs.close();
        } catch (SQLException | ClassNotFoundException e) {

        }
        try {
            st = connection.createStatement();
            rs = st.executeQuery("SELECT DISTINCT `designation` FROM `tbldesignation` ORDER BY `designation`");
            while (rs.next()) {
                cmbselectDesignation.getItems().addAll(rs.getString("designation"));
                //  cmbselectDesignation1.getItems().addAll(rs.getString("designation"));
            }
            st.close();
            rs.close();
//=======
//            loadDesignationAndDepartment();
            connection = connexion.getConnetion();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(UpdateEmployeeDetailsController.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Failed to load the connection class");
        }

        try {
            st = connection.createStatement();
            rs = st.executeQuery("SELECT DISTINCT `id`, `departmentid`, `departmentname` FROM `tbldepartments` ORDER BY `departmentname`");
            while (rs.next()) {
                cmbselectDepartment.getItems().addAll(rs.getString(3));
            }

            rs = st.executeQuery("SELECT DISTINCT `id`, `designationid`, `designation` FROM `tbldesignation` ORDER BY `designation`");
            try {
                while (rs.next()) {
                    cmbselectDesignation.getItems().addAll(rs.getString(3));
                }
                // 
//>>>>>>> f5c7a74c0fba43c1a593f4c9fd5c119e38b274d5
            } catch (SQLException ex) {
                Logger.getLogger(NewEmployeeController.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (SQLException ex) {
            Logger.getLogger(NewEmployeeController.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            //loadJobstatus and workshift combobox
            loadJobandWorkShiftStatus();
            loadSkills();
            //loadDesignationAndDepartment();
            connection = connexion.getConnetion();
            st = connection.createStatement();
            rs = st.executeQuery("SELECT `id`, `departmentid`, `departmentname` FROM `tbldepartments` ORDER BY `departmentname`");
            while (rs.next()) {
                cmbDesignation.getItems().addAll(rs.getString("departmentname"));
            }
            st.close();
            rs.close();
            //
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(UpdateEmployeeDetailsController.class.getName()).log(Level.SEVERE, null, ex);
        }
        //load piechart data
        piechartData = FXCollections.observableArrayList(
                new PieChart.Data("Maternity Leave", 40),
                new PieChart.Data("Sick Leave", 20),
                new PieChart.Data("Miscellanious", 12),
                new PieChart.Data("Military Leave", 0),
                new PieChart.Data("Public Holidays", 13),
                new PieChart.Data("Personal Leave", 5),
                new PieChart.Data("Vacation Leave", 10));
        pieLeave.setData(piechartData);
        setDependantsColumns();
        setNewSkillsColumns();

        //  setWorkExperienceColumns();
    }

    public void initialize() {
        cmbSkills.setItems(parentList);
        Bindings.bindContentBidirectional(parentList, skillsController.getObservableList());
    }

    @FXML
    public void addSkills() throws IOException {
        stage = new Stage();
        AnchorPane root = FXMLLoader.load(getClass().getResource("/octopushr/employees/skills.fxml"));
        Scene scene = new Scene(root);
        scene.getStylesheets().add("/resources/css/skills.css");
        stage.setTitle("Skills");
        stage.setAlwaysOnTop(false);
        stage.setResizable(false);
        stage.centerOnScreen();
        stage.setScene(scene);
        stage.showAndWait();
    }

    public void loadDesignationAndDepartment() throws SQLException, ClassNotFoundException {
        connection = connexion.getConnetion();
        st = connection.createStatement();
        rs = st.executeQuery("SELECT `id`, `departmentid`, `departmentname` FROM `tbldepartments`");
        while (rs.next()) {
            //  cmbselectDepartment1.getItems().addAll("departmentname");
            Alert alert = new Alert(AlertType.CONFIRMATION);
            alert.setHeaderText(null);
            alert.setContentText(rs.getString("departmentname"));
            cmbDesignation.getItems().addAll(rs.getString("departmentname"));
            alert.showAndWait();
        }
        st.close();
        rs.close();
//=======
    }

    @FXML
    public void loadJobandWorkShiftStatus() {
        cmbJobStatus.getItems().addAll("inActive", "Active");
        cmbWorkShift.getItems().addAll("Day", "Night");
        cmbverifiedEmployee.getItems().addAll("Yes", "No");

    }

    @FXML
    public void updateEmployeeDetails() throws SQLException, UnknownHostException, ClassNotFoundException {
        if (txtemployeId.getText().isEmpty()) {
            functions.alertInformation(alert, "Unknown error\n" + "Error performing request\n" + "Please make sure all your input data is valid");
            return;
        }
        connection = connexion.getConnetion();
        pst = connection.prepareStatement("UPDATE `tblguards` SET `firstname`=?,`middlename`=?,`surname`=?,"
                + "`dateofbirth`=?,`appearancenotes`=?,"
                + "`active`=?,`verified`=?,"
                + "`bankid`=?,`designationid`=?,`departmentid`=?,"
                + "`datestarted`=CURDATE(),"
                + "`lastdatemodified`=CURDATE(),`lastusermodified`=?,"
                + "`lastmachinemodifedon`=? WHERE `employeeid`=?");
        pst.setString(1, txtfirstname.getText().toUpperCase());
        pst.setString(2, txtmiddlename.getText().toUpperCase());
        pst.setString(3, txtlastname.getText().toUpperCase());
//        pst.setString(4, (TextField) dtpbirthDate.getValue().getYear() + "-" + dtpbirthDate.getValue().getMonthValue() + "-" + dtpbirthDate.getValue().getDayOfMonth());
        pst.setString(5, txaidentificationDetails.getText().toUpperCase());
        pst.setInt(6, cmbActivatedEmployee.getSelectionModel().getSelectedIndex());
        pst.setInt(7, cmbverifiedEmployee.getSelectionModel().getSelectedIndex());
        pst.setString(8, lblBankId.getText());
        pst.setString(9, lblDesignationIdDetails.getText());
        pst.setString(10, lblDepartmentIdDetails.getText());
        pst.setString(11, Inet4Address.getLocalHost().getHostName());
        pst.setString(12, Inet4Address.getLocalHost().getHostName());
        pst.setString(13, cmbSelectEmployee.getSelectionModel().getSelectedItem().toString());
        pst.execute();
        functions.alertInformation(alert, "Successfully saved");

    }

    @FXML
    public void exit(Event event) {
        functions.closeWindow(event);
    }

    @FXML
    public void setText(String department, String employeeid) {
        functions.alertSuccessful(alert, employeeid);
        this.lblbsetDepartment.setText(department);
        this.lblsetEmployeeid.setText(employeeid);
    }

    @FXML
    public void loadEmployees() throws SQLException, ClassNotFoundException {
        connection = connexion.getConnetion();
        pst = connection.prepareStatement("SELECT `id`,`employeeid`,`firstname`, `surname`, CONCAT(`firstname`,' ', `surname`) AS employee FROM `tblguards` WHERE `departmentid`=?");
        pst.setString(1, lblDepartmentId.getText().trim());
        rs = pst.executeQuery();
        cmbSelectEmployee.getItems().clear();
        while (rs.next()) {
            //cmbSelectEmployee.setItems(null);
            cmbSelectEmployee.getItems().addAll(rs.getString("employeeid"));
            //lblFirstname.setText( rs.getString("firstname"));
            //lblSurname.setText( rs.getString("surname"));
        }
        pst.close();
        rs.close();
    }

    @FXML
    public void loadEmployeeDetails() throws SQLException, ClassNotFoundException, IOException {
        if (cmbSelectEmployee.getSelectionModel().isEmpty()) {
            return;
        }

        connection = connexion.getConnetion();
        pst = connection.prepareStatement("SELECT `firstname`,`middlename`,`surname`,`designation`,`departmentname`,"
                + "`totalexperience`,`picture`,`experiencewithus`,`monthlysalary` FROM `tblguards`"
                + "INNER JOIN `tbldesignation`"
                + "ON `tbldesignation`.`designationid` = `tblguards`.`designationid`"
                + "INNER JOIN `tbldepartments`"
                + "ON `tbldepartments`.`departmentid` = `tblguards`.`departmentid`"
                + "INNER JOIN `tblworkexperience`"
                + "ON `tblworkexperience`.`employeeid` = `tblguards`.`employeeid`"
                + "WHERE `tblguards`.`employeeid` = ?");
        pst.setString(1, cmbSelectEmployee.getSelectionModel().getSelectedItem().toString());
        rs = pst.executeQuery();
        while (rs.next()) {
            txtFirstname.setText(rs.getString("firstname"));
            txtMiddlename.setText(rs.getString("middlename"));
            txtSurname.setText(rs.getString("surname"));
            txtEmployeeIdq.setText(cmbSelectEmployee.getValue().toString());
            cmbDesignation.setValue(rs.getString("designation"));
            lblLevel.setText(rs.getString("designation"));
            cmbselectDepartment1.setValue(rs.getString("departmentname"));
            txtTotalExperience.setText(rs.getString("totalexperience"));
            functions.retrieveImage(imgUpdate, rs);
            // imageView
            functions.retrieveImage(imageViewSmall, rs);
            txtExperienceWithUs.setText(rs.getString("experiencewithus"));
            txtMonthlySalary.setText(rs.getString("monthlysalary"));
        }
        rs.close();
        pst.close();
        // loadEmployees();
    }

    @FXML
    public void loadDepartmentId() throws SQLException, ClassNotFoundException {
        connection = connexion.getConnetion();
        pst = connection.prepareStatement("SELECT `departmentid` FROM `tbldepartments` WHERE `departmentname`=?");
        pst.setString(1, cmbFilterByDepartments.getSelectionModel().getSelectedItem().toString().trim());
        rs = pst.executeQuery();
        while (rs.next()) {
            lblDepartmentId.setText(rs.getString("departmentid"));
        }
        pst.close();
        rs.close();
        loadEmployees();
    }

    @FXML
    public void loadDesignationId() {
    }

    @FXML
    public void loadAllEmployeeDetails() throws SQLException, ClassNotFoundException {
        connection = connexion.getConnetion();
        //SELECT `id`, `employeeid`, `firstname`, `middlename`, `surname`, `gender`, `dateofbirth`, `placeofbirth`, `picture`,
        //`appearancenotes`, `gradeid`, `idno`, `healthnotes`, `married`, `bankid`, `bankbranchid`, `designationid`, `departmentid`,
        //`datestarted`, `firstsystempaydate`, `post`, `contractrunoutdate`, `datecreated`, `usercreated`, `machinecreatedon`, 
        //`lastdatemodified`, `lastusermodified`, `lastmachinemodifedon` FROM `tblguards` WHERE 1
        pst = connection.prepareStatement("SELECT `id`, `employeeid`, `firstname`, `middlename`, `surname`, `gender`, `dateofbirth`,"
                + " `placeofbirth`, `picture`, `appearancenotes`, `gradeid`, `idno`, `healthnotes`, `married`, "
                + "`bankid`, `bankbranchid`, `designationid`, `departmentid`, `datestarted`, `firstsystempaydate`,"
                + "`post`, `contractrunoutdate`, `datecreated`, `usercreated`, `machinecreatedon`,"
                + "`lastdatemodified`, `lastusermodified`, `lastmachinemodifedon`"
                + " FROM `tblguards` WHERE `employeeid`=?");
        pst.setString(1, cmbSelectEmployee.getSelectionModel().getSelectedItem().toString().trim());
        rs = pst.executeQuery();
        while (rs.next()) {
            txtfirstname.setText(rs.getString("firstname"));
            txtmiddlename.setText(rs.getString("middlename"));
            txtlastname.setText(rs.getString("surname"));
            dtpbirthDate.getEditor().setText(rs.getString("dateofbirth"));
            txtemployeId.setText(cmbSelectEmployee.getSelectionModel().getSelectedItem().toString().trim());
        }
        pst.close();
        rs.close();
    }

    @FXML
    public void loadImage() throws SQLException, ClassNotFoundException {

        functions.saveImage(stage, imgUpdate, cmbSelectEmployee.getSelectionModel().getSelectedItem().toString());
    }

    //load
    @FXML
    public void loadPersonalDetails() throws SQLException, ClassNotFoundException {
        if (cmbSelectEmployee.getSelectionModel().isEmpty()) {
            return;
        }
        connection = connexion.getConnetion();
        pst = connection.prepareStatement("SELECT `married`,CONCAT(`fathername`,' ',`fathersurname`) AS `fathername`, "
                + "CONCAT(`mothername`,' ', `mothersurname`) AS `mothername`, "
                + "`languagespeak`, `languagewrite`, `ethnicorigin`,`socialmedialink`,`bloodgroup` "
                + "FROM `tblguards` "
                + "INNER JOIN `tblvillage` "
                + "ON `tblguards`.`employeeid`=`tblvillage`.`employeeid` "
                + "INNER JOIN `tblsocialmedia` "
                + "ON `tblguards`.`employeeid`=`tblsocialmedia`.`employeeid` "
                + "INNER JOIN `tblmedicaldetails` "
                + "ON `tblguards`.`employeeid`=`tblmedicaldetails`.`employeeid` "
                + "WHERE `tblguards`.`employeeid`=?");
        pst.setString(1, cmbSelectEmployee.getSelectionModel().getSelectedItem().toString());
        rs = pst.executeQuery();
        while (rs.next()) {
            txtFathername.setText(rs.getString("fathername"));
            txtMothername.setText(rs.getString("mothername"));

            cmbGender.setValue(rs.getString("married"));
            txtLanguage.setText(rs.getString("languagespeak"));
            txtLanguageWrite.setText(rs.getString("languagewrite"));
            cmbEthnicOrigin.setValue(rs.getString("ethnicorigin"));
            txtFacebook.setText(rs.getString("socialmedialink"));
            txtBloodGroup.setText(rs.getString("bloodgroup"));
        }
        pst.close();
        rs.close();

    }

    @FXML
    public void setDependantsColumns() {

        System.out.println("Creating columns...");
        TableColumn colNo = new TableColumn("No. Of Dependants");
        colNo.setCellValueFactory(new PropertyValueFactory("id"));
        colNo.setPrefWidth(130);

        TableColumn colDependantName = new TableColumn("Dependant Name");
        colDependantName.setMinWidth(150);
        colDependantName.setCellValueFactory(new PropertyValueFactory("dependantname"));

        TableColumn colRelationship = new TableColumn("Relationship");
        colRelationship.setMinWidth(150);
        colRelationship.setCellValueFactory(new PropertyValueFactory("relationship"));

        TableColumn colDependanceNotes = new TableColumn("Dependance Notes");
        colDependanceNotes.setCellValueFactory(new PropertyValueFactory("dependanceNotes"));
        colDependanceNotes.setPrefWidth(200);
        tableView.getColumns().addAll(colNo, colDependantName, colRelationship, colDependanceNotes);
        colNo.setSortable(false);
        colDependantName.setSortable(false);
        colRelationship.setSortable(false);
    }

    @FXML
    public void onCloseRequest() {
        tableView.getItems().clear();
    }

    @FXML
    public void loadDependents() throws SQLException, ClassNotFoundException {
        if (cmbSelectEmployee.getSelectionModel().isEmpty()) {
            Alert alertSelect = new Alert(AlertType.INFORMATION);
            alertSelect.setHeaderText(null);
            alertSelect.setContentText("Select employee before loading contacts.");
            alertSelect.showAndWait();
            return;
        }

        connection = connexion.getConnetion();
        pst = connection.prepareStatement("SELECT `id`, CONCAT(`spousename`,' ', `spousesurname`) AS employee, `numberofdependance`, `dependancenotes`,"
                + "`employeeid`, `relationship` FROM `tbldependance` WHERE `employeeid`=?");
        pst.setString(1, cmbSelectEmployee.getSelectionModel().getSelectedItem().toString());
        rs = pst.executeQuery();
        System.out.println("Executed the executeQuery...");
        tableView.getItems().clear();
        while (rs.next()) {
            System.out.println("Looping...");
            data.addAll(new Dependance(rs.getString("numberofdependance"), rs.getString("employee"), rs.getString("relationship"), rs.getString("dependancenotes")));

            tableView.setItems(data);

        }
        pst.close();
        rs.close();
    }

    @FXML
    public void selectedDependant() {
        Dependance dependance = tableView.getSelectionModel().getSelectedItem();
        if (dependance == null) {
            functions.alertInformation(alert, "Nothing selected");
            return;
        }
        txtDependantName.setText(dependance.getDependantname());
        txtRelationship.setText(dependance.getRelationship());
        txtNumberOfDependance.setText(dependance.getId());
        txaDependanceNotes.setText(dependance.getDependanceNotes());
    }

    @FXML
    public void refreshTableDependants() {
        txtDependantName.clear();
        txtRelationship.clear();
        txtNumberOfDependance.clear();
        txaDependanceNotes.clear();
        tableView.refresh();
    }

    @FXML
    public void loadContactsDetails() throws SQLException, ClassNotFoundException {
        if (cmbSelectEmployee.getSelectionModel().isEmpty()) {
            functions.alertInformation(alert, "Select employee before loading contacts.");
            return;
        }
        //load employees contact details
        connection = connexion.getConnetion();
        pst = connection.prepareStatement("SELECT `id`, `employeeid`, `areacode`, `countrycode`, `workphone`, `workmail`, "
                + "`homephone`, `cellmobile`, `personalemail`, `emepersonaname`, `emerelationship`, `emehomephone`, `emeemail`,"
                + " `emeaddress`, `correspaddress`, `state`, `sameascorresp`, `permaddress`, `permstate`, `permcountry`, `permzipcode`"
                + " FROM `tblrecruitscontacts` "
                + " WHERE `employeeid` = ?");
        pst.setString(1, cmbSelectEmployee.getSelectionModel().getSelectedItem().toString().toUpperCase());
        rs = pst.executeQuery();
        System.out.println("Executed load contact details");
        while (rs.next()) {
            txtWorkPhone.setText(rs.getString("workphone"));
            txtWorkEmail.setText(rs.getString("workmail"));
            txtHomePhone.setText(rs.getString("homephone"));
            txtCellMobile.setText(rs.getString("cellmobile"));
            txtPersonalEmail.setText(rs.getString("personalemail"));
            txtPersonname.setText(rs.getString("emepersonaname"));
            txtRelationShip.setText(rs.getString("emerelationship"));
            txtHomePhon.setText(rs.getString("emehomephone"));
            txtEmail.setText(rs.getString("emeemail"));
            txtEmergencyAddress.setText(rs.getString("emeaddress"));
            txtAddress.setText(rs.getString("correspaddress"));
            txtState.setText(rs.getString("state"));
            chkSameAsCAddress.setSelected(rs.getBoolean("sameascorresp"));
            txtAddres.setText(rs.getString("permaddress"));
            txtStat.setText(rs.getString("permstate"));
            cmbCountr.setValue(rs.getString("permcountry"));
            txtZipPinCode.setText(rs.getString("countrycode"));
        }
        checkBoxSameAsCorrespondenceAddress();
    }

    @FXML
    public void checkBoxSameAsCorrespondenceAddress() {
        if (chkSameAsCAddress.isSelected()) {
            txtAddres.setText(txtAddress.getText().toUpperCase());
            txtStat.setText(txtState.getText().toUpperCase());
            //cmbCountr.setValue(cmbCountry.getValue().toString().toUpperCase());
            txtZipPinCod.setText(txtZipPinCode.getText().toUpperCase());
        }
    }

    @FXML
    public void loadQualificationDetails() throws SQLException, ClassNotFoundException {
        sno.setCellValueFactory(new PropertyValueFactory("employeeno"));
        educationalLevel.setCellValueFactory(new PropertyValueFactory("educationLevel"));
        school.setCellValueFactory(new PropertyValueFactory("school"));
        degree.setCellValueFactory(new PropertyValueFactory("degree"));
        completionYear.setCellValueFactory(new PropertyValueFactory("completeionYear"));
        connection = connexion.getConnetion();
        pst = connection.prepareStatement("SELECT `id`, `employeeid`, `educationlevel`, `school`, `degree`, `completionyear`, `datecreated`,"
                + " `usercreated`, `machinecreatedon`, `lastdatemodified`, `lastusermodified`, `lastmachinemodifiedon`"
                + " FROM `tblqualifications`"
                + " WHERE `employeeid` = ?");
        pst.setString(1, cmbSelectEmployee.getSelectionModel().getSelectedItem().toString());
        rs = pst.executeQuery();
        tableQualifications.getItems().clear();
        System.out.println("Loaded qualification details\n");
        while (rs.next()) {
            data1.add(new Qualifications(rs.getString("employeeid").toUpperCase(), rs.getString("educationlevel").toUpperCase(),
                    rs.getString("school").toUpperCase(), rs.getString("degree").toUpperCase(), rs.getDate("completionyear")));
            tableQualifications.setItems(data1);
        }
    }

    @FXML
    public void showQualificationDetailsInFields() {
        Qualifications qualifications = tableQualifications.getSelectionModel().getSelectedItem();
        if (qualifications == null) {
            functions.alertInformation(alert, "Nothing selected");
            return;
        }
        cmbSelectEducationLevel.setValue(qualifications.getEducationLevel().toUpperCase());
        txtSchoolName.setText(qualifications.getSchool().toUpperCase());
        txtDegree.setText(qualifications.getDegree().toUpperCase());
        dtpCompletionYear.setValue(qualifications.getCompleteionYear().toLocalDate());
    }

    @FXML
    public void insertQualificationDetails() throws SQLException, SQLException, ClassNotFoundException, UnknownHostException {
        if (cmbSelectEducationLevel.getValue() == null
                || txtSchoolName.getText().isEmpty()
                || txtDegree.getText().isEmpty()
                || dtpCompletionYear.getValue() == null) {
            functions.alertError(alert, "Nothing selected");
            return;
        }
        connection = connexion.getConnetion();
        pst = connection.prepareStatement("INSERT INTO `tblqualifications`( `employeeid`, `educationlevel`, `school`, `degree`,"
                + " `completionyear`, `usercreated`, `machinecreatedon`, `lastusermodified` "
                + " ) VALUES (?,?,?,?,?,?,?,?)");
        pst.setString(1, cmbSelectEmployee.getSelectionModel().getSelectedItem().toString());
        pst.setString(2, cmbSelectEducationLevel.getSelectionModel().getSelectedItem().toString());
        pst.setString(3, txtSchoolName.getText().toUpperCase());
        pst.setString(4, txtDegree.getText().toUpperCase());
        pst.setInt(5, dtpCompletionYear.getValue().getYear());
        pst.setString(6, java.net.Inet4Address.getLocalHost().getHostName());
        pst.setString(7, java.net.Inet4Address.getLocalHost().getHostName());
        pst.setString(8, java.net.Inet4Address.getLocalHost().getHostName());
        int success = pst.executeUpdate();
        switch (success) {
            case 0:
                functions.alertInformation(alert, "Failed to update");
                break;
            case 1:
                functions.alertSuccessful(alert, "Succesfully updated");
                refreshInputControls();
                break;
            default:
                functions.alertError(alert, "Failed to initiate update operation");
        }
    }

    @FXML
    public void refreshInputControls() throws SQLException, ClassNotFoundException {

        cmbSelectEducationLevel.getItems().clear();
        txtSchoolName.clear();
        txtDegree.clear();
        dtpCompletionYear.setValue(null);
        loadQualificationDetails();
    }

    @FXML
    public void loadWorkExperienceDetails() throws SQLException, ClassNotFoundException {
        id.setCellValueFactory(new PropertyValueFactory("id"));
        companyName.setCellValueFactory(new PropertyValueFactory("companyName"));
        designation.setCellValueFactory(new PropertyValueFactory("designation"));
        from.setCellValueFactory(new PropertyValueFactory("from"));
        to.setCellValueFactory(new PropertyValueFactory("to"));
        otherDetails.setCellValueFactory(new PropertyValueFactory("otherDetails"));
        colReasonsForLeaving.setCellValueFactory(new PropertyValueFactory("reasonsForLeaving"));
        colTelephone.setCellValueFactory(new PropertyValueFactory("telephone"));
        colAddressOfEmployer.setCellValueFactory(new PropertyValueFactory("addressOfEmployer"));
        connection = connexion.getConnetion();
        pst = connection.prepareStatement("SELECT `id`, `employeeid`, `nameofemployer`, `addressofemployer`, `telephonenumber`, "
                + "`datefrom`, `dateto`, `title`, `totalexperience`, `experiencewithus`, `monthlysalary`, `monthlyincome`, `reasonforleaving`,"
                + " `notes`, `datecreated`, `usercreated`, `machinecreatedon`, `lastdatemodified`, `lastmachinemodifiedon`"
                + " FROM `tblworkexperience` "
                + " WHERE `employeeid` = ? AND `deleted`=0");
        pst.setString(1, cmbSelectEmployee.getSelectionModel().getSelectedItem().toString());
        rs = pst.executeQuery();
        tableWorkExperience.getItems().clear();
        while (rs.next()) {
            data2.add(new WorkExperience(rs.getInt("id"), rs.getString("nameofemployer"), rs.getString("title"), rs.getDate("datefrom"), rs.getDate("dateto"),
                    rs.getString("notes"), rs.getString("telephonenumber"), rs.getString("reasonforleaving"), rs.getString("addressofemployer")));
            tableWorkExperience.setItems(data2);
        }
    }

    @FXML
    public void showWorkExperienceDetailsInFields() {
        WorkExperience workExperience = tableWorkExperience.getSelectionModel().getSelectedItem();
        if (workExperience == null) {
            functions.alertError(alert, "Nothing selected");
            return;
        }
        lblId.setText(Integer.toString(workExperience.getId()));
        txtCompanyName.setText(workExperience.getCompanyName().toUpperCase());
        txtDesignation.setText(workExperience.getDesignation().toUpperCase());
        dtpFrom.setValue(workExperience.getFrom().toLocalDate());
        dtpTo.setValue(workExperience.getTo().toLocalDate());
        txaOtherDetails.setText(workExperience.getOtherDetails().toUpperCase());
        txtTelephone.setText(workExperience.getTelephone());
        txaReasonsForLeaving.setText(workExperience.getReasonsForLeaving().toUpperCase());
        txaAddressOfEmployer.setText(workExperience.getAddressOfEmployer().toUpperCase());
    }

    @FXML
    public void refreshWorkExperienceInputControls() throws SQLException, ClassNotFoundException {
        lblId.setText("");
        txtCompanyName.clear();
        txtDesignation.clear();
        dtpFrom.setValue(null);
        dtpTo.setValue(null);
        txaOtherDetails.clear();
        txtTelephone.clear();
        txaReasonsForLeaving.clear();
        txaAddressOfEmployer.clear();
        loadWorkExperienceDetails();
    }

    @FXML
    public void loadSkillDetails() throws SQLException, ClassNotFoundException {
        if (cmbSelectEmployee.getValue() == null) {
            return;
        }
        connection = connexion.getConnetion();
        pst = connection.prepareStatement("SELECT `tblemployeeskills`.`id` AS id, `tblemployeeskills`.`skillid` AS skillid,"
                + " `tblemployeeskills`.`employeeid` AS employeeid, `level`, `experience`, `currentlyengaged`, "
                + " `tblemployeeskills`.`active` AS active, `tblemployeeskills`.`deleted` AS deleted, `skilldesc`, "
                + " `skilldesclong`, `validityperiod` "
                + " FROM `tblemployeeskills`"
                + " INNER JOIN `tblskills`"
                + " ON `tblskills`.`skillid` = `tblemployeeskills`.`skillid`"
                + " WHERE `tblemployeeskills`.`employeeid` = ? AND `tblemployeeskills`.`deleted`='0'");
        pst.setString(1, cmbSelectEmployee.getSelectionModel().getSelectedItem().toString());
        rs = pst.executeQuery();
        tableNewSkills.getItems().clear();
        dataSkills.clear();
        while (rs.next()) {
            dataSkills.add(new Skills(rs.getInt("id"), rs.getString("employeeid"), rs.getString("skilldesc"), rs.getString("level"),
                    rs.getString("experience"), Boolean.toString(rs.getBoolean("currentlyengaged")), rs.getBoolean("deleted")));
            tableNewSkills.setItems(dataSkills);
        }

    }

    @FXML
    public void loadSkills() throws SQLException, ClassNotFoundException {
        connection = connexion.getConnetion();
        pst = connection.prepareStatement("SELECT `id`, `skillid`, `skilldesc`, `skilldesclong`, `validityperiod`, "
                + "`active`, `deleted` FROM `tblskills` "
                + "WHERE `deleted`=?");
        pst.setBoolean(1, false);
        rs = pst.executeQuery();
        while (rs.next()) {
            cmbSkills.getItems().addAll(rs.getString("skilldesc"));
        }
    }

    @FXML
    public void setNewSkillsColumns() {
        columns = tableNewSkills.getColumns();
        final TableColumn<Skills, ?> colId = new TableColumn("#");
        colId.setCellValueFactory(new PropertyValueFactory("id"));
        colId.setPrefWidth(20);
        columns.add(colId);

        final TableColumn<Skills, ?> colNo = new TableColumn("Emp No.");
        colNo.setCellValueFactory(new PropertyValueFactory("sn"));
        colNo.setPrefWidth(65);
        columns.add(colNo);

        final TableColumn<Skills, ?> colSkills = new TableColumn("Skill(s)");
        colSkills.setCellValueFactory(new PropertyValueFactory("skills"));
        colSkills.setPrefWidth(120);
        columns.add(colSkills);

        final TableColumn<Skills, ?> colLevel = new TableColumn("Level");
        colLevel.setCellValueFactory(new PropertyValueFactory("level"));
        colLevel.setPrefWidth(85);
        columns.add(colLevel);

        final TableColumn<Skills, ?> colExperience = new TableColumn("Experience");
        colExperience.setCellValueFactory(new PropertyValueFactory("experience"));
        colExperience.setPrefWidth(120);
        columns.add(colExperience);

        final TableColumn<Skills, ?> colCurrentlyEngaged = new TableColumn("Currently Engaged");
        colCurrentlyEngaged.setCellValueFactory(new PropertyValueFactory("currentlyEngaged"));
        colCurrentlyEngaged.setPrefWidth(120);
        columns.add(colCurrentlyEngaged);

        final TableColumn<Skills, Boolean> colDelete = new TableColumn("Action");
        colDelete.setCellValueFactory(new PropertyValueFactory("delete"));
        colDelete.setSortable(false);
        colDelete.setPrefWidth(75);
        colDelete.setCellFactory(new Callback<TableColumn<Skills, Boolean>, TableCell<Skills, Boolean>>() {
            @Override
            public TableCell<Skills, Boolean> call(TableColumn<Skills, Boolean> param) {
                return new ButtonCell(tableNewSkills);
            }
        });
        columns.add(colDelete);
        // tableNewSkills.getColumns().addAll(colNo, colSkills, colLevel, colExperience, colCurrentlyEngaged, colDelete);
    }

    @FXML
    public void loadEmployeesWithSimilarSkills() throws SQLException, ClassNotFoundException {
        colName.setCellValueFactory(new PropertyValueFactory("name"));
        colEmployeeId.setCellValueFactory(new PropertyValueFactory("employeeid"));
        colDesignation.setCellValueFactory(new PropertyValueFactory("designation"));
        colDepartment.setCellValueFactory(new PropertyValueFactory("department"));
        Skills skills = tableNewSkills.getSelectionModel().getSelectedItem();
        if (skills == null) {
            return;
        }
        connection = connexion.getConnetion();
        pst = connection.prepareStatement("SELECT DISTINCTROW `tblguards`.`id`, `skillid`, `tblguards`.`employeeid` AS employeeid, `firstname`, `middlename`, `surname`,`departmentname`, `designation`, `level`, `experience`, `currentlyengaged` FROM `tblguards` \n"
                + "INNER JOIN `tblemployeeskills`"
                + "ON `tblemployeeskills`.`employeeid` = `tblguards`.`employeeid`"
                + "INNER JOIN `tbldepartments` "
                + "ON `tbldepartments`.`departmentid` = `tblguards`.`departmentid` "
                + "INNER JOIN `tbldesignation` "
                + "ON `tbldesignation`.`designationid` = `tblguards`.`designationid` "
                + "WHERE `tblemployeeskills`.`level` = ?");
        pst.setString(1, skills.getLevel());
        rs = pst.executeQuery();
        tableSimilarSkills.getItems().clear();
        while (rs.next()) {
            dataSimilarSkills.add(new SimilarSkills(rs.getString("firstname").toUpperCase() + " " + rs.getString("middlename").toUpperCase().charAt(0) + " " + rs.getString("surname"), rs.getString("employeeid").toUpperCase(), rs.getString("designation").toUpperCase(), rs.getString("departmentname")));
            tableSimilarSkills.setItems(dataSimilarSkills);
        }
    }

    @FXML
    public void loadSubmittedDocumentDetails() throws SQLException, ClassNotFoundException {
        if (cmbSelectEmployee.getValue() == null) {
            functions.alertInformation(alert, "Select employee");
            return;
        }
        colId.setCellValueFactory(new PropertyValueFactory("id"));
        colDocumentName.setCellValueFactory(new PropertyValueFactory("documentName"));
        colDocumentType.setCellValueFactory(new PropertyValueFactory("documentType"));
        colSubmittedDate.setCellValueFactory(new PropertyValueFactory("submittedDate"));
        colExpiredOn.setCellValueFactory(new PropertyValueFactory("expiryDate"));
        colOriginalDuplicate.setCellValueFactory(new PropertyValueFactory("duplicate"));
        connection = connexion.getConnetion();
        pst = connection.prepareStatement("SELECT `tblemployeedocs`.`id` AS id, `tblemployeedocs`.`documentid` AS documentid, `documenttype`, `submittedtoemployee`,"
                + " `employeeid`, `documentname`, `submittedateissueddate`, `duplicate`, `expire`, `expirydate`"
                + " FROM `tblemployeedocuments` "
                + " INNER JOIN `tblemployeedocs`"
                + " ON `tblemployeedocs`.`documentid` = `tblemployeedocuments`.`documentid`"
                + " WHERE `tblemployeedocs`.`employeeid` = ? AND `submittedtoemployee` = '1' AND `tblemployeedocs`.`deleted`='0'");
        pst.setString(1, cmbSelectEmployee.getSelectionModel().getSelectedItem().toString());
        rs = pst.executeQuery();
        dataSubmitIssuedDocuments.clear();
        while (rs.next()) {
            dataSubmitIssuedDocuments.add(new SubmitIssuedDocuments(rs.getInt("id"), rs.getString("documentname"), rs.getString("documenttype"), rs.getDate("submittedateissueddate"),
                    rs.getDate("expirydate"), Boolean.toString(rs.getBoolean("duplicate"))));
            tableSubmittedDocuments.setItems(dataSubmitIssuedDocuments);
        }

        loadDocumentTypes();
        loadIssuedDocumentDetails();
    }

    @FXML
    public void loadIssuedDocumentDetails() throws SQLException, ClassNotFoundException {
        if (cmbSelectEmployee.getValue() == null) {
            functions.alertInformation(alert, "Select employee");
            return;
        }
        colI.setCellValueFactory(new PropertyValueFactory("id"));
        colDocumentNam.setCellValueFactory(new PropertyValueFactory("documentName"));
        colDocumentTyp.setCellValueFactory(new PropertyValueFactory("documentType"));
        colSubmittedDat.setCellValueFactory(new PropertyValueFactory("submittedDate"));
        colExpiredO.setCellValueFactory(new PropertyValueFactory("expiryDate"));
        colOriginalDuplicat.setCellValueFactory(new PropertyValueFactory("duplicate"));
        connection = connexion.getConnetion();
        pst = connection.prepareStatement("SELECT `tblemployeedocs`.`id` AS id, `tblemployeedocs`.`documentid` AS documentid, `documenttype`, `submittedtoemployee`,"
                + " `employeeid`, `documentname`, `submittedateissueddate`, `duplicate`, `expire`, `expirydate`"
                + " FROM `tblemployeedocuments` "
                + " INNER JOIN `tblemployeedocs`"
                + " ON `tblemployeedocs`.`documentid` = `tblemployeedocuments`.`documentid`"
                + " WHERE `tblemployeedocs`.`employeeid` = ? AND `submittedtoemployee` = '0' AND `tblemployeedocs`.`deleted`='0'");
        pst.setString(1, cmbSelectEmployee.getSelectionModel().getSelectedItem().toString());
        rs = pst.executeQuery();
        dataIssuedDocuments.clear();

        while (rs.next()) {
            dataIssuedDocuments.add(new SubmitIssuedDocuments(rs.getInt("id"), rs.getString("documentname"), rs.getString("documenttype"), rs.getDate("submittedateissueddate"),
                    rs.getDate("expirydate"), Boolean.toString(rs.getBoolean("duplicate"))));
            tableIssuedDocuments.setItems(dataIssuedDocuments);

        }
    }

    @FXML
    public void loadDocumentTypes() throws SQLException, ClassNotFoundException {
        connection = connexion.getConnetion();
        pst = connection.prepareStatement("SELECT `id`, `documentid`, `documenttype`, `submittedtoemployee`"
                + " FROM `tblemployeedocuments`");
        rs = pst.executeQuery();
        cmbDocumentType.getItems().clear();
        while (rs.next()) {
            cmbDocumentType.getItems().add(rs.getString("documenttype"));
        }
    }

    @FXML
    public void uploadDocuments() throws IOException, SQLException, ClassNotFoundException {
        if (txtSelectDocument.getText().isEmpty()
                || cmbDocumentType.getValue() == null) {
            functions.alertInformation(alert, "No file for upload");
            return;
        }
        connection = connexion.getConnetion();
        pst = connection.prepareStatement("INSERT INTO `tblemployeedocs`( `documentid`, `employeeid`, `documentname`,"
                + " `submittedateissueddate`, `duplicate`, `expire`, `expirydate`,`deleted`, `usercreated`, `datecreated`,"
                + " `machinecreatedon`)"
                + " VALUES (?,?,?,?,?,?,?,?,?,CURDATE(),?)");

        pst.setString(1, lblDocumentId.getText());
        pst.setString(2, cmbSelectEmployee.getSelectionModel().getSelectedItem().toString());
        pst.setString(3, txtSelectDocument.getText());
        pst.setString(4, dtpSubmittedIssuedDate.getValue().getYear() + "-" + dtpSubmittedIssuedDate.getValue().getMonthValue() + "-" + dtpSubmittedIssuedDate.getValue().getDayOfMonth());
        pst.setBoolean(5, rdbOriginal.isSelected());
        pst.setBoolean(6, rdbYes.isSelected());
        if (rdbYes.isSelected()) {
            pst.setString(7, dtpExpirationDate.getValue().getYear() + "-" + dtpExpirationDate.getValue().getMonthValue() + "-" + dtpExpirationDate.getValue().getDayOfMonth());
        }
        pst.setBoolean(8, false);
        pst.setString(9, java.net.Inet4Address.getLocalHost().getHostName());
        pst.setString(10, java.net.Inet4Address.getLocalHost().getHostName());
        pst.execute();
        functions.alertSuccessful(alert, "Successfully inserted");
        File file = new File("C:\\OctopusHR Documents\\" + cmbDocumentType.getValue());
        File fileSource = new File(lblPath.getText() + "\\" + txtSelectDocument.getText());
        if (!file.exists()) {

            boolean flag = file.mkdirs();
            File files = new File("C:\\OctopusHR Documents\\" + cmbDocumentType.getValue() + "\\" + txtSelectDocument.getText());
            if (!files.exists()) {

                File fileDestin = new File(file.getPath() + "\\" + txtSelectDocument.getText());
                Files.copy(fileSource.toPath(), fileDestin.toPath());
                functions.alertSuccessful(alert, "File successfully uploaded");
                return;
            }
        } else {
            File files = new File("C:\\OctopusHR Documents\\" + cmbDocumentType.getValue() + "\\" + txtSelectDocument.getText());
            if (!files.exists()) {

                File fileDestin = new File(file.getPath() + "\\" + txtSelectDocument.getText());
                Files.copy(fileSource.toPath(), fileDestin.toPath());
                functions.alertSuccessful(alert, "File successfully uploaded");
                return;
            }
        }
        functions.alertInformation(alert, "File exists");
    }

    @FXML
    public void selectDocumentId() throws SQLException, ClassNotFoundException {
        connection = connexion.getConnetion();
        pst = connection.prepareStatement("SELECT `id`, `documentid`, `documenttype`, `submittedtoemployee` "
                + " FROM `tblemployeedocuments` WHERE `documenttype` =?");
        pst.setString(1, cmbDocumentType.getValue().toString());
        rs = pst.executeQuery();
        while (rs.next()) {
            lblDocumentId.setText(rs.getString("documentid"));

        }
    }

    @FXML
    public void selectDocument() {
        String fileName;
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new java.io.File("."));
        chooser.setDialogTitle("Select document name");
        chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        chooser.setAcceptAllFileFilterUsed(false);

        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            fileName = chooser.getSelectedFile().getName();
            txtSelectDocument.setText(fileName);
            lblPath.setText(chooser.getCurrentDirectory().getAbsolutePath());
            System.out.println("getCurrentDirectory(): " + chooser.getCurrentDirectory());
            System.out.println("getSelectedFile() : " + chooser.getSelectedFile());
        } else {
            System.out.println("No Selection ");
        }
    }

    @FXML
    public void refreshDocumentControls() throws SQLException, ClassNotFoundException {
        cmbDocumentType.setValue(null);
        txtSelectDocument.clear();
        dtpSubmittedIssuedDate.setValue(null);
        dtpExpirationDate.setValue(null);
        loadSubmittedDocumentDetails();
    }

    @FXML
    public void reflectSubmittedDocuments() {
        SubmitIssuedDocuments submitDocuments = tableSubmittedDocuments.getSelectionModel().getSelectedItem();
        if (submitDocuments != null) {
            lblSelectId.setText(String.valueOf(submitDocuments.getId()));
        }
    }

    @FXML
    public void reflectIssuedDocuments() {
        SubmitIssuedDocuments issuedDocuments = tableIssuedDocuments.getSelectionModel().getSelectedItem();
        if (issuedDocuments != null) {
            lblSelectId.setText(String.valueOf(issuedDocuments.getId()));
        }
    }

    @FXML
    public void deleteDocument() throws SQLException, ClassNotFoundException, UnknownHostException {
        SubmitIssuedDocuments submitDocuments = tableSubmittedDocuments.getSelectionModel().getSelectedItem();
        SubmitIssuedDocuments issuedDocuments = tableIssuedDocuments.getSelectionModel().getSelectedItem();
        if (submitDocuments == null && issuedDocuments == null) {
            functions.alertError(alert, "Select dcoument to delete");
            return;
        }
        if (submitDocuments != null && issuedDocuments == null) {
            connection = connexion.getConnetion();
            pst = connection.prepareStatement("UPDATE `tblemployeedocs` SET "
                    + "`deleted`=?,`lastdatemodified`=CURDATE(),`lastmachinemodifiedon`=?"
                    + " WHERE `id`=? AND `employeeid`=?");
            pst.setBoolean(1, true);
            pst.setString(2, java.net.Inet4Address.getLocalHost().getHostAddress());
            pst.setInt(3, Integer.parseInt(lblSelectId.getText()));
            pst.setString(4, cmbSelectEmployee.getValue().toString());
            pst.execute();
            functions.alertSuccessful(alert, "Successfully deleted");
            refreshDocumentControls();
            return;
        }
        if (submitDocuments == null && issuedDocuments != null) {
            connection = connexion.getConnetion();
            pst = connection.prepareStatement("UPDATE `tblemployeedocs` SET "
                    + "`deleted`=?,`lastdatemodified`=CURDATE(),`lastmachinemodifiedon`=?"
                    + " WHERE `id`=? AND `employeeid`=?");
            pst.setBoolean(1, true);
            pst.setString(2, java.net.Inet4Address.getLocalHost().getHostAddress());
            pst.setInt(3, Integer.parseInt(lblSelectId.getText()));
            pst.setString(4, cmbSelectEmployee.getValue().toString());
            pst.execute();
            functions.alertSuccessful(alert, "Successfully deleted");
            refreshDocumentControls();
        }
    }

    @FXML
    public void showEmailAttachment() throws IOException {
        stage = new Stage();
        Pane root = FXMLLoader.load(getClass().getResource("/octopushr/documents/emailAttachmentDocument.fxml"));
        Scene scene = new Scene(root);
        scene.getStylesheets().add("/resources/css/emailattachmentdocumentcontroller.css");
        stage.setTitle("Send Mail Attachment");
        stage.setResizable(false);
        stage.centerOnScreen();
        stage.setScene(scene);
        stage.getIcons().add(new Image("/resources/icons/identification-documents.png"));
        stage.show();
    }

    @FXML
    public void loadAttendanceDetails() {
    }

    @FXML
    public void loadLeaveDetails() {
    }

    @FXML
    public void loadPayrollDetails() {
    }

    @FXML
    public void loadPerformanceIntelligenceDetails() {
    }

    @FXML
    public void loadDisciplinaryDetails() {
    }

    @FXML
    public void loadTrainingDetails() {
    }

    @FXML
    public void loadTravelDetails() {
    }

    @FXML
    public void loadFacilities() {
    }

    @FXML
    public void loadMedicalDetails() {
    }

    @FXML
    public void loadComplianceAndLegalDetails() {
    }

    @FXML
    public void loadOtherDetails() {
    }

    @FXML
    public void loadFilterByDepartmentAndFilterByEmployeeNumber(String department, String employeeNumber) {
        cmbFilterByDepartments.setValue(department);
        cmbSelectEmployee.setValue(employeeNumber);

    }

    //update
    @FXML
    public void updateQuickDetails() throws SQLException, ClassNotFoundException, UnknownHostException {
        if (txtFirstname.getText().isEmpty()
                || txtSurname.getText().isEmpty()
                || txtEmployeeIdq.getText().isEmpty()) {
            functions.alertInformation(alert, "Input invalid");
            return;
        }

        connection = connexion.getConnetion();
        pst = connection.prepareStatement("UPDATE `tblguards` SET `employeeid`=?,`firstname`=?,"
                + "`middlename`=?,`surname`=?,`designationid`=?,`departmentid`=?,"
                + "`lastdatemodified`=?,`lastusermodified`=?,"
                + "`lastmachinemodifedon`=? WHERE `employeeid`=?");
        pst.setString(1, cmbSelectEmployee.getSelectionModel().getSelectedItem().toString().trim());
        pst.setString(2, txtFirstname.getText().toUpperCase().trim());
        pst.setString(3, txtMiddlename.getText().toUpperCase().trim());
        pst.setString(4, txtSurname.getText().toUpperCase().trim());
        pst.setString(5, lblDesignationId.getText().toUpperCase().trim());
        pst.setString(6, lblDepartmentId.getText().toUpperCase().trim());
        pst.setDate(7, Date.valueOf(LocalDate.now())); //lastdatemodified
        pst.setString(8, InetAddress.getLocalHost().getHostName().toUpperCase().trim()); //lastusermodified
        pst.setString(9, InetAddress.getLocalHost().getHostName().toUpperCase().trim()); //lastusermodified
        pst.setString(10, cmbSelectEmployee.getSelectionModel().getSelectedItem().toString().trim());
        pst.execute();
        alert = new Alert(AlertType.CONFIRMATION);
        alert.setHeaderText(null);
        alert.setContentText("Successfully updated");

        Optional<ButtonType> result = alert.showAndWait();
        if (result.get() == ButtonType.OK) {
            txtFirstname.clear();
            txtMiddlename.clear();
            txtSurname.clear();
            txtEmployeeID.clear();
            cmbDesignation.setValue(null);
            cmbselectDepartment1.setValue(null);
            txttotalExperience.clear();
            txtexperienceWithUs.clear();
            txtMonthlySalary.clear();
            lblLastEmployeeId.setText(null);
        }
    }

    @FXML
    public void updateEmployees() {
    }

    @FXML
    public void updatePersonalDetails() {
    }

    @FXML
    public void updateDependantsDetails() throws SQLException, ClassNotFoundException {
        if (txtRelationship.getText().isEmpty()
                || txtNumberOfDependance.getText().isEmpty()
                || txtRelationship.getText().isEmpty()) {
            functions.alertInformation(alert, "Nothing to update.\nPlease make sure the record to be updated is selected before update.");
            return;
        }
        connection = connexion.getConnetion();
        pst = connection.prepareStatement("UPDATE `tbldependance` SET `numberofdependance`=?,`dependancenotes`=?,`relationship`=? WHERE `employeeid`=?");
        pst.setString(1, txtNumberOfDependance.getText().toUpperCase());
        pst.setString(2, txaDependanceNotes.getText().toUpperCase());
        pst.setString(3, txtRelationship.getText().toUpperCase());
        pst.setString(4, cmbSelectEmployee.getSelectionModel().getSelectedItem().toString().toUpperCase());
        int success = pst.executeUpdate();
        switch (success) {
            case 0:
                functions.alertError(alert, "Failed to update the dependants for " + cmbSelectEmployee.getSelectionModel().getSelectedItem().toString().toUpperCase() + " ID number");
                break;
            case 1:
                functions.alertSuccessful(alert, "Successfully updated");
                refreshTableDependants();
                break;
            default:
                functions.alertInformation(alert, "Failed to initiate update operation");
        }
    }

    @FXML
    public void updateContactsDetails() throws SQLException, ClassNotFoundException {
        if (txtWorkPhone.getText().isEmpty()
                || txtWorkEmail.getText().isEmpty()
                || txtHomePhone.getText().isEmpty()
                || txtCellMobile.getText().isEmpty()
                || txtPersonalEmail.getText().isEmpty()
                || txtPersonname.getText().isEmpty()
                || txtRelationShip.getText().isEmpty()
                || txtHomePhon.getText().isEmpty()
                || txtEmail.getText().isEmpty()
                || txtEmergencyAddress.getText().isEmpty()
                || txtAddress.getText().isEmpty()
                || txtState.getText().isEmpty()) {
            functions.alertInformation(alert, "Null values are not accepted in the system");
            return;
        }

        connection = connexion.getConnetion();
        pst = connection.prepareStatement("UPDATE `tblrecruitscontacts` SET `areacode`=?,`countrycode`=?,`workphone`=?,`workmail`=?,`homephone`=?,"
                + "`cellmobile`=?,`personalemail`=?,`emepersonaname`=?,`emerelationship`=?,`emehomephone`=?,`emeemail`=?,`emeaddress`=?,"
                + "`correspaddress`=?,`state`=?,`sameascorresp`=?,`permaddress`=?,`permstate`=?,`permcountry`=?,`permzipcode`=? "
                + " WHERE `employeeid` = ?");
        pst.setString(1, txtZipPinCode.getText());
        pst.setString(2, txtZipPinCode.getText());
        pst.setString(3, txtWorkPhone.getText());
        pst.setString(4, txtWorkEmail.getText());
        pst.setString(5, txtHomePhone.getText());
        pst.setString(6, txtCellMobile.getText());
        pst.setString(7, txtPersonalEmail.getText());
        pst.setString(8, txtPersonname.getText().toUpperCase());
        pst.setString(9, txtRelationShip.getText().toUpperCase());
        pst.setString(10, txtHomePhon.getText());
        pst.setString(11, txtEmail.getText());
        pst.setString(12, txtEmergencyAddress.getText().toUpperCase());
        pst.setString(13, txtAddress.getText().toUpperCase());
        pst.setString(14, txtState.getText().toUpperCase());
        pst.setBoolean(15, chkSameAsCAddress.isSelected());
        if (chkSameAsCAddress.isSelected()) {
            pst.setString(16, txtAddres.getText().toUpperCase());
            pst.setString(17, txtStat.getText().toUpperCase());
            pst.setString(18, cmbCountr.getSelectionModel().getSelectedItem().toString().toUpperCase());
            pst.setString(19, txtZipPinCod.getText());

        }
        pst.setString(20, cmbSelectEmployee.getSelectionModel().getSelectedItem().toString());
        int success = pst.executeUpdate();
        switch (success) {
            case 0:
                functions.alertInformation(alert, "Failed update operation");
                break;
            case 1:
                functions.alertSuccessful(alert, "Successfully updated");
                refreshContactsInput();
                break;
            default:
                functions.alertError(alert, "Failed to initiate update operation");

        }
    }

    @FXML
    public void refreshContactsInput() {
        txtZipPinCode.clear();
        txtZipPinCode.clear();
        txtWorkPhone.clear();
        txtWorkEmail.clear();
        txtHomePhone.clear();
        txtCellMobile.clear();
        txtPersonalEmail.clear();
        txtPersonname.clear();
        txtRelationShip.clear();
        txtHomePhon.clear();
        txtEmail.clear();
        txtEmergencyAddress.clear();
        txtAddress.clear();
        txtState.clear();
        chkSameAsCAddress.isSelected();
        txtAddres.clear();
        txtStat.clear();
        cmbCountr.getItems().clear();
        txtZipPinCod.clear();
    }

    @FXML
    public void updateQualificationDetails() throws SQLException, ClassNotFoundException, UnknownHostException {
        Qualifications qualifications = tableQualifications.getSelectionModel().getSelectedItem();
        if (qualifications == null) {
            functions.alertInformation(alert, "Select the desired row to be updated");
            return;
        }

        connection = connexion.getConnetion();
        pst = connection.prepareStatement("UPDATE `tblqualifications` SET `employeeid`=?,`educationlevel`=?,`school`=?,`degree`=?,"
                + " `completionyear`=?,`lastusermodified`=? "
                + " WHERE `employeeid`=?");
        pst.setString(1, cmbSelectEmployee.getSelectionModel().getSelectedItem().toString().toUpperCase());
        pst.setString(2, cmbSelectEducationLevel.getSelectionModel().getSelectedItem().toString().toUpperCase());
        pst.setString(3, txtSchoolName.getText().toUpperCase());
        pst.setString(4, txtDegree.getText().toUpperCase());
        pst.setInt(5, dtpCompletionYear.getValue().getYear());
        pst.setString(6, java.net.Inet4Address.getLocalHost().getHostName());
        pst.setString(7, cmbSelectEmployee.getSelectionModel().getSelectedItem().toString().toUpperCase());
        pst.executeUpdate();
        functions.alertSuccessful(alert, "Successfully updated");

    }

    @FXML
    public void updateWorkExperienceDetails() throws SQLException, ClassNotFoundException, UnknownHostException {
        WorkExperience workExperience = tableWorkExperience.getSelectionModel().getSelectedItem();
        if (workExperience == null) {
            functions.alertInformation(alert, "Slect the desired record to update");
            return;
        }
        connection = connexion.getConnetion();
        pst = connection.prepareStatement("UPDATE `tblworkexperience` SET `employeeid`=?,`nameofemployer`=?,"
                + "`addressofemployer`=?,`telephonenumber`=?,`datefrom`=?,`dateto`=?,`title`=?,"
                + "`reasonforleaving`=?,`notes`=?,"
                + "`lastmachinemodifiedon`=? "
                + " WHERE `employeeid`=? AND `id`=?");
        pst.setString(1, cmbSelectEmployee.getSelectionModel().getSelectedItem().toString());
        pst.setString(2, txtCompanyName.getText().toUpperCase());
        pst.setString(3, txaAddressOfEmployer.getText().toUpperCase());
        pst.setString(4, txtTelephone.getText());
        pst.setString(5, dtpFrom.getValue() + "-" + dtpFrom.getValue().getMonthValue() + "-" + dtpFrom.getValue().getDayOfMonth());
        pst.setString(6, dtpTo.getValue() + "-" + dtpTo.getValue().getMonthValue() + "-" + dtpFrom.getValue().getDayOfMonth());
        pst.setString(7, txtDesignation.getText().toUpperCase());
        pst.setString(8, txaReasonsForLeaving.getText().toUpperCase());
        pst.setString(9, txaOtherDetails.getText().toUpperCase());
        pst.setString(10, java.net.Inet4Address.getLocalHost().getHostName());
        pst.setString(11, cmbSelectEmployee.getSelectionModel().getSelectedItem().toString());
        pst.setString(13, lblId.getText());
        pst.execute();
        functions.alertSuccessful(alert, "Successfully updated");
        refreshWorkExperienceInputControls();
    }

    @FXML
    public void insertWorkExperienceDetails() throws SQLException, ClassNotFoundException, UnknownHostException {
        if (txtCompanyName.getText().isEmpty()
                || txtDesignation.getText().isEmpty()
                || dtpFrom.getValue() == null
                || dtpTo.getValue() == null
                || txaOtherDetails.getText().isEmpty()) {
            functions.alertInformation(alert, "Input invalid");
            return;
        }
        connection = connexion.getConnetion();
        pst = connection.prepareStatement("INSERT INTO `tblworkexperience`(`employeeid`, `nameofemployer`, `addressofemployer`, "
                + "`telephonenumber`, `datefrom`, `dateto`, `title`,`reasonforleaving`, `notes`, `usercreated`, `machinecreatedon`, "
                + "`lastmachinemodifiedon`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)");
        pst.setString(1, cmbSelectEmployee.getSelectionModel().getSelectedItem().toString());
        pst.setString(2, txtCompanyName.getText().toUpperCase());
        pst.setString(3, txaAddressOfEmployer.getText().toUpperCase());
        pst.setString(4, txtTelephone.getText().toUpperCase());
        pst.setString(5, dtpFrom.getValue().getYear() + "-" + dtpFrom.getValue().getMonthValue() + "-" + dtpFrom.getValue().getDayOfMonth());
        pst.setString(6, dtpTo.getValue().getYear() + "-" + dtpTo.getValue().getMonthValue() + "-" + dtpTo.getValue().getDayOfMonth());
        pst.setString(7, txtDesignation.getText().toUpperCase());
        pst.setString(8, txaReasonsForLeaving.getText().toUpperCase());
        pst.setString(9, txaOtherDetails.getText().toUpperCase());
        pst.setString(10, java.net.Inet4Address.getLocalHost().getHostName());
        pst.setString(11, java.net.Inet4Address.getLocalHost().getHostName());
        pst.setString(12, java.net.Inet4Address.getLocalHost().getHostName());
        pst.execute();
        functions.alertSuccessful(alert, "Successfully added work experience");
        refreshWorkExperienceInputControls();
    }

    @FXML
    public void deleteWorkExperience() throws SQLException, ClassNotFoundException, UnknownHostException {
        WorkExperience workExperience = tableWorkExperience.getSelectionModel().getSelectedItem();
        if (workExperience == null) {
            functions.alertInformation(alert, "Nothing selected to be updated");
            return;
        }
        connection = connexion.getConnetion();
        pst = connection.prepareStatement("UPDATE `tblworkexperience` SET "
                + "`lastmachinemodifiedon`=?,`deleted`=?"
                + " WHERE `employeeid`=? AND id=?");
        pst.setString(1, java.net.Inet4Address.getLocalHost().getHostName());
        pst.setBoolean(2, true);
        pst.setString(3, cmbSelectEmployee.getSelectionModel().getSelectedItem().toString());
        pst.setString(4, lblId.getText());
        pst.execute();
        functions.alertSuccessful(alert, "Successfully deleted");
        refreshWorkExperienceInputControls();
    }

    @FXML
    public void updateSkillsDetails() throws SQLException, ClassNotFoundException {
        if (cmbSkills.getValue() == null
                || cmbLevel.getValue() == null
                || cmbExperience.getValue() == null) {
            functions.alertInformation(alert, "Information invalid");
            return;
        }
        connection = connexion.getConnetion();
        pst = connection.prepareStatement("INSERT INTO `tblemployeeskills`(`skillid`, `employeeid`, `level`, `experience`, `currentlyengaged`, `active`, `deleted`)"
                + " VALUES (?,?,?,?,?,?,?)");
        pst.setString(1, lblSkillId.getText().toUpperCase());
        pst.setString(2, cmbSelectEmployee.getSelectionModel().getSelectedItem().toString());
        pst.setString(3, cmbLevel.getSelectionModel().getSelectedItem().toString());
        pst.setString(4, cmbExperience.getSelectionModel().getSelectedItem().toString() + " YEARS " + cmbMonths.getSelectionModel().getSelectedItem().toString() + " MONTHS");
        pst.setBoolean(5, true);
        pst.setBoolean(6, true);
        pst.setBoolean(7, false);
        pst.execute();
        functions.alertSuccessful(alert, "Successfully added");
        loadSkillDetails();
    }

    @FXML
    public void loadSkillId() throws SQLException, ClassNotFoundException {
        connection = connexion.getConnetion();
        pst = connection.prepareStatement("SELECT `id`, `skillid`, `skilldesc`,`active`, `deleted` FROM `tblskills` WHERE `deleted`=? AND `skilldesc`=?");
        pst.setBoolean(1, false);
        pst.setString(2, cmbSkills.getSelectionModel().getSelectedItem().toString());
        rs = pst.executeQuery();
        while (rs.next()) {
            lblSkillId.setText(rs.getString("skillid"));
        }

    }

    @FXML
    public void addDocumentType() throws IOException {
        stage = new Stage();
        Pane root = FXMLLoader.load(getClass().getResource("/octopushr/documents/documentTypes.fxml"));
        Scene scene = new Scene(root);
        scene.getStylesheets().add("/resources/css/documenttypes.css");
        stage.setTitle("Document Types");
        stage.setResizable(false);
        stage.centerOnScreen();
        stage.setScene(scene);
        stage.getIcons().add(new Image("/resources/icons/identification-documents.png"));
        stage.show();
    }

    @FXML
    public void updateDocumentsDetails() {
    }

    @FXML
    public void updateAttendanceDetails() {
    }

    @FXML
    public void updateLeaveDetails() {
    }

    @FXML
    public void updatePayrollDetails() {
    }

    @FXML
    public void updatePerformanceIntelligenceDetails() {
    }

    @FXML
    public void updateDisciplinaryDetails() {
    }

    @FXML
    public void updateTrainingDetails() {
    }

    @FXML
    public void updateTravelDetails() {
    }

    @FXML
    public void updateFacilities() {
    }

    @FXML
    public void updateMedicalDetails() {
    }

    @FXML
    public void updateComplianceAndLegalDetails() {
    }

    @FXML
    public void updateOtherDetails() {
    }

    class ButtonCell extends TableCell<Skills, Boolean> {

        final Button cellButton = new Button("Delete");

        ButtonCell(final TableView tblView) {
            cellButton.setOnAction(new EventHandler<ActionEvent>() {

                @Override
                public void handle(ActionEvent t) {
                    try {
                        int selectedIndex = getTableRow().getIndex();
                        Skills toRemove = (Skills) tblView.getItems().get(selectedIndex);
                        connection = connexion.getConnetion();
                        pst = connection.prepareStatement("UPDATE `tblemployeeskills` SET `active`=?,`deleted`=?"
                                + " WHERE `id`=?");
                        pst.setBoolean(1, true);
                        pst.setBoolean(2, true);
                        pst.setInt(3, toRemove.getId());
                        pst.executeUpdate();
                        functions.alertSuccessful(alert, "Successfully deleted");
                        loadSkillDetails();
                    } catch (SQLException | ClassNotFoundException ex) {
                        functions.alertSuccessful(alert, "Error" + ex);
                    }
                }
            });
        }

        //Display button if the row is not empty
        @Override
        protected void updateItem(Boolean t, boolean empty) {
            super.updateItem(t, empty);
            if (!empty) {
                setGraphic(cellButton);
            }
        }
    }

    @FXML
    public void showPayrollSettings() throws IOException {
        stage = new Stage();
        Pane root = FXMLLoader.load(getClass().getResource("/octopushr/payrollAndSalaries/payrollSettings.fxml"));
        Scene scene = new Scene(root);
        scene.getStylesheets().add("/resources/css/payrollsettings.css");
        stage.setTitle("Payroll Settings");
        stage.setResizable(false);
        stage.centerOnScreen();
        stage.setScene(scene);
        stage.getIcons().add(new Image("/resources/icons/identification-documents.png"));
        stage.show();
    }

    @FXML
    public void showEmployeeBilling() throws IOException {
        stage = new Stage();
        Pane root = FXMLLoader.load(getClass().getResource("/octopushr/payrollAndSalaries/employeeBilling.fxml"));
        Scene scene = new Scene(root);
        scene.getStylesheets().add("/resources/css/employeebilling.css");
        stage.setTitle("Employee Billing");
        stage.setResizable(false);
        stage.centerOnScreen();
        stage.setScene(scene);
        stage.getIcons().add(new Image("/resources/icons/identification-documents.png"));
        stage.show();
    }

    //showEmployeeLeaveApplication
    @FXML
    public void showEmployeeLeaveApplication() {

    }

    @FXML
    public void showApproveLeaveApplication() {

    }

    @FXML
    public void showEmployeeLeaveTypes() {

    }

    @FXML
    public void showEmployeeCalendar() {

    }

    @FXML
    public void showEmployeeDepartmentDesignationOverview() {

    }

    @FXML
    public void showOctopusReports() {

    }

    @FXML
    public void showEmployeeGrievances() {

    }

    @FXML
    public void showLoanAndAdvances() throws IOException {
        stage = new Stage();
        Pane root = FXMLLoader.load(getClass().getResource("/octopushr/payrollAndSalaries/loanAndAdvances.fxml"));
        Scene scene = new Scene(root);
        scene.getStylesheets().add("/resources/css/loanandadvances.css");
        stage.setTitle("Loans And Advances");
        stage.setResizable(false);
        stage.centerOnScreen();
        stage.setScene(scene);
        stage.getIcons().add(new Image("/resources/icons/identification-documents.png"));
        stage.show();
    }

//    @FXML
//        public void showEmployeeDepartmentDesignationOverview() throws IOException {
//        stage = new Stage();
//        Pane root = FXMLLoader.load(getClass().getResource("/octopushr/employees/employeeDepartmentDesignation.fxml"));
//        Scene scene = new Scene(root);
//        scene.getStylesheets().add("/resources/css/employeedepartmentdesignation.css");
//        stage.setTitle("Employee Department / Designation Overview");
//        stage.setResizable(false);
//        stage.centerOnScreen();
//        stage.setScene(scene);
//        stage.getIcons().add(new Image("/resources/icons/identification-documents.png"));
//        stage.show();
//    }
//
//    @FXML
//        public void showOctopusReports() throws IOException {
//        stage = new Stage();
//        Pane root = FXMLLoader.load(getClass().getResource("/octopushr/reports/octopusReport.fxml"));
//        Scene scene = new Scene(root);
//        scene.getStylesheets().add("/resources/css/octopusreport.css");
//        stage.setTitle("Octopus Reports");
//        stage.setResizable(false);
//        stage.centerOnScreen();
//        stage.setScene(scene);
//        stage.getIcons().add(new Image("/resources/icons/identification-documents.png"));
//        stage.show();
//    }
//
//    @FXML
//        public void showEmployeeLeaveApplication() throws IOException {
//        stage = new Stage();
//        Pane root = FXMLLoader.load(getClass().getResource("/octopushr/leave/employeeLeaveApplication.fxml"));
//        Scene scene = new Scene(root);
//        scene.getStylesheets().add("/resources/css/employeeleaveapplication.css");
//        stage.setTitle("Employee Leave Application");
//        stage.setResizable(false);
//        stage.centerOnScreen();
//        stage.setScene(scene);
//        stage.getIcons().add(new Image("/resources/icons/identification-documents.png"));
//        stage.show();
//    }
//
//    @FXML
//        public void showApproveLeaveApplication() throws IOException {
//        stage = new Stage();
//        Pane root = FXMLLoader.load(getClass().getResource("/octopushr/leave/approveLeave.fxml"));
//        Scene scene = new Scene(root);
//        scene.getStylesheets().add("/resources/css/approveleave.css");
//        stage.setTitle("Employee Leave Application");
//        stage.setResizable(false);
//        stage.centerOnScreen();
//        stage.setWidth(915);
//        stage.setHeight(500);
//        stage.setScene(scene);
//        stage.getIcons().add(new Image("/resources/icons/identification-documents.png"));
//        stage.show();
//    }
//    
//    @FXML
//        public void showEmployeeLeaveTypes() throws IOException {
//        stage = new Stage();
//        Pane root = FXMLLoader.load(getClass().getResource("/octopushr/leave/employeeLeaveTypes.fxml"));
//        Scene scene = new Scene(root);
//        scene.getStylesheets().add("/resources/css/employeeleavetypes.css");
//        stage.setTitle("Employee Leave Types");
//        stage.setResizable(false);
//        stage.centerOnScreen();
//        stage.setScene(scene);
//        stage.getIcons().add(new Image("/resources/icons/identification-documents.png"));
//        stage.show();
//    }
//
//    @FXML
//        public void showEmployeeCalendar() throws IOException {
//        stage = new Stage();
//        Pane root = FXMLLoader.load(getClass().getResource("/octopushr/employees/employeeCalendar.fxml"));
//        Scene scene = new Scene(root);
//        scene.getStylesheets().add("/resources/css/employeecalendar.css");
//        stage.setTitle("Employee Calendar");
//        stage.setResizable(false);
//        stage.centerOnScreen();
//        stage.setScene(scene);
//        stage.getIcons().add(new Image("/resources/icons/identification-documents.png"));
//        stage.show();
//    }
//    @FXML
//        public void showEmployeeGrievances() throws IOException {
//        stage = new Stage();
//        Pane root = FXMLLoader.load(getClass().getResource("/octopushr/performance/disciplinary/employeeGrievances.fxml"));
//        Scene scene = new Scene(root);
//        scene.getStylesheets().add("/resources/css/employeegrievances.css");
//        stage.setTitle("Employee Grievances");
//        stage.setResizable(false);
//        stage.setWidth(606);
//        stage.setHeight(414);
//        stage.centerOnScreen();
//        stage.setScene(scene);
//        stage.getIcons().add(new Image("/resources/icons/identification-documents.png"));
//        stage.show();
//    }
////=======
////>>>>>>> f5c7a74c0fba43c1a593f4c9fd5c119e38b274d5
}
