package octopushr.employees;

//<<<<<<< HEAD
/*
 *  DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 * 
 *  Contributor(s):
 *  
 *  The Original Software is NetBeans. The Initial Developer of the Original
 *  Software is Sun Microsystems, Inc. Portions Copyright 1997-2010 Sun
 *  Microsystems, Inc.
 *  The developer of this software is HUGGINS
 *  
 *  
 *  If you wish your version of this file to be governed by only the CDDL
 *  or only the GPL Version 2, indicate your decision by adding
 *  "[Contributor] elects to include this software in this distribution
 *  under the [CDDL or GPL Version 2] license." If you do not indicate a
 *  single choice of license, a recipient has the option to distribute
 *  your version of this file under either the CDDL, the GPL Version 2 or
 *  to extend the choice of license to its licensees as provided above.
 *  However, if you add GPL Version 2 code and therefore, elected the GPL
 *  Version 2 license, then the option applies only if the new code is
 *  made subject to such option by the copyright holder.
 *  
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NON-INFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 *  THE SOFTWARE.
 *  
 *  @author SIR HUGGINS
 *  
 *  Copyright (c) 2016, Solution Systems Pvt Ltd
 *  All rights reserved.
 * 
 *  
 *  You should have received a copy of the GNU Lesser General Public
 *  License along with this library; if not, email to the Free Software
 *  Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 *  OR to Solution Systems Pvt Ltd, 56 Milton Park, Harare
 *  Email: mafiguhuggins@gmail.com
 *  Cell: +263782326160
 *  
 *  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 *  AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 *  IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 *  ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
 *  LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 *  CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 *  SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 *  INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 *  CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 *  ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 *  POSSIBILITY OF SUCH DAMAGE.
 * 
 */
import java.io.File;
import java.io.IOException;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.CheckBoxTableCell;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.util.Callback;
import jxl.read.biff.BiffException;
//import jxl.write.Label;
import jxl.write.WriteException;
import octopushr.Connexion;
import octopushr.Functions;
//=======
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import octopushr.closeQuit;
////>>>>>>> f5c7a74c0fba43c1a593f4c9fd5c119e38b274d5

/**
 * FXML Controller class
 *
 * @author Huggins
 */
public class EmployeeListController implements Initializable {

    @FXML
//<<<<<<< HEAD
    private Button btnClose, btnSearch, btnViewDetails, btnEditDetails, btnAddEmployee, btnDownloadEmployeeList;

    @FXML
    private ComboBox cmbFilterByDepartment, cmbFilterByName;

    @FXML
    public Label lblDepartmentId, lblEmployeeId;

    @FXML
    private ObservableList<TableColumn<ViewEmployeeDetails, ?>> columns;
    Statement st;
    PreparedStatement pst;
    ResultSet rs;
    Connection connection;
    Connexion connexion = new Connexion();
    Functions functions = new Functions();
    @FXML
    private Alert alert;

    @FXML
    private Stage stage;
    @FXML
    ObservableList<ViewEmployeeDetails> data;
    @FXML
    private TableView<ViewEmployeeDetails> tableView;

