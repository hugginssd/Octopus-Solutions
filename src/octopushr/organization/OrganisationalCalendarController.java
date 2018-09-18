package octopushr.organization;

//<<<<<<< HEAD
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.ComboBoxTableCell;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Callback;

public class OrganisationalCalendarController implements Initializable {

    @FXML
    Stage stage;
    @FXML
    private TableView<NewEventsCalendarConstructor> tblCalendar;

    @FXML
    private ObservableList<TableColumn<NewEventsCalendarConstructor, ?>> columns;

    @FXML
    private ObservableList<NewEventsCalendarConstructor> tableData;

    @FXML
    private final ObservableList<String> cbValues = FXCollections.observableArrayList("Work Day", "Holiday");

    @FXML
    private ComboBox cmbActivateNow;

    @FXML
    private Spinner spYear;

    @FXML
    private SpinnerValueFactory valueFactory;

    public enum Category {
        HOLIDAY, WORK_DAY
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        cmbActivateNow.getItems().addAll("Activate Now", "Activate Later");
        valueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(1950, 2150, LocalDate.now().getYear());
        spYear.setValueFactory(valueFactory);
        int i = LocalDate.now().getMonthValue();
        loadTableView();
    }

    @FXML
    public void loadTableView() {

        //tblCalendar = new TableView<>();
        tblCalendar.setEditable(true);

        final TableColumn<NewEventsCalendarConstructor, String> firstNameCol = new TableColumn<>("DATE");
        final TableColumn<NewEventsCalendarConstructor, Category> categoryCol = new TableColumn<>(" DATE TYPE ");

        firstNameCol.setCellValueFactory(new PropertyValueFactory("date"));

        categoryCol.setCellValueFactory(new PropertyValueFactory("category"));
        categoryCol.setPrefWidth(131);
        categoryCol.setCellFactory(new Callback<TableColumn<NewEventsCalendarConstructor, Category>, TableCell<NewEventsCalendarConstructor, Category>>() {
            @Override
            public TableCell<NewEventsCalendarConstructor, Category> call(TableColumn<NewEventsCalendarConstructor, Category> param) {
                return new ComboBoxTableCell<>();
            }
        });

        ObservableList<NewEventsCalendarConstructor> tableData1 = createData();
        tblCalendar.setItems(tableData1);
        tblCalendar.getColumns().addAll(Arrays.asList(
                firstNameCol, categoryCol
        ));

    }

    private ObservableList<NewEventsCalendarConstructor> createData() {
        return FXCollections.observableArrayList(
                new NewEventsCalendarConstructor("MONDAY", Category.WORK_DAY),
                new NewEventsCalendarConstructor("TUESDAY", Category.WORK_DAY),
                new NewEventsCalendarConstructor("WEDNESDAY", Category.WORK_DAY),
                new NewEventsCalendarConstructor("THURSDAY", Category.WORK_DAY),
                new NewEventsCalendarConstructor("FRIDAY", Category.WORK_DAY),
                new NewEventsCalendarConstructor("SATURDAY", Category.HOLIDAY),
                new NewEventsCalendarConstructor("SUNDAY", Category.HOLIDAY)
        );
    }

    @FXML
    public void addNewEventDetails() throws IOException {
        stage = new Stage();
        AnchorPane root = FXMLLoader.load(getClass().getResource("/octopushr/organization/newEventDetails.fxml"));
        Scene scene = new Scene(root, 451, 528);
        scene.getStylesheets().add("/resources/css/newEventDetails.css");
        stage.setTitle("Organisational Calendar");
        stage.setResizable(false);
        stage.getIcons().add(new Image("/resources/icons/facilities.png"));
        stage.centerOnScreen();
        stage.setScene(scene);
        stage.show();

    }

}
