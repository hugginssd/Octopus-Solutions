/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package octopushr.file;

import java.io.IOException;
import java.net.InetAddress;
import java.net.URL;
import java.net.UnknownHostException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
//<<<<<<< HEAD
import java.util.HashMap;
import java.util.Map;
//=======
//////>>>>>>> f5c7a74c0fba43c1a593f4c9fd5c119e38b274d5
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
//import javafx.scene.control.Alert;
//import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ComboBox;
//<<<<<<< HEAD
import javafx.scene.control.Label;
//=======
//////>>>>>>> f5c7a74c0fba43c1a593f4c9fd5c119e38b274d5
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import octopushr.Connexion;
import octopushr.Functions;
import octopushr.closeQuit;

/**
 * FXML Controller class
 *
 * @author Support
 */
public class AddUserController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    TextField txtId;

    @FXML
    TextField txtEmployeeID;

    @FXML
    TextField txtFirstname;

    @FXML
    TextField txtSurname;

    @FXML
    TextField txtNationalID;

    @FXML
    ComboBox cmbDepartment;

    @FXML
    ComboBox cmbUserRole;

    @FXML
    TextField txtUsername;

    @FXML
    PasswordField txtPassword;

    @FXML
    PasswordField txtReEnterPassword;
////<<<<<<< HEAD
    
    @FXML
    Label lblDepartmentId;
    
    @FXML
    Label lblRoleId;
    
    @FXML
    TextField txtEmail;
   
////=======
//////>>>>>>> f5c7a74c0fba43c1a593f4c9fd5c119e38b274d5

    Connexion connexion = new Connexion();

    Statement st;
    PreparedStatement ps;
    ResultSet rs;
    Connection connection;
    public String sql;
    Functions functions = new Functions();
    Stage stage;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
////<<<<<<< HEAD
        lblRoleId.setVisible(false);
        lblDepartmentId.setVisible(false);
        
