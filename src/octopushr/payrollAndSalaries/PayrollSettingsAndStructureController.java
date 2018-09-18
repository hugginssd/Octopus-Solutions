package octopushr.payrollAndSalaries;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import octopushr.closeQuit;

public class PayrollSettingsAndStructureController implements Initializable {

    @FXML
    Stage stage;

    @FXML
    private Button btnPaySalary;
    closeQuit closeQuit = new closeQuit();

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    @FXML
    public void closeThisStage(Event event) {
        closeQuit.qiutScene(event);
    }

    @FXML
    public void showPayEmployee() throws IOException {
        stage = new Stage();
        AnchorPane root = FXMLLoader.load(getClass().getResource("payEmployeeSalary.fxml"));
        Scene scene = new Scene(root, 1400, 900);
        scene.getStylesheets().add("/resources/css/payemployeesalary.css");
        stage.setTitle("Pay Employee Salary");
        stage.setAlwaysOnTop(true);
        stage.setResizable(false);
        stage.centerOnScreen();
        stage.setWidth(1400);
        stage.setHeight(900);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void showBankSheet() throws IOException {
        stage = new Stage();
        AnchorPane root = FXMLLoader.load(getClass().getResource("bankSheet.fxml"));
        Scene scene = new Scene(root, 1025, 650);
        scene.getStylesheets().add("/resources/css/banksheet.css");
        stage.setTitle("Bank Sheet");
        stage.setAlwaysOnTop(true);
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
        AnchorPane root = FXMLLoader.load(getClass().getResource("attendanceSync.fxml"));
        Scene scene = new Scene(root, 1400, 900);
        scene.getStylesheets().add("/resources/css/attendancesync.css");
        stage.setTitle("Attendance Sync");
        stage.setAlwaysOnTop(true);
        stage.setResizable(false);
        stage.centerOnScreen();
        stage.setWidth(1400);
        stage.setHeight(900);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void showPaySalaryHistory() throws IOException {
        stage = new Stage();
        AnchorPane root = FXMLLoader.load(getClass().getResource("employeeSalaryHistory.fxml"));
        Scene scene = new Scene(root, 1340, 880);
        scene.getStylesheets().add("/resources/css/employeesalaryhistory.css");
        stage.setTitle("Employee Salary History");
        stage.setAlwaysOnTop(true);
        stage.setResizable(false);
        stage.centerOnScreen();
        stage.setWidth(1340);
        stage.setHeight(880);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void showLoanAndAdvances() throws IOException {
        stage = new Stage();
        AnchorPane root = FXMLLoader.load(getClass().getResource("loanAndAdvances.fxml"));
        Scene scene = new Scene(root, 1200, 720);
        scene.getStylesheets().add("/resources/css/loanandadvances.css");
        stage.setTitle("Loan And Advances");
        stage.setAlwaysOnTop(true);
        stage.setResizable(false);
        stage.centerOnScreen();
        stage.setWidth(1200);
        stage.setHeight(720);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void showEmployeeBilling() throws IOException {
        stage = new Stage();
        AnchorPane root = FXMLLoader.load(getClass().getResource("employeeBilling.fxml"));
        Scene scene = new Scene(root, 983, 630);
        scene.getStylesheets().add("/resources/css/employeebilling.css");
        stage.setTitle("Employee Billing");
        stage.setAlwaysOnTop(true);
        stage.setResizable(false);
        stage.centerOnScreen();
        stage.setWidth(983);
        stage.setHeight(630);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void showOctopusReport() throws IOException {
        stage = new Stage();
        AnchorPane root = FXMLLoader.load(getClass().getResource("octopusReport.fxml"));
        Scene scene = new Scene(root, 983, 630);
        scene.getStylesheets().add("/resources/css/octopusreport.css");
        stage.setTitle("OctopusHR Report");
        stage.setAlwaysOnTop(true);
        stage.setResizable(false);
        stage.centerOnScreen();
        stage.setWidth(983);
        stage.setHeight(630);
        stage.setScene(scene);
        stage.show();
    }

}
