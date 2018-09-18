package octopushr.employees;

import java.net.URL;
//<<<<<<< HEAD
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableView;
import octopushr.Connexion;

public class ViewEmployeeDetailsController implements Initializable {

  
    @FXML
    ObservableList<ViewEmployeeDetails> data;
    
    @FXML
    TableView<ViewEmployeeDetails> tableView;
    
    Connection connection;
    Connexion connexion;
    Statement st;
    PreparedStatement pst;
    ResultSet rs;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }
//<<<<<<< HEAD
    
//    @FXML
//    public void loadViewEmployeeDetails() throws SQLException, ClassNotFoundException{
//    connection = connexion.getConnetion();
//    
//    //employee id
//    TableColumn colEmployeeId = new TableColumn("Employee ID");
//    colEmployeeId.setCellValueFactory(new PropertyValueFactory("employeeid"));
//    
//    //name
//    TableColumn colName = new TableColumn("Name"); 
//    colName.setCellValueFactory(new PropertyValueFactory("name"));
//    
//    //designation
//    TableColumn colDesignation = new TableColumn("Designation");
//    colDesignation.setCellValueFactory(new PropertyValueFactory("designation"));
//    
//    //department
//    TableColumn colDepartment = new TableColumn("Department");
//    colDepartment.setCellValueFactory(new PropertyValueFactory("department"));
//    
//    //verify
//    TableColumn colVerify = new TableColumn("Verify");
//    colVerify.setCellValueFactory(new PropertyValueFactory("verify"));
//    
//            
//    //active
//    TableColumn colActive = new TableColumn("Active");
//    colActive.setCellValueFactory(new PropertyValueFactory("Active"));
//            
//    //location
//    TableColumn colLocation = new TableColumn("Location");
//    colLocation.setCellValueFactory(new PropertyValueFactory("location"));
//    
//    
//    pst = connection.prepareStatement("SELECT `employeeid`, CONCAT(`firstname`,' ',`surname`) AS `employee`,`active`,`verified`,"+
//                                      "`branchname`,`designation`,`departmentname` "+
//                                      " FROM `tblguards` "+
//                                      " INNER JOIN `tblcompanybranches` "+
//                                      " ON `tblguards`.`branchid` = `tblcompanybranches`.`branchid` "+
//                                      " INNER JOIN `tbldesignation` "+
//                                      " ON `tblguards`.`designationid` = `tbldesignation`.`designationid` "+
//                                      " INNER JOIN `tbldepartments` "+
//                                      " ON `tblguards`.`departmentid` = `tbldepartments`.`departmentid`");
//    rs = pst.executeQuery();
//    tableView.getColumns().addAll(colEmployeeId,colName,colDesignation,colDepartment,colVerify,colActive,colLocation);
//    colName.setSortable(false);
//    colDesignation.setSortable(false);
//    colDepartment.setSortable(false);
//    colVerify.setSortable(false);
//    colActive.setSortable(false);
//    colLocation.setSortable(false);
//    while(rs.next()){
//        data.addAll(new ViewEmployeeDetails(rs.getString("employeeid"),rs.getString("employee"),
//                                            rs.getString("designation"),rs.getString("departmentname"),
//                                            rs.getString("verified"),rs.getString("active"),
//                                            rs.getString("branchname")));
//        
//        tableView.setItems(data);
//        
//    }
//    pst.close();
//    rs.close();
//    
//    
//    
//    
//    
//    }
//    
    
//=======

//>>>>>>> f5c7a74c0fba43c1a593f4c9fd5c119e38b274d5
}
