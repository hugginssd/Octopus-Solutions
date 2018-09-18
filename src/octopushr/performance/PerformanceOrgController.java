package octopushr.performance;

import java.io.IOException;
import static java.lang.System.out;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class PerformanceOrgController implements Initializable {

    @FXML
    Stage stage;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    @FXML
    private void addGoal() throws IOException {
        stage = new Stage();
        Pane root = FXMLLoader.load(getClass().getResource("addGoal.fxml"));
        Scene scene = new Scene(root, 1000, 700);
        out.print("addGoal loaded");
        scene.getStylesheets().add("/resources/css/addgoal.css");
        stage.setTitle("Add Goal");
        stage.setResizable(false);
        stage.setAlwaysOnTop(true);
        stage.centerOnScreen();
        stage.setWidth(1000);
        stage.setHeight(700);
        stage.setScene(scene);
        stage.show();
    }
}
