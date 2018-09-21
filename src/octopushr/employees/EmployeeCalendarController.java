package octopushr.employees;

import java.net.URL;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.control.DateCell;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Callback;

public class EmployeeCalendarController implements Initializable {

    @FXML
    private DatePicker dtpCalendar;

    @FXML
    Stage stage;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

//<<<<<<< HEAD
        final ObservableList<String> images = FXCollections.observableArrayList("/resources/icons/sunny.png", "/resources/icons/kweather.png", "/resources/icons/cloud.png", "/resources/icons/sun_rain.png", "/resources/icons/showers.png");
//=======
        //ObservableList<String> images = FXCollections.observableArrayList("/resources/icons/sunny.png", "/resources/icons/kweather.png", "/resources/icons/cloud.png", "/resources/icons/sun_rain.png", "/resources/icons/showers.png");
////>>>>>>> f5c7a74c0fba43c1a593f4c9fd5c119e38b274d5

        //DatePicker date_picker=new DatePicker();
//        dtpCalendar.setShowWeekNumbers(false);
//
//        dtpCalendar.setDayCellFactory(new Callback<DatePicker, DateCell>() {
//
//            @Override
//            public DateCell call(DatePicker param) {
//
//                return new DateCell() {
//                    @Override
//                    public void updateItem(LocalDate item, boolean empty) {
//                        super.updateItem(item, empty);
//
//                        if (empty || item == null) {
//                            setText(null);
//                            setGraphic(null);
//
//                        } else {
//
//                            StackPane cell_pane = new StackPane();
//
//                            Random r = new Random();
//
//                            ImageView image_view = new ImageView("file:" + images.get(r.nextInt(images.size())));
//
//                            Circle circle = new Circle(20);
//
//                            Label label = new Label();
//                            label.setText(getText());
//                            //label.setFont(Fonts.bebasNeue(17));//Enzo library font
//                            label.setTextFill(Color.AQUA);
//                            label.setLabelFor(circle);
//
//                            cell_pane.setAlignment(image_view, Pos.CENTER_RIGHT);
//                            // cell_pane.setMargin(image_view,new Insets(0,20,55,45));
//
//                            cell_pane.getChildren().addAll(circle, label, image_view);
//
//                            //item.get(ChronoField.DAY_OF_WEEK) returns an int from 1 to 7(Monday-Sunday)
//                            //DayOfWeek.of(int) return the name of the day of week. type ENUM.
//                            DayOfWeek day = DayOfWeek.of(item.get(ChronoField.DAY_OF_WEEK));
//
//                            if (day.equals(DayOfWeek.SATURDAY)) {
//                                setStyle("-fx-background-color:blue;");//saturday cells blue background
//                            } else if (day.equals(DayOfWeek.SUNDAY)) {
//                                setStyle("-fx-background-color:green;");//sunday cells green background
//                            } else {
//                                setStyle("-fx-background-color:grey;"); //weekdays grey
//                            }
//                            setGraphic(cell_pane);
//                            setText("");//dont show any text in the cells
//
//                        }
//
//                    }
//                };
//            }
//        ;
//    }
//
//);
      // dtpCalendar.
       // StackPane root = new StackPane();
       // root.getChildren().addAll(dtpCalendar);
       // Scene scene = new Scene(root);
        //scene.getStylesheets().add("employeecalendar.css");
//        stage = new Stage();
//        stage.setTitle("Calendar/Weather");
//        stage.setScene(scene);
//        stage.show();
        //Stage stage1 = (Stage)getScene().
    }
    }    
    
//}
