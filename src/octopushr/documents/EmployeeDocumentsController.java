package octopushr.documents;

import java.net.URL;
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
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Tab;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import octopushr.Connexion;
import octopushr.Functions;

public class EmployeeDocumentsController implements Initializable {

    @FXML
    private Button btnCloseWindow;
    @FXML
    private Button btnExternalDocuments;

    @FXML
    private Button btnCompanyDocuments;

    @FXML
    private Button btnExpiredDocuments;

    @FXML
    private Button btnReferenceDocuments;

    @FXML
    private ComboBox cmbSelectDepartment;

    @FXML
    private ComboBox cmbSelectEmployee;

    @FXML
    private ComboBox cmbAllDocumentTypes;

    @FXML
    private Label lblDocumentTypeCategory;

    @FXML
    private ImageView imgAddDepartment;

    @FXML
    private ImageView imageViewSelectEmployee;

    @FXML
    private ImageView imageViewAllDocumentTypes;

    @FXML
    private Label lblEmployeeName;

    @FXML
    private Label lblEmployeeId, lblEmployeeid;

    @FXML
    private Label lblDesignation;

    @FXML
    private Label lblDepartment;

    @FXML
    private ComboBox<?> cmbSelectDocumentType;

    @FXML
    private Label lblDocumentTypeCategory_;

    @FXML
    private TextField txtSelectDocument;

    @FXML
    private DatePicker dtpSubmitteddate;

    @FXML
    private ToggleButton toggleDuplicate;

    @FXML
    private ToggleButton tglbExpiryDate;

    @FXML
    private Button btnReset;

    @FXML
    private Button btnUpload;

    @FXML
    private ImageView imageViewSelectDocumentType;

    @FXML
    private RadioButton rdbYes;

    @FXML
    private RadioButton rdbNo;

    @FXML
    private Tab tabSubmittedDocuments;

    @FXML
    private TableView<?> tableSubmittedDocuments;

    @FXML
    private Tab tabIssuedDocuments;

    @FXML
    private TableView<?> tableIssuedDocuments;

    @FXML
    private Tab tabInternalDocuments;

    @FXML
    private DatePicker dtpDateTo;

    @FXML
    private DatePicker dtpDateFrom;

    @FXML
    private Button btnSearch;

    @FXML
    private TableView<?> tblInternalDocuments;

    @FXML
    private Button btnAddNew;

    @FXML
    private Button btnDelete;

    @FXML
    private Button btnViewDetail;

    @FXML
    private Button btnEdit;

    @FXML
    private Button btnListAll;

    @FXML
    private Button btnClose;

    @FXML
    private Label lblDepartmentId;

