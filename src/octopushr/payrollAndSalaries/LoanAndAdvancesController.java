/*
   DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
    
     Contributor(s):
     
     The Original Software is NetBeans. The Initial Developer of the Original
     Software is Sun Microsystems, Inc. Portions Copyright 1997-2010 Sun
     Microsystems, Inc.
     The developer of this software is SIR HUGGINS
     
     
     If you wish your version of this file to be governed by only the CDDL
     or only the GPL Version 2, indicate your decision by adding
     "[Contributor] elects to include this software in this distribution
     under the [CDDL or GPL Version 2] license." If you do not indicate a
     single choice of license, a recipient has the option to distribute
     your version of this file under either the CDDL, the GPL Version 2 or
     to extend the choice of license to its licensees as provided above.
     However, if you add GPL Version 2 code and therefore, elected the GPL
     Version 2 license, then the option applies only if the new code is
     made subject to such option by the copyright holder.
     
     THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
     IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
     FITNESS FOR A PARTICULAR PURPOSE AND NON-INFRINGEMENT. IN NO EVENT SHALL THE
     AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
     LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
     OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
     THE SOFTWARE.
     
     @author SIR HUGGINS
     
     Copyright (c) 2016, Solution Systems Pvt Ltd
     All rights reserved.
    
     
     You should have received a copy of the GNU Lesser General Public
     License along with this library; if not, email to the Free Software
     Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
     OR to Solution Systems Pvt Ltd, 56 Milton Park, Harare
     Email: mafiguhuggins@gmail.com
     Cell: +263782326160
     
     THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
     AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
     IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
     ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
     LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
     CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
     SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
     INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
     CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
     ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
     POSSIBILITY OF SUCH DAMAGE.
    
 */
package octopushr.payrollAndSalaries;

import constructors.AdvancePayment;
import constructors.Loans;
import java.io.IOException;
import java.net.Inet4Address;
import java.net.URL;
import java.net.UnknownHostException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.CheckBoxTableCell;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.util.Callback;
import octopushr.Connexion;
import octopushr.Functions;
import octopushr.employees.ViewEmployeeDetails;

/*
  FXML Controller class
 
  @author Huggins
 */
public class LoanAndAdvancesController implements Initializable {

    @FXML
    private ComboBox cmbSelectDepartments;

    @FXML
    private ComboBox cmbSelectEmployee;

    @FXML
    private Tab tabLoans, tabAdvances;

    @FXML
    private TextField txtLoanName;

    @FXML
    private TextField txtLoanAmount;

    @FXML
    private DatePicker dtpSanctionedDate;

    @FXML
    private TextField txtTimePeriod;

    @FXML
    private TextField txtRateOfInterest;

    @FXML
    private ComboBox cmbSanctionedBy;

    @FXML
    private TextField txtInstallmentAmountPerMonth;

    @FXML
    private ComboBox cmbMonths;

    @FXML
    private Button btnApproveLoan;

    @FXML
    private Button btnAddNew;

    @FXML
    private TextField txtAdvanceName;

    @FXML
    private TextArea txaPurpose;

    @FXML
    private TextField txtAdvanceAmount;

    @FXML
    private DatePicker dtpSanctionedDate_;

    @FXML
    private ComboBox cmbSanctionedBy_;

    @FXML
    private Button btnPayAdvance;

    @FXML
    private Button btnAddNew_;

    @FXML
    private Button btnDownloadTransactionHistory;

    @FXML
    private Button btnUpdate;

    @FXML
    private TextField txtEnterEMIAmount, txtLoanPurpose, txtReturnAmountPerMonth, txtRecieveAdvanceAmount;

    @FXML
    private Button btnUpdatee;

    @FXML
    private Button btnDownloadTransactionHistorya;

    @FXML
    private Label lblDepartmentId, lblEmployeeName, lblLoanID, lblAdvanceID, lbladvancetransactionid, lblCaslculatedSimpleInterest, lblloantransactionid;

    @FXML
    private ImageView imgView;

    @FXML
    private Alert alert;

    @FXML
    private TableView<AdvancePayment> tableAdvancePayment;

