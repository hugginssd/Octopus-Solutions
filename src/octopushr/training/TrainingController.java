/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package octopushr.training;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import octopushr.closeQuit;

/**
 * FXML Controller class
 *
 * @author HUGGINST
 */
public class TrainingController implements Initializable {

    /**
     * Initializes the controller class.
     */
    closeQuit closeQuit = new closeQuit();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    public void closeThisStage(Event event) {

        closeQuit.qiutScene(event);

    }

}
