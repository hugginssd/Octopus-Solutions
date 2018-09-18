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
//<<<<<<< HEAD
import java.util.Optional;
//=======
//>>>>>>> f5c7a74c0fba43c1a593f4c9fd5c119e38b274d5
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
//import javafx.scene.control.Alert;
//import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
//import javafx.scene.control;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import octopushr.Connexion;
import octopushr.Functions;
import octopushr.closeQuit;

/**
 * FXML Controller class
 *
 * @author Support
 */
public class AddRoleController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    Button btnAddRole;

    @FXML
    Button btnCloseForm;

    @FXML
    TextField txtId;

    @FXML
    TextField txtUserRole;

    @FXML
    ListView<String> lstvUserRole;

    public static final Boolean FALSE = Boolean.FALSE;

    Connection connection;
    Connexion connexion = new Connexion();
    Functions functions = new Functions();
    closeQuit closeQuit = new closeQuit();
    Statement statement;
    PreparedStatement ps;
    ResultSet rs;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            // TODO
//<<<<<<< HEAD
            txtId.setText("RL00"+Integer.toString(functions.getLastId("id","tbluserroles")));
            txtId.setEditable(FALSE);
            loadListView();
           // connection = connexion.getConnetion();
//=======
            txtId.setText(Integer.toString(functions.getRowCount("tblrole") + 1));
            txtId.setEditable(FALSE);
            connection = connexion.getConnetion();
//>>>>>>> f5c7a74c0fba43c1a593f4c9fd5c119e38b274d5
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(AddRoleController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

//<<<<<<< HEAD
    public void addRole() throws SQLException, ClassNotFoundException {

        if (txtUserRole.getText().isEmpty()) {
            System.out.println("Userrole Empty");
            Alert alert = new Alert(AlertType.WARNING);
            alert.setTitle("Message");
            alert.setHeaderText(null);
            alert.setContentText("User role connot be empty");
            //alert.setResult(ButtonType.CANCEL);
            alert.showAndWait();

        } else {

             //INSERT INTO `tbldepartments`(`id`, `departmentid`, `departmentname`) VALUES ([value-1],[value-2],[value-3])
            
            connection = connexion.getConnetion();
            System.err.println("Connected");
            ps = connection.prepareStatement("INSERT INTO `tbluserroles`(`id`, `roleid`, `rolename`)"+
                                             " VALUES (?,?,?)");
            ps.setString(1, null);
            ps.setString(2, txtId.getText().toUpperCase());
            ps.setString(3, txtUserRole.getText().toUpperCase().trim());
            System.err.println("To execute");
            ps.execute();
            System.err.println("Executed");
            ps.clearParameters();
           
            lstvUserRole.getItems().addAll(txtId.getText().toUpperCase()+"  "+txtUserRole.getText().toUpperCase());
            
             ps.close();
            Alert alert = new Alert(AlertType.CONFIRMATION);
            alert.setTitle("Confirmation");
            alert.setContentText(txtId.getText().toUpperCase()+" "+txtUserRole.getText().toUpperCase() + " user role added");
            //alert.show();
            
            Optional<ButtonType> result = alert.showAndWait();
            if(result.get()==ButtonType.OK){
            txtId.setText(null);
            txtId.setText("RL00"+Integer.toString(functions.getLastId("id","tbluserroles")));
            txtUserRole.setText(null);
        }

        }
    }
     public void loadListView() throws SQLException, ClassNotFoundException{
        connection = connexion.getConnetion();
        ps = connection.prepareStatement("SELECT * FROM `tbluserroles`");
        rs = ps.executeQuery();
        while(rs.next()){

             lstvUserRole.getItems().addAll(rs.getString("roleid").toUpperCase()+"  "+rs.getString("rolename").toUpperCase());

        }
        ps.close();
        rs.close();
    }
    
    
////=======
//    @FXML
//    public void addRole() {
//
//        if (txtUserRole.getText().isEmpty()) {
//
//            Alert alert = new Alert(AlertType.WARNING);
//            alert.setTitle("Message");
//            alert.setContentText("User role connot be empty");
//            alert.setResult(ButtonType.CANCEL);
//            alert.show();
//
//        } else {
//
//            lstvUserRole.getItems().addAll(txtUserRole.getText().toUpperCase());
//        }
//
//    }

//>>>>>>> f5c7a74c0fba43c1a593f4c9fd5c119e38b274d5
    @FXML
    public void closeThisStage(Event event) {

        closeQuit.qiutScene(event);

    }

//<<<<<<< HEAD
    }
//=======

//>>>>>>> f5c7a74c0fba43c1a593f4c9fd5c119e38b274d5
