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
package octopushr.leave;

import java.net.URL;
import java.net.UnknownHostException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import octopushr.Connexion;
import octopushr.Functions;

/**
 * FXML Controller class
 *
 * @author user
 */
public class EmployeeLeaveTypesController implements Initializable {

    Functions functions = new Functions();
    Connection connection;
    Connexion connexion = new Connexion();
    PreparedStatement pst;
    Statement st;
    ResultSet rs;
    Alert alert;

    @FXML
    Label lblleavetypeid;

    @FXML
    TextField txtLeavename, txtPayrate, txtLeaveceiling;

    @FXML
    Spinner spAnnualtotaldays, spDefaultid;

    @FXML
    TextArea txaDescription;

    @FXML
    CheckBox chkShowOnPayslip, chkCanbeencashed;
    
    @FXML
    ComboBox cmbSelectLeaveType;

    @FXML
    RadioButton rdbPayable;

    @FXML
    SpinnerValueFactory<Integer> spinnerValueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 356, 1);

    @FXML
    SpinnerValueFactory<Integer> spinnerValueFactory1 = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 356, 1);

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            // TODO

            spAnnualtotaldays.setValueFactory(spinnerValueFactory);
            spDefaultid.setValueFactory(spinnerValueFactory1);
            lblleavetypeid.setText("LTY0" + functions.getLastId("id", "tblleavetype"));
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(EmployeeLeaveTypesController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    public void closeThisStage(Event event) {
        functions.closeWindow(event);
    }

    @FXML
    public void addLeaveType() throws SQLException, ClassNotFoundException, UnknownHostException {
        if (txtLeavename.getText().isEmpty()
                || txtPayrate.getText().isEmpty()
                || txtLeaveceiling.getText().isEmpty()
                || txaDescription.getText().isEmpty()) {
            functions.alertInformation(alert, "Invalid entry");
            return;
        }
        connection = connexion.getConnetion();
        pst = connection.prepareStatement("INSERT INTO `tblleavetype`(`leavetypeid`, `name`, `description`, `payable`, `payrate`, `canbeencashed`,"
                + " `annualtotaldaysallowable`, `leaveceiling`, `defaultduration`,`active`, `datecreated`,"
                + " `usercreated`, `machinecreatedon`,`systemdefined`, `showonpayslip`)"
                + " VALUES (?,?,?,?,?,?,?,?,?,?,CURDATE(),?,?,?,?)");
        pst.setString(1, lblleavetypeid.getText().toUpperCase());
        pst.setString(2, txtLeavename.getText().toUpperCase());
        pst.setString(3, txaDescription.getText().toUpperCase());
        pst.setBoolean(4, rdbPayable.isSelected());
        pst.setDouble(5, Double.valueOf(txtPayrate.getText()));
        pst.setBoolean(6, chkCanbeencashed.isSelected());
        pst.setInt(7, (int) spAnnualtotaldays.getValue());
        pst.setInt(8, Integer.parseInt(txtLeaveceiling.getText()));
        pst.setInt(9, (int) spDefaultid.getValue());
        pst.setBoolean(10, true);
        pst.setString(11, java.net.Inet4Address.getLocalHost().getHostName());
        pst.setString(12, java.net.Inet4Address.getLocalHost().getHostName());
        pst.setBoolean(13, true);
        pst.setBoolean(14, chkShowOnPayslip.isSelected());
        pst.execute();
        functions.alertSuccessful(alert, "Successfully created");
        refreshControls();
    }

    @FXML
    public void refreshControls() throws SQLException, ClassNotFoundException {
        lblleavetypeid.setText("");
        txtLeavename.clear();
        txaDescription.clear();
        rdbPayable.setSelected(false);
        txtPayrate.setText("");
        chkCanbeencashed.setSelected(false);
        txtLeaveceiling.setText("");
        spAnnualtotaldays.setValueFactory(spinnerValueFactory);
        spDefaultid.setValueFactory(spinnerValueFactory1);
        chkShowOnPayslip.setSelected(false);
        lblleavetypeid.setText("LTY0" + functions.getLastId("id", "tblleavetype"));
    }
}
