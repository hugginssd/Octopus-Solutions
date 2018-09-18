package octopushr.organization;

//<<<<<<< HEAD
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.embed.swing.SwingFXUtils;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javax.imageio.ImageIO;
import octopushr.Connexion;
import octopushr.Functions;
//=======
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.stage.Stage;
import javax.swing.JOptionPane;
//>>>>>>> f5c7a74c0fba43c1a593f4c9fd5c119e38b274d5
import octopushr.closeQuit;

public class NewOrganizationOrBranchController implements Initializable {

    @FXML
//<<<<<<< HEAD
    private TableView<NewOrganizationOrBranchConstructor> tblBranch;

    @FXML
    private TableColumn<NewOrganizationOrBranchConstructor, String> colSno;

    @FXML
    private TableColumn<NewOrganizationOrBranchConstructor, String> colOrgaName;

    @FXML
    private TableColumn<NewOrganizationOrBranchConstructor, String> colheadManager;

    @FXML
    private TableColumn<NewOrganizationOrBranchConstructor, String> colContactPerson;

    @FXML
    private TableColumn<NewOrganizationOrBranchConstructor, String> colPhone;

    @FXML
    private TableColumn<NewOrganizationOrBranchConstructor, String> colEmail;

    @FXML
    private TableColumn<NewOrganizationOrBranchConstructor, String> colDepartment;

    @FXML
    private ObservableList<NewOrganizationOrBranchConstructor> data;

    @FXML
    private ImageView imageView;

    @FXML
    private TextField txtBranchName, txtOfficePhone, txtFax, txtWebsite, txtAddress, txtState, txtCity, txtZipCode, txtheadName,
                      txtContactName,txtEmail;

    @FXML
    private ComboBox cmbCountry, cmbSelectMonth;

