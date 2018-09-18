package octopushr;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;

import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class OctopusHR extends Application {

    @FXML
    private Button btnSignIn;
 
    
    @FXML
    public Scene scene;


    Connexion conn = new Connexion();
    @Override
    public void start(Stage stage) throws IOException {
      
        
        AnchorPane root = FXMLLoader.load(getClass().getResource("/octopushr/file/login.fxml"));
        scene = new Scene(root);  
        stage.setTitle("OctopusHR");
        stage.setWidth(320);
        stage.setHeight(476);
        stage.setScene(scene);
        stage.getIcons().add(new Image(this.getClass().getResourceAsStream("/resources/icons/octopuslogo..png")));
        stage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }

}
