package octopushr.help;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import octopushr.OctopusHR;

public class LoginController implements Initializable {

    @FXML
    public Button btnSignIn;

    @FXML
    private AnchorPane anchorRoot;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }
    @FXML
    Stage stage;

    OctopusHR octopus = new OctopusHR();
    @FXML
    public void userSignin() throws IOException {

        AnchorPane pane = FXMLLoader.load(getClass().getResource("/octopushr/hrandAdmin.fxml"));
        anchorRoot.getChildren().addAll(pane);
        anchorRoot.getStylesheets().add("/resources/css/hrandadmin.css");
        anchorRoot.setMinHeight(900);
        Scene scene = new Scene(anchorRoot);
        stage = new Stage();
        stage.setScene(null);
        //stage.sizeToScene();
    }

}
