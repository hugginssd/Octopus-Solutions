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

import constructors.HourlyBilling;
import constructors.OtherBillingDetail;
import constructors.OverTimeBilling;
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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import octopushr.Connexion;
import octopushr.Functions;

/**
 * FXML Controller class
 *
 * @author Huggins
 */
public class EmployeeBillingController implements Initializable {

    @FXML
    private ComboBox cmbSelectDepartment;

    @FXML
    private ComboBox cmbSelectEmployee;

    @FXML
    private Label lblEmployeeName;

    @FXML
    private Label lblDesignation;

    @FXML
    private Label lblDepartment;

    @FXML
    private Label lblTotalOverallOverTimeHours;

    @FXML
    private Label lblHourlyCostPerHour;

    @FXML
    private TextField txtTotalHours;

    @FXML
    private Label lblTotalHourlyAmount;

    @FXML
    private DatePicker dtpDate;

    @FXML
    private Button btnUpdateHourlyCost;

    @FXML
    private Button btnExportToExcel;

    @FXML
    private Button btnSet;

    @FXML
    private Button btnDelete;

    @FXML
    private TableView<HourlyBilling> tableHourlyBilling;

    @FXML
    private ObservableList<TableColumn<HourlyBilling, ?>> columnsHourlyBilling;

    @FXML
    private ObservableList<HourlyBilling> columns;

    @FXML
    private Button btnCloseForm;

    @FXML
    private TableView<OverTimeBilling> tableOverTimeBilling;

    @FXML
    private ObservableList<TableColumn<OverTimeBilling, ?>> columnsOverTimeBilling;

    @FXML
    private ObservableList<OverTimeBilling> columns2;

    @FXML
    private Button btnDelete1;

    @FXML
    private Button btnSet1;

    @FXML
    private Button btnExportToExcel1;

    @FXML
    private Button btnUpdateOvertimeCost;

    @FXML
    private DatePicker dtpDate1;

    @FXML
    private Label lblTotalOvertimeAmount;

    @FXML
    private TextField txtTotalHours1;

    @FXML
    private Label lblOvertimeCostPerHour, lblDepartmentId, lblHourlyBillingID;

    @FXML
    private TextField txtAmount;

    @FXML
    private TextArea txaDetail;

    @FXML
    private DatePicker dtpDateBilling;

    @FXML
    private TableView<OtherBillingDetail> tableOtherBillingDetails;

    @FXML
    private ObservableList<TableColumn<OtherBillingDetail, ?>> columnsOtherBillingDetails;

    @FXML
    private ObservableList<OtherBillingDetail> columns3;

    @FXML
    private Button btnExportToExcelBilling;

    @FXML
    private Button btnAdd;

    @FXML
    private Button btnDeleteBilling;

    @FXML
    private ImageView imgView;

    @FXML
    Alert alert;