    @FXML
    private Button btnReset;
    @FXML
    private Label lblOrganisationId;
    @FXML
    Stage stage = new Stage();
    closeQuit closeQuit = new closeQuit();
    Functions functions = new Functions();
    Connexion connexion = new Connexion();
    Connection connection;
    ResultSet rs;
    PreparedStatement pst;
    Statement st;
    Alert alert;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        cmbCountry.getItems().addAll("AN    - Angola", "BS   - Botswana", "CM  - Comoros", "DRC - Democratic Republic of the Congo", "LS    - Lesotho",
                "MD  - Madagascar", "MW  - Malawi", "MR - Mauritius", "MZ - Mozambique", "NM - Namibia", "SY - Seychelles",
                "SA - South Africa", "SW - Swaziland", "TN - Tanzania", "ZM - Zambia", "ZW - Zimbabwe");
        try {
            selectOrganization();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(NewOrganizationOrBranchController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    public void selectOrganization() throws SQLException, ClassNotFoundException {
        connection = connexion.getConnetion();

        colSno.setCellValueFactory(new PropertyValueFactory("sno"));
        colOrgaName.setCellValueFactory(new PropertyValueFactory("orgName"));
        colheadManager.setCellValueFactory(new PropertyValueFactory("headManager"));
        colContactPerson.setCellValueFactory(new PropertyValueFactory("contactPerson"));
        colPhone.setCellValueFactory(new PropertyValueFactory("phone"));
        colEmail.setCellValueFactory(new PropertyValueFactory("email"));
        colDepartment.setCellValueFactory(new PropertyValueFactory("department"));
        
        
        
        
        pst = connection.prepareStatement("SELECT `tblcompanydetails`.`id`, `tblcompanydetails`.`companycode` AS companycode, `companyname`, `industry`, "
                + " `annualrevenue`, `yearestablished`, `siccode`, `primaryproduct`, `secondaryproduct`, `nosalescalss`, `nopostal`,`numberofemployees`,"
                + " `manager`, `telephone`, `fax`, `website`, `address`, `towncity`, `countrystate`, `postal`, `zipcode`,`contactperson`,`email`"
                + " FROM `tblcompanydetails` "
                + " INNER JOIN `tblcompanycontacts` "
                + " ON `tblcompanycontacts`.`companycode`= `tblcompanydetails`.`companycode`");
        rs = pst.executeQuery();
        tblBranch.setItems(null);
        data = FXCollections.observableArrayList();
        while (rs.next()) {
            data.add(new NewOrganizationOrBranchConstructor(rs.getString("companycode"), rs.getString("companyname"),
                    rs.getString("manager"), rs.getString("contactperson"), rs.getString("telephone"), rs.getString("email"), "6"));
            tblBranch.setItems(data);
        }
        pst.close();
        rs.close();
    }

    @FXML
    public void updateOrganisationDetails() throws SQLException, ClassNotFoundException {
        if (txtBranchName.getText().isEmpty()) {
            functions.alertSuccessful(alert, "Branch name is empty");
            return;
        }
        if (txtAddress.getText().isEmpty()) {
            functions.alertSuccessful(alert, "Address fied is empty");
            return;
        }
        if (lblOrganisationId.getText().isEmpty()) {
            functions.alertSuccessful(alert, "Company fied is empty");
            return;
        }
        connection = connexion.getConnetion();
        pst = connection.prepareStatement("UPDATE `tblcompanydetails` SET `companyname`=?, `manager`=? "
                + " WHERE `companycode`=?");
        pst.setString(1, txtBranchName.getText().toUpperCase());
        pst.setString(2, txtheadName.getText().toUpperCase());
        pst.setString(3, lblOrganisationId.getText().toUpperCase());
        pst.execute();
        pst.close();
        functions.alertSuccessful(alert, "Successfully updated");
        updateOrganisationContacts();
        functions.alertSuccessful(alert, "Successfully updated");
    }

    @FXML
    public void updateOrganisationContacts() throws SQLException, ClassNotFoundException {
        connection = connexion.getConnetion();
        pst = connection.prepareStatement("UPDATE `tblcompanycontacts` SET `telephone`=?,`fax`=?,`website`=?, "
                + "`address`=?,`towncity`=?,`countrystate`=?,`zipcode`=?, `country`=?"
                + " WHERE `companycode`=?");
        pst.setString(1, txtOfficePhone.getText().toUpperCase());
        pst.setString(2, txtFax.getText().toUpperCase());
        pst.setString(3, txtWebsite.getText());
        pst.setString(4, txtAddress.getText().toUpperCase());
        pst.setString(5, txtCity.getText().toUpperCase());
        pst.setString(6, txtState.getText().toUpperCase());
        pst.setString(7, txtZipCode.getText().toUpperCase());
        pst.setString(8, cmbCountry.getValue().toString().substring(0, 2).toUpperCase());
        pst.setString(9, lblOrganisationId.getText().toUpperCase());
        pst.execute();
    }

    @FXML
    public void loadImage() {

        FileChooser fileChooser = new FileChooser();

        //Set extension filter
        FileChooser.ExtensionFilter extFilterJPG = new FileChooser.ExtensionFilter("JPG files (*.jpg)", "*.JPG");
        FileChooser.ExtensionFilter extFilterPNG = new FileChooser.ExtensionFilter("PNG files (*.png)", "*.PNG");
        fileChooser.getExtensionFilters().addAll(extFilterJPG, extFilterPNG);

        //Show open file dialog
        File file = fileChooser.showOpenDialog(null);

        try {
            BufferedImage bufferedImage = ImageIO.read(file);
            Image image = SwingFXUtils.toFXImage(bufferedImage, null);
            imageView.getId();
            imageView.setImage(image);
            ScrollPane scrollPane = new ScrollPane();
            scrollPane.setContent(null);
            scrollPane.setContent(imageView);
        } catch (IOException ex) {
            // System.err.println(ex.toString());
            imageView.setImage(new Image("/resources/icons/no-image.jpg", 102, 114, false, false));
        }
        imageView.minHeight(102);
        imageView.minWidth(102);
    }

    @FXML
    public void getRowClicked() throws SQLException, ClassNotFoundException {
        NewOrganizationOrBranchConstructor newOrganisation = tblBranch.getSelectionModel().getSelectedItem();
        if (newOrganisation == null) {
            functions.alertSuccessful(alert, "Nothing selected");
        } else {
            connection = connexion.getConnetion();
            String companycode = newOrganisation.getSno();
            lblOrganisationId.setText(companycode);
            pst = connection.prepareStatement("SELECT `tblcompanydetails`.`id`, `tblcompanydetails`.`companycode` AS companycode, "
                                             +" `companyname`, `industry`, `annualrevenue`, `yearestablished`, `siccode`, `primaryproduct`,"
                                             +" `secondaryproduct`, `nosalescalss`, `nopostal`,`numberofemployees`,`manager`, `telephone`,"
                                             +" `fax`, `website`, `address`, `towncity`, `countrystate`, `postal`,`tblcompanycontacts`.`zipcode` AS zipcode,"
                                             +" `contactperson`,`email`,CONCAT(`tblcountry`.`zipcode`,' - ',`tblcountry`.`country`) AS country"
                                             +" FROM `tblcompanydetails`"
                                             +" INNER JOIN `tblcompanycontacts`"
                                             +" ON `tblcompanycontacts`.`companycode`= `tblcompanydetails`.`companycode`"
                                             +" INNER JOIN `tblcountry`"
                                             +" ON `tblcountry`.`zipcode`= `tblcompanycontacts`.`country`"
                                             +" WHERE `tblcompanydetails`.`companycode` = ?");
            pst.setString(1, txtBranchName.getText().toUpperCase());
            rs = pst.executeQuery();
            while(rs.next()){
                        lblOrganisationId.setText(rs.getString("companycode").toUpperCase());
                        txtBranchName.setText(rs.getString("companyname").toUpperCase());
                        txtContactName.setText(rs.getString("contactperson").toUpperCase());
                        txtOfficePhone.setText(rs.getString("telephone").toUpperCase());
                        txtEmail.setText(rs.getString("email"));
                        txtFax.setText(rs.getString("fax"));
                        txtAddress.setText(rs.getString("address"));
                        txtState.setText(rs.getString("countrystate"));
                        txtCity.setText(rs.getString("towncity"));
                        cmbCountry.setValue(rs.getString("country"));
                        txtZipCode.setText(rs.getString("zipcode"));
                        txtWebsite.setText(rs.getString("website"));
            }
            pst.close();
        }
//=======
//    Stage stage = new Stage();
//    closeQuit closeQuit = new closeQuit();
//
//    @Override
//    public void initialize(URL url, ResourceBundle rb) {
//
//    }
//
//    @FXML
//    public void addNewOrg() {
//
//        JOptionPane.showConfirmDialog(null, "clicked");
//
////>>>>>>> f5c7a74c0fba43c1a593f4c9fd5c119e38b274d5
    }

    @FXML
    public void closeThisStage(Event event) {
//<<<<<<< HEAD
        functions.closeWindow(event);
//=======
        closeQuit.qiutScene(event);

//>>>>>>> f5c7a74c0fba43c1a593f4c9fd5c119e38b274d5
    }
}
