/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package octopushr.organization;

import com.sun.javafx.scene.control.skin.CustomColorDialog;
import java.net.URL;
import java.time.Instant;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.CheckBoxTableCell;
import javafx.scene.control.cell.ComboBoxTableCell;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Callback;
import javafx.util.StringConverter;
import javafx.util.converter.DefaultStringConverter;
import octopushr.Functions;

/**
 * FXML Controller class
 *
 * @author user
 */
public class NewEventDetailsController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    DatePicker dtpEventDate;

    @FXML
    TextField txtDay, txtEventName;

    @FXML
    CheckBox chkIsItHoliday;

    @FXML
    ComboBox cmbRecurringFrequency;

    @FXML
    Label lblEventColor, lblEventTextColor;

    @FXML
    Stage stage;

    @FXML
    ColorPicker colorEventColor, colorEventTextColor;

    @FXML
    Text txtText;

    @FXML
    private Button btnEventColor, btnEventTextColor, btnOk, btnCancel;

 

    Functions functions = new Functions();
    Alert alert;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        txtDay.setEditable(false);
        txtDay.setText(LocalDate.now().getDayOfWeek().toString());
        dtpEventDate.setPromptText(LocalDate.now().toString());
        cmbRecurringFrequency.getItems().addAll("Monthly", "Yearly");
        txtEventName.setPromptText("New Event");
    }

    @FXML
    public void setDaY() {
        txtDay.setText(dtpEventDate.getValue().getDayOfWeek().toString());
    }

    @FXML
    public void showEventColor() {
        btnEventColor.setStyle("-fx-background-color: #" + Integer.toHexString(colorEventColor.getValue().hashCode()).substring(0, 6).toUpperCase() + ";");
    }

    @FXML
    public void showEventTextColor() {
        btnEventTextColor.setStyle("-fx-background-color: #" + Integer.toHexString(colorEventTextColor.getValue().hashCode()).substring(0, 6).toUpperCase() + ";");
    }

  

    @FXML
    public void closeThisStage(Event event) {
        functions.closeWindow(event);

    }
}
