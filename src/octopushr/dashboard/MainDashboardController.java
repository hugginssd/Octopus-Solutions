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
package octopushr.dashboard;

import java.io.IOException;
import static java.lang.System.out;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.chart.AreaChart;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ToolBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import octopushr.Connexion;
import octopushr.Functions;

public class MainDashboardController implements Initializable {

    @FXML
    private AnchorPane anchorRoot;

    @FXML
    private Menu file;

    @FXML
    private MenuItem newOrg;

    @FXML
    private MenuItem newUser;

    @FXML
    private MenuItem viewUsers;

    @FXML
    private MenuItem trails;

    @FXML
    private MenuItem saveExit;

    @FXML
    private MenuItem closeQuit;

    @FXML
    private Menu homeMenu;

    @FXML
    private MenuItem addOrg;

    @FXML
    private MenuItem menuItemQuickRegistration;

    @FXML
    private MenuItem newEmp;

    @FXML
    private MenuItem hrOutlook;

    @FXML
    private MenuItem empDoc;

    @FXML
    private MenuItem comDoc;

    @FXML
    private MenuItem empLeave;

    @FXML
    private MenuItem payroll;

    @FXML
    private MenuItem training;

    @FXML
    private MenuItem recruit;

    @FXML
    private MenuItem scheduleTrav;

    @FXML
    private MenuItem perform;

    @FXML
    private MenuItem complNleg;

    @FXML
    private MenuItem activateNow;

    @FXML
    private Menu orgMenu;

    @FXML
    private MenuItem newOrganization;

    @FXML
    private MenuItem addViewOrg;

    @FXML
    private MenuItem dep;

    @FXML
    private MenuItem desig;

    @FXML
    private MenuItem benNfac;

    @FXML
    private MenuItem calendar;

    @FXML
    private MenuItem empCal;

    @FXML
    private Menu empMenu;

    @FXML
    private MenuItem newEmpl;

    @FXML
    private MenuItem empList;

    @FXML
    private MenuItem uploadEmp;

    @FXML
    private MenuItem addLeaveDetails;

    @FXML
    private MenuItem depHist;

    @FXML
    private MenuItem proHist;

    @FXML
    private MenuItem doc;

    @FXML
    private MenuItem perf;

    @FXML
    private MenuItem disc;

    @FXML
    private Menu docMenu;

    @FXML
    private MenuItem docTypes;

    @FXML
    private MenuItem empDocs;

    @FXML
    private MenuItem comDocs;

    @FXML
    private MenuItem exteDocs;

    @FXML
    private MenuItem refDocs;

    @FXML
    private MenuItem expDocs;

    @FXML
    private Menu perfMenu;

    @FXML
    private MenuItem menuItemperfIntelligence;

    @FXML
    private MenuItem addGoal;

    @FXML
    private MenuItem analyseGoalEffort;

    @FXML
    private MenuItem orgPerf;

    @FXML
    private MenuItem orgImprovement;

    @FXML
    private Menu paySalaryMenu;

    @FXML
    private MenuItem paySettings;

    @FXML
    private MenuItem payStruct;

    @FXML
    private MenuItem paySal;

    @FXML
    private MenuItem wagesAndBilling;

    @FXML
    private MenuItem salHist;

    @FXML
    private MenuItem loanAndAdvances;

    @FXML
    private MenuItem bankSheet;

    @FXML
    private MenuItem uploadPayrollAttendance;

    @FXML
    private MenuItem advancePayroll;

    @FXML
    private Menu attendanceMenu;

    @FXML
    private MenuItem empAttTimeSheet;

    @FXML
    private MenuItem empAttendance;

    @FXML
    private MenuItem orgCalAttendance;

    @FXML
    private MenuItem empLeaveCal;

    @FXML
    private Menu leaveMenu;

    @FXML
    private MenuItem punchApplyLeave;

    @FXML
    private MenuItem approveManageLeave;

    @FXML
    private MenuItem leaveSettings;

    @FXML
    private MenuItem orgCalLeave;

    @FXML
    private MenuItem empCalLeave;

    @FXML
    private MenuItem empPerfLeave;

    @FXML
    private Menu trainingMenu;

    @FXML
    private MenuItem trainingItem;

    @FXML
    private Menu recruitMenu;

    @FXML
    private MenuItem recruitItem;

    @FXML
    private Menu travelMenu;

    @FXML
    private MenuItem travelschedule;

    @FXML
    private Menu reportsMenu;

    @FXML
    private MenuItem deductionReport;

    @FXML
    private MenuItem dueSalaryReport;

    @FXML
    private MenuItem netSalaryReport;

    @FXML
    private MenuItem employeeReport;

    @FXML
    private MenuItem headCountReport;

    @FXML
    private Menu compAndLegalMenu;

    @FXML
    private MenuItem compItem;

    @FXML
    private MenuItem legalItem;

    @FXML
    private Menu congSettingsMenu;

    @FXML
    private MenuItem securitySettings;

    @FXML
    private MenuItem configEmail;

    @FXML
    private MenuItem backupDatabase;

    @FXML
    private MenuItem restoreDatabase;

    @FXML
    private MenuItem emptyDatabase;

    @FXML
    private Menu aboutHRandAdminMenu;

    @FXML
    private MenuItem licenseItem;

    @FXML
    private MenuItem activateNowItem;

    @FXML
    private Menu helpMenu;

    @FXML
    private MenuItem howItWorks;

    @FXML
    private MenuItem aboutHRandAdminItem;

    @FXML
    private MenuItem termsAndConditions;

    @FXML
    private MenuItem checkForUpdates;

    @FXML
    private MenuItem referralsItem;

    @FXML
    private MenuItem feedbackContactUs;

    @FXML
    private MenuItem faqItem;

    @FXML
    private Label lblAdminDashboard, lblDate;

    @FXML
    private LineChart<?, ?> lineChart1;

    @FXML
    private LineChart<?, ?> lineChart2;

    @FXML
    private LineChart<?, ?> lineChart3;

    @FXML
    private LineChart<?, ?> lineChart4;

    @FXML
    private AreaChart<?, ?> areaChart1;

    @FXML
    private AreaChart<?, ?> areaChart2;

    @FXML
    private AreaChart<?, ?> areaChart3;

    @FXML
    private AreaChart<?, ?> areaChart4;

    @FXML
    private PieChart pieChart1;

    @FXML
    private PieChart pieChart2;

    @FXML
    private PieChart pieChart3;

    @FXML
    private PieChart pieChart4;

    @FXML
    private ToolBar toolBar;

    @FXML
    Stage stage;

    Connection connection;
    Statement st;
    PreparedStatement pst;
    ResultSet rs;
    Connexion connexion;
    Functions functions = new Functions();

    @FXML
    public void forgotPassword() throws IOException {
        stage = new Stage();
        Pane root = FXMLLoader.load(getClass().getResource("/octopushr/file/forgotPassword.fxml"));
        Scene scene = new Scene(root, 515, 309);
        out.print("Forgot Password loaded\n");
        scene.getStylesheets().add("/resources/css/forgotpassword.css");
        stage.setTitle("Forgot Password");
        //stage.setIconified(true);
        stage.getIcons().add(new Image("/resources/icons/forgot-password.png"));
        //stage.setAlwaysOnTop(true);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.getIcons().add(new Image(this.getClass().getResourceAsStream("/resources/icons/forgot-password.png")));
        stage.show();
    }

