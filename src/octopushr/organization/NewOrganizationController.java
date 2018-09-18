/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package octopushr.organization;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import octopushr.Functions;

/**
 * FXML Controller class
 *
 * @author user
 */
public class NewOrganizationController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private Button btnCancel;

    @FXML
    private Button btnCreateNew;
    Functions functions = new Functions();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        btnCreateNew = new Button();
        //btnCreateNew.getGraphic().
        //last here
    }

    @FXML
    public void closeThisStage(Event event) {
        functions.closeWindow(event);
    }
}
