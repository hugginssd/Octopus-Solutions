package octopushr.recruitment;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import octopushr.closeQuit;

/**
 * FXML Controller class
 *
 * @author Support
 */
public class JobBoardController implements Initializable {

    @FXML
    private TextField txtJobType;

    @FXML
    private ComboBox<?> cmbFilterByJobStatus;

    @FXML
    private Button btnSearch;

    @FXML
    private TextField txtJobCode;

    @FXML
    private TextArea txaDescription;

    @FXML
    private TextField txtExperience;

    @FXML
    private DatePicker dtpFrom;

    @FXML
    private DatePicker dtpJoiningDate;

    @FXML
    private TextArea txaQualification;

    @FXML
    private TextField txtJobTitle;

    @FXML
    private TextField txtDocument;

    @FXML
    private DatePicker dtpTo;

    @FXML
    private Button btnDelete;

    @FXML
    private Button btnListAll;

    @FXML
    private DatePicker dtpLastDateToApply;

    @FXML
    private Button btnDeleteJob;

    @FXML
    private Button btnAddNew;

    @FXML
    private TextField txtSalaryDetail;

    @FXML
    private TextArea txaSkills;

    @FXML
    private Button btnSaveJob;

    @FXML
    private TextField txtLocation;

    @FXML
    private Button btnDownloadAttachedDocument;

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
