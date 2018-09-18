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

import java.io.IOException;
import static java.lang.System.out;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author user
 */
public class SkillsController extends UpdateEmployeeDetailsController implements Initializable {

    @FXML
    private ComboBox cmbNumyear, cmbSelectYear, cmbNumMonth, cmbSelectMonth, cmbStatus;

    @FXML
    private TextField txtSkills;

    @FXML
    private TextArea txaSkillsDescription, txaSkillsDescriptions;

    @FXML
    ObservableList comboData = FXCollections.observableArrayList();

    UpdateEmployeeDetailsController updateEmployeeDetailsController = new UpdateEmployeeDetailsController();

    @FXML
    Stage stage;

    /**
     * Initializes the controller class.
     *
     *
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            // TODO
            cmbNumyear.getItems().addAll(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25);
            cmbSelectYear.getItems().addAll("YEARS", "MONTHS");
            cmbNumMonth.getItems().addAll(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
            cmbSelectMonth.getItems().addAll("YEAR", "MONTH");
            cmbStatus.getItems().addAll("ACTIVE", "IN-ACTIVE");
            txtSkills.setText("SK0" + Integer.toString(functions.getLastId("id", "tblskills")));
            txtSkills.setEditable(false);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(SkillsController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    public void addNewSkill() throws SQLException, ClassNotFoundException {
        if (cmbNumyear.getValue() == null
                || cmbSelectYear.getValue() == null
                || txtSkills.getText().isEmpty()
                || txaSkillsDescription.getText().isEmpty()
                || txaSkillsDescriptions.getText().isEmpty()) {
            functions.alertInformation(alert, "Insufficient information");
            return;
        }
        connection = connexion.getConnetion();
        pst = connection.prepareStatement("INSERT INTO `tblskills`(`skillid`, `skilldesc`, `skilldesclong`, `validityperiod`, `active`,`deleted`)"
                + " VALUES (?,?,?,?,?,?)");
        pst.setString(1, txtSkills.getText().toUpperCase());
        pst.setString(2, txaSkillsDescription.getText().toUpperCase());
        pst.setString(3, txaSkillsDescriptions.getText().toUpperCase());
        pst.setString(4, cmbNumyear.getSelectionModel().getSelectedItem().toString() + " " + cmbSelectYear.getSelectionModel().getSelectedItem().toString()
                + " " + cmbNumMonth.getSelectionModel().getSelectedItem().toString() + " " + cmbSelectMonth.getSelectionModel().getSelectedItem().toString());
        pst.setBoolean(5, true);
        pst.setBoolean(6, false);
        pst.execute();
        functions.alertSuccessful(alert, "Successfully added");
        refreshInputControls();
    }

    /**
     *
     * @throws SQLException
     * @throws ClassNotFoundException clearing input controls for skills
     * controller
     *
     */
    @FXML
    @Override
    public void refreshInputControls() throws SQLException, ClassNotFoundException {
        txtSkills.clear();
        txaSkillsDescription.clear();
        txaSkillsDescriptions.clear();
        cmbNumyear.setValue(null);
        cmbNumMonth.setValue(null);
        cmbSelectYear.setValue(null);
        cmbSelectMonth.setValue(null);
        cmbStatus.setValue(null);
        txtSkills.setText("SK0" + Integer.toString(functions.getLastId("id", "tblskills")));
    }

    @FXML
    public ObservableList loadSkillsComboBox() throws SQLException, ClassNotFoundException {
        connection = connexion.getConnetion();
        pst = connection.prepareStatement("SELECT `id`, `skillid`, `skilldesc`, `skilldesclong`, `validityperiod`,"
                + " `active`, `deleted` FROM `tblskills`"
                + " WHERE `active`='1' AND `deleted`='0'");
        rs = pst.executeQuery();
        while (rs.next()) {
            comboData.addAll(rs.getString("skilldesc"));
            // updateEmployeeDetailsController.cmbSkills.getItems().addAll(rs.getString("skilldesc"));
        }
        return comboData;
    }

    @FXML
    public ObservableList getObservableList() {
        return comboData;

    }

    @FXML
    public void closeThisStage(Event event) throws SQLException, ClassNotFoundException, IOException {
        functions.closeWindow(event);
        loadSkillsComboBox();
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

}