    @FXML
    private ObservableList<TableColumn<AdvancePayment, ?>> columnsAdvancePayment;

    @FXML
    private ObservableList<AdvancePayment> columns;

    @FXML
    private TableView<Loans> tableLoan;

    @FXML
    private ObservableList<TableColumn<Loans, ?>> columnsLoans;

    @FXML
    private ObservableList<Loans> columns2;

    Functions functions = new Functions();
    Connexion connexion = new Connexion();
    Statement st;
    PreparedStatement pst;
    ResultSet rs;
    Connection connection;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            // TODO
            loadDepartments();
            lblLoanID.setText("LNS00" + Integer.toString(functions.getLastId("id", "tblloans")));
            lblAdvanceID.setText("ADV00" + Integer.toString(functions.getLastId("id", "tbladvances")));
            lblDepartmentId.setVisible(false);
            setTableView();
            setLoanTableView();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(LoanAndAdvancesController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    public void loadDepartments() throws SQLException, ClassNotFoundException {
        connection = connexion.getConnetion();
        pst = connection.prepareStatement("SELECT `id`, `departmentid`, `departmentname`"
                + " FROM `tbldepartments`");
        rs = pst.executeQuery();
        while (rs.next()) {
            cmbSelectDepartments.getItems().add(rs.getString("departmentname"));
        }
        System.out.println("Started loading employees");
        pst.close();
        rs.close();
    }

    @FXML
    public void loadDepartmentId() throws SQLException, ClassNotFoundException {
        connection = connexion.getConnetion();
        pst = connection.prepareStatement("SELECT `id`, `departmentid`, `departmentname` FROM `tbldepartments` WHERE `departmentname` = ?");
        pst.setString(1, cmbSelectDepartments.getValue().toString());
        rs = pst.executeQuery();
        while (rs.next()) {
            lblDepartmentId.setText(rs.getString("departmentid"));
        }
        loadEmployees();

        pst.close();
        rs.close();
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
            cmbSanctionedBy.getItems().addAll(rs.getString("employeeid"));
            cmbSanctionedBy_.getItems().addAll(rs.getString("employeeid"));
            // lblEmployeeName.setText( rs.getString("employee"));
            //lblSurname.setText( rs.getString("surname"));
        }
        pst.close();
        rs.close();
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
        pst.setString(1, cmbSelectEmployee.getSelectionModel().getSelectedItem().toString());
        rs = pst.executeQuery();
        while (rs.next()) {
            //lblDepartment.setText(rs.getString("designation"));
            functions.retrieveImage(imgView, rs);
            lblEmployeeName.setText(rs.getString("employeename"));
            // functions.retrieveImage(imgPerson1, rs);
            //functions.retrieveImage(imgPerson2, rs);
            //lblDesignation.setText(rs.getString("employeename"));
        }
        loadAdvancePaymentTableView();
        loadLoanTableView();
        pst.close();
        rs.close();

    }

