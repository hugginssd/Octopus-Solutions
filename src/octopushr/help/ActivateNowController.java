package octopushr.help;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressIndicator;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author HUGGINST
 */
public class ActivateNowController implements Initializable {

    @FXML
    private Button btnCancel;

    @FXML
    private ProgressIndicator progIndActivate;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    public void closeActivation() {

        Stage stage = (Stage) btnCancel.getScene().getWindow();
        stage.close();
    }

    @FXML
    public void activateProduct() {
        int i = 0;
        while (i <= 100) {
            //progIndActivate
            progIndActivate.setProgress(i);
            if (progIndActivate.getProgress() <= 25) {

            }
            i++;
        }

    }
}
