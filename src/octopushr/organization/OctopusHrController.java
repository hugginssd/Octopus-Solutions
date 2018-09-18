package octopushr.organization;

//<<<<<<< HEAD
import java.io.IOException;
//=======
//>>>>>>> f5c7a74c0fba43c1a593f4c9fd5c119e38b274d5
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
//<<<<<<< HEAD
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
//=======
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
//>>>>>>> f5c7a74c0fba43c1a593f4c9fd5c119e38b274d5

public class OctopusHrController implements Initializable {

    @FXML
//<<<<<<< HEAD
    private TextField txtUsername;
    @FXML
    private TextField txtPassword;
    @FXML
    private Button btnSignIn;
    
    @FXML
    private AnchorPane anchorPane;
//=======
    private Label label;
//>>>>>>> f5c7a74c0fba43c1a593f4c9fd5c119e38b274d5

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
//<<<<<<< HEAD
    public void openNewScene() throws IOException{
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/octopushr/organization/hrandAdmin.fxml"));
        anchorPane.getChildren().setAll(pane);
    }
//=======
//>>>>>>> f5c7a74c0fba43c1a593f4c9fd5c119e38b274d5

}