    @FXML
    public void approveLoan() throws SQLException, ClassNotFoundException, UnknownHostException {
        if (txtLoanName.getText().isEmpty() || txtLoanAmount.getText().isEmpty()) {
            functions.alertError(alert, "Invalid parameter.\nLoan name and loan amount should not be empty");
            return;
        }
        if (txtLoanPurpose.getText().isEmpty() || txtTimePeriod.getText().isEmpty() || txtRateOfInterest.getText().isEmpty()) {
            functions.alertError(alert, "Invalid parameters.\nPurpose of loan and the period for which the loan is to be borrowed should be specified.\nRate of interest must not be ommitted.");
            return;
        }

        connection = connexion.getConnetion();
        String sql = "INSERT INTO `tblloans`( `loanid`,`loanname`, `employeeid`, `loanamount`, `loanbalance`, "
                + "`loanpurpose`, `loandate`, `loanperiod`, "
                + "`rateinterestpercentage`, `sanctionedby`, `installmentamountpermonth`, `simpleinterest`, "
                + "`datecreated`, `usercreated`, `machinecreatedon`, `lastdatemodified`, `lastusermodified`, "
                + "`lastmachinemodifiedon`)"
                + " VALUES (?,?,?,?,?,?,?,?,?,?,?,?,NOW(),?,?,NOW(),?,?)";
        pst = connection.prepareStatement(sql);
        pst.setString(1, lblLoanID.getText().toUpperCase());
        pst.setString(2, txtLoanName.getText().toUpperCase());
        pst.setString(3, cmbSelectEmployee.getSelectionModel().getSelectedItem().toString().toUpperCase());
        pst.setDouble(4, Double.parseDouble(txtLoanAmount.getText()));
        pst.setDouble(5, 0.00);
        pst.setString(6, txtLoanPurpose.getText().toUpperCase());
        pst.setString(7, dtpSanctionedDate.getValue().getYear() + "-" + dtpSanctionedDate.getValue().getMonthValue() + "-" + dtpSanctionedDate.getValue().getDayOfMonth());
        pst.setInt(8, Integer.parseInt(txtTimePeriod.getText()));
        pst.setDouble(9, Integer.parseInt(txtRateOfInterest.getText()));
        pst.setString(10, cmbSanctionedBy.getSelectionModel().getSelectedItem().toString().toUpperCase());
        pst.setDouble(11, Double.parseDouble(txtInstallmentAmountPerMonth.getText()));
        double principal = Double.parseDouble(txtLoanAmount.getText());
        double rate = Double.parseDouble(txtRateOfInterest.getText());
        double time = Double.parseDouble(txtTimePeriod.getText());
        double simpleInterest = (principal * rate * time) / 100;
        pst.setDouble(12, simpleInterest);
        pst.setString(13, java.net.Inet4Address.getLocalHost().getHostName());
        pst.setString(14, java.net.Inet4Address.getLocalHost().getHostName());
        pst.setString(15, java.net.Inet4Address.getLocalHost().getHostName());
        pst.setString(16, java.net.Inet4Address.getLocalHost().getHostName());
        pst.execute();
        functions.alertSuccessful(alert, "Loan successfully approved");
        addNewLoan();
        loadLoanTableView();
        pst.close();
        rs.close();
    }

    @FXML
    public void payAdvance() throws SQLException, ClassNotFoundException, UnknownHostException {
        if (txtAdvanceName.getText().isEmpty() || txtAdvanceAmount.getText().isEmpty()) {
            alert = new Alert(AlertType.ERROR);
            alert.setTitle("Parameters");
            alert.setHeaderText("Invalid parameters");
            alert.setContentText("Advance name and advance amount should not be empty");
            alert.showAndWait();
            return;
        }
        if (txaPurpose.getText().isEmpty() || txtReturnAmountPerMonth.getText().isEmpty()) {
            alert = new Alert(AlertType.ERROR);
            alert.setTitle("Parameters");
            alert.setHeaderText("Invalid parameters");
            alert.setContentText("Purpose of advance credit and the return amount per month.");
            alert.showAndWait();
            return;
        }
        connection = connexion.getConnetion();
        String sql = "INSERT INTO `tbladvances`(`advanceid`, `employeeid`, `advancename`, `advancepurpose`,"
                + " `advanceamount`, `sanctioneddae`, `sanctionedby`, `returnamountpermonth`, "
                + "`datecreated`, `usercreated`, `machinecreatedon`, `lastdatemodified`, `lastusermodified`, "
                + "`lastmachinemodifiedon`) VALUES (?,?,?,?,?,?,?,?,NOW(),?,?,NOW(),?,?)";
        pst = connection.prepareStatement(sql);
        pst.setString(1, lblAdvanceID.getText().toUpperCase());
        pst.setString(2, cmbSelectEmployee.getSelectionModel().getSelectedItem().toString().toUpperCase());
        pst.setString(3, txtAdvanceName.getText().toUpperCase());
        pst.setString(4, txaPurpose.getText().toUpperCase());
        pst.setDouble(5, Double.parseDouble(txtAdvanceAmount.getText()));
        pst.setString(6, dtpSanctionedDate_.getValue().getYear() + "-" + dtpSanctionedDate_.getValue().getMonthValue() + "-" + dtpSanctionedDate_.getValue().getDayOfMonth());
        pst.setString(7, cmbSanctionedBy_.getSelectionModel().getSelectedItem().toString().toUpperCase());
        pst.setDouble(8, Double.parseDouble(txtReturnAmountPerMonth.getText()));
        pst.setString(9, Inet4Address.getLocalHost().getHostName().toUpperCase());
        pst.setString(10, Inet4Address.getLocalHost().getHostName());
        pst.setString(11, Inet4Address.getLocalHost().getHostName().toUpperCase());
        pst.setString(12, Inet4Address.getLocalHost().getHostName().toUpperCase());
        lblAdvanceID.setText("ADV00" + Integer.toString(functions.getLastId("id", "tbladvances")));
        pst.executeUpdate();
        alert = new Alert(AlertType.CONFIRMATION);
        alert.setHeaderText("Success");
        alert.setContentText("Advance payment successfully processed");
        alert.setTitle("Advance Payment");
        alert.showAndWait();
        addNewAdvancePayment();
        loadAdvancePaymentTableView();
        pst.close();
        rs.close();
    }

