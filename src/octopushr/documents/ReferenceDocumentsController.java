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
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import octopushr.Connexion;
import octopushr.Functions;

/**
 * FXML Controller class
 *
 * @author user
 */
public class ReferenceDocumentsController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private ComboBox<?> cmbDocumenttype;

    @FXML
    private TextField txtDocumentnumber;

    @FXML
    private TextField txtDocumentitle;

    @FXML
    private TextArea txaDescription;

    @FXML
    private TextField txtSelectdocument;

    @FXML
    private DatePicker dtpIssuedon;

    @FXML
    private ComboBox<?> cmbAuthority;

    @FXML
    private TextField txtBuyFee;

    @FXML
    private TextArea txtFeedetails;

    @FXML
    private TextArea txtStatussummary;

    @FXML
    private Button btnUpdate;

    @FXML
    private Button btnAddNew;

    @FXML
    private ComboBox<?> cmbAuthourity;

    @FXML
    private DatePicker dtpFrom;

    @FXML
    private DatePicker dtpTo;

    @FXML
    private TableView<?> tableReferenceDocuments;

    @FXML
    private TableColumn<?, ?> colSno;

    @FXML
    private TableColumn<?, ?> colTitle;

    @FXML
    private TableColumn<?, ?> colDocumentType;

    @FXML
    private TableColumn<?, ?> colAuthority;

    @FXML
    private TableColumn<?, ?> colIssuedOn;

    @FXML
    private TableColumn<?, ?> colBuyFee;

    @FXML
    private TableColumn<?, ?> colFeeDetail;

    @FXML
    private Button btnViewAll;

    @FXML
    private Button btnDelete;

    @FXML
    private Button btnDownloadFile;

    @FXML
    private Button btnClose;

    @FXML
    private Button btnEmployeeDocuments;

    @FXML
    private Button btnExternalDocuments;

    @FXML
    private Button btnExpiredDocuments;

    @FXML
    private Button btnCompanyDocuments;

    Functions functions = new Functions();
    Connexion connexion = new Connexion();
    Connection connection;
    Statement st;
    PreparedStatement pst;
    ResultSet rs;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO

    }

    @FXML
    public void uploadReferenceDocuments() throws SQLException, ClassNotFoundException {
        
        connection = connexion.getConnetion();
        pst = connection.prepareStatement(" INSERT INTO `tblreferencedocuments`(`documentnumber`, `documenttitle`, `issuedon`, `documentname`, "
                + " `description`, `documentid`, `authorityid`, `buyfee`, `feedetails`, `statussummary`) "
                + " VALUES (?,?,?,?,?,?,?,?,?,?)");

        
        
        
    }

}
