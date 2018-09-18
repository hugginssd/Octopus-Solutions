package octopushr.file;

import java.io.IOException;
import static java.lang.System.out;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import octopushr.Connexion;
import octopushr.Functions;

public class LoginController implements Initializable {

    @FXML
    public Button btnSignIn = new Button();

    @FXML
    public Scene scene;

    @FXML
    public AnchorPane anchorRoot;

    @FXML
    Stage stage;

    @FXML
    private Label label;
    
    @FXML
    private ProgressIndicator progressIndicator;
    
    @FXML
    private Label labelSwitch;
    
    @FXML
    private TextField txtUsername;
    
    @FXML
    private PasswordField txtPassword;
    
    PreparedStatement pst;
    Statement str;
    ResultSet rs;
    Functions functions = new Functions();
    Connexion connexion = new Connexion();
    Connection connection;
    String user,password;
    int count=0;
    Alert alert;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        progressIndicator = new ProgressIndicator();
        labelSwitch = new Label();
        progressIndicator.setVisible(true);
        labelSwitch.setVisible(false);
        
    }

    //OctopusHr octopus = new OctopusHr();
    @FXML
    public void userSignin() throws IOException, SQLException, ClassNotFoundException {
        if(txtUsername.getText().isEmpty() || txtPassword.getText().isEmpty()){
            alert = new Alert(AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setContentText("Empty password and username");
            alert.showAndWait();
            return;
        }
        if(count==3){
            alert =new Alert(AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setContentText("You have been logged out of the system");
            alert.showAndWait();
            txtUsername.clear();
            txtPassword.clear();
            txtUsername.setEditable(false);
            txtPassword.setEditable(false);
            return;
        }
        
        String checkUser = txtUsername.getText();
        String checkPass = txtPassword.getText();
        connection = connexion.getConnetion();
        pst = connection.prepareStatement("SELECT * FROM `tblebusers` WHERE `email`=? AND `password`=?");
        pst.setString(1, txtUsername.getText());
        pst.setString(2, txtPassword.getText());
        rs = pst.executeQuery();
        while(rs.next()){
          user = rs.getString("email");
          password = rs.getString("password");
          if(checkUser.equals(user)&& checkPass.equals(password)){
            AnchorPane pane = FXMLLoader.load(getClass().getResource("/octopushr/organization/hrandAdmin.fxml"));
            anchorRoot.getChildren().addAll(pane);
            anchorRoot.setMinHeight(900);
            anchorRoot.getStylesheets().addAll("/resources/css/hrandadmin.css");
          }
        }
        if(!checkUser.equals(user)&& checkPass.equals(password)){
            count++;
            alert = new Alert(AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setContentText("Invalid credentials");
            alert.showAndWait();
          }
    }
    
    @FXML
    public void forgotPassword() throws IOException{
         stage = new Stage();
         Pane root = FXMLLoader.load(getClass().getResource("/octopushr/file/forgotPassword.fxml"));
         scene = new Scene(root, 900, 400);
         out.print("Forgot Password loaded");
         scene.getStylesheets().add("/resources/css/forgotpassword.css");
         stage.setTitle("Forgot Password loaded");
         //stage.setIconified(true);
         stage.getIcons().add(new Image("/resources/icons/new_32.png"));
         //stage.setAlwaysOnTop(true);
         stage.setScene(scene);
         stage.setResizable(false);
         stage.show();
    } 
    @FXML
    void setDecoration() {
            stage = new Stage();
            stage.initStyle(StageStyle.DECORATED);
    }

}
