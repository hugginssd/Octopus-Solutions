package octopushr.performance;

import java.io.IOException;
import static java.lang.System.out;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
//<<<<<<< HEAD
import javafx.event.Event;
//=======
//>>>>>>> f5c7a74c0fba43c1a593f4c9fd5c119e38b274d5
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
//<<<<<<< HEAD
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import octopushr.Functions;
//=======
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
//>>>>>>> f5c7a74c0fba43c1a593f4c9fd5c119e38b274d5

public class PerformanceController implements Initializable {

    @FXML
    Stage stage;
//<<<<<<< HEAD
    
    @FXML
    Functions functions = new Functions();
//=======
//>>>>>>> f5c7a74c0fba43c1a593f4c9fd5c119e38b274d5

    @FXML
    private Button btnCloseWindow;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    @FXML
    public void addGoal() throws IOException {
        stage = new Stage();
        Pane root = FXMLLoader.load(getClass().getResource("addgoal.fxml"));
//<<<<<<< HEAD
        Scene scene = new Scene(root);
//=======
        out.print("addGoal loaded");
        scene.getStylesheets().add("/resources/css/addgoal.css");
        stage.setTitle("Add Goal");
        stage.setResizable(false);
//<<<<<<< HEAD
        stage.setWidth(643);
        stage.setHeight(495);
        stage.centerOnScreen();
//=======
        stage.setAlwaysOnTop(true);
        stage.centerOnScreen();
        stage.setWidth(650);
        stage.setHeight(550);
//>>>>>>> f5c7a74c0fba43c1a593f4c9fd5c119e38b274d5
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void employeeMonthlyGoalAnalysis() throws IOException {
        stage = new Stage();
        Pane root = FXMLLoader.load(getClass().getResource("employeeMonthlyGoalAnalysis.fxml"));
//<<<<<<< HEAD
        Scene scene = new Scene(root);
//>>>>>>> f5c7a74c0fba43c1a593f4c9fd5c119e38b274d5
        out.print("EmployeeMonthlyGoalAnalysis loaded");
        scene.getStylesheets().add("/resources/css/employeemonthlygoalanalysis.css");
        stage.setTitle("Employee Monthly Goal Analysis");
        stage.setResizable(false);
//<<<<<<< HEAD
        stage.centerOnScreen();
        stage.setWidth(680);
        stage.setHeight(563);
//=======
        stage.setAlwaysOnTop(true);
        stage.centerOnScreen();
        stage.setWidth(680);
        stage.setHeight(575);
//>>>>>>> f5c7a74c0fba43c1a593f4c9fd5c119e38b274d5
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void implementSolution() throws IOException {
        stage = new Stage();
        Pane root = FXMLLoader.load(getClass().getResource("implementSolution.fxml"));
//<<<<<<< HEAD
        Scene scene = new Scene(root);

        out.print("Implement Solution loaded");
        scene.getStylesheets().add("/resources/css/implementsolution.css");
        stage.setTitle("Implement Solution");
        stage.setResizable(false);
//<<<<<<< HEAD
        stage.centerOnScreen();
        stage.setWidth(1063);
        stage.setHeight(685);
//=======
        stage.setAlwaysOnTop(true);
        stage.centerOnScreen();
        stage.setWidth(1100);
        stage.setHeight(700);
//>>>>>>> f5c7a74c0fba43c1a593f4c9fd5c119e38b274d5
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void viewPerformance() throws IOException {
        stage = new Stage();
        Pane root = FXMLLoader.load(getClass().getResource("performanceOrg.fxml"));
        Scene scene = new Scene(root, 878, 585);
        out.print("Performance Org loaded");
        scene.getStylesheets().add("/resources/css/performanceorg.css");
        stage.setTitle("Performance Org");
        stage.setResizable(false);
        stage.setAlwaysOnTop(true);
        stage.centerOnScreen();
        stage.setWidth(878);
        stage.setHeight(585);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void improvementAction() throws IOException {
        stage = new Stage();
        Pane root = FXMLLoader.load(getClass().getResource("improvementAction.fxml"));
        Scene scene = new Scene(root, 1058, 673);
        out.print("Improvement Action loaded");
        scene.getStylesheets().add("/resources/css/improvementaction.css");
        stage.setTitle("Improvement Action");
        stage.setResizable(false);
        stage.setAlwaysOnTop(true);
        stage.centerOnScreen();
        stage.setWidth(1058);
        stage.setHeight(673);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void about() throws IOException {
        stage = new Stage();

        Pane root = FXMLLoader.load(getClass().getResource("about.fxml"));
//>>>>>>> f5c7a74c0fba43c1a593f4c9fd5c119e38b274d5
        Scene scene = new Scene(root, 878, 585);
        out.print("About loaded");
        scene.getStylesheets().add("/resources/css/about.css");
        stage.setTitle("About");
        stage.setResizable(false);
        stage.setAlwaysOnTop(true);
        stage.centerOnScreen();
        stage.setWidth(878);
        stage.setHeight(585);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
//<<<<<<< HEAD
    public void closeStage(Event event) {
        functions.closeWindow(event);

    }
}
