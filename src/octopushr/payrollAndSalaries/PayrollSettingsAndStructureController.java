package octopushr.payrollAndSalaries;

import constructors.PayrollAttributes;
import java.io.IOException;
import java.net.Inet4Address;
import java.net.URL;
import java.net.UnknownHostException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import octopushr.Functions;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import octopushr.Connexion;

public class PayrollSettingsAndStructureController implements Initializable {

    @FXML
    private Pane paneButtons;

    @FXML
    private Button btnPaySalary;

    @FXML
    private Button btnBankSheet;

    @FXML
    private Button btnAttendanceSync;

    @FXML
    private Button btnPayslipSalaryHistory;

    @FXML
    private Button btnWagesAndBilling;

    @FXML
    private Button btnLoanAndAdvance;

    @FXML
    private Button btnReports;

    @FXML
    private Pane paneSettings;

    @FXML
    private Tab tabPayrollAttribute;

    @FXML
    private AnchorPane anchorPaneSettings;

    @FXML
    private Label lblPayrollSettings, lblAttributeid;

    @FXML
    private Pane pane1;

    @FXML
    private ComboBox cmbAttributeType;

    @FXML
    private TextField txtPayrollAttribute;

    @FXML
    private Button btnCloseForm;

    @FXML
    private Button btnAdd;

    @FXML
    private Pane pane2;

    @FXML
    private TableView<PayrollAttributes> tableAttributeList;

    @FXML
    private ObservableList<TableColumn<PayrollAttributes, ?>> columnsAttributeList;

    @FXML
    private ObservableList<PayrollAttributes> columns;

    @FXML
    private Button btnAddNew;

    @FXML
    private Button btnDelete;

    @FXML
    private Tab tabPayrollStructure;

    @FXML
    private Stage stage;

    @FXML
    private Alert alert;