    @FXML
    public void addNewLoan() throws SQLException, ClassNotFoundException {
        txtLoanName.clear();
        txtLoanAmount.clear();
        txtLoanPurpose.clear();
        dtpSanctionedDate.setValue(null);
        txtTimePeriod.clear();
        txtRateOfInterest.clear();
        txtTimePeriod.clear();
        txtInstallmentAmountPerMonth.clear();
        txtLoanAmount.clear();
        txtRateOfInterest.clear();
        lblLoanID.setText("LNS00" + Integer.toString(functions.getLastId("id", "tblloans")));
    }

    @FXML
    public void addNewAdvancePayment() throws SQLException, ClassNotFoundException {
        txtAdvanceName.clear();
        txaPurpose.clear();
        txtAdvanceAmount.clear();
        dtpSanctionedDate_.setValue(null);
        txtReturnAmountPerMonth.clear();
        lblAdvanceID.setText("ADV00" + Integer.toString(functions.getLastId("id", "tbladvances")));
    }

    @FXML
    public void setTableView() {
        columnsAdvancePayment = tableAdvancePayment.getColumns();

        //id
        final TableColumn<AdvancePayment, Boolean> colId = new TableColumn("ID");
        colId.setCellValueFactory(new PropertyValueFactory("ID"));
        columnsAdvancePayment.add(colId);
        //name
        final TableColumn<AdvancePayment, Boolean> colName = new TableColumn("NAME");
        colName.setCellValueFactory(new PropertyValueFactory("Name"));
        colName.setPrefWidth(350);
        columnsAdvancePayment.add(colName);
        //amount
        final TableColumn<AdvancePayment, Boolean> colAmount = new TableColumn("AMOUNT");
        colAmount.setCellValueFactory(new PropertyValueFactory("Amount"));
        columnsAdvancePayment.add(colAmount);
        //balance
        final TableColumn<AdvancePayment, Boolean> colBalance = new TableColumn("BALANCE");
        colBalance.setCellValueFactory(new PropertyValueFactory("Balance"));
        colBalance.setPrefWidth(175);
        columnsAdvancePayment.add(colBalance);
    }

    @FXML
    public void setLoanTableView() {
        columnsLoans = tableLoan.getColumns();

        //id
        final TableColumn<Loans, Boolean> colId = new TableColumn("ID");
        colId.setCellValueFactory(new PropertyValueFactory("ID"));
        columnsLoans.add(colId);
        //name
        final TableColumn<Loans, Boolean> colName = new TableColumn("NAME");
        colName.setCellValueFactory(new PropertyValueFactory("Name"));
        colName.setPrefWidth(350);
        columnsLoans.add(colName);
        //amount
        final TableColumn<Loans, Boolean> colAmount = new TableColumn("AMOUNT");
        colAmount.setCellValueFactory(new PropertyValueFactory("Amount"));
        columnsLoans.add(colAmount);
        //expiry
        final TableColumn<Loans, Boolean> colExpiry = new TableColumn("EXPIRY");
        colExpiry.setCellValueFactory(new PropertyValueFactory("Expiry"));
        colExpiry.setPrefWidth(100);
        columnsLoans.add(colExpiry);
        //balance
        final TableColumn<Loans, Boolean> colBalance = new TableColumn("BALANCE");
        colBalance.setCellValueFactory(new PropertyValueFactory("Balance"));
        columnsLoans.add(colBalance);
    }

