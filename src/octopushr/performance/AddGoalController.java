package octopushr.performance;

import java.net.URL;
import java.util.ResourceBundle;
//<<<<<<< HEAD
import javafx.event.Event;
//=======
//>>>>>>> f5c7a74c0fba43c1a593f4c9fd5c119e38b274d5
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
//<<<<<<< HEAD
import octopushr.Functions;
//=======
//>>>>>>> f5c7a74c0fba43c1a593f4c9fd5c119e38b274d5

public class AddGoalController implements Initializable {

    @FXML
    private Pane pane1;
    @FXML
    private ComboBox<?> cmbSelectDepartment;
    @FXML
    private ComboBox<?> cmbSelectEmployee;
    @FXML
    private Pane pane2;
    @FXML
    private Label lblEmployeeID;
    @FXML
    private Label lblDesignation;
    @FXML
    private Label lblDepartment;
    @FXML
    private Pane pane3;
    @FXML
    private Button btnDelete;
    @FXML
    private Button btnAdd;
    @FXML
    private TextField txtGoal;
    @FXML
    private Button btnUpdateGoalAndEffort;

//<<<<<<< HEAD
    Functions functions = new Functions();

//=======
//>>>>>>> f5c7a74c0fba43c1a593f4c9fd5c119e38b274d5
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

//<<<<<<< HEAD
    @FXML
    public void closeThisStage(Event event) {
        functions.closeWindow(event);
    }

//=======
//>>>>>>> f5c7a74c0fba43c1a593f4c9fd5c119e38b274d5
}