    @FXML
    public void newOrganization() throws IOException {
        stage = new Stage();
        Pane root = FXMLLoader.load(getClass().getResource("/octopushr/organization/newOrganization.fxml"));
        Scene scene = new Scene(root, 900, 400);
        out.print("Organisation loaded");
        scene.getStylesheets().add("/resources/css/neworganization.css");
        stage.setTitle("New Organization");
        //stage.setIconified(true);
        stage.getIcons().add(new Image("/resources/icons/new_32.png"));
        //stage.setAlwaysOnTop(true);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    public void addOrganization() throws IOException {
        stage = new Stage();
        Pane root = FXMLLoader.load(getClass().getResource("/octopushr/organization/newOrganizationOrBranch.fxml"));
        Scene scene = new Scene(root, 1500, 800);
        out.print("Organisation loaded");
        scene.getStylesheets().add("/resources/css/neworganizationorbranch.css");
        stage.setTitle("New Branch");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void addOrganizationStage() throws IOException {
        stage = new Stage();
        Pane root = FXMLLoader.load(getClass().getResource("/octopushr/file/newOrganisation.fxml"));
        Scene scene = new Scene(root, 780, 450);
        out.print("Organisation loaded");
        scene.getStylesheets().add("/resources/css/neworganisation.css");
        stage.setTitle("New Organization");
        //stage.setIconified(true);
        stage.getIcons().add(new Image("/resources/icons/new_32.png"));
        //stage.setAlwaysOnTop(true);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.showAndWait();
    }

    public void quickRegistration() {
        try {
            stage = new Stage();
            Pane root = FXMLLoader.load(getClass().getResource("/octopushr/employees/newEmployee.fxml"));
            Scene scene = new Scene(root, 800, 440);
            out.print("newEmployee.fxml");
            scene.getStylesheets().add("/resources/css/newemployee_1.css");
            stage.setTitle("Quick Registration");
            stage.setResizable(false);
            stage.setScene(scene);
            //stage.setAlwaysOnTop(true);
            stage.show();
            //stage.show();
        } catch (IOException ex) {
            Logger.getLogger(MainDashboardController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    public void addNewEmployee() throws IOException {
        stage = new Stage();
        Pane root = FXMLLoader.load(getClass().getResource("/octopushr/employees/updateEmployeeDetails.fxml"));
        Scene scene = new Scene(root, 1700, 840);
        out.print("updateEmployeeDetails.fxml");
        scene.getStylesheets().add("/resources/css/updateemployeedetails.css");
        stage.setTitle("Update Employee Details");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void hrOutlook() throws IOException {
        stage = new Stage();
        AnchorPane root = FXMLLoader.load(getClass().getResource("/octopushr/organization/hrAndOtlook.fxml"));//"));
        Scene scene = new Scene(root, 800, 800);
        out.print("hrOutLook loaded");
        scene.getStylesheets().add("/resources/css/hroutlook.css");
        stage.setScene(scene);
        stage.setWidth(800);
        stage.setHeight(800);
        stage.setTitle("HR Outlook");
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    public void employeeDocuments() throws IOException {
        stage = new Stage();
        Pane root = FXMLLoader.load(getClass().getResource("/octopushr/documents/employeeDocuments.fxml"));
        Scene scene = new Scene(root, 1220, 700);
        out.print("employeeDocuments loaded");
        scene.getStylesheets().add("/resources/css/employeedocuments.css");
        stage.setResizable(false);
        stage.setTitle("Employee Documents");
        stage.setAlwaysOnTop(true);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void companyDocuments() throws IOException {
        stage = new Stage();
        Pane root = FXMLLoader.load(getClass().getResource("/octopushr/documents/companyDocuments.fxml"));
        Scene scene = new Scene(root, 1000, 700);
        out.print("companyDocuments loaded");
        scene.getStylesheets().add("/resources/css/companydocuments.css");
        stage.setTitle("Company Documents");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void employeeLeaves() throws IOException {
        stage = new Stage();
        Pane root = FXMLLoader.load(getClass().getResource("/octopushr/leave/employeeLeaveApplication.fxml"));
        Scene scene = new Scene(root, 1325, 700);
        out.print("employeeLeaveApplication loaded");
        scene.getStylesheets().add("/resources/css/employeeleaveapplication.css");
        stage.setTitle("Employee Leave Application");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();

    }

//PERFORMANCE_MENU
    @FXML
    public void addGoal() throws IOException {
        stage = new Stage();
        Pane root = FXMLLoader.load(getClass().getResource("/octopushr/performance/addgoal.fxml"));
        Scene scene = new Scene(root, 500, 400);
        out.print("addGoal loaded");
        scene.getStylesheets().add("/resources/css/addgoal.css");
        stage.setTitle("Add Goal");
        stage.setResizable(false);
        stage.centerOnScreen();
        stage.setWidth(650);
        stage.setHeight(550);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void employeeMonthlyGoalAnalysis() throws IOException {
        stage = new Stage();
        Pane root = FXMLLoader.load(getClass().getResource("/octopushr/performance/employeeMonthlyGoalAnalysis.fxml"));
        Scene scene = new Scene(root, 680, 575);
        out.print("EmployeeMonthlyGoalAnalysis loaded");
        scene.getStylesheets().add("/resources/css/employeemonthlygoalanalysis.css");
        stage.setTitle("Employee Monthly Goal Analysis");
        stage.setResizable(false);
        stage.centerOnScreen();
        stage.setWidth(680);
        stage.setHeight(575);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void viewPerformance() throws IOException {
        stage = new Stage();
        Pane root = FXMLLoader.load(getClass().getResource("/octopushr/performance/performanceOrg.fxml"));
        Scene scene = new Scene(root, 878, 585);
        out.print("Performance Org loaded");
        scene.getStylesheets().add("/resources/css/performanceorg.css");
        stage.setTitle("Organisation Performance");
        stage.setResizable(false);
        stage.centerOnScreen();
        stage.setWidth(878);
        stage.setHeight(585);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void improvementAction() throws IOException {
        stage = new Stage();
        Pane root = FXMLLoader.load(getClass().getResource("/octopushr/performance/improvementAction.fxml"));
        Scene scene = new Scene(root, 1058, 673);
        out.print("Improvement Action loaded");
        scene.getStylesheets().add("/resources/css/improvementaction.css");
        stage.setTitle("Improvement Action");
        stage.setResizable(false);
        stage.centerOnScreen();
        stage.setWidth(1058);
        stage.setHeight(673);
        stage.setScene(scene);
        stage.show();
    }

//PAYROLL_MENU
    @FXML
    public void payroll() throws IOException {
        stage = new Stage();
        AnchorPane root = FXMLLoader.load(getClass().getResource("/octopushr/payrollAndSalaries/payrollSettingsAndStructure.fxml"));
        Scene scene = new Scene(root);
        scene.getStylesheets().add("/resources/css/payrollsettingsandstructure.css");
        stage.setTitle("Payroll");
        stage.setResizable(false);
        stage.centerOnScreen();
        stage.getIcons().add(new Image("/resources/icons/m-payroll.png"));
        stage.setWidth(1362);
        stage.setHeight(705);
        stage.show();
    }

    @FXML
    public void showPayEmployeeSalary() throws IOException {
        stage = new Stage();
        GridPane root = FXMLLoader.load(getClass().getResource("/octopushr/payrollAndSalaries/payEmployeeSalary.fxml"));
        Scene scene = new Scene(root);
        scene.getStylesheets().add("/resources/css/payemployeesalary.css");
        stage.setTitle("Pay Employee Salary");
        stage.setResizable(false);
//        stage.setWidth(1355);
        stage.setHeight(748);
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();
    }

    @FXML
    public void showEmployeeBilling() throws IOException {
        stage = new Stage();
        AnchorPane root = FXMLLoader.load(getClass().getResource("/octopushr/payrollAndSalaries/employeeBilling.fxml"));
        Scene scene = new Scene(root, 983, 630);
        scene.getStylesheets().add("/resources/css/employeebilling.css");
        stage.setTitle("Employee Billing");
        stage.setResizable(false);
        stage.centerOnScreen();
        stage.setWidth(983);
        stage.setHeight(630);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void showEmployeeSalaryHistory() throws IOException {
        stage = new Stage();
        AnchorPane root = FXMLLoader.load(getClass().getResource("/octopushr/payrollAndSalaries/employeeSalaryHistory.fxml"));
        Scene scene = new Scene(root);
        scene.getStylesheets().add("/resources/css/employeesalaryhistory.css");
        stage.setTitle("Employee Salary History");
        stage.setResizable(false);
        
//        stage.setWidth(1335);
//        stage.setHeight(820);
//, 1340, 885
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();
    }

    @FXML
    public void showLoanAndAdvances() throws IOException {
        stage = new Stage();
        AnchorPane root = FXMLLoader.load(getClass().getResource("/octopushr/payrollAndSalaries/loanAndAdvances.fxml"));
        Scene scene = new Scene(root, 1200, 500);
        scene.getStylesheets().add("/resources/css/loanandadvances.css");
        stage.setTitle("Loan And Advances");
        stage.setResizable(false);
        stage.centerOnScreen();
        stage.setWidth(1200);
        stage.setHeight(725);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void showBankSheet() throws IOException {
        stage = new Stage();
        AnchorPane root = FXMLLoader.load(getClass().getResource("/octopushr/payrollAndSalaries/bankSheet.fxml"));
        Scene scene = new Scene(root, 1025, 640);
        scene.getStylesheets().add("/resources/css/banksheet.css");
        stage.setTitle("Bank Sheet");
        stage.setResizable(false);
        stage.centerOnScreen();
        stage.setWidth(1025);
        stage.setHeight(640);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void training() throws IOException {
        stage = new Stage();
        Pane root = FXMLLoader.load(getClass().getResource("/octopushr/training/training.fxml"));
        Scene scene = new Scene(root, 1455, 890);
        out.print("training loaded");
        scene.getStylesheets().add("/resources/css/training.css");
        stage.setTitle("Training");
        stage.setResizable(false);
        stage.centerOnScreen();
        stage.getIcons().add(new Image("/resources/icons/assign-training.png"));
        stage.setWidth(1445);
        stage.setHeight(880);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void recruitment() throws IOException {
        stage = new Stage();
        Pane root = FXMLLoader.load(getClass().getResource("/octopushr/recruitment/jobBoard.fxml"));
        Scene scene = new Scene(root, 1330, 820);
        out.print("recruitment loaded");
        scene.getStylesheets().add("/resources/css/jobboard.css");
        stage.setTitle("Job Board");
        stage.setResizable(false);
        stage.centerOnScreen();
        stage.setWidth(1330);
        stage.setHeight(780);
        stage.setScene(scene);
        stage.show();
    }
//SCHEDULE_TRAVEL_MENU

    @FXML
    public void scheduleTravel() throws IOException {
        stage = new Stage();
        Pane root = FXMLLoader.load(getClass().getResource("/octopushr/travel/scheduleTravel.fxml"));
        Scene scene = new Scene(root, 1530, 795);
        out.print("scheduleTravel loaded");
        scene.getStylesheets().add("/resources/css/scheduletravel.css");
        stage.setTitle("Schedule Travel");
        stage.setResizable(false);
        stage.centerOnScreen();
        stage.setFullScreen(true);
        stage.setFullScreenExitHint("Press Esc to exit Travel Schedule View");
        stage.getIcons().add(new Image("/resources/icons/manage-travelling.png"));
        stage.setWidth(1550);
        stage.setHeight(795);
        stage.setScene(scene);
        stage.show();
    }

//REPORTS
    @FXML
    public void showReports() throws IOException {
        stage = new Stage();
        Pane root = FXMLLoader.load(getClass().getResource("/octopushr/reports/octopusReport.fxml"));
        Scene scene = new Scene(root, 1000, 720);
        out.print("octopusReport loaded");
        scene.getStylesheets().add("/resources/css/octopusreport.css");
        stage.setTitle("Octopus Reports");
        stage.setResizable(false);
        stage.centerOnScreen();
        stage.setFullScreen(true);
        stage.setFullScreenExitHint("Press Esc to exit Octopus Report Centre");
        stage.setWidth(1000);
        stage.setHeight(720);
        stage.setScene(scene);
        stage.show();
    }

//DOCUMENTS_TYPES
    @FXML
    public void showEmployeeDocuments(ActionEvent e) throws IOException {
        stage = new Stage();
        Pane root = FXMLLoader.load(getClass().getResource("/octopushr/documents/employeeDocuments.fxml"));
        Scene scene = new Scene(root, 1250, 700);
        out.print("Employee Documents loaded");
        scene.getStylesheets().add("/resources/css/employeedocuments.css");
        stage.setTitle("Employee Documents");
        stage.setResizable(false);
        stage.setHeight(700);
        stage.setWidth(1250);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void showDocumentTypes(ActionEvent e) throws IOException {
        stage = new Stage();
        Pane root = FXMLLoader.load(getClass().getResource("/octopushr/documents/documentTypes.fxml"));
        Scene scene = new Scene(root);
        out.print("Employee Documents loaded");
        scene.getStylesheets().add("/resources/css/documenttypes.css");
        stage.setTitle("Document Types");
        stage.setResizable(false);
        stage.setWidth(782);
        stage.setHeight(415);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void showExternalDocuments(ActionEvent e) throws IOException {
        stage = new Stage();
        Pane root = FXMLLoader.load(getClass().getResource("/octopushr/documents/externalDocuments.fxml"));
        Scene scene = new Scene(root);
        out.print("Employee Documents loaded");
        scene.getStylesheets().add("/resources/css/externaldocuments.css");
        stage.setTitle("External Documents");
        stage.setResizable(false);
        stage.setWidth(1180);
        stage.setHeight(565);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void showCompanyDocuments(ActionEvent e) throws IOException {
        stage = new Stage();
        Pane root = FXMLLoader.load(getClass().getResource("/octopushr/documents/companyDocuments.fxml"));
        Scene scene = new Scene(root);
        out.print("Employee Documents loaded");
        scene.getStylesheets().add("/resources/css/companydocuments.css");
        stage.setTitle("Company Documents");
        stage.setResizable(false);
        stage.setHeight(533);
        stage.setWidth(1165);
        stage.centerOnScreen();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void showReferenceDocuments(ActionEvent e) throws IOException {
        stage = new Stage();
        Pane root = FXMLLoader.load(getClass().getResource("/octopushr/documents/referenceDocuments.fxml"));
        Scene scene = new Scene(root);
        out.print("Employee Documents loaded");
        scene.getStylesheets().add("/resources/css/referencedocuments.css");
        stage.setTitle("Refence Documents");
        stage.setResizable(false);
        stage.setWidth(1090);
        stage.setHeight(550);
        stage.centerOnScreen();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void showExpiredDocuments(ActionEvent e) throws IOException {
        stage = new Stage();
        Pane root = FXMLLoader.load(getClass().getResource("/octopushr/documents/expiredDocuments.fxml"));
        Scene scene = new Scene(root);
        out.print("Employee Documents loaded");
        scene.getStylesheets().add("/resources/css/expireddocuments.css");
        stage.setTitle("Expired Documents");
        stage.setResizable(false);
        stage.setWidth(1108);
        stage.setHeight(582);
        stage.centerOnScreen();
        stage.setScene(scene);
        stage.show();
    }
//PERFORMANCE_MENU

    @FXML
    public void performance() throws IOException {
        stage = new Stage();
        Pane root = FXMLLoader.load(getClass().getResource("/octopushr/performance/performance.fxml"));
        Scene scene = new Scene(root, 1285, 700);
        out.print("performance loaded");
        scene.getStylesheets().add("/resources/css/performance.css");
        stage.setTitle("Performance");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

//COMPLIANCE_AND_LEGAL_MENU
    @FXML
    public void showComplianceAndLegal() throws IOException {
        stage = new Stage();
        Pane root = FXMLLoader.load(getClass().getResource("/octopushr/complianceAndLegal/complianceAndLegal.fxml"));
        Scene scene = new Scene(root);
        out.print("Compliance And Legal loaded");
        scene.getStylesheets().add("/resources/css/complianceandlegal.css");
        stage.setResizable(false);
        stage.setTitle("Compliance and Legal");
        stage.setWidth(1318);
        stage.setHeight(680);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void showLegal() throws IOException {
        stage = new Stage();
        Pane root = FXMLLoader.load(getClass().getResource("/octopushr/complianceAndLegal/legal.fxml"));
        Scene scene = new Scene(root, 1325, 700);
        out.print("Legal loaded");
        scene.getStylesheets().add("/resources/css/legal.css");
        stage.setResizable(false);
        stage.setTitle("Legal");
        stage.setScene(scene);
        stage.show();
    }

//ACTIVATION_AND_REGISTRATION_MENU
    @FXML
    public void activateNow() throws IOException {
        stage = new Stage();
        Pane root = FXMLLoader.load(getClass().getResource("/octopushr/help/activateNow.fxml"));
        Scene scene = new Scene(root, 600, 500);
        out.print("activateNow loaded");
        scene.getStylesheets().add("/resources/css/activatenow.css");
        stage.setTitle("Activate Now");
        stage.setResizable(false);
        stage.setWidth(600);
        stage.setHeight(400);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void showPayrollSettings() throws IOException {
        stage = new Stage();
        AnchorPane root = FXMLLoader.load(getClass().getResource("/octopushr/payrollAndSalaries/payrollSettingsAndStructure.fxml"));
        Scene scene = new Scene(root);
        scene.getStylesheets().add("/resources/css/payrollsettingsandstructure.css");
        stage.setTitle("Payroll Settings");
//        stage.setWidth(1362);
//        stage.setHeight(705);
        stage.setResizable(false);
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();

    }

    @FXML
    public void showPayrollStructure() throws IOException {
        stage = new Stage();
        AnchorPane root = FXMLLoader.load(getClass().getResource("/octopushr/payrollAndSalaries/payrollSettingsAndStructure.fxml"));
        Scene scene = new Scene(root);
        scene.getStylesheets().add("/resources/css/payrollsettingsandstructure.css");
        stage.setTitle("Payroll Structure");
//        stage.setWidth(1362);
//        stage.setHeight(705);
        stage.setResizable(false);
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();

    }

    @FXML
    public void showPayrollStettings() throws IOException {
        stage = new Stage();
        AnchorPane root = FXMLLoader.load(getClass().getResource("/octopushr/payrollAndSalaries/payrollCentre/payrollSettings.fxml"));
        Scene scene = new Scene(root, 1300, 750);
        scene.getStylesheets().add("/resources/css/payrollsettings.css");
        stage.setTitle("Payroll Centre");
        stage.setWidth(1450);
        stage.setHeight(875);
        stage.getIcons().add(new Image("/resources/icons/payrol.png"));
        stage.setScene(scene);
        stage.setResizable(false);
        stage.setIconified(false);
        stage.centerOnScreen();
        stage.show();

    }

    @FXML
    public void openEmployeeList() throws IOException {
        stage = new Stage();
        AnchorPane root = FXMLLoader.load(getClass().getResource("/octopushr/employees/employeeList.fxml"));
        Scene scene = new Scene(root, 773, 502);
        scene.getStylesheets().add("/resources/css/employeelist.css");
        stage.setTitle("Employee List");
        stage.setResizable(false);
        stage.setHeight(530);
        stage.setWidth(785);
        stage.getIcons().add(new Image("/resources/icons/list.png"));
        stage.centerOnScreen();
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    public void uploadEmployees() throws IOException {
        stage = new Stage();
        AnchorPane root = FXMLLoader.load(getClass().getResource("/octopushr/employees/uploadEmployees.fxml"));
        Scene scene = new Scene(root, 825, 700);
        scene.getStylesheets().add("/resources/css/uploademployees.css");
        stage.setTitle("Upload Employees");
        stage.setResizable(false);
        stage.centerOnScreen();
        stage.setWidth(825);
        stage.setHeight(700);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void addViewLeaveDetails() throws IOException {
        stage = new Stage();
        AnchorPane root = FXMLLoader.load(getClass().getResource("/octopushr/leave/addViewLeaveDetails.fxml"));
        Scene scene = new Scene(root, 825, 700);
        scene.getStylesheets().add("/resources/css/addviewleavedetails.css");
        stage.setTitle("Add / View Leave Details");
        stage.setResizable(false);
        stage.centerOnScreen();
        stage.setWidth(825);
        stage.setHeight(700);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void departmentHistory() throws IOException {
        stage = new Stage();
        AnchorPane root = FXMLLoader.load(getClass().getResource("/octopushr/organization/departmentHistory.fxml"));
        Scene scene = new Scene(root, 1000, 800);
        scene.getStylesheets().add("/resources/css/departmenthistory.css");
        stage.setTitle("Department History");
        stage.setResizable(false);
        stage.centerOnScreen();
        stage.setWidth(1000);
        stage.setHeight(800);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void promotionsHistory() throws IOException {
        stage = new Stage();
        AnchorPane root = FXMLLoader.load(getClass().getResource("/octopushr/performance/promotionsHistory.fxml"));
        Scene scene = new Scene(root, 1000, 800);
        scene.getStylesheets().add("/resources/css/promotionshistory.css");
        stage.setTitle("Promotions History");
        stage.setResizable(false);
        stage.centerOnScreen();
        stage.setWidth(1000);
        stage.setHeight(800);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void employeePerformance() throws IOException {
        stage = new Stage();
        AnchorPane root = FXMLLoader.load(getClass().getResource("/octopushr/performance/performance.fxml"));
        Scene scene = new Scene(root, 1000, 800);
        scene.getStylesheets().add("/resources/css/performance.css");
        stage.setTitle("Performance");
        stage.setResizable(false);
        stage.centerOnScreen();
        stage.setWidth(1000);
        stage.setHeight(800);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void employeeDisciplinary() throws IOException {
        stage = new Stage();
        AnchorPane root = FXMLLoader.load(getClass().getResource("/octopushr/performance/disciplinary.fxml"));
        Scene scene = new Scene(root, 1000, 800);
        scene.getStylesheets().add("/resources/css/disciplinary.css");
        stage.setTitle("Disciplinary");
        stage.setResizable(false);
        stage.centerOnScreen();
        stage.setWidth(1000);
        stage.setHeight(800);
        stage.setScene(scene);
        stage.show();
    }

    //DEPARTMENT_MENU
    @FXML
    public void addNewDepartment() throws IOException {
        stage = new Stage();
        AnchorPane root = FXMLLoader.load(getClass().getResource("/octopushr/organization/newDepartment.fxml"));
        Scene scene = new Scene(root, 600, 500);
        scene.getStylesheets().add("/resources/css/newdepartment.css");
        stage.setTitle("New Department");
        stage.setResizable(false);
        stage.centerOnScreen();
        stage.setWidth(600);
        stage.setHeight(500);
        stage.setScene(scene);
        stage.showAndWait();
        stage.show();
    }

    @FXML
    public void addNewDesignation() throws IOException {
        stage = new Stage();
        AnchorPane root = FXMLLoader.load(getClass().getResource("/octopushr/employees/designation.fxml"));
        Scene scene = new Scene(root, 320, 420);
        scene.getStylesheets().add("/resources/css/designation.css");
        stage.setTitle("New Designation");
        stage.setResizable(false);
        stage.centerOnScreen();
        stage.getIcons().add(new Image("/resources/icons/designation.png"));
        stage.setWidth(320);
        stage.setHeight(420);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void addBenefitsAndFacilities() throws IOException {
        stage = new Stage();
        AnchorPane root = FXMLLoader.load(getClass().getResource("/octopushr/organization/benefitsAndFacilities.fxml"));
        Scene scene = new Scene(root, 715, 400);
        scene.getStylesheets().add("/resources/css/benefitsandfacilities.css");
        stage.setTitle("Benefits and Facilities");
        stage.setResizable(false);
        stage.centerOnScreen();
        stage.getIcons().add(new Image("/resources/icons/facilities.png"));
        stage.setWidth(715);
        stage.setHeight(400);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void organisationalCalendar() throws IOException {
        stage = new Stage();
        AnchorPane root = FXMLLoader.load(getClass().getResource("/octopushr/organization/organisationalCalendar.fxml"));
        Scene scene = new Scene(root, 1380, 840);
        scene.getStylesheets().add("/resources/css/organisationalcalendar.css");
        stage.setTitle("Organisational Calendar");
        stage.setResizable(false);
        stage.getIcons().add(new Image("/resources/icons/facilities.png"));
        stage.centerOnScreen();
        stage.setFullScreen(true);
        stage.setFullScreenExitHint("Press Esc to exit Organisation Calendar View");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void employeeCalendar() throws IOException {
        stage = new Stage();
        AnchorPane root = FXMLLoader.load(getClass().getResource("/octopushr/employees/employeeCalendar.fxml"));
        Scene scene = new Scene(root);
        scene.getStylesheets().add("/resources/css/employeecalendar.css");
        stage.setTitle("Employee Calendar");
        stage.setResizable(false);
        stage.setFullScreen(true);
        stage.setFullScreenExitHint("Press Esc to exit Employee Leave Calendar View");
        stage.centerOnScreen();
        stage.setScene(scene);
        stage.show();
    }
//LEAVE_MENU

    @FXML
    public void addOrPunchLeave() throws IOException {
        stage = new Stage();
        AnchorPane root = FXMLLoader.load(getClass().getResource("/octopushr/leave/employeeLeaveApplication.fxml"));
        Scene scene = new Scene(root);
        scene.getStylesheets().add("/resources/css/employeeleaveapplication.css");
        stage.setTitle("Employee Leave Application");
        stage.setResizable(false);
        stage.centerOnScreen();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void addSkills() throws IOException {
        stage = new Stage();
        AnchorPane root = FXMLLoader.load(getClass().getResource("/octopushr/leave/employeeLeaveTypes.fxml"));
        Scene scene = new Scene(root);
        scene.getStylesheets().add("/resources/css/employeeleavetypes.css");
        stage.setTitle("Leave Types");
        stage.setResizable(false);
        stage.centerOnScreen();
        stage.setScene(scene);
        stage.showAndWait();
    }

    //CONFIG_AND_SETTINGS
    @FXML
    public void showSecuritySettings() throws IOException {
        stage = new Stage();
        AnchorPane root = FXMLLoader.load(getClass().getResource("/octopushr/configAndSettings/securitySettings.fxml"));
        Scene scene = new Scene(root, 1000, 500);
        scene.getStylesheets().add("/resources/css/securitysettings.css");
        stage.setTitle("Security Settings");
        stage.setAlwaysOnTop(true);
        stage.setResizable(false);
        stage.centerOnScreen();
        stage.setWidth(1000);
        stage.setHeight(500);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void showConfigureEmail() throws IOException {
        stage = new Stage();
        AnchorPane root = FXMLLoader.load(getClass().getResource("/octopushr/configAndSettings/configureEmail.fxml"));
        Scene scene = new Scene(root, 1000, 700);
        scene.getStylesheets().add("/resources/css/configureemail.css");
        stage.setTitle("Configure Email");
        stage.setAlwaysOnTop(true);
        stage.setResizable(false);
        stage.centerOnScreen();
        stage.setWidth(1000);
        stage.setHeight(700);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void showShadowValue() {

    }

    @FXML
    public void closeMain(Event event) {
        functions.closeWindow(event);
        Platform.exit();

    }

//MAIN_STAGE
    @FXML
    public void showDeactivateEmployees() throws IOException {
        stage = new Stage();
        AnchorPane root = FXMLLoader.load(getClass().getResource("/octopushr/employees/viewEmployeeDetails.fxml"));
        Scene scene = new Scene(root);
        scene.getStylesheets().add("/resources/css/viewemployeedetails.css");
        stage.setTitle("View Employee Details");
        stage.setResizable(false);
        stage.centerOnScreen();
        stage.setFullScreen(true);
        stage.setWidth(1700);
        stage.setHeight(900);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void showEmployeeList() throws IOException {
        stage = new Stage();
        AnchorPane root = FXMLLoader.load(getClass().getResource("/octopushr/employees/employeeList.fxml"));
        Scene scene = new Scene(root);
        scene.getStylesheets().add("/resources/css/employeelist.css");
        stage.setTitle("Employee List");
        stage.setResizable(false);
        stage.centerOnScreen();
        stage.setWidth(795);
        stage.setHeight(510);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void addNewUser() throws IOException {

        stage = new Stage();
        AnchorPane root = FXMLLoader.load(getClass().getResource("/octopushr/file/addUser.fxml"));
        Scene scene = new Scene(root, 690, 400);
        scene.getStylesheets().add("/resources/css/adduser.css");
        stage.setTitle("Add User");
        stage.setAlwaysOnTop(false);
        stage.setResizable(false);
        stage.centerOnScreen();
        stage.setWidth(690);
        stage.setHeight(400);
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    public void viewUsers() throws IOException {

        stage = new Stage();
        AnchorPane root = FXMLLoader.load(getClass().getResource("/octopushr/audittrails/auditcentre.fxml"));
        Scene scene = new Scene(root);
        scene.getStylesheets().add("/resources/css/auditcentre.css");
        stage.setTitle("Audit Centre");
//        stage.setResizable(false);
        stage.centerOnScreen();
        stage.setWidth(1300);
        stage.setHeight(830);
        stage.setScene(scene);
        stage.showAndWait();

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now)); //2016/11/16 12:08:43
        lblDate.setText(String.valueOf(dtf.format(now)));
        lblAdminDashboard.setText("Admin Dashboard \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tMonthly Analysis");
//        anchorRoot.setPrefSize(this.stage.getWidth(), this.stage.getHeight());

        ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList(new PieChart.Data("On-time", 75),
                new PieChart.Data("Late", 8),
                new PieChart.Data("Absent", 10),
                new PieChart.Data("Not Reported", 3),
                new PieChart.Data("Stopped Attending", 4));
        pieChart1.setData(pieChartData);
        ObservableList<PieChart.Data> pieChartData2 = FXCollections.observableArrayList(new PieChart.Data("Personal", 35),
                new PieChart.Data("Fmla", 8),
                new PieChart.Data("Military", 10),
                new PieChart.Data("Public holidays", 13),
                new PieChart.Data("Maternity", 4),
                new PieChart.Data("Sick", 35),
                new PieChart.Data("Adverse Weather", 3),
                new PieChart.Data("Voting", 2)
        );
        pieChart2.setData(pieChartData2);
        pieChart2.labelsVisibleProperty().setValue(Boolean.FALSE);
        ObservableList<PieChart.Data> pieChartData3 = FXCollections.observableArrayList(new PieChart.Data("Certifications", 9),
                new PieChart.Data("Workshops", 8),
                new PieChart.Data("Skills Training", 25),
                new PieChart.Data("Team Training", 13),
                new PieChart.Data("Safety Training", 35),
                new PieChart.Data("Managerial Training", 10)
        );
        pieChart3.setData(pieChartData3);
        pieChart3.labelsVisibleProperty().setValue(Boolean.FALSE);
        ObservableList<PieChart.Data> pieChartData4 = FXCollections.observableArrayList(new PieChart.Data("Package Holiday", 13),
                new PieChart.Data("Group Tour", 5),
                new PieChart.Data("Event Travel", 7),
                new PieChart.Data("Business Travel", 60),
                new PieChart.Data("Long Term Slow Travel", 10),
                new PieChart.Data("Volunteer Travel", 5)
        );
        pieChart4.setData(pieChartData4);
        pieChart4.labelsVisibleProperty().setValue(Boolean.FALSE);

        //setting up a sBarChart for employees
        XYChart.Series seriessbE = new XYChart.Series();
        XYChart.Series seriessbE1 = new XYChart.Series();
        XYChart.Series seriessbE2 = new XYChart.Series();
        XYChart.Series seriessbE3 = new XYChart.Series();

        seriessbE.getData().addAll(
                new XYChart.Data("Jan", 2),
                new XYChart.Data("Feb", 4),
                new XYChart.Data("Mar", 6),
                new XYChart.Data("Apr", 3),
                new XYChart.Data("May", 10),
                new XYChart.Data("Jun", 4),
                new XYChart.Data("Jul", 15),
                new XYChart.Data("Aug", 17),
                new XYChart.Data("Sep", 19),
                new XYChart.Data("Oct", 15),
                new XYChart.Data("Nov", 22),
                new XYChart.Data("Dec", 25)
        );

        seriessbE1.getData().addAll(
                new XYChart.Data("Jan", 0),
                new XYChart.Data("Feb", 40),
                new XYChart.Data("Mar", 16),
                new XYChart.Data("Apr", 31),
                new XYChart.Data("May", 11),
                new XYChart.Data("Jun", 14),
                new XYChart.Data("Jul", 50),
                new XYChart.Data("Aug", 17),
                new XYChart.Data("Sep", 29),
                new XYChart.Data("Oct", 45),
                new XYChart.Data("Nov", 23),
                new XYChart.Data("Dec", 35)
        );

        seriessbE2.getData().addAll(
                new XYChart.Data("Jan", 2),
                new XYChart.Data("Feb", 14),
                new XYChart.Data("Mar", 26),
                new XYChart.Data("Apr", 13),
                new XYChart.Data("May", 21),
                new XYChart.Data("Jun", 24),
                new XYChart.Data("Jul", 50),
                new XYChart.Data("Aug", 27),
                new XYChart.Data("Sep", 29),
                new XYChart.Data("Oct", 40),
                new XYChart.Data("Nov", 23),
                new XYChart.Data("Dec", 30)
        );
        seriessbE3.getData().addAll(
                new XYChart.Data("Jan", 2),
                new XYChart.Data("Feb", 20),
                new XYChart.Data("Mar", 36),
                new XYChart.Data("Apr", 11),
                new XYChart.Data("May", 19),
                new XYChart.Data("Jun", 12),
                new XYChart.Data("Jul", 35),
                new XYChart.Data("Aug", 27),
                new XYChart.Data("Sep", 19),
                new XYChart.Data("Oct", 25),
                new XYChart.Data("Nov", 13),
                new XYChart.Data("Dec", 45)
        );
        seriessbE.setName("2013");
        seriessbE1.setName("2014");
        seriessbE2.setName("2015");
        seriessbE3.setName("2016");
        // sbcPerformanceValueGraph.getData().addAll(seriessbE, seriessbE1, seriessbE2, seriessbE3);

        //setting up a lineChart for contracts
        XYChart.Series serieslC = new XYChart.Series();
        XYChart.Series serieslC1 = new XYChart.Series();
        XYChart.Series serieslC2 = new XYChart.Series();
        XYChart.Series serieslC3 = new XYChart.Series();

        serieslC.getData().addAll(new XYChart.Data("Jan", 2),
                new XYChart.Data("Feb", 4),
                new XYChart.Data("Mar", 6),
                new XYChart.Data("Apr", 3),
                new XYChart.Data("May", 10),
                new XYChart.Data("Jun", 4),
                new XYChart.Data("Jul", 15),
                new XYChart.Data("Aug", 5),
                new XYChart.Data("Sep", 19),
                new XYChart.Data("Oct", 15),
                new XYChart.Data("Nov", 22),
                new XYChart.Data("Dec", 25)
        );
        serieslC1.getData().addAll(
                new XYChart.Data("Jan", 0),
                new XYChart.Data("Feb", 2),
                new XYChart.Data("Mar", 16),
                new XYChart.Data("Apr", 13),
                new XYChart.Data("May", 20),
                new XYChart.Data("Jun", 40),
                new XYChart.Data("Jul", 15),
                new XYChart.Data("Aug", 20),
                new XYChart.Data("Sep", 19),
                new XYChart.Data("Oct", 14),
                new XYChart.Data("Nov", 45),
                new XYChart.Data("Dec", 25)
        );
        serieslC2.getData().addAll(
                new XYChart.Data("Jan", 0),
                new XYChart.Data("Feb", 10),
                new XYChart.Data("Mar", 26),
                new XYChart.Data("Apr", 19),
                new XYChart.Data("May", 36),
                new XYChart.Data("Jun", 24),
                new XYChart.Data("Jul", 15),
                new XYChart.Data("Aug", 45),
                new XYChart.Data("Sep", 19),
                new XYChart.Data("Oct", 25),
                new XYChart.Data("Nov", 35),
                new XYChart.Data("Dec", 47)
        );
        serieslC3.getData().addAll(
                new XYChart.Data("Jan", 0),
                new XYChart.Data("Feb", 5),
                new XYChart.Data("Mar", 12),
                new XYChart.Data("Apr", 23),
                new XYChart.Data("May", 15),
                new XYChart.Data("Jun", 28),
                new XYChart.Data("Jul", 15),
                new XYChart.Data("Aug", 15),
                new XYChart.Data("Sep", 19),
                new XYChart.Data("Oct", 30),
                new XYChart.Data("Nov", 22),
                new XYChart.Data("Dec", 50)
        );
        serieslC.setName("2013");
        serieslC1.setName("2014");
        serieslC2.setName("2015");
        serieslC3.setName("2016");
        XYChart.Series serieslClineChart2 = new XYChart.Series();
        XYChart.Series serieslC1lineChart2 = new XYChart.Series();
        XYChart.Series serieslC2lineChart2 = new XYChart.Series();
        XYChart.Series serieslC3lineChart2 = new XYChart.Series();

        serieslClineChart2.getData().addAll(new XYChart.Data("Jan", 2),
                new XYChart.Data("Feb", 4),
                new XYChart.Data("Mar", 6),
                new XYChart.Data("Apr", 3),
                new XYChart.Data("May", 10),
                new XYChart.Data("Jun", 4),
                new XYChart.Data("Jul", 15),
                new XYChart.Data("Aug", 17),
                new XYChart.Data("Sep", 19),
                new XYChart.Data("Oct", 15),
                new XYChart.Data("Nov", 22),
                new XYChart.Data("Dec", 25)
        );
        serieslC1lineChart2.getData().addAll(
                new XYChart.Data("Jan", 45),
                new XYChart.Data("Feb", 2),
                new XYChart.Data("Mar", 16),
                new XYChart.Data("Apr", 13),
                new XYChart.Data("May", 20),
                new XYChart.Data("Jun", 40),
                new XYChart.Data("Jul", 15),
                new XYChart.Data("Aug", 27),
                new XYChart.Data("Sep", 19),
                new XYChart.Data("Oct", 14),
                new XYChart.Data("Nov", 45),
                new XYChart.Data("Dec", 25)
        );
        serieslC2lineChart2.getData().addAll(
                new XYChart.Data("Jan", 0),
                new XYChart.Data("Feb", 10),
                new XYChart.Data("Mar", 26),
                new XYChart.Data("Apr", 19),
                new XYChart.Data("May", 36),
                new XYChart.Data("Jun", 24),
                new XYChart.Data("Jul", 15),
                new XYChart.Data("Aug", 12),
                new XYChart.Data("Sep", 19),
                new XYChart.Data("Oct", 25),
                new XYChart.Data("Nov", 35),
                new XYChart.Data("Dec", 3)
        );
        serieslC3lineChart2.getData().addAll(
                new XYChart.Data("Jan", 25),
                new XYChart.Data("Feb", 5),
                new XYChart.Data("Mar", 12),
                new XYChart.Data("Apr", 23),
                new XYChart.Data("May", 15),
                new XYChart.Data("Jun", 28),
                new XYChart.Data("Jul", 15),
                new XYChart.Data("Aug", 25),
                new XYChart.Data("Sep", 19),
                new XYChart.Data("Oct", 30),
                new XYChart.Data("Nov", 22),
                new XYChart.Data("Dec", 21)
        );
        serieslClineChart2.setName("2013");
        serieslC1lineChart2.setName("2014");
        serieslC2lineChart2.setName("2015");
        serieslC3lineChart2.setName("2016");
        XYChart.Series serieslClineChart3 = new XYChart.Series();
        XYChart.Series serieslC1lineChart3 = new XYChart.Series();
        XYChart.Series serieslC2lineChart3 = new XYChart.Series();
        XYChart.Series serieslC3lineChart3 = new XYChart.Series();

        serieslClineChart3.getData().addAll(new XYChart.Data("Jan", 2),
                new XYChart.Data("Feb", 4),
                new XYChart.Data("Mar", 6),
                new XYChart.Data("Apr", 3),
                new XYChart.Data("May", 10),
                new XYChart.Data("Jun", 4),
                new XYChart.Data("Jul", 13),
                new XYChart.Data("Aug", 17),
                new XYChart.Data("Sep", 19),
                new XYChart.Data("Oct", 15),
                new XYChart.Data("Nov", 22),
                new XYChart.Data("Dec", 25)
        );
        serieslC1lineChart3.getData().addAll(
                new XYChart.Data("Jan", 0),
                new XYChart.Data("Feb", 2),
                new XYChart.Data("Mar", 16),
                new XYChart.Data("Apr", 13),
                new XYChart.Data("May", 20),
                new XYChart.Data("Jun", 40),
                new XYChart.Data("Jul", 47),
                new XYChart.Data("Aug", 27),
                new XYChart.Data("Sep", 19),
                new XYChart.Data("Oct", 14),
                new XYChart.Data("Nov", 45),
                new XYChart.Data("Dec", 25)
        );
        serieslC2lineChart3.getData().addAll(
                new XYChart.Data("Jan", 0),
                new XYChart.Data("Feb", 10),
                new XYChart.Data("Mar", 26),
                new XYChart.Data("Apr", 19),
                new XYChart.Data("May", 36),
                new XYChart.Data("Jun", 24),
                new XYChart.Data("Jul", 10),
                new XYChart.Data("Aug", 45),
                new XYChart.Data("Sep", 19),
                new XYChart.Data("Oct", 25),
                new XYChart.Data("Nov", 35),
                new XYChart.Data("Dec", 47)
        );
        serieslC3lineChart3.getData().addAll(
                new XYChart.Data("Jan", 0),
                new XYChart.Data("Feb", 5),
                new XYChart.Data("Mar", 12),
                new XYChart.Data("Apr", 23),
                new XYChart.Data("May", 15),
                new XYChart.Data("Jun", 28),
                new XYChart.Data("Jul", 70),
                new XYChart.Data("Aug", 25),
                new XYChart.Data("Sep", 19),
                new XYChart.Data("Oct", 30),
                new XYChart.Data("Nov", 22),
                new XYChart.Data("Dec", 25)
        );
        serieslClineChart3.setName("2013");
        serieslC1lineChart3.setName("2014");
        serieslC2lineChart3.setName("2015");
        serieslC3lineChart3.setName("2016");
        XYChart.Series serieslClineChart4 = new XYChart.Series();
        XYChart.Series serieslC1lineChart4 = new XYChart.Series();
        XYChart.Series serieslC2lineChart4 = new XYChart.Series();
        XYChart.Series serieslC3lineChart4 = new XYChart.Series();

        serieslClineChart4.getData().addAll(new XYChart.Data("Jan", 2),
                new XYChart.Data("Feb", 4),
                new XYChart.Data("Mar", 6),
                new XYChart.Data("Apr", 3),
                new XYChart.Data("May", 10),
                new XYChart.Data("Jun", 4),
                new XYChart.Data("Jul", 15),
                new XYChart.Data("Aug", 17),
                new XYChart.Data("Sep", 19),
                new XYChart.Data("Oct", 15),
                new XYChart.Data("Nov", 22),
                new XYChart.Data("Dec", 45)
        );
        serieslC1lineChart4.getData().addAll(
                new XYChart.Data("Jan", 0),
                new XYChart.Data("Feb", 2),
                new XYChart.Data("Mar", 16),
                new XYChart.Data("Apr", 13),
                new XYChart.Data("May", 20),
                new XYChart.Data("Jun", 40),
                new XYChart.Data("Jul", 15),
                new XYChart.Data("Aug", 27),
                new XYChart.Data("Sep", 19),
                new XYChart.Data("Oct", 14),
                new XYChart.Data("Nov", 45),
                new XYChart.Data("Dec", 25)
        );
        serieslC2lineChart4.getData().addAll(
                new XYChart.Data("Jan", 0),
                new XYChart.Data("Feb", 10),
                new XYChart.Data("Mar", 26),
                new XYChart.Data("Apr", 19),
                new XYChart.Data("May", 36),
                new XYChart.Data("Jun", 24),
                new XYChart.Data("Jul", 15),
                new XYChart.Data("Aug", 12),
                new XYChart.Data("Sep", 19),
                new XYChart.Data("Oct", 25),
                new XYChart.Data("Nov", 35),
                new XYChart.Data("Dec", 90)
        );
        serieslC3lineChart4.getData().addAll(
                new XYChart.Data("Jan", 0),
                new XYChart.Data("Feb", 5),
                new XYChart.Data("Mar", 12),
                new XYChart.Data("Apr", 23),
                new XYChart.Data("May", 15),
                new XYChart.Data("Jun", 28),
                new XYChart.Data("Jul", 15),
                new XYChart.Data("Aug", 25),
                new XYChart.Data("Sep", 19),
                new XYChart.Data("Oct", 30),
                new XYChart.Data("Nov", 22),
                new XYChart.Data("Dec", 3)
        );
        serieslClineChart4.setName("2013");
        serieslC1lineChart4.setName("2014");
        serieslC2lineChart4.setName("2015");
        serieslC3lineChart4.setName("2016");
        lineChart1.getData().addAll(serieslC, serieslC1, serieslC2, serieslC3);
        lineChart2.getData().addAll(serieslClineChart2, serieslC1lineChart2, serieslC2lineChart2, serieslC3lineChart2);
        lineChart3.getData().addAll(serieslClineChart3, serieslC1lineChart3, serieslC2lineChart3, serieslC3lineChart3);
        lineChart4.getData().addAll(serieslClineChart4, serieslC1lineChart4, serieslC2lineChart4, serieslC3lineChart4);

        //Setting the organisation icon on menuItem
        Image orgIcon = new Image(getClass().getResourceAsStream("/resources/icons/company.png"));
        ImageView orgView = new ImageView(orgIcon);
        orgView.setFitWidth(20);
        orgView.setFitHeight(20);
        addOrg.setGraphic(orgView);//setting the organisation icon to menuItem organisation

        //Setting the new employee icon on menuItem
        Image newEmpIcon = new Image(getClass().getResourceAsStream("/resources/icons/employee.png"));
        ImageView newEmpView = new ImageView(newEmpIcon);
        newEmpView.setFitWidth(20);
        newEmpView.setFitHeight(20);
        newEmp.setGraphic(newEmpView);//setting the new employee icon to menuItem new employee

        //Setting the hrm icon on menuItem
        Image hrOutIcon = new Image(getClass().getResourceAsStream("/resources/icons/hrm.jpg"));
        ImageView hrOutView = new ImageView(hrOutIcon);
        hrOutView.setFitWidth(20);
        hrOutView.setFitHeight(20);
        hrOutlook.setGraphic(hrOutView);//setting the hrm icon to menuItem hrOutlook

        //Setting the empDoc icon on menuItem
        Image empDocIcon = new Image(getClass().getResourceAsStream("/resources/icons/document-icon.png"));
        ImageView empDocView = new ImageView(empDocIcon);
        empDocView.setFitWidth(20);
        empDocView.setFitHeight(20);
        empDoc.setGraphic(empDocView);//setting the empDoc icon to menuItem employee documents

        //Setting the comDoc icon on menuItem
        Image comDocIcon = new Image(getClass().getResourceAsStream("/resources/icons/company-documents.png"));
        ImageView comDocView = new ImageView(comDocIcon);
        comDocView.setFitWidth(20);
        comDocView.setFitHeight(20);
        comDoc.setGraphic(comDocView);//setting the comDoc icon to menuItem company documents

        //Setting the empLeave icon on menuItem
        Image empLeaveIcon = new Image(getClass().getResourceAsStream("/resources/icons/leave-a-message.png"));
        ImageView empLeaveView = new ImageView(empLeaveIcon);
        empLeaveView.setFitWidth(20);
        empLeaveView.setFitHeight(20);
        empLeave.setGraphic(empLeaveView);//setting the empLeave icon to menuItem employee leave

        //Setting the payroll icon on menuItem
        ImageView payrollView = new ImageView(new Image(getClass().getResourceAsStream("/resources/icons/payroll.png")));
        payrollView.setFitWidth(20);
        payrollView.setFitHeight(20);
        payroll.setGraphic(payrollView);//setting the payroll icon to menuItem payroll

        //Setting the training icon on menuItem
        Image trainingIcon = new Image(getClass().getResourceAsStream("/resources/icons/trainings.png"));
        ImageView trainingView = new ImageView(trainingIcon);
        trainingView.setFitWidth(20);
        trainingView.setFitHeight(20);
        training.setGraphic(trainingView);//setting the training icon to menuItem training

        //Setting the recruit icon on menuItem
        Image recruitIcon = new Image(getClass().getResourceAsStream("/resources/icons/recruit.png"));
        ImageView recruitView = new ImageView(recruitIcon);
        recruitView.setFitWidth(20);
        recruitView.setFitHeight(20);
        recruit.setGraphic(recruitView);//setting the recruit icon to menuItem recruit

        //Setting the scheduleTrav icon on menuItem
        Image scheduleTravIcon = new Image(getClass().getResourceAsStream("/resources/icons/travel.png"));
        ImageView scheduleTravView = new ImageView(scheduleTravIcon);
        scheduleTravView.setFitWidth(20);
        scheduleTravView.setFitHeight(20);
        scheduleTrav.setGraphic(scheduleTravView);//setting the scheduleTrav icon to menuItem scheduleTravel

        //Setting the perform icon on menuItem
        Image performIcon = new Image(getClass().getResourceAsStream("/resources/icons/performance.png"));
        ImageView performView = new ImageView(performIcon);
        performView.setFitWidth(20);
        performView.setFitHeight(20);
        perform.setGraphic(performView);//setting the training icon to menuItem training

        //Setting the compliance-and-legal icon on menuItem
        Image complNlegalIcon = new Image(getClass().getResourceAsStream("/resources/icons/compliance-and-legal.png"));
        ImageView complNlegalView = new ImageView(complNlegalIcon);
        complNlegalView.setFitWidth(20);
        complNlegalView.setFitHeight(20);
        complNleg.setGraphic(complNlegalView);//setting the compliance-and-legal icon to menuItem compliance-and-legal

        //Setting the activateNow icon on menuItem
        Image activateNowIcon = new Image(getClass().getResourceAsStream("/resources/icons/activateNow.png"));
        ImageView activateNowView = new ImageView(activateNowIcon);
        activateNowView.setFitWidth(20);
        activateNowView.setFitHeight(20);
        activateNow.setGraphic(activateNowView);//setting the activateNow icon to menuItem activateNow

        //Setting the menuItems of the menu organisation
        //add the addorganisation icon
        Image addOrgIcon = new Image(getClass().getResourceAsStream("/resources/icons/add org.png"));
        ImageView addOrgView = new ImageView(addOrgIcon);
        addOrgView.setFitWidth(20);
        addOrgView.setFitHeight(20);
        addViewOrg.setGraphic(addOrgView);//setting the addorganisation icon to menuItem add organisation

        //add the department icon
        Image departmentIcon = new Image(getClass().getResourceAsStream("/resources/icons/department.png"));
        ImageView departmentView = new ImageView(departmentIcon);
        departmentView.setFitWidth(20);
        departmentView.setFitHeight(20);
        dep.setGraphic(departmentView);//setting the department icon to menuItem department

        //add designation icon
        Image designationIcon = new Image(getClass().getResourceAsStream("/resources/icons/designation.png"));
        ImageView designationView = new ImageView(designationIcon);
        designationView.setFitWidth(20);
        designationView.setFitHeight(20);
        desig.setGraphic(designationView);//setting the desig icon to menuItem designation

        //add the benefitsAndFacilities icon
        Image benNfacIcon = new Image(getClass().getResourceAsStream("/resources/icons/benefits-and-facilities.png"));
        ImageView benNfacView = new ImageView(benNfacIcon);
        benNfacView.setFitWidth(20);
        benNfacView.setFitHeight(20);
        benNfac.setGraphic(benNfacView);//setting the benefitsAndFacilities icon to menuItem benefits & Facilities

        //add the calendar icon
        Image calendarIcon = new Image(getClass().getResourceAsStream("/resources/icons/calendar.jpg"));
        ImageView calendarView = new ImageView(calendarIcon);
        calendarView.setFitWidth(20);
        calendarView.setFitHeight(20);
        calendar.setGraphic(calendarView);//setting the calendar icon to menuItem calendar

        //add the empCal icon
        Image empCalIcon = new Image(getClass().getResourceAsStream("/resources/icons/employee-calendar.jpg"));
        ImageView empCalView = new ImageView(empCalIcon);
        empCalView.setFitWidth(20);
        empCalView.setFitHeight(20);
        empCal.setGraphic(empCalView);//setting the calendar icon to menuItem calendar

        //Setting up the menuItems of Employee menu
        //add the newEmpl icon
        Image newEmplIcon = new Image(getClass().getResourceAsStream("/resources/icons/employee.png"));
        ImageView newEmplView = new ImageView(newEmplIcon);
        newEmplView.setFitWidth(20);
        newEmplView.setFitHeight(20);//employee-list.jpg
        newEmpl.setGraphic(newEmplView);//setting the newEmp to menuItem new Employee

        //add the empList icon
        Image empListIcon = new Image(getClass().getResourceAsStream("/resources/icons/employee-list.jpg"));
        ImageView empListView = new ImageView(empListIcon);
        empListView.setFitWidth(20);
        empListView.setFitHeight(20);
        empList.setGraphic(empListView);//setting the empList to menuItem Employee List

        //add the uploadEmp icon
        Image uploadEmpIcon = new Image(getClass().getResourceAsStream("/resources/icons/upload-employees.png"));
        ImageView uploadEmpView = new ImageView(uploadEmpIcon);
        uploadEmpView.setFitWidth(20);
        uploadEmpView.setFitHeight(20);
        uploadEmp.setGraphic(uploadEmpView);//setting the uploadEmp to menuItem upload Employee 

        //add the addLeaveDetails icon
        Image addLeaveDetailsIcon = new Image(getClass().getResourceAsStream("/resources/icons/add-leave-details.jpg"));
        ImageView addLeaveDetailsView = new ImageView(addLeaveDetailsIcon);
        addLeaveDetailsView.setFitWidth(20);
        addLeaveDetailsView.setFitHeight(20);
        addLeaveDetails.setGraphic(addLeaveDetailsView);//setting the addLeaveDetails to menuItem Add Leave Details 

        //add the depHist icon
        Image depHistIcon = new Image(getClass().getResourceAsStream("/resources/icons/department-history.png"));
        ImageView depHistView = new ImageView(depHistIcon);
        depHistView.setFitWidth(20);
        depHistView.setFitHeight(20);
        depHist.setGraphic(depHistView);//setting the uploadEmp to menuItem upload Employee 

        //add the proHist icon
        Image proHistIcon = new Image(getClass().getResourceAsStream("/resources/icons/promotions.png"));
        ImageView proHistView = new ImageView(proHistIcon);
        proHistView.setFitWidth(20);
        proHistView.setFitHeight(20);
        proHist.setGraphic(proHistView);//setting the proHist to menuItem promotions or history

        //add the doc icon
        Image docIcon = new Image(getClass().getResourceAsStream("/resources/icons/add-leave-details.jpg"));
        ImageView docView = new ImageView(docIcon);
        docView.setFitWidth(20);
        docView.setFitHeight(20);
        doc.setGraphic(docView);//setting the addLeaveDetails to menuItem Add Leave Details 

        //add the perf icon
        Image perfIcon = new Image(getClass().getResourceAsStream("/resources/icons/performance.png"));
        ImageView perfView = new ImageView(perfIcon);
        perfView.setFitWidth(20);
        perfView.setFitHeight(20);
        perf.setGraphic(perfView);//setting the perf to menuItem performance

        //add the disc icon
        Image discIcon = new Image(getClass().getResourceAsStream("/resources/icons/disciplinary.png"));
        ImageView discView = new ImageView(discIcon);
        discView.setFitWidth(20);
        discView.setFitHeight(20);
        disc.setGraphic(discView);//setting the disc to menuItem disciplinary
//<<<<<<< HEAD

        //documents
        //add the docTypes icon
        Image docTypesIcon = new Image(getClass().getResourceAsStream("/resources/icons/doc-types.png"));
        ImageView docsTypesView = new ImageView(docTypesIcon);
        docsTypesView.setFitWidth(20);
        docsTypesView.setFitHeight(20);
        docTypes.setGraphic(docsTypesView);//setting the disc to menuItem disciplinary

        //documents
        //add the employee documents icon
        Image employeeDocsIcon = new Image(getClass().getResourceAsStream("/resources/icons/employee-documents.png"));
        ImageView employeeDocsView = new ImageView(employeeDocsIcon);
        employeeDocsView.setFitWidth(20);
        employeeDocsView.setFitHeight(20);
        empDocs.setGraphic(employeeDocsView);//setting the disc to menuItem disciplinary

        //documents
        //add the company documents icon
        Image companyDocsIcon = new Image(getClass().getResourceAsStream("/resources/icons/company-documents1.png"));
        ImageView companyDocsView = new ImageView(companyDocsIcon);
        companyDocsView.setFitWidth(20);
        companyDocsView.setFitHeight(20);
        comDocs.setGraphic(companyDocsView);//setting the disc to menuItem disciplinary

        //documents
        //add the external documents icon
        Image externalDocsIcon = new Image(getClass().getResourceAsStream("/resources/icons/external-documents.png"));
        ImageView externalDocsView = new ImageView(externalDocsIcon);
        externalDocsView.setFitWidth(20);
        externalDocsView.setFitHeight(20);
        exteDocs.setGraphic(externalDocsView);//setting the disc to menuItem disciplinary

        //documents
        //add the reference documents icon
        Image referenceDocsIcon = new Image(getClass().getResourceAsStream("/resources/icons/reference-documents.png"));
        ImageView referenceDocsView = new ImageView(referenceDocsIcon);
        referenceDocsView.setFitWidth(20);
        referenceDocsView.setFitHeight(20);
        refDocs.setGraphic(referenceDocsView);//setting the disc to menuItem disciplinary

        //documents
        //add the expired documents icon
        Image expiredDocsIcon = new Image(getClass().getResourceAsStream("/resources/icons/expired-documents.png"));
        ImageView expiredDocsView = new ImageView(expiredDocsIcon);
        expiredDocsView.setFitWidth(20);
        expiredDocsView.setFitHeight(20);
        expDocs.setGraphic(expiredDocsView);//setting the disc to menuItem disciplinary

        //performance
        //add the performance icon
        Image performanceIcon = new Image(getClass().getResourceAsStream("/resources/icons/performamce1.png"));
        ImageView performanceView = new ImageView(performanceIcon);
        performanceView.setFitWidth(20);
        performanceView.setFitHeight(20);
        menuItemperfIntelligence.setGraphic(performanceView);//setting the disc to menuItem disciplinary/add-goal

        //performance
        //add the add-goal icon
        Image addGoalIcon = new Image(getClass().getResourceAsStream("/resources/icons/add-goal.png"));
        ImageView addGoalView = new ImageView(addGoalIcon);
        addGoalView.setFitWidth(20);
        addGoalView.setFitHeight(20);
        addGoal.setGraphic(addGoalView);//setting the disc to menuItem disciplinary/add-goal

        //performance
        //add the performance icon
        Image analysisIcon = new Image(getClass().getResourceAsStream("/resources/icons/analysis.png"));
        ImageView analysisView = new ImageView(analysisIcon);
        analysisView.setFitWidth(20);
        analysisView.setFitHeight(20);
        analyseGoalEffort.setGraphic(analysisView);//setting the disc to menuItem disciplinary/add-goal

        //performance
        //add the performance icon
        Image organizationIcon = new Image(getClass().getResourceAsStream("/resources/icons/organization.png"));
        ImageView organizationView = new ImageView(organizationIcon);
        organizationView.setFitWidth(20);
        organizationView.setFitHeight(20);
        orgPerf.setGraphic(organizationView);//setting the disc to menuItem disciplinary/add-goal

        //performance
        //add the performance icon
        Image organizationImIcon = new Image(getClass().getResourceAsStream("/resources/icons/improvement.png"));
        ImageView organizationImView = new ImageView(organizationImIcon);
        organizationImView.setFitWidth(20);
        organizationImView.setFitHeight(20);
        orgImprovement.setGraphic(organizationImView);//setting the disc to menuItem disciplinary/add-goal

        //payroll
        //add the payrollSettings icon
        Image payrollSettingsIcon = new Image(getClass().getResourceAsStream("/resources/icons/pay-settings.png"));
        ImageView payrollSettingsView = new ImageView(payrollSettingsIcon);
        payrollSettingsView.setFitWidth(20);
        payrollSettingsView.setFitHeight(20);
        paySettings.setGraphic(payrollSettingsView);//setting the disc to menuItem disciplinary/add-goal

        //payroll
        //add the payrollStructure icon
        Image payrollStructureIcon = new Image(getClass().getResourceAsStream("/resources/icons/salary-structure.png"));
        ImageView payrollStructureView = new ImageView(payrollStructureIcon);
        payrollStructureView.setFitWidth(20);
        payrollStructureView.setFitHeight(20);
        payStruct.setGraphic(payrollStructureView);//setting the disc to menuItem disciplinary/add-goal

        //payroll
        //add the payslip icon
        Image payslipIcon = new Image(getClass().getResourceAsStream("/resources/icons/payslip.png"));
        ImageView payslipView = new ImageView(payslipIcon);
        payslipView.setFitWidth(20);
        payslipView.setFitHeight(20);
        paySal.setGraphic(payslipView);//setting the disc to menuItem disciplinary/add-goal

        //payroll
        //add the wagesAndBilling icon
        Image wagesAndBillingIcon = new Image(getClass().getResourceAsStream("/resources/icons/billing.png"));
        ImageView wagesAndBillingView = new ImageView(wagesAndBillingIcon);
        wagesAndBillingView.setFitWidth(20);
        wagesAndBillingView.setFitHeight(20);
        wagesAndBilling.setGraphic(wagesAndBillingView);//setting the disc to menuItem disciplinary/add-goal

        //payroll
        //add the salaryHistory icon
        Image salaryHistoryIcon = new Image(getClass().getResourceAsStream("/resources/icons/salary-history.png"));
        ImageView salaryHistoryView = new ImageView(salaryHistoryIcon);
        salaryHistoryView.setFitWidth(20);
        salaryHistoryView.setFitHeight(20);
        salHist.setGraphic(salaryHistoryView);//setting the disc to menuItem disciplinary/add-goal

        //payroll
        //add the loanAndAdvances icon
        Image loanAndAdvancesIcon = new Image(getClass().getResourceAsStream("/resources/icons/loan.png"));
        ImageView loanAndAdvancesView = new ImageView(loanAndAdvancesIcon);
        loanAndAdvancesView.setFitWidth(20);
        loanAndAdvancesView.setFitHeight(20);
        loanAndAdvances.setGraphic(loanAndAdvancesView);//setting the disc to menuItem disciplinary/add-goal

        //payroll
        //add the bankSheet icon
        Image bankSheetIcon = new Image(getClass().getResourceAsStream("/resources/icons/bank-sheet.png"));
        ImageView bankSheetView = new ImageView(bankSheetIcon);
        bankSheetView.setFitWidth(20);
        bankSheetView.setFitHeight(20);
        bankSheet.setGraphic(bankSheetView);//setting the disc to menuItem disciplinary/add-goal

        //payroll
        //add the uploadPayrollAttendanceSheet icon
        Image uploadPayrollAttendanceIcon = new Image(getClass().getResourceAsStream("/resources/icons/upload.png"));
        ImageView uploadPayrollAttendanceView = new ImageView(uploadPayrollAttendanceIcon);
        uploadPayrollAttendanceView.setFitWidth(20);
        uploadPayrollAttendanceView.setFitHeight(20);
        uploadPayrollAttendance.setGraphic(uploadPayrollAttendanceView);//setting the disc to menuItem disciplinary/add-goal

        //payroll
        //add the advancePayroll icon
        Image advancePayrollIcon = new Image(getClass().getResourceAsStream("/resources/icons/advance-payrol.png"));
        ImageView advancePayrollView = new ImageView(advancePayrollIcon);
        advancePayrollView.setFitWidth(20);
        advancePayrollView.setFitHeight(20);
        advancePayroll.setGraphic(advancePayrollView);//setting the disc to menuItem disciplinary/add-goal

        //Attendance
        //add the empAttTimeSheet icon
        Image empAttTimeSheetIcon = new Image(getClass().getResourceAsStream("/resources/icons/sheet.png"));
        ImageView empAttTimeSheetView = new ImageView(empAttTimeSheetIcon);
        empAttTimeSheetView.setFitWidth(20);
        empAttTimeSheetView.setFitHeight(20);
        empAttTimeSheet.setGraphic(empAttTimeSheetView);//setting the disc to menuItem disciplinary/add-goal

        //Attendance
        //add the empAttendance icon
        Image empAttendanceIcon = new Image(getClass().getResourceAsStream("/resources/icons/attendance.png"));
        ImageView empAttendanceView = new ImageView(empAttendanceIcon);
        empAttendanceView.setFitWidth(20);
        empAttendanceView.setFitHeight(20);
        empAttendance.setGraphic(empAttendanceView);//setting the disc to menuItem disciplinary/add-goalorgCalAttendance

        //Attendance
        //add the orgCalAttendance icon
        Image orgCalAttendanceIcon = new Image(getClass().getResourceAsStream("/resources/icons/salary-structure.png"));
        ImageView orgCalAttendanceView = new ImageView(orgCalAttendanceIcon);
        orgCalAttendanceView.setFitWidth(20);
        orgCalAttendanceView.setFitHeight(20);
        orgCalAttendance.setGraphic(orgCalAttendanceView);//setting the disc to menuItem disciplinary/add-goalorgCalAttendanceempLeaveCal

        //Attendance
        //add the empLeaveCal icon
        Image empLeaveCalIcon = new Image(getClass().getResourceAsStream("/resources/icons/leave.png"));
        ImageView empLeaveCalView = new ImageView(empLeaveCalIcon);
        empLeaveCalView.setFitWidth(20);
        empLeaveCalView.setFitHeight(20);
        empLeaveCal.setGraphic(empLeaveCalView);//setting the disc to menuItem disciplinary/add-goalorgCalAttendanceempLeaveCal

        //Leave
        //add the punchApplyLeave icon
        Image punchApplyLeaveIcon = new Image(getClass().getResourceAsStream("/resources/icons/apply.png"));
        ImageView punchApplyLeaveView = new ImageView(punchApplyLeaveIcon);
        punchApplyLeaveView.setFitWidth(20);
        punchApplyLeaveView.setFitHeight(20);
        punchApplyLeave.setGraphic(punchApplyLeaveView);//setting the disc to menuItem disciplinary/add-goalorgCalAttendanceempLeaveCal//manage-application

        //Leave
        //add the approveManageLeave icon
        Image approveManageLeaveIcon = new Image(getClass().getResourceAsStream("/resources/icons/manage-application.png"));
        ImageView approveManageLeaveView = new ImageView(approveManageLeaveIcon);
        approveManageLeaveView.setFitWidth(20);
        approveManageLeaveView.setFitHeight(20);
        approveManageLeave.setGraphic(approveManageLeaveView);//setting the disc to menuItem disciplinary/add-goalorgCalAttendanceempLeaveCal//manage-application

        //Leave
        //add the leaveSettings icon
        Image leaveSettingsIcon = new Image(getClass().getResourceAsStream("/resources/icons/pay-settings.png"));
        ImageView leaveSettingsView = new ImageView(leaveSettingsIcon);
        leaveSettingsView.setFitWidth(20);
        leaveSettingsView.setFitHeight(20);
        leaveSettings.setGraphic(leaveSettingsView);//setting the disc to menuItem disciplinary/add-goalorgCalAttendanceempLeaveCal//manage-application

        //Leave
        //add the orgCalLeave icon
        Image orgCalLeaveIcon = new Image(getClass().getResourceAsStream("/resources/icons/organization.png"));
        ImageView orgCalLeaveView = new ImageView(orgCalLeaveIcon);
        orgCalLeaveView.setFitWidth(20);
        orgCalLeaveView.setFitHeight(20);
        orgCalLeave.setGraphic(orgCalLeaveView);//setting the disc to menuItem disciplinary/add-goalorgCalAttendanceempLeaveCal//manage-application

        //Leave
        //add the empCalLeave icon
        Image empCalLeaveIcon = new Image(getClass().getResourceAsStream("/resources/icons/view-calendar.png"));
        ImageView empCalLeaveView = new ImageView(empCalLeaveIcon);
        empCalLeaveView.setFitWidth(20);
        empCalLeaveView.setFitHeight(20);
        empCalLeave.setGraphic(empCalLeaveView);//setting the disc to menuItem disciplinary/add-goalorgCalAttendanceempLeaveCal//manage-application

        //Leave
        //add the empPerfLeave icon
        Image empPerfLeaveIcon = new Image(getClass().getResourceAsStream("/resources/icons/leave.png"));
        ImageView empPerfLeaveView = new ImageView(empPerfLeaveIcon);
        empPerfLeaveView.setFitWidth(20);
        empPerfLeaveView.setFitHeight(20);
        empPerfLeave.setGraphic(empPerfLeaveView);//setting the disc to menuItem disciplinary/add-goalorgCalAttendanceempLeaveCal//manage-application

        //Training
        //add the trainings icon
        Image trainingsIcon = new Image(getClass().getResourceAsStream("/resources/icons/trainings.png"));
        ImageView trainingsView = new ImageView(trainingsIcon);
        trainingsView.setFitWidth(20);
        trainingsView.setFitHeight(20);
        trainingItem.setGraphic(trainingsView);//setting the disc to menuItem disciplinary/add-goalorgCalAttendanceempLeaveCal//manage-application

        //Recruit
        //add the recruitment icon
        Image recruitmentIcon = new Image(getClass().getResourceAsStream("/resources/icons/recruitment.png"));
        ImageView recruitmentView = new ImageView(recruitmentIcon);
        recruitmentView.setFitWidth(20);
        recruitmentView.setFitHeight(20);
        recruitItem.setGraphic(recruitmentView);//setting the disc to menuItem disciplinary/add-goalorgCalAttendanceempLeaveCal//manage-application

        //Travel
        //add the travelAndSchedule icon
        Image travelAndScheduleIcon = new Image(getClass().getResourceAsStream("/resources/icons/travel.png"));
        ImageView travelAndScheduleView = new ImageView(travelAndScheduleIcon);
        travelAndScheduleView.setFitWidth(20);
        travelAndScheduleView.setFitHeight(20);
        travelschedule.setGraphic(travelAndScheduleView);//setting the disc to menuItem disciplinary/add-goalorgCalAttendanceempLeaveCal//manage-application

        //Report
        //add the deductionReport icon
        Image deductionReportIcon = new Image(getClass().getResourceAsStream("/resources/icons/deduction-report.png"));
        ImageView deductionReportView = new ImageView(deductionReportIcon);
        deductionReportView.setFitWidth(20);
        deductionReportView.setFitHeight(20);
        deductionReport.setGraphic(deductionReportView);//setting the disc to menuItem disciplinary/add-goalorgCalAttendanceempLeaveCal//manage-application

        //Report
        //add the dueSalaryReport icon
        Image dueSalaryReportIcon = new Image(getClass().getResourceAsStream("/resources/icons/due-salary-report.png"));
        ImageView dueSalaryReportView = new ImageView(dueSalaryReportIcon);
        dueSalaryReportView.setFitWidth(20);
        dueSalaryReportView.setFitHeight(20);
        dueSalaryReport.setGraphic(dueSalaryReportView);//setting the disc to menuItem disciplinary/add-goalorgCalAttendanceempLeaveCal//manage-application

        //Report
        //add the netSalaryReport icon
        Image netSalaryReportIcon = new Image(getClass().getResourceAsStream("/resources/icons/net-salary.png"));
        ImageView netSalaryReportView = new ImageView(netSalaryReportIcon);
        netSalaryReportView.setFitWidth(20);
        netSalaryReportView.setFitHeight(20);
        netSalaryReport.setGraphic(netSalaryReportView);//setting the disc to menuItem disciplinary/add-goalorgCalAttendanceempLeaveCal//manage-application

        //Report
        //add the employeeReport icon
        Image employeeReportIcon = new Image(getClass().getResourceAsStream("/resources/icons/employee-report.png"));
        ImageView employeeReportView = new ImageView(employeeReportIcon);
        employeeReportView.setFitWidth(20);
        employeeReportView.setFitHeight(20);//headCountReport
        employeeReport.setGraphic(employeeReportView);//setting the disc to menuItem disciplinary/add-goalorgCalAttendanceempLeaveCal//manage-application

        //Report
        //add the headCountReport icon
        Image headCountReportIcon = new Image(getClass().getResourceAsStream("/resources/icons/head-count-report.png"));
        ImageView headCountReportView = new ImageView(headCountReportIcon);
        headCountReportView.setFitWidth(20);
        headCountReportView.setFitHeight(20);//headCountReport
        headCountReport.setGraphic(headCountReportView);//setting the disc to menuItem disciplinary/add-goalorgCalAttendanceempLeaveCal//manage-application

        //Compliance and legal
        //add the compliance icon
        Image complianceIcon = new Image(getClass().getResourceAsStream("/resources/icons/compliance-and-legal1.png"));
        ImageView complianceView = new ImageView(complianceIcon);
        complianceView.setFitWidth(20);
        complianceView.setFitHeight(20);//headCountReport
        compItem.setGraphic(complianceView);//setting the disc to menuItem disciplinary/add-goalorgCalAttendanceempLeaveCal//manage-application

        //Compliance and legal
        //add the legalItem icon
        Image legalItemIcon = new Image(getClass().getResourceAsStream("/resources/icons/legal.png"));
        ImageView legalItemView = new ImageView(legalItemIcon);
        legalItemView.setFitWidth(20);
        legalItemView.setFitHeight(20);//headCountReport
        legalItem.setGraphic(legalItemView);//setting the disc to menuItem disciplinary/add-goalorgCalAttendanceempLeaveCal//manage-application

        //Config and settings
        //add the system security icon
        Image systemsecurityIcon = new Image(getClass().getResourceAsStream("/resources/icons/system-security.png"));
        ImageView systemsecurityView = new ImageView(systemsecurityIcon);
        systemsecurityView.setFitWidth(20);
        systemsecurityView.setFitHeight(20);//headCountReport
        securitySettings.setGraphic(systemsecurityView);//setting the disc to menuItem disciplinary/add-goalorgCalAttendanceempLeaveCal//manage-application

        //Config and settings
        //add the configEmail icon
        Image configEmailIcon = new Image(getClass().getResourceAsStream("/resources/icons/config-email.png"));
        ImageView configEmailView = new ImageView(configEmailIcon);
        configEmailView.setFitWidth(20);
        configEmailView.setFitHeight(20);//headCountReport
        configEmail.setGraphic(configEmailView);//setting the disc to menuItem disciplinary/add-goalorgCalAttendanceempLeaveCal//manage-application

        //Config and settings
        //add the backup icon
        Image backupIcon = new Image(getClass().getResourceAsStream("/resources/icons/backup-database.png"));
        ImageView backupView = new ImageView(backupIcon);
        backupView.setFitWidth(20);
        backupView.setFitHeight(20);//headCountReport
        backupDatabase.setGraphic(backupView);//setting the disc to menuItem disciplinary/add-goalorgCalAttendanceempLeaveCal//manage-application

        //Config and settings
        //add the restoredatabase icon
        Image restoredatabaseIcon = new Image(getClass().getResourceAsStream("/resources/icons/restore-database.png"));
        ImageView restoredatabaseView = new ImageView(restoredatabaseIcon);
        restoredatabaseView.setFitWidth(20);
        restoredatabaseView.setFitHeight(20);//headCountReport
        restoreDatabase.setGraphic(restoredatabaseView);//setting the disc to menuItem disciplinary/add-goalorgCalAttendanceempLeaveCal//manage-application

        //Config and settings
        //add the empty database icon
        Image emptyDatabaseIcon = new Image(getClass().getResourceAsStream("/resources/icons/delete-database.png"));
        ImageView emptyDatabaseView = new ImageView(emptyDatabaseIcon);
        emptyDatabaseView.setFitWidth(20);
        emptyDatabaseView.setFitHeight(20);//headCountReport
        emptyDatabase.setGraphic(emptyDatabaseView);//setting the disc to menuItem disciplinary/add-goalorgCalAttendanceempLeaveCal//manage-application

        //About
        //add the license icon
        Image licenseIcon = new Image(getClass().getResourceAsStream("/resources/icons/lisense.png"));
        ImageView licenseView = new ImageView(licenseIcon);
        licenseView.setFitWidth(20);
        licenseView.setFitHeight(20);//headCountReport
        licenseItem.setGraphic(licenseView);//setting the disc to menuItem disciplinary/add-goalorgCalAttendanceempLeaveCal//manage-application

        //About
        //add the activate now icon
        Image activateIcon = new Image(getClass().getResourceAsStream("/resources/icons/activate.png"));
        ImageView activateView = new ImageView(activateIcon);
        activateView.setFitWidth(20);
        activateView.setFitHeight(20);//headCountReport
        activateNowItem.setGraphic(activateView);//setting the disc to menuItem disciplinary/add-goalorgCalAttendanceempLeaveCal//manage-application

//        try {
//            loadDepartments();
//            selectOrganization();
//
//        } catch (SQLException | ClassNotFoundException ex) {
//            Logger.getLogger(MainDashboardController.class
//                    .getName()).log(Level.SEVERE, null, ex);
//        }
//        setTableView();
//        //lblDepartmentId.setVisible(false);
    }

    @FXML
    public void onMouseMoved() throws IOException {
        final Label caption = new Label("");
        caption.setTextFill(Color.WHITE);
        caption.setStyle("-fx-font: 12 arial;");

        for (final PieChart.Data data : pieChart1.getData()) {

            caption.setTranslateX(data.getNode().getTranslateX());
            caption.setTranslateY(data.getNode().getTranslateX());

            caption.setText(String.valueOf(data.getPieValue()));

        }
    }

    @FXML
    public void viewEmployeeDetails() throws IOException {
        stage = new Stage();
        AnchorPane root = FXMLLoader.load(getClass().getResource("/octopushr/employees/viewEmployeeDetails.fxml"));
        Scene scene = new Scene(root, 1452, 800);
        scene.getStylesheets().add("/resources/css/viewemployeedetails.css");
        stage.setTitle("View Employee Details");
        stage.setAlwaysOnTop(false);
        //stage.setResizable(false);
        stage.centerOnScreen();
        stage.setScene(scene);
        stage.showAndWait();
    }

    @FXML
    public void showEmployeeAttendance() throws IOException {
        stage = new Stage();
        AnchorPane root = FXMLLoader.load(getClass().getResource("/octopushr/employees/viewEmployeeDetails.fxml"));
        Scene scene = new Scene(root, 1452, 800);
        scene.getStylesheets().add("/resources/css/viewemployeedetails.css");
        stage.setTitle("View Employee Details");
        stage.setAlwaysOnTop(false);
        //stage.setResizable(false);
        stage.centerOnScreen();
        stage.setScene(scene);
        stage.showAndWait();
    }

    @FXML
    public void employeeProflie() throws IOException {

        stage = new Stage();
        AnchorPane root = FXMLLoader.load(getClass().getResource("/octopushr/employees/profileView.fxml"));
        Scene scene = new Scene(root, 1093, 788);
        scene.getStylesheets().add("/resources/css/profileview.css");
        stage.setTitle("Employee Details");
        stage.setAlwaysOnTop(false);
        stage.getIcons().add(new Image(getClass().getResourceAsStream("/resources/icons/employee-profile.png")));
        stage.setResizable(false);
        stage.centerOnScreen();
        stage.setScene(scene);
        stage.showAndWait();
    }

    @FXML
    public void showEmployeeAttendanceSheet() throws IOException {

        stage = new Stage();
        AnchorPane root = FXMLLoader.load(getClass().getResource("/octopushr/attendance/employeeAttendanceSheet.fxml"));
        Scene scene = new Scene(root);
        scene.getStylesheets().add("/resources/css/employeeattendancesheet.css");
        stage.setTitle("Employee Attendance Sheet");
        stage.setAlwaysOnTop(false);
        stage.getIcons().add(new Image(getClass().getResourceAsStream("/resources/icons/employee-profile.png")));
        stage.setResizable(false);
        stage.setWidth(1085);
        stage.setHeight(400);
        stage.centerOnScreen();
        stage.setScene(scene);
        stage.showAndWait();
    }
}
