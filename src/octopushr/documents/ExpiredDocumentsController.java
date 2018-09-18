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
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

/**
 * FXML Controller class
 *
 * @author user
 */
public class ExpiredDocumentsController implements Initializable {

   @FXML
    private TableView<?> tableExpiredEmployeeSubmittedDocuments;

    @FXML
    private TableColumn<?, ?> colEmployeeIdExpiredIssued;

    @FXML
    private TableColumn<?, ?> colNameExpiredSubmittedDocuments;

    @FXML
    private TableColumn<?, ?> colDocumentExpiredSubmittedDocuments;

    @FXML
    private TableColumn<?, ?> colSubmitDateExpiredSubmittedDocuments;

    @FXML
    private TableColumn<?, ?> colExpiryDateExpiredSubmittedDocuments;

    @FXML
    private Button btnExpiredSubmittedDocumentsDownload;

    @FXML
    private TableView<?> tableExpiredEmployeeIssuedDocuments;

    @FXML
    private TableColumn<?, ?> colNameExpiredIssuedDocuments;

    @FXML
    private TableColumn<?, ?> colDocumentExpiredIssuedDocuments2;

    @FXML
    private TableColumn<?, ?> colSubmitDateExpiredSubmittedDocuments2;

    @FXML
    private TableColumn<?, ?> colExpiryDateExpiredIssuedDocuments;

    @FXML
    private Button btnExpiredIssuedDocumentsDownload;

    @FXML
    private TableView<?> tableExpiredDocumentsEmployeeInternalDocuments;

    @FXML
    private TableColumn<?, ?> colExpiredEmployeeInternalDocumentsSno;

    @FXML
    private TableColumn<?, ?> colNameExpiredEmployeeInternalDocuments;

    @FXML
    private TableColumn<?, ?> colExpiredDocumentsEmployeeInternalDocuments;

    @FXML
    private TableColumn<?, ?> colDocumentTypeExpiredEmployeeInternalDocuments;

    @FXML
    private TableColumn<?, ?> colExpiredInternalDocuments;

    @FXML
    private Button btnExpiredEmployeeInternalDocumentsDownload;

    @FXML
    private TableView<?> tableExpiredInternalCompanyDocuments;

    @FXML
    private TableColumn<?, ?> colExpiredCampanyInternalDocumentsSno;

    @FXML
    private TableColumn<?, ?> colExpiredCompanyInternalDOcumentsName;

    @FXML
    private TableColumn<?, ?> colExpiredCompanyInternalDocumentsDocumentType;

    @FXML
    private TableColumn<?, ?> colExpiredCompanyInternalDocumentsAuthority;

    @FXML
    private TableColumn<?, ?> colExpiredCompanyInternalDocumentsSubmittedon;

    @FXML
    private TableColumn<?, ?> colExpiredCompanyInternalDocumentsExpiryDate;

    @FXML
    private TableColumn<?, ?> colExpiredInternalDocumentsCurrentStatus;

    @FXML
    private TableColumn<?, ?> colExpiredInternalDocumentsProcessFee;

    @FXML
    private Button btnExpiredCompanyInternalDocumentsDownload;

    @FXML
    private TableView<?> tableToBeExpiredEmployeeSubmittedDocuments;

    @FXML
    private TableColumn<?, ?> colEmployeeId1;

    @FXML
    private TableColumn<?, ?> colNameExpiredSubmittedDocuments1;

    @FXML
    private TableColumn<?, ?> colDocumentExpiredSubmittedDocuments1;

    @FXML
    private TableColumn<?, ?> colSubmitDateExpiredSubmittedDocuments1;

    @FXML
    private TableColumn<?, ?> colExpiryDateExpiredSubmittedDocuments1;

    @FXML
    private Button btnToBeExpiredSubmittedDocumentsDownload;

    @FXML
    private TableView<?> tableToBeExpiredEmployeeIssuedDocuments1;

    @FXML
    private TableColumn<?, ?> colEmployeeIdTobeExpiredIssued;

    @FXML
    private TableColumn<?, ?> colNameToBeExpiredIssuedDocuments;

    @FXML
    private TableColumn<?, ?> colDocumentToBeExpiredIssuedDocuments;

    @FXML
    private TableColumn<?, ?> colSubmitDateToBeExpiredIssuedDateDocuments;

    @FXML
    private TableColumn<?, ?> colExpiryDateToBeExpiredIssuedDocuments;

    @FXML
    private Button btnToBeExpiredIssuedDocumentsDownload;

    @FXML
    private TableView<?> tableToBeExpiredDocumentsEmployeeInternalDocuments;

    @FXML
    private TableColumn<?, ?> colExpiredEmployeeInternalDocumentsSno1;

    @FXML
    private TableColumn<?, ?> colNameExpiredEmployeeInternalDocuments1;

    @FXML
    private TableColumn<?, ?> colDocumentExpiredSubmittedDocuments2;

    @FXML
    private TableColumn<?, ?> colExpiredDocumentsEmployeeInternalDocuments1;

    @FXML
    private TableColumn<?, ?> colDocumentTypeExpiredEmployeeInternalDocuments1;

    @FXML
    private TableColumn<?, ?> colExpiredInternalDocuments1;

    @FXML
    private Button btnToBeExpiredEmployeeInternalDocumentsDownload;

    @FXML
    private TableView<?> tableExpiredInternalCompanyDocuments1;

    @FXML
    private TableColumn<?, ?> colExpiredCampanyInternalDocumentsSno1;

    @FXML
    private TableColumn<?, ?> colExpiredCompanyInternalDOcumentsName1;

    @FXML
    private TableColumn<?, ?> colExpiredCompanyInternalDocumentsDocumentType1;

    @FXML
    private TableColumn<?, ?> colExpiredCompanyInternalDocumentsAuthority1;

    @FXML
    private TableColumn<?, ?> colExpiredCompanyInternalDocumentsSubmittedon1;

    @FXML
    private TableColumn<?, ?> colExpiredCompanyInternalDocumentsExpiryDate1;

    @FXML
    private TableColumn<?, ?> colExpiredInternalDocumentsCurrentStatus1;

    @FXML
    private TableColumn<?, ?> colExpiredInternalDocumentsProcessFee1;

    @FXML
    private Button btnToBeExpiredCompanyInternalDocumentsDownload;

    @FXML
    private Button btnClose;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