    Functions functions = new Functions();
    Connexion connexion = new Connexion();
    Connection connection;
    Statement st;
    PreparedStatement pst;
    ResultSet rs;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            cmbAttributeType.getItems().addAll("Earning", "Deduction");
            lblAttributeid.setText("ATTR00" + functions.getLastId("id", "tblattributetype"));
            setTableView();
            loadPayrollAttributes();
        } catch (SQLException | ClassNotFoundException ex) {
            functions.alertError(alert, ex.toString());
        }
    }

    @FXML
    public void addPayrollAttributes() {
        if (cmbAttributeType.getSelectionModel().isEmpty()) {
            functions.alertError(alert, "Invalid parameters.\nChoose attribute before you create new attribute type.");
            return;
        }
        if (txtPayrollAttribute.getText().isEmpty()) {
            functions.alertError(alert, "Invalid parameters.\nAdd new payroll attribute type.");
            return;
        }
        try {
            connection = connexion.getConnetion();
            String sql = "INSERT INTO `tblattributetype`(`attributetypeid`, `attributeid`, `description`, `datecreated`, `usercreated`, "
                    + "`machinecreatedon`, `lastdatemodified`, `lastusermodified`, `lastmachinemodifiedon`)"
                    + " VALUES (?,?,?,NOW(),?,?,NOW(),?,?)";
            pst = connection.prepareStatement(sql);
            pst.setString(1, lblAttributeid.getText().toUpperCase());
            pst.setInt(2, cmbAttributeType.getSelectionModel().getSelectedIndex() + 1);
            pst.setString(3, txtPayrollAttribute.getText().toUpperCase());
            pst.setString(4, Inet4Address.getLocalHost().getHostName().toUpperCase());
            pst.setString(5, Inet4Address.getLocalHost().getHostName());
            pst.setString(6, Inet4Address.getLocalHost().getHostName().toUpperCase());
            pst.setString(7, Inet4Address.getLocalHost().getHostName());
            pst.execute();
            functions.alertSuccessful(alert, "Successfully created");
            lblAttributeid.setText("ATTR00" + functions.getLastId("id", "tblattributetype"));
            txtPayrollAttribute.clear();
            cmbAttributeType.setValue(null);
            loadPayrollAttributes();
        } catch (SQLException | UnknownHostException | ClassNotFoundException ex) {
            functions.alertError(alert, ex.toString());
        }
    }

    @FXML
    public void closeThisStage(Event event) {
        functions.closeWindow(event);
    }

    @FXML
    public void setTableView() {
        columnsAttributeList = tableAttributeList.getColumns();

        final TableColumn<PayrollAttributes, ?> colID = new TableColumn("ID");
        colID.setCellValueFactory(new PropertyValueFactory<>("ID"));
        columnsAttributeList.add(colID);

        final TableColumn<PayrollAttributes, ?> colAttribute = new TableColumn("ATTRIBUTE");
        colAttribute.setCellValueFactory(new PropertyValueFactory<>("Attribute"));
        colAttribute.setPrefWidth(200);
        columnsAttributeList.add(colAttribute);

        final TableColumn<PayrollAttributes, ?> colAttributeType = new TableColumn("ATTRIBUTE TYPE");
        colAttributeType.setCellValueFactory(new PropertyValueFactory<>("AttributeType"));
        colAttributeType.setPrefWidth(200);
        columnsAttributeList.add(colAttributeType);

    }

    @FXML
    public void loadPayrollAttributes() {
        try {
            connection = connexion.getConnetion();
            String sql = "SELECT `id`, `attributetypeid`,`tblattribute`.`description` AS attribdesc, "
                    + " `tblattributetype`.`description` AS attribtypedesc "
                    + " FROM `tblattributetype` "
                    + " INNER JOIN `tblattribute`"
                    + " ON `tblattribute`.`attributeid` = `tblattributetype`.`attributeid`";
            //pst = connection.prepareStatement(sql);
            st = connection.createStatement();
            rs = st.executeQuery(sql);
            columns = FXCollections.observableArrayList();
            tableAttributeList.setItems(null);
            while (rs.next()) {
                columns.addAll(new PayrollAttributes(rs.getInt("id"), rs.getString("attribtypedesc"),rs.getString("attribdesc")));
            }
            tableAttributeList.setItems(columns);
            st.close();
            rs.close();
        } catch (SQLException | ClassNotFoundException ex) {
            functions.alertError(alert, ex.toString());
        }

    }

    @FXML
    public void showPayEmployee() throws IOException {
        stage = new Stage();
        GridPane root = FXMLLoader.load(getClass().getResource("/octopushr/payrollAndSalaries/payEmployeeSalary.fxml"));
        Scene scene = new Scene(root);
        scene.getStylesheets().add("/resources/css/payemployeesalary.css");
        stage.setTitle("Pay Employee Salary");
        stage.setResizable(false);
        stage.setWidth(1355);
        stage.setHeight(851);
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();
    }

    @FXML
    public void showBankSheet() throws IOException {
        stage = new Stage();
        AnchorPane root = FXMLLoader.load(getClass().getResource("/octopushr/payrollAndSalaries/bankSheet.fxml"));
        Scene scene = new Scene(root, 1025, 650);
        scene.getStylesheets().add("/resources/css/banksheet.css");
        stage.setTitle("Bank Sheet");
        stage.setResizable(false);
        stage.centerOnScreen();
        stage.setWidth(1025);
        stage.setHeight(650);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void showAttendanceSync() throws IOException {
        stage = new Stage();
        AnchorPane root = FXMLLoader.load(getClass().getResource("/octopushr/attendance/attendanceSync.fxml"));
        Scene scene = new Scene(root, 1400, 900);
        scene.getStylesheets().add("/resources/css/attendancesync.css");
        stage.setTitle("Attendance Sync");
        stage.setResizable(false);
        stage.setWidth(1400);
        stage.setHeight(900);
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();
    }

    @FXML
    public void showPaySalaryHistory() throws IOException {
        stage = new Stage();
        AnchorPane root = FXMLLoader.load(getClass().getResource("/octopushr/payrollAndSalaries/employeeSalaryHistory.fxml"));
        Scene scene = new Scene(root, 1340, 885);
        scene.getStylesheets().add("/resources/css/employeesalaryhistory.css");
        stage.setTitle("Employee Salary History");
        stage.setResizable(false);
        stage.setWidth(1335);
        stage.setHeight(820);
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();
    }

    @FXML
    public void showLoanAndAdvances() throws IOException {
        stage = new Stage();
        AnchorPane root = FXMLLoader.load(getClass().getResource("/octopushr/payrollAndSalaries/loanAndAdvances.fxml"));
        Scene scene = new Scene(root, 1200, 720);
        scene.getStylesheets().add("/resources/css/loanandadvances.css");
        stage.setTitle("Loan And Advances");
        stage.setResizable(false);
        stage.setWidth(1200);
        stage.setHeight(720);
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();
    }

    @FXML
    public void showEmployeeBilling() throws IOException {
        stage = new Stage();
        AnchorPane root = FXMLLoader.load(getClass().getResource("/octopushr/payrollAndSalaries/employeeBilling.fxml"));
        Scene scene = new Scene(root, 983, 630);
        scene.getStylesheets().add("/resources/css/employeebilling.css");
        stage.setTitle("Employee Billing");
        stage.setResizable(false);
        stage.setWidth(983);
        stage.setHeight(630);
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();
    }

    @FXML
    public void showOctopusReport() throws IOException {
        stage = new Stage();
        AnchorPane root = FXMLLoader.load(getClass().getResource("/octopushr/reports/octopusReport.fxml"));
        Scene scene = new Scene(root, 983, 630);
        scene.getStylesheets().add("/resources/css/octopusreport.css");
        stage.setTitle("OctopusHR Report");
        stage.setResizable(false);
        stage.setWidth(983);
        stage.setHeight(630);
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();
    }

}
