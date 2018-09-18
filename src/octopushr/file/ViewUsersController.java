/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package octopushr.file;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import octopushr.Connexion;
import octopushr.Functions;

/**
 * FXML Controller class
 *
 * @author user
 */
public class ViewUsersController implements Initializable {

    /**
     * Initializes the controller class.
     */
    Connection connection;
    Connexion connexion = new Connexion();
    Functions functions = new Functions();

    Statement st;
    PreparedStatement ps;
    ResultSet rs;

    @FXML
    TableView<ViewUsersContructor> tblviewUsers;

    @FXML
    Button btnClose;
    
    TableColumn colID = new TableColumn("ID");
    TableColumn colFirstname = new TableColumn("SURNAME");
    
    @FXML
    ObservableList<ViewUsersContructor> data = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            // TODO
            loadListView();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ViewUsersController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void loadListView() throws SQLException, ClassNotFoundException {

        connection = connexion.getConnetion();
        ps = connection.prepareStatement("SELECT `tblebusers`.`id` AS ID,`tblebusers`.`staffcode` AS EMPLOYEEID,`tblebusers`.`surname` AS SURNAME,`tblebusers`.`firstname` AS FIRSTNAME,`tbluserroles`.`rolename` AS ROLE, `tbldepartments`.`departmentname` AS DEPARTMENT "+
                                         " FROM `tblebusers` "+
                                         " INNER JOIN `tbluserroles` "+
                                         " ON `tbluserroles`.`roleid`=`tblebusers`.`roleid` "+
                                         " INNER JOIN `tbldepartments` "+
                                         " ON `tblebusers`.`departmentid`=`tbldepartments`.`departmentid`"+
                                         " ORDER BY `id`");
        rs = ps.executeQuery();
        
        //TableColumn colID = new TableColumn("Employee Id");
        colID.setMinWidth(100);
        colID.setCellValueFactory(new PropertyValueFactory("ID"));
 
        TableColumn colEmployeeID = new TableColumn("EMPLOYEEID");
        colEmployeeID.setMinWidth(100);
        colEmployeeID.setCellValueFactory(
                new PropertyValueFactory("EmployeeId"));
 
        //TableColumn colFirstname = new TableColumn("Surname");
        colFirstname.setMinWidth(100);
        colFirstname.setCellValueFactory(
                new PropertyValueFactory("Surname"));
        
        TableColumn colSurname = new TableColumn("FIRSTNAME");
        colSurname.setMinWidth(100);
        colSurname.setCellValueFactory(
                new PropertyValueFactory("Firstname"));
        
        TableColumn colRole = new TableColumn("ROLE");
        colRole.setMinWidth(100);
        colRole.setCellValueFactory(
                new PropertyValueFactory("Role"));
        
        TableColumn colDepartment = new TableColumn("DEPARTMENT");
        colDepartment.setMinWidth(100);
        colDepartment.setCellValueFactory(
                new PropertyValueFactory("Department"));
       
        tblviewUsers.getColumns().addAll(colID, colEmployeeID, colFirstname,colSurname,colRole,colDepartment);
 
        colID.setSortType(TableColumn.SortType.ASCENDING);
        colEmployeeID.setSortable(false);
        colFirstname.setSortable(false);
        colSurname.setSortable(false);
        colRole.setSortable(false);
        colDepartment.setSortable(false);
        while(rs.next()){
            data.add(new ViewUsersContructor(rs.getInt("ID"),rs.getString("EMPLOYEEID"),
                                                                       rs.getString("SURNAME"),rs.getString("FIRSTNAME"),
                                                                       rs.getString("ROLE"),rs.getString("DEPARTMENT")));
        
          tblviewUsers.setItems(data);
        }
        //tblviewUsers.setItems(data);
        ps.close();
        rs.close();
//   colFirstname.setCellFactory(TextFieldTableCell.<ViewUsersContructor>forTableColumn());
//    colFirstname.setOnEditCommit(
//    (CellEditEvent<ViewUsersContructor, String> t) -> {
//        ((ViewUsersContructor) t.getTableView().getItems().get(
//            t.getTablePosition().getRow())
//            ).setFirstname(t.getNewValue());
//        });
    }
//    colID.setCellFactory(TextFieldTableCell.<ViewUsersContructor>forTableColumn());
//    colID.setOnEditCommit(
//    (CellEditEvent<Person, String> t) -> {
//        ((ViewUsersContructor) t.getTableView().getItems().get(
//            t.getTablePosition().getRow())
//            ).setFirstName(t.getNewValue());
//        });
    
    
    
    
    //editing tableview data
//    colID.setCellFactory(TextFieldTableCell.forTableColumn());
//    firstNameCol.setOnEditCommit(event -> {
//    String[] row = event.getRowValue();
//    row[index] = event.getNewValue();
//    });
    @FXML
    public void closeThisStage(Event event){
    
        functions.closeWindow(event);
    
    }

}