    ViewEmployeeDetails viewEmployeeDetails;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            // TODO
            loadDepartments();
            setTableView();
            loadEmployees();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(EmployeeListController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @FXML
    public void qiut(Event event) throws Exception {
//<<<<<<< HEAD
        functions.closeWindow(event);

    }

    @FXML
    public void loadDepartments() throws SQLException, ClassNotFoundException {
        connection = connexion.getConnetion();
        st = connection.createStatement();
        rs = st.executeQuery("SELECT DISTINCT `departmentid`,`departmentname` FROM `tbldepartments` ORDER BY `departmentname`");
        while (rs.next()) {
            cmbFilterByDepartment.getItems().addAll(rs.getString("departmentname"));
        }
    }

    @FXML
    public void loadDepartmentId() throws SQLException, ClassNotFoundException {
        connection = connexion.getConnetion();
        pst = connection.prepareStatement("SELECT DISTINCT `departmentid` FROM `tbldepartments` WHERE `departmentname`=?");
        pst.setString(1, cmbFilterByDepartment.getValue().toString());
        rs = pst.executeQuery();
        while (rs.next()) {
            lblDepartmentId.setText(rs.getString("departmentid"));
        }
        st.close();
        rs.close();
        loadEmployeeNames();
        selectDepartmentEmployees();
    }

    @FXML
    public void loadEmployeeNames() throws SQLException, ClassNotFoundException {
        connection = connexion.getConnetion();
        pst = connection.prepareStatement("SELECT `id`, `employeeid`,CONCAT(`firstname`,' ', `middlename`,' ',`surname`)AS employeename  FROM `tblguards` WHERE `departmentid`=?");
        pst.setString(1, lblDepartmentId.getText());
        rs = pst.executeQuery();
        cmbFilterByName.getItems().clear();
        while (rs.next()) {
            cmbFilterByName.getItems().addAll(rs.getString("employeename"));
        }

    }

    @FXML
    public void selectDepartmentEmployees() throws SQLException, ClassNotFoundException {

        connection = connexion.getConnetion();
        pst = connection.prepareStatement("SELECT `employeeid`, CONCAT(`firstname`,' ',`surname`) AS `employee`,`active`,`verified`,"
                + "`branchname`,`designation`,`departmentname` "
                + " FROM `tblguards` "
                + " INNER JOIN `tblcompanybranches` "
                + " ON `tblguards`.`branchid` = `tblcompanybranches`.`branchid` "
                + " INNER JOIN `tbldesignation` "
                + " ON `tblguards`.`designationid` = `tbldesignation`.`designationid` "
                + " INNER JOIN `tbldepartments` "
                + " ON `tblguards`.`departmentid` = `tbldepartments`.`departmentid`"
                + " WHERE `tblguards`.`departmentid`=?");
        pst.setString(1, lblDepartmentId.getText());
        rs = pst.executeQuery();
        tableView.setItems(null);
        data = FXCollections.observableArrayList();
        while (rs.next()) {
            data.addAll(new ViewEmployeeDetails(rs.getString("employeeid"), rs.getString("employee"),
                    rs.getString("designation"), rs.getString("departmentname"),
                    rs.getBoolean("verified"), rs.getBoolean("active"),
                    rs.getString("branchname")));

        }
        tableView.setItems(data);
        tableView.setEditable(true);
        pst.close();
        rs.close();
    }

    //add new information
    @FXML
    public void viewDetails() throws SQLException, ClassNotFoundException, IOException {
        ViewEmployeeDetails viewEmployeeDetails = tableView.getSelectionModel().getSelectedItem();
        if (viewEmployeeDetails == null) {
            functions.alertSuccessful(alert, "Nothing selected");
            return;
        }
        String department = lblDepartmentId.getText();
        String employeeid = lblEmployeeId.getText();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/octopushr/employees/updateEmployeeDetails.fxml"));
        loader.load();
        UpdateEmployeeDetailsController updateEmployeeDetailsController = new UpdateEmployeeDetailsController();
        functions.alertSuccessful(alert, department);
        updateEmployeeDetailsController.setText(department, employeeid);

        Parent parent = loader.getRoot();
        stage = new Stage();
        stage.setScene(new Scene(parent, 1700, 840));
        stage.setResizable(false);
        stage.getIcons().add(new Image("/resources/icons/identification-documents.png"));
        stage.show();

//        
//        Pane root = FXMLLoader.load(getClass().getResource("/octopushr/employees/updateEmployeeDetails.fxml"));
//        Scene scene = new Scene(root, 1700, 840);
//        out.print("updateEmployeeDetails.fxml");
//        scene.getStylesheets().add("/resources/css/style.css");
//        stage.setTitle("Update Employee Details");
//        stage.setResizable(false);
//        stage.setScene(scene);
//        stage.getIcons().add(new Image("/resources/icons/identification-documents.png"));
//        stage.show();
    }

    @FXML
    public void editDetails() throws IOException {
        ViewEmployeeDetails viewEmployeeDetails = tableView.getSelectionModel().getSelectedItem();
        if (viewEmployeeDetails == null) {
            functions.alertSuccessful(alert, "Nothing selected");
            return;
        }
        stage = new Stage();
        Pane root = FXMLLoader.load(getClass().getResource("/octopushr/employees/updateEmployeeDetails.fxml"));
        Scene scene = new Scene(root, 1700, 840);
        out.print("updateEmployeeDetails.fxml");
        scene.getStylesheets().add("/resources/css/style.css");
        stage.setTitle("Update Employee Details");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.getIcons().add(new Image("/resources/icons/identification-documents.png"));
        stage.show();
    }

    @FXML
    public void addEmployees() throws IOException {
        stage = new Stage();
        Pane root = FXMLLoader.load(getClass().getResource("/octopushr/employees/newEmployee.fxml"));
        Scene scene = new Scene(root, 706, 421);
        out.print("newEmployee.fxml");
        scene.getStylesheets().add("/resources/css/newemployee_1.css");
        stage.setTitle("Quick Registration");
        stage.setScene(scene);
        stage.show();
        stage.setResizable(false);
    }

    //download information from tableview and create pdf
    @FXML
    public void downloadEmployeeList() throws IOException, BiffException, WriteException {
        File f = new File("employeelist.xls");
        if (!f.exists()) {
            functions.createExcel();
            btnDownloadEmployeeList.setDisable(false);
            return;
        }
        if (!f.canExecute()) {
            functions.alertSuccessful(alert, "You cannot execute this file. Please close the file if it is open. ");
            return;
        }
        functions.writeExcel(tableView, viewEmployeeDetails);
    }

    @FXML
    public void search() throws SQLException, ClassNotFoundException {
        if (cmbFilterByDepartment.getValue() == null && cmbFilterByName.getValue() == null) {
            functions.alertSuccessful(alert, "Department and name must be selected");
        }
        connection = connexion.getConnetion();
        pst = connection.prepareStatement("SELECT `employeeid`, CONCAT(`firstname`,' ',`surname`) AS `employee`,`active`,`verified`,"
                + "`branchname`,`designation`,`departmentname` "
                + " FROM `tblguards` "
                + " INNER JOIN `tblcompanybranches` "
                + " ON `tblguards`.`branchid` = `tblcompanybranches`.`branchid` "
                + " INNER JOIN `tbldesignation` "
                + " ON `tblguards`.`designationid` = `tbldesignation`.`designationid` "
                + " INNER JOIN `tbldepartments` "
                + " ON `tblguards`.`departmentid` = `tbldepartments`.`departmentid`"
                + " WHERE `tblguards`.`departmentid`=?"
                + " AND CONCAT(`tblguards`.`firstname`,' ', `tblguards`.`middlename`,' ',`tblguards`.`surname`) =?");
        pst.setString(1, lblDepartmentId.getText());
        pst.setString(2, cmbFilterByName.getValue().toString());
        rs = pst.executeQuery();
        tableView.setItems(null);
        data = FXCollections.observableArrayList();
        while (rs.next()) {
            data.addAll(new ViewEmployeeDetails(rs.getString("employeeid"), rs.getString("employee"),
                    rs.getString("designation"), rs.getString("departmentname"),
                    rs.getBoolean("verified"), rs.getBoolean("active"),
                    rs.getString("branchname")));
            lblEmployeeId.setText(rs.getString("employeeid"));
        }
        tableView.setItems(data);
        tableView.setEditable(true);
        pst.close();
        rs.close();
    }

    @FXML
    public void setTableView() {
        columns = tableView.getColumns();
        //employee id
        final TableColumn<ViewEmployeeDetails, Boolean> colEmployeeId = new TableColumn("Employee ID");
        colEmployeeId.setCellValueFactory(new PropertyValueFactory("employeeid"));
        columns.add(colEmployeeId);
        //name
        final TableColumn<ViewEmployeeDetails, Boolean> colName = new TableColumn("Name");
        colName.setCellValueFactory(new PropertyValueFactory("name"));
        colName.setPrefWidth(150);
        columns.add(colName);
        //designation
        final TableColumn<ViewEmployeeDetails, Boolean> colDesignation = new TableColumn("Designation");
        colDesignation.setCellValueFactory(new PropertyValueFactory("designation"));
        columns.add(colDesignation);
        //department
        final TableColumn<ViewEmployeeDetails, Boolean> colDepartment = new TableColumn("Department");
        colDepartment.setCellValueFactory(new PropertyValueFactory("department"));
        colDepartment.setPrefWidth(150);
        columns.add(colDepartment);
        //verify
        final TableColumn<ViewEmployeeDetails, Boolean> colVerify = new TableColumn("Verify");
        colVerify.setCellValueFactory(new PropertyValueFactory("verify"));
        colVerify.setCellFactory((TableColumn<ViewEmployeeDetails, Boolean> param) -> new CheckBoxTableCell<>());
        columns.add(colVerify);
        //active
        final TableColumn<ViewEmployeeDetails, Boolean> colActive = new TableColumn<>("Active");
        colActive.setCellValueFactory(new PropertyValueFactory("active"));
        columns.add(colActive);
        //location
        final TableColumn<ViewEmployeeDetails, Boolean> colLocation = new TableColumn<>("Location");
        colLocation.setCellValueFactory(new PropertyValueFactory("location"));
        colLocation.setPrefWidth(150);
        columns.add(colLocation);
    }

    public void loadEmployees() throws SQLException, ClassNotFoundException {

        connection = connexion.getConnetion();
        pst = connection.prepareStatement("SELECT `employeeid`, CONCAT(`firstname`,' ',`surname`) AS `employee`,`active`,`verified`,"
                + "`branchname`,`designation`,`departmentname` "
                + " FROM `tblguards` "
                + " INNER JOIN `tblcompanybranches` "
                + " ON `tblguards`.`branchid` = `tblcompanybranches`.`branchid` "
                + " INNER JOIN `tbldesignation` "
                + " ON `tblguards`.`designationid` = `tbldesignation`.`designationid` "
                + " INNER JOIN `tbldepartments` "
                + " ON `tblguards`.`departmentid` = `tbldepartments`.`departmentid`");
        rs = pst.executeQuery();
        tableView.setItems(null);
        data = FXCollections.observableArrayList();
        while (rs.next()) {
            data.addAll(new ViewEmployeeDetails(rs.getString("employeeid"), rs.getString("employee"),
                    rs.getString("designation"), rs.getString("departmentname"),
                    rs.getBoolean("verified"), rs.getBoolean("active"),
                    rs.getString("branchname")));

        }
        tableView.setItems(data);
        tableView.setEditable(true);
        pst.close();
        rs.close();
        closeQuit closeStage = new closeQuit();

    }
}
