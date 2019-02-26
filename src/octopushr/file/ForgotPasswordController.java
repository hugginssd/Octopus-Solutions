/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package octopushr.file;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javax.mail.MessagingException;
import octopushr.Connexion;
import octopushr.Functions;

/**
 * FXML Controller class
 *
 * @author user
 */
public class ForgotPasswordController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private TextField txtEnterMail, txtEnterMobileNumber;

    @FXML
    private Button btnOk, btnCancel;

    Connexion connection = new Connexion();
    Functions functions = new Functions();
    Alert alert;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    public void sendMaill() {
        String username;
        String memberName;
        String password;
        if (txtEnterMail.getText().isEmpty()) {
            functions.alertError(alert, "Please enter your mail");
            return;
        }
        if (txtEnterMobileNumber.getText().isEmpty()) {
            functions.alertError(alert, "Please enter your mobile number");
            return;
        }
        try {
            username = txtEnterMail.getText();
            password = "0782326160Ht";
            memberName = "Dennis";
            functions.sendMail(username, memberName, password);
        } catch (MessagingException ex) {
            functions.alertError(alert, ex.toString());
        }
    }

    @FXML
    public void closeThisStage(Event event) {
        functions.closeWindow(event);
    }
}
