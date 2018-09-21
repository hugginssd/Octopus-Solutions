package octopushr.employees;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import octopushr.Connexion;
import octopushr.Functions;

public class ViewEmployeeDetailsController implements Initializable {

    @FXML
    private Pane paneBack;

    @FXML
    private Pane topPane;

    @FXML
    private Pane paneImage;

    @FXML
    private Label lblemployeeName;

    @FXML
    private Button btnEditEmployeeDetails;

    @FXML
    private Button btnDeactivateEmployee;

    @FXML
    private Label lblName;

    @FXML
    private Label lblRelationship;

    @FXML
    private Label lblHomePhone;

    @FXML
    private Label lblEmail;

    @FXML
    private ComboBox<?> cmbDepartment;

    @FXML
    private ComboBox<?> cmbEmployee;

    @FXML
    private Label lblEmployeeName;

    @FXML
    private Label lblEmployeeId;

    @FXML
    private Label lblBirthDate;

    @FXML
    private Label lblDesignation;

    @FXML
    private Label lblDepartment;

    @FXML
    private Label lblJoiningDate;

    @FXML
    private Label lblJobStatus;

    @FXML
    private Label lblWorkShift;

    @FXML
    private Label lblEmployeeStatus;

    @FXML
    private Label lblIdentificationDetails;

    @FXML
    private Label lblVerifiedEmployee;

    @FXML
    private Label lblBankname;

    @FXML
    private Label lblAccountholder;

    @FXML
    private Label lblAccountnumber;

    @FXML
    private Label lblOtherBankDetails;

    @FXML
    private Label lblHourlyCostPerHour;

    @FXML
    private Label lblOvertimeCostPerHour;

    @FXML
    private Label lblFatherName;

    @FXML
    private Label lblMotherName;

    @FXML
    private Label lblGender;

    @FXML
    private Label lblBloodGroup;

    @FXML
    private Label lblMaritalStatus;

    @FXML
    private Label lblReligion;

    @FXML
    private Label lblLanguageSpeak;

    @FXML
    private Label lblLanguageWriten;

    @FXML
    private Label lblEthnicOrigin;

    @FXML
    private Label lblTwitter;

    @FXML
    private Label lblSkype;

    @FXML
    private Label lblFacebook;

    @FXML
    private Label lblLinkedIn;

    @FXML
    private Label lblWorkPhone;

    @FXML
    private Label lblWorkEmail;

    @FXML
    private Label lblCellPhone;

    @FXML
    private Label lblPersonalEmail;

    @FXML
    private Label lblCorrespondenceAddress;

    @FXML
    private Label lblPermanentAddress;

    Connection connection;
    Connexion connexion;
    Statement st;
    PreparedStatement pst;
    ResultSet rs;
    Functions functions = new Functions();
    Alert alert;
    String employeeName = "Michael Ryan";

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    @FXML
    public void closeThisStage(Event event) {
        functions.closeWindow(event);
    }

    @FXML
    public void deactivateEmployee() {
        functions.alertSuccessful(alert, "Do you want to deactivate " + lblemployeeName.getText().toUpperCase() + "?");

    }
}
