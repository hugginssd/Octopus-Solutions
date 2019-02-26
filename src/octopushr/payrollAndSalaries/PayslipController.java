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
package octopushr.payrollAndSalaries;

import constructors.Payslip;
import java.net.URL;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import octopushr.Functions;

/**
 * FXML Controller class
 *
 * @author user
 */
public class PayslipController implements Initializable {

    @FXML
    private Label lblPayDate;

    @FXML
    private Label lblCompanyName;

    @FXML
    private TableView<Payslip> tablePayslip;

    @FXML
    private ObservableList<TableColumn<Payslip, ?>> columnsPayslip;

    @FXML
    private ObservableList<Payslip> columns;

    @FXML
    private Label lblPaymentMethod;

    @FXML
    private Label lblBankName;

    @FXML
    private Label lblAccountNumber;

    @FXML
    private Label lblDescription;

    @FXML
    private Label lblPaidAmount;

    @FXML
    private Label lblComments, lblEmployeeNumber,lblTotalPay,lblTotalDeductions,lblNetPay;

    @FXML
    private Button btnPrint;

    @FXML
    private Button btnEmail;

    @FXML
    private Button btnClose;

    Functions functions = new Functions();

    @FXML
    Scene scene;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        lblPayDate.setText(Date.valueOf(LocalDate.now()).toString());
        setTableView();
        loadTableData();
    }

    @FXML
    public void setTableView() {
        columnsPayslip = tablePayslip.getColumns();

        final TableColumn<Payslip, Boolean> colID = new TableColumn<>("Description");
        colID.setCellValueFactory(new PropertyValueFactory<>("DescriptionEarning"));
        colID.setPrefWidth(250);
        columnsPayslip.add(colID);

        final TableColumn<Payslip, Boolean> colAmountAllowance = new TableColumn<>("Amount");
        colAmountAllowance.setCellValueFactory(new PropertyValueFactory<>("AmountEarning"));
        colAmountAllowance.setPrefWidth(200);
        columnsPayslip.add(colAmountAllowance);

        final TableColumn<Payslip, Boolean> colDescriptionDeduction = new TableColumn<>("Description");
        colDescriptionDeduction.setCellValueFactory(new PropertyValueFactory<>("DescriptionDeduction"));
        colDescriptionDeduction.setPrefWidth(250);
        columnsPayslip.add(colDescriptionDeduction);

        final TableColumn<Payslip, Boolean> colAmountDeduction = new TableColumn<>("Amount");
        colAmountDeduction.setCellValueFactory(new PropertyValueFactory<>("AmountDeduction"));
        colAmountDeduction.setPrefWidth(142);
        columnsPayslip.add(colAmountDeduction);

    }

    @FXML
    public void loadTableData() {
        columns = FXCollections.observableArrayList();
        columns.addAll(new Payslip("Basic Pay", 324.00, "NSSA", 15.00),
                new Payslip("OverTime", 223.00, "Health Insurance", 10.00),
                new Payslip("Paid Leaves", 124.00, "Aids Levy", 15.00),
                new Payslip("Transport Allowance", 214.00, "Champions Insurance", 24.00),
                new Payslip("Medical Allowance", 120.00, "Tax Deductions", 20.00),
                new Payslip("Bonus", 324.00, "Salary Loan", 520.00),
                new Payslip("Other Allowance", 240.00, "", 0.00));
        tablePayslip.setItems(columns);
        lblTotalPay.setText("1,569,00");
        lblTotalDeductions.setText("604,00");
        lblNetPay.setText("965,00");
        lblPaidAmount.setText("965,00");
    }

    @FXML
    public void closeThisStage(Event event) {
        functions.closeWindow(event);
    }

    @FXML
    public void Print() {
        if (lblEmployeeNumber.getText().isEmpty()) {
            return;
        } 
    }
}