    @FXML//not finished
    public void loadLoanTableView() {
        try {
            tableLoan.setItems(null);
            if (cmbSelectEmployee.getSelectionModel().isEmpty()) {
                return;
            } else {

                // tableAdvancePayment.getColumns().clear();
                connection = connexion.getConnetion();

                String sql = "SELECT `tblloans`.`id` AS id, `tblloans`.`loanid`, `tblloans`.`loanname` AS loanname, `tblloans`.`loanpurpose`,"
                        + " `tblloans`.`loandate` AS loandate, `tblloans`.`loanperiod` AS loanperiod, `tblloans`.`paidperiod`, `tblloans`.`balancepaid` `rateinterestpercentage`, "
                        + " `sanctionedby`, `installmentamountpermonth`, `simpleinterest`,"
                        + " `tbloantransactions`.`id`, `tbloantransactions`.`loantransactionid`,`tbloantransactions`.`loanamount` AS loanamount, (`tbloantransactions`.`loanamount`) - SUM(`tbloantransactions`.`paidamount`) AS balanceowing, "
                        + " `tbloantransactions`.`paiddate`, `tbloantransactions`.`savedby` "
                        + " FROM `tblloans`"
                        + " INNER JOIN `tbloantransactions`"
                        + " ON `tbloantransactions`.`loanid` = `tblloans`.`loanid`"
                        + " WHERE `tblloans`.`employeeid` = ?"
                        + " AND  `tblloans`.`balancepaid` = 0";
                pst = connection.prepareStatement(sql);
                pst.setString(1, cmbSelectEmployee.getSelectionModel().getSelectedItem().toString().toUpperCase());
                rs = pst.executeQuery();
                columns2 = FXCollections.observableArrayList();
                while (rs.next()) {
                    columns2.addAll(new Loans(rs.getInt("id"), rs.getString("loanname"),
                            rs.getDouble("loanamount"),
                            Date.valueOf((rs.getDate("loandate").toLocalDate().plusMonths(rs.getInt("loanperiod")))),
                            rs.getDouble("balanceowing")));
                }
                tableLoan.setItems(columns2);
                pst.close();
                rs.close();
            }
        } catch (SQLException | ClassNotFoundException ex) {
            functions.alertError(alert, ex.toString());
        }
    }

    @FXML
    public void loadAdvancePaymentTableView() throws SQLException, ClassNotFoundException {
        tableAdvancePayment.setItems(null);
        if (cmbSelectEmployee.getSelectionModel().isEmpty()) {
            return;
        } else {
            // tableAdvancePayment.getColumns().clear();
            connection = connexion.getConnetion();
            String sql = "SELECT `tbladvances`.`id` as id, `tbladvances`.`advanceid`, `tbladvances`.`employeeid`, `advancename`,"
                    + " `advancepurpose`, `tbladvances`.`advanceamount` AS advanceamount, (`tbladvancetransactions`.`advanceamount` - SUM(`tbladvancetransactions`.`paidamount`)) AS balanceowing,"
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
            columns = FXCollections.observableArrayList();
            while (rs.next()) {
                columns.addAll(new AdvancePayment(rs.getInt("id"), rs.getString("advancename"),
                        rs.getDouble("advanceamount"), rs.getDouble("balanceowing")));
            }
            tableAdvancePayment.setItems(columns);
            pst.close();
            rs.close();
        }
    }

