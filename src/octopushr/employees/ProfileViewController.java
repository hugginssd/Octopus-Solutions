/*
  * 
  *   DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
  *  
  *   Contributor(s):
  *   
  *   The Original Software is NetBeans. The Initial Developer of the Original
  *   Software is Sun Microsystems, Inc. Portions Copyright 1997-2010 Sun
  *   Microsystems, Inc.
  *   The developer of this software is HUGGINS
  *   
  *  
  *   If you wish your version of this file to be governed by only the CDDL
  *   or only the GPL Version 2, indicate your decision by adding
  *   "[Contributor] elects to include this software in this distribution
  *   under the [CDDL or GPL Version 2] license." If you do not indicate a
  *   single choice of license, a recipient has the option to distribute
  *   your version of this file under either the CDDL, the GPL Version 2 or
  *   to extend the choice of license to its licensees as provided above.
  *   However, if you add GPL Version 2 code and therefore, elected the GPL
  *   Version 2 license, then the option applies only if the new code is
  *   made subject to such option by the copyright holder.
  *   
  *   THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
  *   IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
  *   FITNESS FOR A PARTICULAR PURPOSE AND NON-INFRINGEMENT. IN NO EVENT SHALL THE
  *   AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
  *   LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
  *   OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
  *   THE SOFTWARE.
  *   
  *   @author SIR HUGGINS
  *   
  *   Copyright (c) 2016, Solution Systems Pvt Ltd
  *   All rights reserved.
  *  
  *   
  *   You should have received a copy of the GNU Lesser General Public
  *   License along with this library; if not, email to the Free Software
  *   Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
  *   OR to Solution Systems Pvt Ltd, 56 Milton Park, Harare
  *   Email: mafiguhuggins@gmail.com
  *   Cell: +263782326160
  *   
  *   THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
  *   AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
  *   IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
  *   ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
  *   LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
  *   CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
  *   SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
  *   INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
  *   CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
  *   ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
  *   POSSIBILITY OF SUCH DAMAGE.
  *  
  * 
 */
package octopushr.employees;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import octopushr.Connexion;
import octopushr.Functions;

/**
 * FXML Controller class
 *
 * @author user
 */
public class ProfileViewController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private ComboBox cmbSelectDepartment, cmbSelectEmployee;

    @FXML
    private Label lblDepartmentId, lblDesignation, lblTitle, lblFirstname, lblMiddlename, lblLastname, lblDateOfBirth, lblSex, lblMaritalStatus, lblLanguages, lblEmployeenumber;

    @FXML
    private ImageView imageView;

    @FXML
    Stage stage;
    Connection connection;
    Statement statement;
    ResultSet rs;

    PreparedStatement pst;
    Connexion connexion = new Connexion();
    Functions functions = new Functions();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            // TODO
            loadDepartments();
            lblDepartmentId.setVisible(false);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ProfileViewController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    public void loadImage() throws SQLException, ClassNotFoundException {
        //functions.loadImageView(imageView);
        functions.saveImage(stage, imageView,lblEmployeenumber.getText());
    }

    @FXML
    public void loadEmployeeDetails() throws SQLException, ClassNotFoundException {
        if (cmbSelectEmployee.getSelectionModel().isEmpty()) {
            return;
        }

        connection = connexion.getConnetion();
        pst = connection.prepareStatement("SELECT  `tblguards`.`employeeid` AS employeeid,`firstname`,`middlename`,`surname`,`designation`,`departmentname`,"
                + "`totalexperience`,`experiencewithus`,`monthlysalary` FROM `tblguards`"
                + "INNER JOIN `tbldesignation`"
                + "ON `tbldesignation`.`designationid` = `tblguards`.`designationid`"
                + "INNER JOIN `tbldepartments`"
                + "ON `tbldepartments`.`departmentid` = `tblguards`.`departmentid`"
                + "INNER JOIN `tblworkexperience`"
                + "ON `tblworkexperience`.`employeeid` = `tblguards`.`employeeid`"
                + "WHERE CONCAT(`tblguards`.`firstname`,' ',`tblguards`.`surname`) = ?");
        pst.setString(1, cmbSelectEmployee.getSelectionModel().getSelectedItem().toString());
        rs = pst.executeQuery();
        while (rs.next()) {
            lblEmployeenumber.setText(rs.getString("employeeid"));
            lblFirstname.setText(rs.getString("firstname").toUpperCase());
            lblMiddlename.setText(rs.getString("middlename").toUpperCase());
            lblLastname.setText(rs.getString("surname").toUpperCase());
            lblDesignation.setText(rs.getString("designation"));

        }
        rs.close();
        pst.close();
    }

    @FXML
    public void loadDepartments() throws SQLException, ClassNotFoundException {
        connection = connexion.getConnetion();
        statement = connection.createStatement();
        rs = statement.executeQuery("SELECT DISTINCT `departmentname` FROM `tbldepartments` ORDER BY `departmentname`");
        while (rs.next()) {
            cmbSelectDepartment.getItems().addAll(rs.getString("departmentname"));
        }
        statement.close();
        rs.close();
        //loadDepartmentId();
    }

    @FXML
    public void loadDepartmentId() throws SQLException, ClassNotFoundException {
        connection = connexion.getConnetion();
        pst = connection.prepareStatement("SELECT DISTINCT `departmentid` FROM `tbldepartments` WHERE `departmentname`=?");
        pst.setString(1, cmbSelectDepartment.getValue().toString());
        rs = pst.executeQuery();
        while (rs.next()) {
            lblDepartmentId.setText(rs.getString("departmentid"));
        }
        statement.close();
        rs.close();
        loadEmployees();
//        selectDepartmentEmployees();
    }

    @FXML
    public void loadEmployees() throws SQLException, ClassNotFoundException {
        connection = connexion.getConnetion();
        pst = connection.prepareStatement("SELECT `id`,`employeeid`,`firstname`, `surname`, CONCAT(`firstname`,' ', `surname`) AS employee FROM `tblguards` WHERE `departmentid`=?");
        pst.setString(1, lblDepartmentId.getText().trim());
        rs = pst.executeQuery();
        cmbSelectEmployee.getItems().clear();
        while (rs.next()) {
            Map<String, String> employee = new HashMap<>();
            employee.put(rs.getString("employee").toUpperCase(), rs.getString("employeeid"));
            cmbSelectEmployee.getItems().addAll(employee.keySet());
        }
        pst.close();
        rs.close();
    }

}
