package octopushr.organization;

import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class HrAndOtlookController implements Initializable {

    @FXML
    Label lbldateToday;

    @FXML
    Date today = new Date();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        LocalDate localDate = LocalDate.now();
        lbldateToday.setText(localDate.getDayOfMonth() + " "
                + localDate.getMonth().name() + " "
                + localDate.getYear()
        );
//       SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("DD, MMMM, YYYY");
//       String date = DATE_FORMAT.format(today.clone());
//       lbldateToday.setText(date.intern());

    }
//    
//    public Date getCurrentDate(){
//    
//    return java.sql.Date.valueOf(today.toString());
//    }
//    
}