    @FXML
    public void showTableData() throws SQLException, ClassNotFoundException {

        AdvancePayment advancePayment = tableAdvancePayment.getSelectionModel().getSelectedItem();
        if (advancePayment == null) {
            functions.alertSuccessful(alert, "Nothing selected");
            return;
        } else {
            //select all advance details where employeeid =? and balancepaid =0 and id = ?
            connection = connexion.getConnetion();
            String sql = "SELECT `id`, `advanceid`, `employeeid`, `advancename`, `advancepurpose`, `advanceamount`,"
                    + " `balanceleft`, `balancepaid`, `sanctioneddae`, `sanctionedby`, `returnamountpermonth`, `datecreated`,"
                    + " `usercreated`, `machinecreatedon`, `lastdatemodified`, `lastusermodified`, `lastmachinemodifiedon`"
                    + " FROM `tbladvances`"
                    + " WHERE `employeeid` = ? AND `balancepaid` = 0 AND `id` = ?";
            pst = connection.prepareStatement(sql);
            pst.setString(1, cmbSelectEmployee.getSelectionModel().getSelectedItem().toString().toUpperCase());
            pst.setInt(2, advancePayment.getID());
            rs = pst.executeQuery();
            while (rs.next()) {
                lblAdvanceID.setText(rs.getString("advanceid"));
                txtAdvanceName.setText(rs.getString("advancename"));
                txtAdvanceAmount.setText(rs.getString("advanceamount"));
                txaPurpose.setText(rs.getString("advancepurpose"));
                dtpSanctionedDate_.setValue(rs.getDate("sanctioneddae").toLocalDate());
                cmbSanctionedBy_.setValue(rs.getString("employeeid"));
                txtReturnAmountPerMonth.setText(rs.getString("returnamountpermonth"));
                txtRecieveAdvanceAmount.setText(rs.getString("returnamountpermonth"));
            }
        }
        pst.close();
        rs.close();
    }

    @FXML
    public void showLoanTableData() throws SQLException, ClassNotFoundException {
        Loans loans = tableLoan.getSelectionModel().getSelectedItem();
        if (loans == null) {
            functions.alertError(alert, "Nothing selected");
            return;
        } else {
            System.out.println("show loan table data");
            connection = connexion.getConnetion();
            String sql = "SELECT `id`, `loanid`, `loanname`, `employeeid`, `loanamount`, `loanbalance`, `loanpurpose`, `loandate`,"
                    + " `loanperiod`, `paidperiod`, `balancepaid`, `paidamount`, `rateinterestpercentage`, `sanctionedby`,"
                    + " `installmentamountpermonth`, `simpleinterest`, `datecreated`, `usercreated`, `machinecreatedon`, "
                    + "`lastdatemodified`, `lastusermodified`, `lastmachinemodifiedon`"
                    + " FROM `tblloans` "
                    + " WHERE `employeeid` = ? AND `balancepaid` = 0 AND `id` = ?";
            pst = connection.prepareStatement(sql);
            pst.setString(1, cmbSelectEmployee.getSelectionModel().getSelectedItem().toString().toUpperCase());
            pst.setInt(2, loans.getID());
            rs = pst.executeQuery();
            while (rs.next()) {
                lblLoanID.setText(rs.getString("loanid"));
                txtLoanName.setText(rs.getString("loanname"));
                txtLoanAmount.setText(Double.toString(rs.getDouble("loanamount")));
                txtLoanPurpose.setText(rs.getString("loanpurpose"));
                dtpSanctionedDate.setValue(rs.getDate("loandate").toLocalDate());
                txtTimePeriod.setText(rs.getString("loanperiod"));
                txtRateOfInterest.setText(rs.getString("rateinterestpercentage"));
                cmbSanctionedBy.setValue(rs.getString("sanctionedby"));
                txtInstallmentAmountPerMonth.setText(Double.toString(rs.getDouble("installmentamountpermonth")));
                txtEnterEMIAmount.setText(Double.toString(rs.getDouble("installmentamountpermonth")));
                lblCaslculatedSimpleInterest.setText(rs.getString("simpleinterest"));
            }
        }
        pst.close();
        rs.close();
    }