    Functions functions = new Functions();
    Connexion connexion = new Connexion();
    Connection connection;
    PreparedStatement pst;
    Statement st;
    ResultSet rs;
    String employeename;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            cmbSelectDepartment.getItems().addAll(functions.loadDepartments());
            loadDocumentTypes();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(EmployeeDocumentsController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    public void setClose() {

        Stage stage = (Stage) btnCloseWindow.getScene().getWindow();
        stage.close();

    }

    @FXML
    public void loadDepartmentId() throws SQLException, ClassNotFoundException {
        connection = connexion.getConnetion();
        pst = connection.prepareStatement("SELECT DISTINCT `departmentid`,`departmentname` FROM `tbldepartments` WHERE `departmentname`= ? ORDER BY `departmentname`");
        pst.setString(1, cmbSelectDepartment.getSelectionModel().getSelectedItem().toString());
        rs = pst.executeQuery();
        ObservableList observableList = FXCollections.observableArrayList();
        while (rs.next()) {
            lblDepartmentId.setText(rs.getString("departmentid"));
        }
        cmbSelectEmployee.getItems().addAll(functions.loadEmployees(lblDepartmentId.getText()));
    }

    @FXML
    public void loadDocumentTypes() throws SQLException, ClassNotFoundException {
        cmbAllDocumentTypes.getItems().addAll(functions.loadDocumentTypes());
        cmbSelectDocumentType.getItems().addAll(functions.loadDocumentTypes());
    }

    @FXML
    public void loadProfile() throws SQLException, ClassNotFoundException {
        connection = connexion.getConnetion();
        pst = connection.prepareStatement("SELECT `tblguards`.`id`, `employeeid`, `firstname`,`middlename`,`surname`, `gender`,"
                + " `dateofbirth`, `placeofbirth`, `gradeid`, `idno`, `healthnotes`, `married`, `active`, `verified`,"
                + " `tbldesignation`.`designation` AS designation, `tbldepartments`.`departmentname` AS department"
                + " FROM `tblguards`"
                + " INNER JOIN `tbldesignation`"
                + " ON `tbldesignation`.`designationid` = `tblguards`.`designationid`"
                + " INNER JOIN `tbldepartments`"
                + " ON `tbldepartments`.`departmentid` = `tblguards`.`departmentid`"
                + " WHERE CONCAT(`firstname`,' ',`middlename`,' ',`surname`) = ?");
        pst.setString(1, cmbSelectEmployee.getSelectionModel().getSelectedItem().toString());
        rs = pst.executeQuery();
        while (rs.next()) {
            lblEmployeeId.setText(rs.getString("employeeid"));
        }
        pst.clearParameters();
        pst = connection.prepareStatement("SELECT `tblguards`.`id`, `employeeid`, CONCAT(`firstname`,' ',`middlename`,' ',`surname`) AS employeename, `gender`, `dateofbirth`, `placeofbirth`, `gradeid`, `idno`, `healthnotes`, `married`, `active`, `verified`, `tbldesignation`.`designation` AS designation, `tbldepartments`.`departmentname` AS department"
                + " FROM `tblguards`"
                + " INNER JOIN `tbldesignation`"
                + " ON `tbldesignation`.`designationid` = `tblguards`.`designationid`"
                + " INNER JOIN `tbldepartments`"
                + " ON `tbldepartments`.`departmentid` = `tblguards`.`departmentid`"
                + " WHERE `tblguards`.`employeeid` = ?");
        pst.setString(1, lblEmployeeId.getText());
        rs = pst.executeQuery();
        System.out.println("\nProfile loading\n");
        while (rs.next()) {
            lblEmployeeName.setText(rs.getString("employeename"));
            lblDesignation.setText(rs.getString("designation"));
            lblDepartment.setText(rs.getString("department"));
            //System.out.println("\nProfile loaded\n"+employeename+" "+designation+" "+department);
        }
//        functions.loadEmployeeProfile(lblEmployeeId.getText(),employeename, lblDesignation.getText(), lblDepartment.getText());
//        lblEmployeeName.setText(employeename);
    }

    @FXML
    public void loadDocumentTypeID() throws SQLException, ClassNotFoundException {
        connection = connexion.getConnetion();
        pst = connection.prepareStatement("SELECT `id`, `documentid`, `documenttype`, `submittedtoemployee` "
                + " FROM `tblemployeedocuments` "
                + " WHERE `documenttype` = ?");
        // ObservableList observableList = FXCollections.observableArrayList();
        pst.setString(1, cmbSelectDocumentType.getSelectionModel().getSelectedItem().toString());
        rs = pst.executeQuery();
        while (rs.next()) {
            lblDocumentTypeCategory_.setText(rs.getString("documentid"));
        }

    }

    @FXML
    public void loadEmployeeDocumentTypeID() throws SQLException, ClassNotFoundException {
        connection = connexion.getConnetion();
        pst = connection.prepareStatement("SELECT `id`, `documentid`, `documenttype`, `submittedtoemployee` "
                + " FROM `tblemployeedocuments` "
                + " WHERE `documenttype` = ?");
        // ObservableList observableList = FXCollections.observableArrayList();
        pst.setString(1, cmbAllDocumentTypes.getSelectionModel().getSelectedItem().toString());
        rs = pst.executeQuery();
        while (rs.next()) {
            lblDocumentTypeCategory.setText(rs.getString("documentid"));
        }

    }

    @FXML
    public void loadEmployeeSubmittedDocuments() throws SQLException, ClassNotFoundException {
        connection = connexion.getConnetion();
        pst = connection.prepareStatement("");
        
        
        
        
        
        
    }
}
