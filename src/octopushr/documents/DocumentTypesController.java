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
package octopushr.documents;

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
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import octopushr.Connexion;
import octopushr.Functions;

/**
 * FXML Controller class
 *
 * @author user
 */
public class DocumentTypesController implements Initializable {
    
    Functions functions = new Functions();
    
    @FXML
    private RadioButton rdIssued, rdSubmit;
    
    Connection connection;
    Connexion connexion = new Connexion();
    Statement st;
    PreparedStatement pst;
    ResultSet rs;
    Alert alert;
    
    @FXML
    Label lblDocumentId, lblId;
    
    @FXML
    TextField txtDocumentType;
    
    @FXML
    TableView<ExistingDocuments> tableDocuments;
    
    @FXML
    ObservableList<ExistingDocuments> dataExistingDocuments = FXCollections.observableArrayList();
    
    @FXML
    TableColumn<ExistingDocuments, ?> colSno;
    @FXML
    TableColumn<ExistingDocuments, ?> colDocumentType;
    @FXML
    TableColumn<ExistingDocuments, ?> colCategory;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            // TODO
            rdSubmit.setSelected(true);
            lblId.setVisible(false);
            lblDocumentId.setText("DOC_0" + Integer.toString(functions.getLastId("id", "tblemployeedocuments")));
            loadDocumentTypes();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(DocumentTypesController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @FXML
    public void closeThisStage(Event event) {
        functions.closeWindow(event);
    }
    
    @FXML
    public void addDocumentType() throws SQLException, ClassNotFoundException, UnknownHostException {
        if (lblDocumentId.getText().isEmpty()
                || txtDocumentType.getText().isEmpty()) {
            functions.alertInformation(alert, "Invalid entry");
            return;
        }
        connection = connexion.getConnetion();
        pst = connection.prepareStatement("INSERT INTO `tblemployeedocuments`(`documentid`, `documenttype`,`submittedtoemployee`,`usercreated`, `machinecreatedon`, `lastmachinemodifiedon`)"
                + " VALUES (?,?,?,?,?,?)");
        pst.setString(1, lblDocumentId.getText().toUpperCase());
        pst.setString(2, txtDocumentType.getText().toUpperCase());
        pst.setBoolean(3, true);
        pst.setString(4, java.net.Inet4Address.getLocalHost().getHostName());
        pst.setString(5, java.net.Inet4Address.getLocalHost().getHostName());
        pst.setString(6, java.net.Inet4Address.getLocalHost().getHostName());
        pst.execute();
        functions.alertSuccessful(alert, "Successfully added");
        refreshControls();
    }
    
    @FXML
    public void refreshControls() throws SQLException, ClassNotFoundException {
        txtDocumentType.clear();
        lblDocumentId.setText("DOC_0" + Integer.toString(functions.getLastId("id", "tblemployeedocuments")));
        loadDocumentTypes();
    }
    
    @FXML
    public void loadDocumentTypes() throws SQLException, ClassNotFoundException {
        colSno.setCellValueFactory(new PropertyValueFactory("id"));
        colDocumentType.setCellValueFactory(new PropertyValueFactory("documentType"));
        colCategory.setCellValueFactory(new PropertyValueFactory("category"));
        
        connection = connexion.getConnetion();
        pst = connection.prepareStatement("SELECT `id`, `documentid`, `documenttype`,`submittedtoemployee` "
                + "FROM `tblemployeedocuments`");
        rs = pst.executeQuery();
        tableDocuments.getItems().clear();
        while (rs.next()) {
            dataExistingDocuments.add(new ExistingDocuments(rs.getInt("id"), rs.getString("documenttype"), Boolean.toString(rs.getBoolean("submittedtoemployee"))));
            tableDocuments.setItems(dataExistingDocuments);
        }
        
    }
    
    @FXML
    public void updateDocumentType() throws SQLException, ClassNotFoundException, UnknownHostException {
        ExistingDocuments existingDocuments = tableDocuments.getSelectionModel().getSelectedItem();
        if (existingDocuments == null) {
            functions.alertInformation(alert, "Select the document to update");
            return;
        }
        lblId.setText(Integer.toString(existingDocuments.getId()));
        connection = connexion.getConnetion();
        pst = connection.prepareStatement("UPDATE `tblemployeedocuments` SET `documenttype`=?,`submittedtoemployee`=?,"
                + "`lastdatemodified`=CURDATE(),`lastmachinemodifiedon`=? WHERE `id`=?");
        pst.setString(1, txtDocumentType.getText().toUpperCase());
        pst.setBoolean(2, rdIssued.isSelected());
        pst.setString(3, java.net.Inet4Address.getLocalHost().getHostName());
        pst.setInt(4, Integer.parseInt(lblId.getText()));
        pst.execute();
        functions.alertSuccessful(alert, "Successfully updated");
        refreshControls();
    }
    
    @FXML
    public void showInLabel() {
        ExistingDocuments existingDocuments = tableDocuments.getSelectionModel().getSelectedItem();
        if (existingDocuments == null) {
            return;
        }
        lblId.setText(Integer.toString(existingDocuments.getId()));
        lblDocumentId.setText("");
        txtDocumentType.setText(existingDocuments.getDocumentType());
    }
    
    @FXML
    public void checkCheckBox() {
        if (rdIssued.isSelected()) {
            rdSubmit.setSelected(false);
        }
        if (rdSubmit.isSelected()) {
            rdIssued.setSelected(false);
        }
    }
    
}