    @FXML
    public void updateAdvancePaymentTransaction() throws SQLException, ClassNotFoundException, UnknownHostException {
        AdvancePayment advancePayment = tableAdvancePayment.getSelectionModel().getSelectedItem();
        if (advancePayment == null) {
            functions.alertSuccessful(alert, "Nothing selected");
            return;
        } else {
            if (!cmbSelectEmployee.getSelectionModel().isEmpty()) {
                lbladvancetransactionid.setText("ADVT00" + Integer.toString(functions.getLastId("id", "tbladvancetransactions")));
                connection = connexion.getConnetion();
                String sql = "INSERT INTO `tbladvancetransactions`(`advancetransactionid`, `advanceid`, `employeeid`, "
                        + "`advanceamount`,`paidamount`,`paiddate`, `savedby`, `datecreated`, `usercreated`, `machinecreatedon`,"
                        + " `lastdatemodifed`, `lastusermodified`, `lastmachinemodifiedon`) VALUES (?,?,?,?,?,NOW(),?,NOW(),?,?,NOW(),?,?)";
                pst = connection.prepareStatement(sql);
                pst.setString(1, lbladvancetransactionid.getText().toUpperCase());
                pst.setString(2, lblAdvanceID.getText().toUpperCase());
                pst.setString(3, cmbSelectEmployee.getSelectionModel().getSelectedItem().toString().toUpperCase());
                pst.setDouble(4, advancePayment.getAmount());
                pst.setDouble(5, Double.parseDouble(txtRecieveAdvanceAmount.getText()));
                pst.setString(6, Inet4Address.getLocalHost().getHostName().toUpperCase());
                pst.setString(7, Inet4Address.getLocalHost().getHostName().toUpperCase());
                pst.setString(8, Inet4Address.getLocalHost().getHostName());
                pst.setString(9, Inet4Address.getLocalHost().getHostName());
                pst.setString(10, Inet4Address.getLocalHost().getHostName());
                pst.execute();
                functions.alertSuccessful(alert, "Transaction successfully processed");
                txtRecieveAdvanceAmount.clear();
                loadAdvancePaymentTableView();
                addNewAdvancePayment();
            } else {
                functions.alertError(alert, "Select employee to update record");
            }
        }
    }

    @FXML
    public void updateLoanTransaction() throws SQLException, ClassNotFoundException, UnknownHostException {
        System.out.println("update loan transaction 1");
        Loans loans = tableLoan.getSelectionModel().getSelectedItem();
        System.out.println("update loan transaction 2");
        if (loans == null) {
            functions.alertError(alert, "Select record you want to update.");
            return;
        } else {
            System.out.println("update loan transaction 3");
            if (!txtEnterEMIAmount.getText().isEmpty()) {
                System.out.println("update loan transaction 4");
                lblloantransactionid.setText("LNT00" + Integer.toString(functions.getLastId("id", "tbloantransactions")));
                connection = connexion.getConnetion();
                String sql = "INSERT INTO `tbloantransactions`(`loantransactionid`, `loanid`, `employeeid`, `loanamount`, "
                        + " `paidamount`, `paiddate`, `savedby`, `datecreated`, `usercreated`, `machinecreatedon`, `lastdatemodified`,"
                        + " `lastusermodified`, `lastmachinemodifiedon`) VALUES (?,?,?,?,?,NOW(),?,NOW(),?,?,NOW(),?,?)";
                pst = connection.prepareStatement(sql);
                pst.setString(1, lblloantransactionid.getText().toUpperCase());
                pst.setString(2, lblLoanID.getText().toUpperCase());
                pst.setString(3, cmbSelectEmployee.getSelectionModel().getSelectedItem().toString().toUpperCase());
                pst.setDouble(4, loans.getAmount());
                pst.setDouble(5, Double.parseDouble(txtEnterEMIAmount.getText()));
                pst.setString(6, Inet4Address.getLocalHost().getHostName().toUpperCase());
                pst.setString(7, Inet4Address.getLocalHost().getHostName().toUpperCase());
                pst.setString(8, Inet4Address.getLocalHost().getHostName());
                pst.setString(9, Inet4Address.getLocalHost().getHostName().toUpperCase());
                pst.setString(10, Inet4Address.getLocalHost().getHostName());
                pst.execute();
                functions.alertSuccessful(alert, "Loan transaction processed successfully.");
                txtEnterEMIAmount.clear();
                addNewLoan();
                loadLoanTableView();
            }
        }
    }

    @FXML
    public void downloadAdvanceTransactionHistory() { //to pdf
    }

    @FXML
    public void downloadLoanTransactionHistory() { // to pdf
    }
}