////=======
//////>>>>>>> f5c7a74c0fba43c1a593f4c9fd5c119e38b274d5
        try {

            // TODO
            //String i = functions.getRowCount("tblusers");
////<<<<<<< HEAD
            //LOAD_DEPARTMENTS
            txtId.setText(Integer.toString(functions.getRowCount("tblebusers") + 1));
            txtId.setEditable(false);
            // txtId.setEffect((javafx.scene.effect.Effect) Effect.DefaultInput.getInputs());
           // functions.showConfirmation(AlertType.CONFIRMATION, "Select role", "Roles", "Update", "Message");
            
                connection = connexion.getConnetion();
                st = connection.createStatement();
                rs = st.executeQuery("SELECT DISTINCT `id`, `departmentid`,`departmentname` FROM `tbldepartments` ORDER BY `departmentname`");
                while (rs.next()) {
                    cmbDepartment.getItems().addAll(rs.getString(3));
                }
                st.close();
                rs.close();
               //LOAD_ROLES
                //functions.showConfirmation(AlertType.CONFIRMATION, "Select role", "Roles", "Update", "Message");
                st = connection.createStatement();
                rs = st.executeQuery("SELECT `id`, `roleid`, `rolename` FROM `tbluserroles`");
                Map<String, String> maprole = new HashMap<>();
                while (rs.next()) {
                    maprole.put(rs.getString("roleid"), rs.getString("rolename"));
                    cmbUserRole.getItems().addAll(rs.getString("rolename"));
                }
                st.close();
                rs.close();

        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(AddUserController.class.getName()).log(Level.SEVERE, null, ex);
        }

        
    }
    public void loadDepartments() throws SQLException, ClassNotFoundException{
            connection = connexion.getConnetion();
            st = connection.createStatement();
            rs = st.executeQuery("SELECT DISTINCT `id`, `departmentid`,`departmentname` FROM `tbldepartments` ORDER BY `departmentname`");
            while (rs.next()) {
                cmbDepartment.getItems().addAll(rs.getString(3));
            }
            st.close();
            rs.close();
    }
    public void loadUserRoles() throws SQLException{
            //LOAD_ROLES
            //functions.showConfirmation(AlertType.CONFIRMATION, "Select role", "Roles", "Update", "Message");
            st = connection.createStatement();
            rs = st.executeQuery("SELECT `id`, `roleid`, `rolename` FROM `tbluserroles`");
            Map<String, String> maprole = new HashMap<>();
            while (rs.next()) {
                maprole.put(rs.getString("roleid"), rs.getString("rolename"));
                cmbUserRole.getItems().addAll(rs.getString("rolename"));
            }
            st.close();
            rs.close();
    }
    public void selectLastId() throws SQLException, ClassNotFoundException{
        connection = connexion.getConnetion();
        
        
       // txtId.clear();
        txtEmployeeID.clear();
        txtFirstname.clear();
        txtSurname.clear();
        txtNationalID.clear();
        txtEmail.clear();
        txtUsername.clear();
        txtPassword.clear();
        txtReEnterPassword.clear();
        cmbDepartment.setItems(null);
        cmbUserRole.setItems(null);
       loadDepartments();
       loadUserRoles();
        
        
//        st = connection.createStatement();
//        rs = st.executeQuery("SELECT MAX(`empid`) AS id FROM `tblguards`");
//       
//        while(rs.next()){
//            int i = rs.getInt("id")+1;
//        txtEmployeeID.setText("EMP00"+Integer.toString(i));
//        txtEmployeeID.setEditable(false);
//        }
//        
//        st.close();
//        rs.close();
        
    }
    @FXML
    public void addUser(Event event) throws SQLException, UnknownHostException, ClassNotFoundException {

        if (txtId.getText().isEmpty()) {

            Alert alert = new Alert(AlertType.ERROR);
        }
        try{
//=======
            txtId.setText(Integer.toString(functions.getRowCount("tblusers") + 1));
            txtId.setEditable(false);
            // txtId.setEffect((javafx.scene.effect.Effect) Effect.DefaultInput.getInputs());
            connection = connexion.getConnetion();
            st = connection.createStatement();
            rs = st.executeQuery("SELECT DISTINCT `id`, `department_id`, `emp_id`, `departmentname` FROM `tbldepartment` ORDER BY `departmentname`");
            while (rs.next()) {
                cmbDepartment.getItems().addAll(rs.getString(4));
            }
            st.close();
            rs.close();

            st = connection.createStatement();
            rs = st.executeQuery("SELECT `id`, `empid`, `role`, `datecreated`, `usercreated`, `lastmachinetoedit`, `lastdatetoedit` FROM `tblrole` WHERE 1");
            while (rs.next()) {
                cmbUserRole.getItems().addAll(rs.getString("role"));
            }
            st.close();
            rs.close();

        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(AddUserController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @FXML
    public void addUser() throws SQLException, UnknownHostException {

        if (txtId.getText().isEmpty()) {

            Alert alert = new Alert(AlertType.WARNING);
//////>>>>>>> f5c7a74c0fba43c1a593f4c9fd5c119e38b274d5
            alert.setContentText("Id field cannot be empty");
            alert.setHeaderText("Null Values");
            alert.setTitle("Null");
            alert.showAndWait();

        } else if (txtFirstname.getText().isEmpty()) {

//<<<<<<< HEAD
            Alert alert = new Alert(AlertType.ERROR);
//=======
////>>>>>>> f5c7a74c0fba43c1a593f4c9fd5c119e38b274d5
            alert.setContentText("Firstname field cannot be empty");
            alert.setHeaderText("Null Values");
            alert.setTitle("Null");
            alert.showAndWait();
        } else if (txtSurname.getText().isEmpty()) {

//<<<<<<< HEAD
//=======
            Alert alert = new Alert(AlertType.WARNING);
////>>>>>>> f5c7a74c0fba43c1a593f4c9fd5c119e38b274d5
            alert.setContentText("Surname field cannot be empty");
            alert.setHeaderText("Null Values");
            alert.setTitle("Null");
            alert.showAndWait();
        } else if (txtNationalID.getText().isEmpty()) {

//<<<<<<< HEAD
//=======
            Alert alert = new Alert(AlertType.WARNING);
////>>>>>>> f5c7a74c0fba43c1a593f4c9fd5c119e38b274d5
            alert.setContentText("National Id field cannot be empty");
            alert.setHeaderText("Null Values");
            alert.setTitle("Null");
            alert.showAndWait();
        } else if (cmbDepartment.getValue() == null) {

//<<<<<<< HEAD
//=======
            Alert alert = new Alert(AlertType.WARNING);
////>>>>>>> f5c7a74c0fba43c1a593f4c9fd5c119e38b274d5
            alert.setContentText("Department field cannot be empty. Please select department");
            alert.setHeaderText("Null Values");
            alert.setTitle("Null");
            alert.showAndWait();
        } else if (cmbUserRole.getValue() == null) {
//<<<<<<< HEAD
//=======
            Alert alert = new Alert(AlertType.WARNING);
////>>>>>>> f5c7a74c0fba43c1a593f4c9fd5c119e38b274d5
            alert.setContentText("User role field cannot be empty. Please select the role of your user");
            alert.setHeaderText("Null Values");
            alert.setTitle("Null");
            alert.showAndWait();
        } else if (txtUsername.getText().isEmpty()) {

//<<<<<<< HEAD
            Alert alert = new Alert(AlertType.ERROR);
            alert.setContentText("Username field cannot be empty. Please enter your prefered username");
            alert.setHeaderText("Username");
            alert.setTitle("Username value");
            alert.showAndWait();
        } else if (txtPassword.getText().isEmpty()) {

            Alert alert = new Alert(AlertType.ERROR);
            alert.setContentText("Password field cannot be empty. Please enter your prefered 6 character password");
            alert.setHeaderText("Password");
            alert.setTitle("Password value");
            alert.showAndWait();
        } else if (txtPassword.getText() == null ? txtReEnterPassword.getText() != null : !txtPassword.getText().equals(txtReEnterPassword.getText())) {

//=======
            Alert alert = new Alert(AlertType.WARNING);
            alert.setContentText("Username field cannot be empty. Please enter your prefered username");
            alert.setHeaderText("Null Values");
            alert.setTitle("Null");
            alert.showAndWait();
        } else if (txtPassword.getText().isEmpty()) {

            Alert alert = new Alert(AlertType.WARNING);
            alert.setContentText("Password field cannot be empty. Please enter your prefered 6 character password");
            alert.setHeaderText("Null Values");
            alert.setTitle("Null");
            alert.showAndWait();
        } else if (txtPassword.getText() == null ? txtReEnterPassword.getText() != null : !txtPassword.getText().equals(txtReEnterPassword.getText())) {

            Alert alert = new Alert(AlertType.WARNING);
////>>>>>>> f5c7a74c0fba43c1a593f4c9fd5c119e38b274d5
            alert.setContentText("Password field and re-enter password field must be equal");
            alert.setHeaderText("Security");
            alert.setTitle("Null");
            alert.showAndWait();

        } else {
//<<<<<<< HEAD
            //INSERT INTO `tblebusers`(`id`, `staffcode`, `surname`, `firstname`, `position`, `ext`, `email`, `mobile`, `datecreated`,
            //`usercreated`, `lastdatemodified`, `lastusermodified`, `deleted`, `connected`, `workstation`, `password`, `userid`, 
            //`authtokendate`, `authtoken`, `lastauthdate`) VALUES ([value-1],[value-2],[value-3],[value-4],[value-5],[value-6],[value-7],[value-8],[value-9],[value-10],[value-11],[value-12],[value-13],[value-14],[value-15],[value-16],[value-17],[value-18],[value-19],[value-20])
            
            //IF_THE_ABOVE_CONDITONS_ARE_MET_THEN_PROCESS_THE_BELOW_CODE
            sql = "INSERT INTO `tblebusers`(`id`, `staffcode`, `surname`, `firstname`,`email`, `nationalid`,`departmentid`,`roleid`,`datecreated`, "+
                  "`usercreated`, `lastdatemodified`, `lastusermodified`, `deleted`, `connected`, `workstation`, `password`,"+
                  "`userid`,`lastauthdate`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            ps = connection.prepareStatement(sql);
            ps.setString(1, null);
            ps.setString(2, txtEmployeeID.getText().toUpperCase()); //staffcode
            ps.setString(3, txtSurname.getText().toUpperCase()); //surname
            ps.setString(4, txtFirstname.getText().toUpperCase()); //firstname
            ps.setString(5, txtEmail.getText().toUpperCase().trim()); //email
            ps.setString(6, txtNationalID.getText().toUpperCase()); //nationalid
            ps.setString(7, lblDepartmentId.getText().toUpperCase().trim()); //departmentid
            ps.setString(8, lblRoleId.getText().toUpperCase().trim()); //roleid
            ps.setDate(9, Date.valueOf(LocalDate.now())); //datecreated
            ps.setString(10, java.net.Inet4Address.getLocalHost().getHostName()); //usercreated
            ps.setDate(11, Date.valueOf(LocalDate.now())); //lastdatemodified
            ps.setString(12, InetAddress.getLocalHost().getHostName().toUpperCase()); //lastusermodified
            ps.setBoolean(13,false); //deleted
            ps.setBoolean(14, true); //connected
            ps.setString(15, InetAddress.getLocalHost().getHostName().toUpperCase()); //workstation
            ps.setString(16,txtPassword.getText().trim()); //password
            ps.setString(17,txtId.getText().trim()); //userid
            ps.setDate(18, Date.valueOf(LocalDate.now())); //lastauthdate
//=======

            //IF_THE_ABOVE_CONDITONS_ARE_MET_THEN_PROCESS_THE_BELOW_CODE
            sql = "INSERT INTO `tblusers`(`id`, `empid`, `firstname`, `surname`, `nationalid`, `department`, `role`, `datereg`,"
                    + " `datecreated`, `usercreated`, `lastmachinetoedit`, `lastusertoedit`, `lastdatetoedit`) VALUES "
                    + "(?,?,?,?,?,?,?,?,?,?,?,?,?)";
            ps = connection.prepareStatement(sql);
            ps.setString(1, null);
            ps.setString(2, txtEmployeeID.getText().toUpperCase());
            ps.setString(3, txtFirstname.getText().toUpperCase());
            ps.setString(4, txtSurname.getText().toUpperCase());
            ps.setString(5, txtNationalID.getText().toUpperCase());
            ps.setString(6, cmbDepartment.getSelectionModel().getSelectedItem().toString().toUpperCase());
            ps.setString(7, cmbUserRole.getSelectionModel().getSelectedItem().toString().toUpperCase());
            ps.setDate(8, Date.valueOf(LocalDate.now()));
            ps.setDate(9, Date.valueOf(LocalDate.now()));
            ps.setString(10, "HUGGINS".toUpperCase());
            ps.setString(11, InetAddress.getLocalHost().getHostName().toUpperCase());
            ps.setString(12, "HUGGINS".toUpperCase());
            ps.setDate(13, Date.valueOf(LocalDate.now()));
////>>>>>>> f5c7a74c0fba43c1a593f4c9fd5c119e38b274d5
            System.out.println("Now executing");
            ps.execute();

            ps.clearParameters();
            ps.close();
            Alert alert = new Alert(AlertType.CONFIRMATION);
            alert.setTitle("Confirmation");
            alert.setContentText("Data saved");
            alert.show();
//<<<<<<< HEAD
            //Event event;
            //closeStage(event);
           // selectLastId();
//=======
////>>>>>>> f5c7a74c0fba43c1a593f4c9fd5c119e38b274d5
        }

    }

    @FXML
    public void addDepartment() throws IOException {

//<<<<<<< HEAD
        AnchorPane root = FXMLLoader.load(getClass().getResource("/octopushr/organization/newDepartment.fxml"));
//=======
        //AnchorPane root = FXMLLoader.load(getClass().getResource("newDepartment.fxml"));
////>>>>>>> f5c7a74c0fba43c1a593f4c9fd5c119e38b274d5
        Scene scene = new Scene(root, 600, 400);
        stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Add New Department");
        stage.setAlwaysOnTop(false);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    public void addRole() throws IOException {

        AnchorPane root = FXMLLoader.load(getClass().getResource("addRole.fxml"));
        Scene scene = new Scene(root, 600, 400);
        stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Add Role");
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    public void closeStage(Event event) {

        closeQuit quit = new closeQuit();
        quit.qiutScene(event);

    }

//<<<<<<< HEAD
    @FXML
    public void selectDepartment() throws SQLException, ClassNotFoundException{
        connection = connexion.getConnetion();
       // st = connection.createStatement();
       // lblDepartmentId = new Label();
        int i = 0;
        i++;
        System.out.println("Select department");
        ps = connection.prepareStatement("SELECT `id`, `departmentid`,`departmentname` FROM `tbldepartments` WHERE `departmentname`=?");
        ps.setString(1, cmbDepartment.getSelectionModel().getSelectedItem().toString().trim());
        rs = ps.executeQuery();
        System.out.println("Executed "+i);
        while(rs.next()){
           lblDepartmentId.setText("");
            System.out.println("Inside loop");
         
        lblDepartmentId.setText(rs.getString("departmentid"));
        }
        st.close();
        rs.close();
        ps.close();
    }
    
    @FXML
    public void selectRole() throws SQLException, ClassNotFoundException{
    connection = connexion.getConnetion();
    ps = connection.prepareStatement("SELECT * FROM `octopus`.`tbluserroles` WHERE rolename=?");
    ps.setString(1, cmbUserRole.getSelectionModel().getSelectedItem().toString().trim());
    rs = ps.executeQuery();
    while(rs.next()){
        lblRoleId.setText("");
        lblRoleId.setText(rs.getString("roleid"));
    }
    ps.close();
    rs.close();
    }
//=======
////>>>>>>> f5c7a74c0fba43c1a593f4c9fd5c119e38b274d5
}