    @FXML
    Stage stage;
    /**
     * Initializes the controller class.
     */
    Statement st;
    PreparedStatement pst;
    ResultSet rs;
    Connection connection;
    Connexion connexion = new Connexion();
    Functions functions = new Functions();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            // TODO
            loadDepartments();
            lblHourlyBillingID.setText("OVTB00" + Integer.toString(functions.getLastId("id", "tblovertimebilling")));
            setHourlyBillingTableView();
            setOverTimeBillingTableView();
            setOtherDetailsBillingTableView();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(EmployeeBillingController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    public void close(Event event) {
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
        pst.close();
        rs.close();
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
        pst.setString(1, cmbSelectEmployee.getSelectionModel().getSelectedItem().toString());
        rs = pst.executeQuery();
        while (rs.next()) {
            lblDepartment.setText(cmbSelectDepartment.getSelectionModel().getSelectedItem().toString().toUpperCase());
            functions.retrieveImage(imgView, rs);
            lblEmployeeName.setText(rs.getString("employeename"));
            lblDesignation.setText(rs.getString("designation"));
        }
        pst.close();
        rs.close();
        loadHourlyBilling();
        loadHourlyAndOverTimeRates();
        loadOverTimeBilling();
        loadOtherBillingDetail();
    }

    @FXML
    public void setHourlyBilling() throws SQLException, ClassNotFoundException, UnknownHostException {
        if (txtTotalHours.getText().isEmpty()) {
            functions.alertError(alert, "Total hours for hourly billing need to be set to process payment.");
            return;
        }
        if (dtpDate.getValue() == null) {
            functions.alertError(alert, "Date on which the overtime hours were worked need to be set to process payment.");
            return;
        }
        connection = connexion.getConnetion();
        String sql = "INSERT INTO `tblovertimebilling`(`overtimeid`, `employeeid`, "
                + " `totalperemployeehours`, `dateofhourlyovertime`, `totalperemployeeamount`,"
                + " `datecreated`, `usercreated`, `machinecreatedon`, `lastdatemodified`, `lastusermodified`,"
                + " `lastmachinemodifiedon`) VALUES (?,?,?,?,?,NOW(),?,?,NOW(),?,?)";
        lblTotalHourlyAmount.setText(Double.toString(Double.parseDouble(lblHourlyCostPerHour.getText()) * Double.parseDouble(txtTotalHours.getText())));
        pst = connection.prepareStatement(sql);
        pst.setString(1, lblHourlyBillingID.getText().toUpperCase());
        pst.setString(2, cmbSelectEmployee.getSelectionModel().getSelectedItem().toString().toUpperCase());
        pst.setInt(3, Integer.parseInt(txtTotalHours.getText()));
        pst.setString(4, dtpDate.getValue().getYear() + "-" + dtpDate.getValue().getMonthValue() + "-" + dtpDate.getValue().getDayOfMonth());
        pst.setDouble(5, Double.parseDouble(lblTotalHourlyAmount.getText()));
        pst.setString(6, Inet4Address.getLocalHost().getHostName().toUpperCase());
        pst.setString(7, Inet4Address.getLocalHost().getHostName());
        pst.setString(8, Inet4Address.getLocalHost().getHostName().toUpperCase());
        pst.setString(9, Inet4Address.getLocalHost().getHostName());
        pst.execute();
        functions.alertSuccessful(alert, "Hourly billing details for " + cmbSelectEmployee.getSelectionModel().getSelectedItem().toString().toUpperCase() + " successfully processed");
        txtTotalHours.clear();
        dtpDate.setValue(null);
        lblHourlyBillingID.setText("OVTB00" + Integer.toString(functions.getLastId("id", "tblovertimebilling")));
        loadHourlyBilling();
        lblTotalHourlyAmount.setText("0.00");
        pst.close();
    }

    @FXML
    public void setOverTimeBilling() throws SQLException, ClassNotFoundException, UnknownHostException {
        if (txtTotalHours1.getText().isEmpty()) {
            functions.alertError(alert, "Overtime hours are empty");
            return;
        }
        if (dtpDate1.getValue() == null) {
            functions.alertError(alert, "Date must not be set to null");
            return;
        }
        lblTotalOvertimeAmount.setText(Double.toString(Double.parseDouble(lblOvertimeCostPerHour.getText()) * Double.parseDouble(txtTotalHours1.getText())));
        connection = connexion.getConnetion();
        String sql = "INSERT INTO `tblovertimebilling`(`overtimeid`, `employeeid`, `totalovertimehours`, "
                + "`dateofovertimebilling`, `totalovertimeamount`, `datecreated`, `usercreated`, `machinecreatedon`, `lastdatemodified`, "
                + "`lastusermodified`, `lastmachinemodifiedon`)"
                + " VALUES (?,?,?,?,?,NOW(),?,?,NOW(),?,?)";
        pst = connection.prepareStatement(sql);
        pst.setString(1, lblHourlyBillingID.getText().toUpperCase());
        pst.setString(2, cmbSelectEmployee.getSelectionModel().getSelectedItem().toString().toUpperCase());
        pst.setDouble(3, Double.parseDouble(txtTotalHours1.getText().toUpperCase()));
        pst.setString(4, dtpDate1.getValue().getYear() + "-" + dtpDate1.getValue().getMonthValue() + "-" + dtpDate1.getValue().getDayOfMonth());
        pst.setDouble(5, Double.parseDouble(lblTotalOvertimeAmount.getText())); //totalovetimeamount
        pst.setString(6, Inet4Address.getLocalHost().getHostName().toUpperCase());
        pst.setString(7, Inet4Address.getLocalHost().getHostName());
        pst.setString(8, Inet4Address.getLocalHost().getHostName().toUpperCase());
        pst.setString(9, Inet4Address.getLocalHost().getHostName());
        pst.execute();
        functions.alertSuccessful(alert, "Overtime request successfulyy processed");
        txtTotalHours1.clear();
        dtpDate1.setValue(null);
        lblTotalOvertimeAmount.setText("0.00");
        loadOverTimeBilling();
    }

    @FXML
    public void loadHourlyAndOverTimeRates() throws SQLException, ClassNotFoundException {
        connection = connexion.getConnetion();
        String sql = "SELECT `id`, `overtimesettingid`, `employeeid`, `overtimecostperhour`, `hourlycostperemployee`"
                + " FROM `tblovertimesettings`"
                + " WHERE `employeeid` = ?";
        pst = connection.prepareStatement(sql);
        pst.setString(1, cmbSelectEmployee.getSelectionModel().getSelectedItem().toString().toUpperCase());
        rs = pst.executeQuery();
        while (rs.next()) {
            lblHourlyCostPerHour.setText(Double.toString(rs.getDouble("hourlycostperemployee")));
            lblOvertimeCostPerHour.setText(Double.toString(rs.getDouble("overtimecostperhour")));
        }
        pst.close();
        rs.close();
    }

    @FXML
    public void setOtherDetailBilling() throws SQLException, ClassNotFoundException, UnknownHostException {
        if (txtAmount.getText().isEmpty()) {
            functions.alertError(alert, "Amount cannot be empty.");
            return;
        }
        if (txaDetail.getText().isEmpty()) {
            functions.alertError(alert, "Detail description cannot be empty");
            return;
        }
        if (cmbSelectEmployee.getSelectionModel().isEmpty()) {
            functions.alertError(alert, "Employee not selected");
            return;
        }

//public boolean isAfter(ChronoLocalDate other)
//Checks if this date is after the specified date.
//This checks to see if this date represents a point on the local time-line after the other date.
//        LocalDate a = LocalDate.of(2012, 6, 30);
//        LocalDate b = LocalDate.of(2012, 7, 1);
//   a.isAfter(b) == false
//   a.isAfter(a) == false
//   b.isAfter(a) == true
        LocalDate local = LocalDate.now();
        if ((dtpDateBilling.getValue() != null && dtpDateBilling.getValue().isBefore(local)) || dtpDateBilling.getValue().equals(local)) {
            connection = connexion.getConnetion();
            String sql = "INSERT INTO `tblovertimebilling`( `overtimeid`, `employeeid`, `otheramount`, `otherdetail`, "
                    + "`otherdetaildate`,`datecreated`, `usercreated`, `machinecreatedon`, `lastdatemodified`, "
                    + "`lastusermodified`, `lastmachinemodifiedon`) "
                    + " VALUES (?,?,?,?,?,NOW(),?,?,NOW(),?,?)";
            lblHourlyBillingID.setText("OVTB00" + Integer.toString(functions.getLastId("id", "tblovertimebilling")));
            pst = connection.prepareStatement(sql);
            pst.setString(1, lblHourlyBillingID.getText().toUpperCase());
            pst.setString(2, cmbSelectEmployee.getSelectionModel().getSelectedItem().toString().toUpperCase());
            pst.setDouble(3, Double.parseDouble(txtAmount.getText()));
            pst.setString(4, txaDetail.getText().toUpperCase());
            pst.setString(5, dtpDateBilling.getValue().getYear() + "-" + dtpDateBilling.getValue().getMonthValue() + "-" + dtpDateBilling.getValue().getDayOfMonth());
            pst.setString(6, Inet4Address.getLocalHost().getHostName().toUpperCase().toUpperCase());
            pst.setString(7, Inet4Address.getLocalHost().getHostName().toUpperCase());
            pst.setString(8, Inet4Address.getLocalHost().getHostName().toUpperCase().toUpperCase());
            pst.setString(9, Inet4Address.getLocalHost().getHostName().toUpperCase());
            pst.execute();
            functions.alertSuccessful(alert, "Request successfully processed.");
            lblHourlyBillingID.setText("OVTB00" + Integer.toString(functions.getLastId("id", "tblovertimebilling")));
            txtAmount.clear();
            txaDetail.clear();
            dtpDateBilling.setValue(null);
            pst.close();
            rs.close();
            loadOtherBillingDetail();
        } else {
            functions.alertError(alert, "Date is invalid.\nDate should be before today or today");
        }
    }

    @FXML
    public void setHourlyBillingTableView() {
        columnsHourlyBilling = tableHourlyBilling.getColumns();

        final TableColumn<HourlyBilling, ?> colID = new TableColumn<>("ID");
        colID.setCellValueFactory(new PropertyValueFactory<>("ID"));
        colID.setPrefWidth(50);
        columnsHourlyBilling.add(colID);

        final TableColumn<HourlyBilling, ?> colHourlyCostPerHour = new TableColumn<>("HOURLY COST PER HOUR");
        colHourlyCostPerHour.setCellValueFactory(new PropertyValueFactory<>("HourlyCostPerHour"));
        colHourlyCostPerHour.setPrefWidth(155);
        columnsHourlyBilling.add(colHourlyCostPerHour);

        final TableColumn<HourlyBilling, ?> colTotalHours = new TableColumn<>("TOTAL HOURS");
        colTotalHours.setCellValueFactory(new PropertyValueFactory<>("TotalHours"));
        colTotalHours.setPrefWidth(90);
        columnsHourlyBilling.add(colTotalHours);

        final TableColumn<HourlyBilling, ?> colTotalAmount = new TableColumn<>("TOTAL AMOUNT");
        colTotalAmount.setCellValueFactory(new PropertyValueFactory<>("TotalAmount"));
        colTotalAmount.setPrefWidth(100);
        columnsHourlyBilling.add(colTotalAmount);

        final TableColumn<HourlyBilling, ?> colDate = new TableColumn<>("DATE");
        colDate.setCellValueFactory(new PropertyValueFactory<>("Date"));
        columnsHourlyBilling.add(colDate);
    }

    @FXML
    public void setOverTimeBillingTableView() {
        columnsOverTimeBilling = tableOverTimeBilling.getColumns();

        final TableColumn<OverTimeBilling, ?> colID = new TableColumn<>("ID");
        colID.setCellValueFactory(new PropertyValueFactory<>("ID"));
        colID.setPrefWidth(50);
        columnsOverTimeBilling.add(colID);

        final TableColumn<OverTimeBilling, ?> colHourlyCostPerHour = new TableColumn<>("OVERTIME COST PER HOUR");
        colHourlyCostPerHour.setCellValueFactory(new PropertyValueFactory<>("OverTimeCostPerHour"));
        colHourlyCostPerHour.setPrefWidth(155);
        columnsOverTimeBilling.add(colHourlyCostPerHour);

        final TableColumn<OverTimeBilling, ?> colTotalHours = new TableColumn<>("OVERTIME HOURS");
        colTotalHours.setCellValueFactory(new PropertyValueFactory<>("OverTimeHours"));
        colTotalHours.setPrefWidth(90);
        columnsOverTimeBilling.add(colTotalHours);

        final TableColumn<OverTimeBilling, ?> colTotalAmount = new TableColumn<>("TOTAL AMOUNT");
        colTotalAmount.setCellValueFactory(new PropertyValueFactory<>("TotalAmount"));
        colTotalAmount.setPrefWidth(100);
        columnsOverTimeBilling.add(colTotalAmount);

        final TableColumn<OverTimeBilling, ?> colDate = new TableColumn<>("DATE");
        colDate.setCellValueFactory(new PropertyValueFactory<>("Date"));
        columnsOverTimeBilling.add(colDate);
    }

    @FXML
    public void setOtherDetailsBillingTableView() {
        columnsOtherBillingDetails = tableOtherBillingDetails.getColumns();

        final TableColumn<OtherBillingDetail, ?> colID = new TableColumn<>("ID");
        colID.setCellValueFactory(new PropertyValueFactory<>("ID"));
        colID.setPrefWidth(50);
        columnsOtherBillingDetails.add(colID);

        final TableColumn<OtherBillingDetail, ?> colDetailID = new TableColumn<>("DETAILID");
        colDetailID.setCellValueFactory(new PropertyValueFactory<>("DetailID"));
        columnsOtherBillingDetails.add(colDetailID);

        final TableColumn<OtherBillingDetail, ?> colDetail = new TableColumn<>("DETAIL");
        colDetail.setCellValueFactory(new PropertyValueFactory<>("Detail"));
        colDetail.setPrefWidth(155);
        columnsOtherBillingDetails.add(colDetail);

        final TableColumn<OtherBillingDetail, ?> colAmount = new TableColumn<>("AMOUNT");
        colAmount.setCellValueFactory(new PropertyValueFactory<>("Amount"));
        colAmount.setPrefWidth(90);
        columnsOtherBillingDetails.add(colAmount);

        final TableColumn<OtherBillingDetail, ?> colDate = new TableColumn<>("DATE");
        colDate.setCellValueFactory(new PropertyValueFactory<>("Date"));
        colDate.setPrefWidth(100);
        columnsOtherBillingDetails.add(colDate);

    }

    @FXML
    public void loadHourlyBilling() throws SQLException, ClassNotFoundException {
        connection = connexion.getConnetion();
        System.out.println("loading hourly billing 1");
        String sql = "SELECT `tblovertimebilling`.`id` AS id, `overtimeid`, `tblovertimebilling`.`employeeid` AS employeeid, `totalperemployeehours`,`totalperemployeeamount`, `dateofhourlyovertime`, `deleted`,"
                + "`hourlycostperemployee`"
                + "FROM `tblovertimebilling`"
                + "INNER JOIN `tblovertimesettings`"
                + "ON `tblovertimesettings`.`employeeid` = `tblovertimebilling`.`employeeid`"
                + "WHERE `tblovertimebilling`.`employeeid` = ? AND `tblovertimebilling`.`deleted` = 0 "
                + "AND `totalperemployeehours` !=0";
        pst = connection.prepareStatement(sql);
        pst.setString(1, cmbSelectEmployee.getSelectionModel().getSelectedItem().toString().toUpperCase());
        columns = FXCollections.observableArrayList();
        tableHourlyBilling.setItems(null);
        System.out.println("loading hourly billing 2");
        rs = pst.executeQuery();
        while (rs.next()) {
            System.out.println("loading hourly billing 3");
            columns.addAll(new HourlyBilling(rs.getInt("id"), rs.getDouble("hourlycostperemployee"),
                    rs.getInt("totalperemployeehours"), rs.getDouble("totalperemployeeamount"),
                    rs.getDate("dateofhourlyovertime")));
            System.out.println("loading hourly billing 4");
        }
        tableHourlyBilling.setItems(columns);
        tableHourlyBilling.setEditable(false);
        pst.close();
        rs.close();
    }

    @FXML
    public void loadOverTimeBilling() throws SQLException, ClassNotFoundException {
        connection = connexion.getConnetion();
        System.out.println("loading overtime billing 1");
        String sql = "SELECT `tblovertimebilling`.`id` AS id, `overtimeid`, `tblovertimebilling`.`employeeid` AS employeeid,"
                + " `totalovertimehours`,`totalovertimeamount`, `dateofovertimebilling`, `deleted`,`overtimecostperhour`"
                + " FROM `tblovertimebilling`"
                + " INNER JOIN `tblovertimesettings`"
                + " ON `tblovertimesettings`.`employeeid` = `tblovertimebilling`.`employeeid`"
                + " WHERE `tblovertimebilling`.`employeeid` = ? AND `tblovertimebilling`.`deleted` = 0 "
                + " AND `totalovertimehours` !=0";
        pst = connection.prepareStatement(sql);
        pst.setString(1, cmbSelectEmployee.getSelectionModel().getSelectedItem().toString().toUpperCase());
        columns2 = FXCollections.observableArrayList();
        tableOverTimeBilling.setItems(null);
        System.out.println("loading overtime billing 2");
        rs = pst.executeQuery();
        while (rs.next()) {
            System.out.println("loading overtime billing 3");
            columns2.addAll(new OverTimeBilling(rs.getInt("id"), rs.getDouble("overtimecostperhour"),
                    rs.getInt("totalovertimehours"), rs.getDouble("totalovertimeamount"),
                    rs.getDate("dateofovertimebilling")));
            System.out.println("loading overtime billing 4");
        }
        tableOverTimeBilling.setItems(columns2);
        tableOverTimeBilling.setEditable(false);
        pst.close();
        rs.close();
    }

    @FXML
    public void loadOtherBillingDetail() throws SQLException, ClassNotFoundException {
        connection = connexion.getConnetion();
        String sql = "SELECT `id`, `overtimeid`, `employeeid`, `otheramount`, `otherdetail`, `otherdetaildate`, `deleted` "
                + "FROM `tblovertimebilling`"
                + "WHERE `employeeid` = ? AND `deleted` = 0 "
                + " AND `otheramount` !=0";
        pst = connection.prepareStatement(sql);
        pst.setString(1, cmbSelectEmployee.getSelectionModel().getSelectedItem().toString().toUpperCase());
        rs = pst.executeQuery();
        columns3 = FXCollections.observableArrayList();
        tableOtherBillingDetails.setItems(null);
        while (rs.next()) {
            columns3.addAll(new OtherBillingDetail(rs.getInt("id"), rs.getString("overtimeid"),
                    rs.getString("otherdetail"), rs.getDouble("otheramount"),
                    rs.getDate("otherdetaildate")));
        }
        tableOtherBillingDetails.setItems(columns3);
        pst.close();
        rs.close();
    }

    @FXML
    public void deleteHourlyBilling() throws SQLException, ClassNotFoundException, UnknownHostException {
        HourlyBilling hourlyBilling = tableHourlyBilling.getSelectionModel().getSelectedItem();
        if (hourlyBilling == null) {
            functions.alertError(alert, "Nothing selected");
            return;
        }
        if (cmbSelectEmployee.getSelectionModel().getSelectedItem().toString().isEmpty()) {
            functions.alertError(alert, "Error performing request,\nSelect employee you want to process billing for.");
            return;
        }
        connection = connexion.getConnetion();
        String sql = "UPDATE `tblovertimebilling` SET `deleted`=?,`lastdatemodified`=NOW(),`lastusermodified`=?,"
                + "`lastmachinemodifiedon`=? "
                + "WHERE id = ?";
        pst = connection.prepareStatement(sql);
        pst.setInt(1, 1);
        pst.setString(2, Inet4Address.getLocalHost().getHostName().toUpperCase());
        pst.setString(3, Inet4Address.getLocalHost().getHostName());
        pst.setInt(4, hourlyBilling.getID());
        pst.execute();
        functions.alertSuccessful(alert, "Record successfully deleted.");
        loadHourlyBilling();
    }

    @FXML
    public void deleteOverTimeBilling() throws SQLException, ClassNotFoundException, UnknownHostException {
        OverTimeBilling overTimeBilling = tableOverTimeBilling.getSelectionModel().getSelectedItem();
        if (overTimeBilling == null) {
            functions.alertError(alert, "Nothing selected");
            return;
        }
        if (cmbSelectEmployee.getSelectionModel().getSelectedItem().toString().isEmpty()) {
            functions.alertError(alert, "Error performing request,\nSelect employee you want to process billing for.");
            return;
        }
        connection = connexion.getConnetion();
        String sql = "UPDATE `tblovertimebilling` SET `deleted`=?,`lastdatemodified`=NOW(),`lastusermodified`=?,"
                + "`lastmachinemodifiedon`=? "
                + "WHERE id = ?";
        pst = connection.prepareStatement(sql);
        pst.setInt(1, 1);
        pst.setString(2, Inet4Address.getLocalHost().getHostName().toUpperCase());
        pst.setString(3, Inet4Address.getLocalHost().getHostName());
        pst.setInt(4, overTimeBilling.getID());
        pst.execute();
        functions.alertSuccessful(alert, "Record successfully deleted.");
        loadOverTimeBilling();

    }

    @FXML
    public void deleteOtherBillingDetail() throws SQLException, UnknownHostException, ClassNotFoundException {
        OtherBillingDetail otherBillingDetail = tableOtherBillingDetails.getSelectionModel().getSelectedItem();
        if (otherBillingDetail == null) {
            functions.alertError(alert, "Nothing selected in the table");
            return;
        }
        if (cmbSelectEmployee.getSelectionModel().isEmpty()) {
            functions.alertError(alert, "Select employee to delete record");
            return;
        }
        connection = connexion.getConnetion();
        String sql = "UPDATE `tblovertimebilling` SET `deleted`=?,`lastdatemodified`=NOW(),`lastusermodified`=?,"
                + "`lastmachinemodifiedon`=? "
                + "WHERE id = ?";
        pst = connection.prepareStatement(sql);
        pst.setInt(1, 1);
        pst.setString(2, Inet4Address.getLocalHost().getHostName().toUpperCase());
        pst.setString(3, Inet4Address.getLocalHost().getHostName());
        pst.setInt(4, otherBillingDetail.getID());
        pst.execute();
        functions.alertSuccessful(alert, "Request successfully processed.");
        loadOtherBillingDetail();
    }

    @FXML
    public void loadEssentialForm() throws IOException {
        stage = new Stage();
        Pane root = FXMLLoader.load(getClass().getResource("/octopushr/employees/updateEmployeeDetails.fxml"));
        Scene scene = new Scene(root, 1700, 840);
        out.print("updateEmployeeDetails.fxml");
        scene.getStylesheets().add("/resources/css/updateemployeedetails.css");
        stage.setTitle("Update Employee Details");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    public void exportHourlyBillingToExcel() {

    }

    @FXML
    public void exportOverTimeBillingToExcel() {

    }

}
