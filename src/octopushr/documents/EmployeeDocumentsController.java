package octopushr.documents;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class EmployeeDocumentsController implements Initializable {

    @FXML
    private Button btnCloseWindow;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    @FXML
    public void setClose() {

        Stage stage = (Stage) btnCloseWindow.getScene().getWindow();
        stage.close();

    }
}
