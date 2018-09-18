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
import java.util.Optional;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import octopushr.Connexion;
import octopushr.Functions;
import octopushr.organization.HrandAdminController;

/**
 * FXML Controller class
 *
 * @author user
 */
public class NewOrganisationController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private TextField txtCompanyName;
    
    @FXML
    private TextArea txtStreetAddress;
    
    @FXML
    private TextField txtTownCIty,txtTelephone,txtAnnualRevenue,txtYearEstablished,txtSicCode,txtFax,txtWebsite,txtCountryState,txtPostal,txtNumberOfEmployees;
    
    @FXML
    private Label lblCompanyCode;
    
    @FXML
    private ComboBox cmbIndustry,cmbPrimaryProduct,cmbSecondaryProduct,cmbZipcode;
    
    @FXML
    private CheckBox chkNoSalesCalls,chkNoPostal;
    
    Functions functions = new Functions();
    Connection connection;
    Connexion connexion = new Connexion();
    ResultSet rs;
    PreparedStatement pst;
    Statement st;
    Alert alert;
    HrandAdminController hrandadmin = new HrandAdminController();
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            // TODO
            lblCompanyCode.setText("CCO"+functions.getLastId("id", "tblcompanydetails"));
            cmbIndustry.getItems().addAll("Aerospace","Agriculture","Chemical","Computer","Construction",
                                          "Defense","Education","Energy","Entertainment","Finance","Food",
                                          "Health","Hospitality","Information","Manufacturing","Mass media",
                                          "Telecomunications","Transport","Water","Direct Selling");
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(NewOrganisationController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    @FXML
    public void addOrganisation() throws SQLException, ClassNotFoundException{
        if(txtCompanyName.getText().isEmpty()){
            alert = new Alert(AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setContentText("Fill in company name");
            alert.showAndWait();
            return;
        }
        if(txtYearEstablished.getText().isEmpty()){
            alert = new Alert(AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setContentText("Fill in year established");
            alert.showAndWait();
            return;
        }
        connection = connexion.getConnetion();
        pst = connection.prepareStatement("INSERT INTO `tblcompanydetails`(`companycode`, `companyname`, `industry`, "+
                "`annualrevenue`, `yearestablished`, `siccode`, `primaryproduct`, `secondaryproduct`, `telephone`, `fax`, `website`,"+
                "`nosalescalss`, `nopostal`, `address`, `towncity`, `countrystate`, `postal`, `zipcode`,`numberofemployees`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        pst.setString(1, lblCompanyCode.getText());
        pst.setString(2, txtCompanyName.getText().toUpperCase());
        pst.setString(3, cmbIndustry.getValue().toString().toUpperCase());
        alert = new Alert(AlertType.CONFIRMATION);
        alert.setContentText(cmbIndustry.getValue().toString());
        alert.show();
        pst.setDouble(4, Double.parseDouble(txtAnnualRevenue.getText()));
        pst.setInt(5, Integer.parseInt(txtYearEstablished.getText()));
        pst.setString(6, txtSicCode.getText().toUpperCase());
        pst.setString(7,cmbPrimaryProduct.getValue().toString().toUpperCase());
        pst.setString(8, cmbSecondaryProduct.getValue().toString().toUpperCase());
        pst.setString(9, txtTelephone.getText().toUpperCase());
        pst.setString(10, txtFax.getText().toUpperCase());
        pst.setString(11, txtWebsite.getText());
        pst.setBoolean(12, chkNoSalesCalls.isSelected());
        pst.setBoolean(13, chkNoPostal.isSelected());
        pst.setString(14, txtStreetAddress.getText().toUpperCase());
        pst.setString(15, txtTownCIty.getText().toUpperCase());
        pst.setString(16, txtCountryState.getText().toUpperCase());
        pst.setString(17, txtPostal.getText().toUpperCase());
        pst.setString(18, cmbZipcode.getValue().toString().toUpperCase());
        pst.setInt(19, Integer.parseInt(txtNumberOfEmployees.getText()));
        pst.execute();
        alert = new Alert(AlertType.CONFIRMATION);
        alert.setHeaderText(null);
        alert.setContentText("Successfully added");
        Optional<ButtonType> result = alert.showAndWait();
        if(result.get() == ButtonType.OK){
          lblCompanyCode.setText("CCO"+functions.getLastId("id", "tblcompanydetails"));
          txtCompanyName.clear();
          cmbIndustry.setValue(null);
          txtAnnualRevenue.clear();
          txtYearEstablished.clear();
          txtSicCode.clear();
          cmbPrimaryProduct.setValue(null);
          cmbSecondaryProduct.setValue(null);
          txtTelephone.clear();
          txtFax.clear();
          txtWebsite.clear();
          chkNoSalesCalls.setSelected(false);
          chkNoPostal.setSelected(false);
          txtStreetAddress.clear();
          txtTownCIty.clear();
          txtCountryState.clear();
          txtPostal.clear();
          cmbZipcode.setValue(null);
         // selectOrganisation();
        }
    }
    
    @FXML
    public void selectOrganisation() throws SQLException, ClassNotFoundException{
    
        connection = connexion.getConnetion();
        pst = connection.prepareStatement("SELECT `id`, `companycode`, `companyname` FROM `tblcompanydetails`");
        rs = pst.executeQuery();
        //hrandadmin.cmbChangeOrganization.setValue(null);
        while(rs.next()){
            hrandadmin.cmbChangeOrganization.getItems().addAll(rs.getString("companyname"));
        }
        pst.close();
        rs.close();
    }
    
    @FXML
    public void closeThisStage(Event event) {
        functions.closeWindow(event);
    }

}
