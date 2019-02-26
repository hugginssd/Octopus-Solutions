/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
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
 * and open the template in the editor.
 */
package octopushr.payrollAndSalaries;

import constructors.PayEmployeeSalaryAdvance;
import constructors.PayEmployeeSalaryLoan;
import java.io.IOException;
import static java.lang.System.out;
import java.net.URL;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.CheckBoxTableCell;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Callback;
import octopushr.Connexion;
import octopushr.Functions;

/**
 * FXML Controller class
 *
 * @author Support
 */
public class PayEmployeeSalaryController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private Pane paneMain;

    @FXML
    private Pane pane1;

    @FXML
    private ComboBox cmbSelectDepartment;

    @FXML
    private ComboBox cmbSelectEmployee;

    @FXML
    private Button btnViewSalaryStructure;

    @FXML
    private Button btnUploadAttendanceSheet;

    @FXML
    private Pane pane2;

    @FXML
    private ImageView imgPerson;

    @FXML
    private Label lblDesignation;

    @FXML
    private Label lblDepartment;

    @FXML
    private Label lblDepartmentId;

    @FXML
    private Pane pane3;

    @FXML
    private DatePicker dtpSelectMonth;

    @FXML
    private Label lblOctopusCalSalary;

    @FXML
    private DatePicker dtpFrom;

    @FXML
    private DatePicker dtpTo;

    @FXML
    private Text txtTotalSalary;

    @FXML
    private TextField txtNote;

    @FXML
    private Text txtSalaryToPay;

    @FXML
    private TextField txtDeductionForLeave;

    @FXML
    private TextField txtOvertimebill;

    @FXML
    private TextField txtBonusIncentive;

    @FXML
    private Label lblAdvancePaymentDeductions;

    @FXML
    private Label lblLoanDeductions;

    @FXML
    private Label lblNetSalary;

    @FXML
    private Label lblSalaryOfOneDay;

    @FXML
    private Label lblSalaryDeductions;

    @FXML
    private Label lblTotalEarnings, lblSanctionedOn, lblClosingOn;

    @FXML
    private Label lblNoOfDays, lblSanctionedOnA, lblClosingOnA;

    @FXML
    private TextField txtActualWorkBaseDays;

    @FXML
    private TextField txtNoOfDayssalary;

    @FXML
    private Pane panemain;

    @FXML
    private Pane pane4;

    @FXML
    private Pane pane5;

    @FXML
    private Pane pane8;

    @FXML
    private ImageView imgPerson1;

    @FXML
    private Text lblSanctionByName;

    @FXML
    private Text lblSanctionByDesignation;

    @FXML
    private Text lblSanctionByDepartment;

    @FXML
    private Pane pane5_;

    @FXML
    private Pane pane6;

    @FXML
    private ImageView imgPerson2;

    @FXML
    private Text lblSanctionByPaidName;

    @FXML
    private Text lblSanctionByPaidDesignation;

    @FXML
    private Text lblSanctionByPaidDepartment;

    @FXML
    private Pane pane9;

    @FXML
    private TableView<PayEmployeeSalaryLoan> tableLoan;

    @FXML
    private ObservableList<TableColumn<PayEmployeeSalaryLoan, ?>> columnsLoan;

    @FXML
    private ObservableList<PayEmployeeSalaryLoan> columns;

    @FXML
    private TableView<PayEmployeeSalaryAdvance> tableAdvance;

    @FXML
    private ObservableList<TableColumn<PayEmployeeSalaryAdvance, ?>> columnsAdvance;

    @FXML
    private ObservableList<PayEmployeeSalaryAdvance> columns2;

    @FXML
    private Stage stage;

    Connection connection;
    ResultSet rs;
    PreparedStatement pst;
    Connexion connexion = new Connexion();
    Functions functions = new Functions();
    Alert alert;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            // TODO
            loadDepartments();
            txtBonusIncentive.setText("0");
            txtOvertimebill.setText("0");
            txtDeductionForLeave.setText("0");
            setLoanTableView();
            setAdvanceTableView();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(PayEmployeeSalaryController.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        clearSanctions();
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
        //functions.alertInformation(alert, cmbSelectEmployee.getValue().toString());
        pst.setString(1, cmbSelectEmployee.getValue().toString());
        rs = pst.executeQuery();
        while (rs.next()) {
            lblDepartment.setText(rs.getString("designation"));
            functions.retrieveImage(imgPerson, rs);
            // functions.retrieveImage(imgPerson1, rs);
            //functions.retrieveImage(imgPerson2, rs);
            lblDesignation.setText(rs.getString("employeename"));
        }
        pst.close();
        rs.close();
        selectLoanDeductions();
        selectAdvancePayment();
        clearSanctions();
    }

    @FXML
    public void calculatePromptDays() {
        lblNoOfDays.setText(Integer.toString(dtpSelectMonth.getValue().lengthOfMonth()));
        txtActualWorkBaseDays.setText(Integer.toString(dtpSelectMonth.getValue().lengthOfMonth()));
        txtNoOfDayssalary.setText(Integer.toString(dtpSelectMonth.getValue().lengthOfMonth()));
        if (dtpSelectMonth.getValue().lengthOfMonth() == 31) {
            txtActualWorkBaseDays.setText(Integer.toString(dtpSelectMonth.getValue().lengthOfMonth() - 1));
            txtNoOfDayssalary.setText(Integer.toString(dtpSelectMonth.getValue().lengthOfMonth() - 1));
        }

    }

    @FXML
    public void calculateBonusIncentive() {
        txtSalaryToPay.setText(Integer.toString(Integer.parseInt(txtBonusIncentive.getText()) + Integer.parseInt(txtOvertimebill.getText())));
    }

    @FXML
    public void calculateDeductionForLeave() {

        txtSalaryToPay.setText(Integer.toString((Integer.parseInt((txtBonusIncentive.getText()) + Integer.parseInt(txtOvertimebill.getText())) - Integer.parseInt(txtDeductionForLeave.getText()))));

    }

    @FXML
    public void setLoanTableView() {
        columnsLoan = tableLoan.getColumns();

        final TableColumn<PayEmployeeSalaryLoan, Boolean> colID = new TableColumn<>("ID");
        colID.setCellValueFactory(new PropertyValueFactory<>("ID"));
        colID.setPrefWidth(50);
        columnsLoan.add(colID);

        final TableColumn<PayEmployeeSalaryLoan, Boolean> colName = new TableColumn<>("NAME");
        colName.setCellValueFactory(new PropertyValueFactory<>("Name"));
        colName.setPrefWidth(200);
        columnsLoan.add(colName);

        final TableColumn<PayEmployeeSalaryLoan, Boolean> colLoanAmount = new TableColumn<>("LOAN AMOUNT");
        colLoanAmount.setCellValueFactory(new PropertyValueFactory<>("LoanAmount"));
        colLoanAmount.setPrefWidth(100);
        columnsLoan.add(colLoanAmount);

        final TableColumn<PayEmployeeSalaryLoan, Boolean> colBalance = new TableColumn<>("BALANCE");
        colBalance.setCellValueFactory(new PropertyValueFactory<>("Balance"));
        colBalance.setPrefWidth(100);
        columnsLoan.add(colBalance);

        final TableColumn<PayEmployeeSalaryLoan, Boolean> colEnterAmount = new TableColumn<>("ENTER AMOUNT");
        colEnterAmount.setCellValueFactory(new PropertyValueFactory<>("EnterAmount"));
        colEnterAmount.setEditable(true);
        colEnterAmount.setPrefWidth(100);
        columnsLoan.add(colEnterAmount);

        final TableColumn<PayEmployeeSalaryLoan, Boolean> colDeductFromSalary = new TableColumn<>("TAKE FROM SALARY");
        colDeductFromSalary.setCellValueFactory(new PropertyValueFactory<>("DeductFromSalary"));
        colDeductFromSalary.setCellFactory((TableColumn<PayEmployeeSalaryLoan, Boolean> param) -> new CheckBoxTableCell<>());
        colDeductFromSalary.setPrefWidth(125);

        columnsLoan.add(colDeductFromSalary);

        final TableColumn<PayEmployeeSalaryLoan, Boolean> colTakeFromEMISeperate = new TableColumn<>("TAKE SEPERATE");
        colTakeFromEMISeperate.setCellValueFactory(new PropertyValueFactory("TakeEMISeperate"));
        colTakeFromEMISeperate.setCellFactory((TableColumn<PayEmployeeSalaryLoan, Boolean> param) -> new CheckBoxTableCell<>());
        colTakeFromEMISeperate.setPrefWidth(125);
        columnsLoan.add(colTakeFromEMISeperate);
    }

    @FXML
    public void setAdvanceTableView() {
        columnsAdvance = tableAdvance.getColumns();

        final TableColumn<PayEmployeeSalaryAdvance, Boolean> colID = new TableColumn<>("ID");
        colID.setCellValueFactory(new PropertyValueFactory<>("ID"));
        colID.setPrefWidth(50);
        columnsAdvance.add(colID);

        final TableColumn<PayEmployeeSalaryAdvance, Boolean> colName = new TableColumn<>("NAME");
        colName.setCellValueFactory(new PropertyValueFactory<>("Name"));
        colName.setPrefWidth(200);
        columnsAdvance.add(colName);

        final TableColumn<PayEmployeeSalaryAdvance, Boolean> colLoanAmount = new TableColumn<>("ADVANCE AMOUNT");
        colLoanAmount.setCellValueFactory(new PropertyValueFactory<>("AdvanceAmount"));
        colLoanAmount.setPrefWidth(120);
        columnsAdvance.add(colLoanAmount);

        final TableColumn<PayEmployeeSalaryAdvance, Boolean> colBalance = new TableColumn<>("BALANCE");
        colBalance.setCellValueFactory(new PropertyValueFactory<>("Balance"));
        colBalance.setPrefWidth(80);
        columnsAdvance.add(colBalance);

        final TableColumn<PayEmployeeSalaryAdvance, Boolean> colEnterAmount = new TableColumn<>("ENTER AMOUNT");
        colEnterAmount.setCellValueFactory(new PropertyValueFactory<>("EnterAmount"));
        colEnterAmount.setEditable(true);
        colEnterAmount.setPrefWidth(100);
        columnsAdvance.add(colEnterAmount);

        final TableColumn<PayEmployeeSalaryAdvance, Boolean> colDeductFromSalary = new TableColumn<>("TAKE FROM SALARY");
        colDeductFromSalary.setCellValueFactory(new PropertyValueFactory<>("DeductFromSalary"));
        colDeductFromSalary.setCellFactory((TableColumn<PayEmployeeSalaryAdvance, Boolean> param) -> new CheckBoxTableCell<>());
        colDeductFromSalary.setPrefWidth(125);

        columnsAdvance.add(colDeductFromSalary);

        final TableColumn<PayEmployeeSalaryAdvance, Boolean> colTakeFromEMISeperate = new TableColumn<>("TAKE SEPERATE");
        colTakeFromEMISeperate.setCellValueFactory(new PropertyValueFactory("TakeEMISeperate"));
        colTakeFromEMISeperate.setCellFactory((TableColumn<PayEmployeeSalaryAdvance, Boolean> param) -> new CheckBoxTableCell<>());
        colTakeFromEMISeperate.setPrefWidth(125);
        columnsAdvance.add(colTakeFromEMISeperate);
    }

    @FXML
    public void selectAdvancePayment() throws SQLException, ClassNotFoundException {

        connection = connexion.getConnetion();
        String sql = "SELECT `tbladvances`.`id` as id, `tbladvances`.`advanceid`, `tbladvances`.`employeeid`, `advancename`,"
                + " `tbladvances`.`advanceamount` AS advanceamount, "
                + " (`tbladvancetransactions`.`advanceamount` - SUM(`tbladvancetransactions`.`paidamount`)) AS balanceowing,"
                + " `balancepaid`, `sanctioneddae`, `sanctionedby`, `returnamountpermonth`,`tbladvancetransactions`.`id` AS transid,"
                + " `advancetransactionid`,`tbladvancetransactions`.`paidamount` AS paidamount, `tbladvancetransactions`.`paiddate`,"
                + " `tbladvancetransactions`.`savedby`"
                + " FROM `tbladvances`"
                + " INNER JOIN `tbladvancetransactions`"
                + " ON `tbladvancetransactions`.`advanceid` = `tbladvances`.`advanceid`"
                + " WHERE `tbladvances`.`employeeid` = ?"
                + " AND `tbladvances`.`balancepaid` = 0";
        pst = connection.prepareStatement(sql);
        pst.setString(1, cmbSelectEmployee.getSelectionModel().getSelectedItem().toString().toUpperCase());
        rs = pst.executeQuery();
        tableAdvance.setItems(null);
        columns2 = FXCollections.observableArrayList();
        while (rs.next()) {
            if (rs.getInt("id") > 0) {
                columns2.addAll(new PayEmployeeSalaryAdvance(rs.getInt("id"), rs.getString("advancename"), rs.getDouble("advanceamount"),
                        rs.getDouble("balanceowing"), rs.getDouble("returnamountpermonth"),
                        false, false));
            }
        }
        tableAdvance.setItems(columns2);
        tableLoan.setEditable(true);
        pst.close();
        rs.close();
    }

    @FXML
    public void selectLoanDeductions() throws SQLException, ClassNotFoundException {

        connection = connexion.getConnetion();
        String sql = "SELECT `tblloans`.`id` AS id, `tblloans`.`loanid`, `tblloans`.`loanname` AS loanname, `tblloans`.`loanpurpose`,"
                + " `tblloans`.`loandate` AS loandate, `tblloans`.`loanperiod` AS loanperiod, `tblloans`.`paidperiod`,"
                + " `tblloans`.`balancepaid`, `rateinterestpercentage`, "
                + " `sanctionedby`, `installmentamountpermonth`, `simpleinterest`,"
                + " `tbloantransactions`.`id`, `tbloantransactions`.`loantransactionid`,`tbloantransactions`.`loanamount` AS loanamount, "
                + " (`tbloantransactions`.`loanamount`) - SUM(`tbloantransactions`.`paidamount`) AS balanceowing, "
                + " `tbloantransactions`.`paiddate`, `tbloantransactions`.`savedby` "
                + " FROM `tblloans`"
                + " INNER JOIN `tbloantransactions`"
                + " ON `tbloantransactions`.`loanid` = `tblloans`.`loanid`"
                + " WHERE `tblloans`.`employeeid` = ?"
                + " AND  `tblloans`.`balancepaid` = 0 AND `tbloantransactions`.`loanamount` != 0";
        pst = connection.prepareStatement(sql);
        pst.setString(1, cmbSelectEmployee.getSelectionModel().getSelectedItem().toString().toUpperCase());
        rs = pst.executeQuery();
        tableLoan.setItems(null);
        columns = FXCollections.observableArrayList();
        while (rs.next()) {
            if (rs.getInt("id") > 0) {
                columns.addAll(new PayEmployeeSalaryLoan(rs.getInt("id"), rs.getString("loanname"), rs.getDouble("loanamount"),
                        rs.getDouble("balanceowing"), rs.getDouble("installmentamountpermonth"),
                        false, false));
            }
        }
        tableLoan.setItems(columns);
        tableLoan.setEditable(true);
        pst.close();
        rs.close();

    }

    @FXML
    public void showTableData() throws SQLException, ClassNotFoundException, IOException {
        PayEmployeeSalaryLoan payEmployeeSalaryLoan = tableLoan.getSelectionModel().getSelectedItem();
        if (payEmployeeSalaryLoan == null) {
            functions.alertError(alert, "Nothing selected");
            return;
        }
        lblLoanDeductions.setText(Double.toString(payEmployeeSalaryLoan.getEnterAmount()));
        connection = connexion.getConnetion();
        String sql = "SELECT `tblguards`.`id` AS id, `tblguards`.`employeeid`, `tblloans`.`employeeid` AS sanctionedemployee, CONCAT(`firstname`, ' ', `surname`) AS employeename, `picture`, "
                + " `designation`, `departmentname`,`tblloans`.`loanperiod` AS loanperiod,`sanctionedby`,`tblloans`.`datecreated` AS sanctioneddate "
                + " FROM `tblguards` "
                + " INNER JOIN `tbldesignation` "
                + " ON `tbldesignation`.`designationid` = `tblguards`.`designationid` "
                + " INNER JOIN `tbldepartments` "
                + " ON `tbldepartments`.`departmentid` = `tblguards`.`departmentid` "
                + " INNER JOIN `tblloans` "
                + " ON `tblloans`.`sanctionedby` = `tblguards`.`employeeid`"
                + " WHERE `tblloans`.`id` = ?";
        pst = connection.prepareStatement(sql);
        pst.setInt(1, payEmployeeSalaryLoan.getID());
        rs = pst.executeQuery();
        while (rs.next()) {
            lblSanctionByName.setText(rs.getString("employeename"));
            lblSanctionByDesignation.setText(rs.getString("designation"));
            lblSanctionByDepartment.setText(rs.getString("departmentname"));
            lblSanctionedOn.setText(rs.getString("sanctioneddate"));
            functions.retrieveImage(imgPerson1, rs);
            lblClosingOn.setText(String.valueOf(Date.valueOf(rs.getDate("sanctioneddate").toLocalDate().plusMonths(rs.getInt("loanperiod")))));

        }
        pst.close();
        rs.close();
    }

    @FXML
    public void showAdvanceTableData() throws SQLException, ClassNotFoundException, IOException {
        PayEmployeeSalaryAdvance payEmployeeSalaryAdvance = tableAdvance.getSelectionModel().getSelectedItem();
        if (payEmployeeSalaryAdvance == null) {
            functions.alertError(alert, "Nothing selected");
            return;
        }
        lblAdvancePaymentDeductions.setText(Double.toString(payEmployeeSalaryAdvance.getAdvanceAmount()));
        connection = connexion.getConnetion();
        String sql = "SELECT `tblguards`.`id` AS id, `tblguards`.`employeeid`, `tbladvances`.`employeeid` AS sanctionedemployee, CONCAT(`firstname`, ' ', `surname`) AS employeename, `picture`, "
                + " `designation`, `departmentname`,`sanctionedby`,`tbladvances`.`sanctioneddae` AS sanctioneddate "
                + " FROM `tblguards` "
                + " INNER JOIN `tbldesignation` "
                + " ON `tbldesignation`.`designationid` = `tblguards`.`designationid` "
                + " INNER JOIN `tbldepartments` "
                + " ON `tbldepartments`.`departmentid` = `tblguards`.`departmentid` "
                + " INNER JOIN `tbladvances` "
                + " ON `tbladvances`.`sanctionedby` = `tblguards`.`employeeid`"
                + " WHERE `tbladvances`.`id` = ?";
        pst = connection.prepareStatement(sql);
        pst.setInt(1, payEmployeeSalaryAdvance.getID());
        rs = pst.executeQuery();
        while (rs.next()) {
            lblSanctionByPaidName.setText(rs.getString("employeename"));
            lblSanctionByPaidDesignation.setText(rs.getString("designation"));
            lblSanctionByPaidDepartment.setText(rs.getString("departmentname"));
            lblSanctionedOnA.setText(rs.getString("sanctioneddate"));
            functions.retrieveImage(imgPerson2, rs);
            lblClosingOnA.setText(String.valueOf(Date.valueOf(rs.getDate("sanctioneddate").toLocalDate().plusMonths(5))));

        }
        pst.close();
        rs.close();
    }

    @FXML
    public void clearSanctions() {
        lblSanctionByName.setText("");
        lblSanctionByDesignation.setText("");
        lblSanctionByDepartment.setText("");
        lblSanctionedOn.setText("");
        lblClosingOn.setText("");
        lblSanctionByPaidName.setText("");
        lblSanctionByPaidDesignation.setText("");
        lblSanctionByPaidDepartment.setText("");
        lblSanctionedOnA.setText("");
        lblClosingOnA.setText("");
        imgPerson1.setImage(new Image("@\\resources\\icons\\no-image.jpg"));
//        imgPerson2.setImage(new Image("../resources/icons/no-image.jpg"));
        // new Image("..\\..\\resources\\icons\\no-image.jpg")

    }

    @FXML
    public void loadPayslip() throws IOException {
        stage = new Stage();
        Pane root = FXMLLoader.load(getClass().getResource("/octopushr/payrollAndSalaries/payslip.fxml"));
        Scene scene = new Scene(root, 845, 670);
        out.print("Payslip loaded");
        scene.getStylesheets().add("/resources/css/payslip.css");
        stage.setTitle("Payslip");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();
    }

    @FXML
    public void viewSalaryStructure() throws IOException {
        stage = new Stage();
        AnchorPane root = FXMLLoader.load(getClass().getResource("/octopushr/payrollAndSalaries/payrollSettingsAndStructure.fxml"));
        Scene scene = new Scene(root);
        scene.getStylesheets().add("/resources/css/payrollsettingsandstructure.css");
        stage.setTitle("Payroll Structure");
        stage.setWidth(1362);
        stage.setHeight(705);
        stage.setResizable(false);
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();
    }

    @FXML
    public void uploadAttendanceSheet() throws IOException {
        stage = new Stage();
        AnchorPane root = FXMLLoader.load(getClass().getResource("/octopushr/attendance/employeeAttendanceSheet.fxml"));
        Scene scene = new Scene(root);
        scene.getStylesheets().add("/resources/css/employeeattendancesheet.css");
        stage.setTitle("Employee Attendance Sheet");
        stage.setAlwaysOnTop(false);
        stage.getIcons().add(new Image(getClass().getResourceAsStream("/resources/icons/employee-profile.png")));
        stage.setResizable(false);
        stage.setWidth(1085);
        stage.setHeight(400);
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.showAndWait();
    }

    @FXML
    public void closeWindow(Event event) {
        functions.closeWindow(event);
    }
}
