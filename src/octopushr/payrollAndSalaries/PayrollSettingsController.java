/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 * 
 *  Contributor(s):
 *  
 *  The Original Software is NetBeans. The Initial Developer of the Original
 *  Software is Sun Microsystems, Inc. Portions Copyright 1997-2010 Sun
 *  Microsystems, Inc.
 *  The developer of this software is SIR HUGGINS
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
 * and open the template in the editor.
 */
package octopushr.payrollAndSalaries;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import octopushr.Functions;

/**
 * FXML Controller class
 *
 * @author Support
 */
public class PayrollSettingsController implements Initializable {

  
    @FXML
    private MenuItem itemClose;

    @FXML
    private MenuItem itemDashboard;

    @FXML
    private MenuItem itemProcessPayroll;

    @FXML
    private MenuItem itemWagesBilling;

    @FXML
    private MenuItem itemSalaryHistory;

    @FXML
    private MenuItem itemLoanAdvances;

    @FXML
    private MenuItem itemBankSheet;

    @FXML
    private MenuItem itemSavingsGOSI;

    @FXML
    private MenuItem itemPayOvertime;

    @FXML
    private MenuItem itemPayrollAttributes;

    @FXML
    private MenuItem itemPayrollStructure;

    @FXML
    private MenuItem itemEarningFormula;

    @FXML
    private MenuItem itemDeductionFormula;

    @FXML
    private MenuItem itemContributionGOSISettings;

    @FXML
    private MenuItem itemOvertimeSettings;

    @FXML
    private MenuItem itemTaxationSettings;

    @FXML
    private MenuItem itemHourlySettings;

    @FXML
    private MenuItem itemExemptionSettings;

    @FXML
    private MenuItem itemMonthlySalary;

    @FXML
    private MenuItem itemNotPaidSalary;

    @FXML
    private MenuItem itemOvertime;

    @FXML
    private MenuItem itemEmployeeSalary;

    @FXML
    private MenuItem itemSalaryBudget;

    @FXML
    private MenuItem itemAttendanceDeduction;

    @FXML
    private MenuItem itemLeaveDeduction;

    @FXML
    private MenuItem itemAttendanceDashboard;

    @FXML
    private MenuItem itemSIngleEmployee;

    @FXML
    private MenuItem itemMultiEmployee;

    @FXML
    private MenuItem itemOrganisationCalendar;

    @FXML
    private MenuItem itemStaffSettings;

    @FXML
    private MenuItem itemPunchSettings;

    @FXML
    private MenuItem itemLateGracePeriod;

    @FXML
    private MenuItem itemLateOvertimeCalculator;

    @FXML
    private MenuItem itemAbsent;

    @FXML
    private MenuItem itemMonthlyAttendance;

    @FXML
    private MenuItem itemYealryAttendance;

    @FXML
    private MenuItem itemLateMinutes;

    @FXML
    private MenuItem itemLeaveDashboard;

    @FXML
    private MenuItem itemPunchApplyleave;

    @FXML
    private MenuItem itemApproveleave;

    @FXML
    private MenuItem itemOrganisationCalendar_;

    @FXML
    private MenuItem itemEmployeeLeaveCalendar;

    @FXML
    private MenuItem itemLeaveTypes;

    @FXML
    private MenuItem itemEmployeeLeaveSettings;

    @FXML
    private MenuItem itemHolidayVacations;

    @FXML
    private MenuItem itemAbout;

    Functions functions = new Functions();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        //payroll
        //add the itemClose icon
        Image itemCloseIcon = new Image(getClass().getResourceAsStream("/resources/icons/close.png"));
        ImageView itemCloseView = new ImageView(itemCloseIcon);
        itemCloseView.setFitWidth(20);
        itemCloseView.setFitHeight(20);
        itemClose.setGraphic(itemCloseView);//setting the disc to menuItem disciplinary

        //payroll
        //add the itemDashboard icon
        Image itemDashboardIcon = new Image(getClass().getResourceAsStream("/resources/icons/payrol.png"));
        ImageView itemDashboardView = new ImageView(itemDashboardIcon);
        itemDashboardView.setFitWidth(20);
        itemDashboardView.setFitHeight(20);
        itemDashboard.setGraphic(itemDashboardView);//setting the disc to menuItem disciplinary

        //payroll
        //add the itemClose icon
        Image itemProcessPayrollIcon = new Image(getClass().getResourceAsStream("/resources/icons/process.png"));
        ImageView itemProcessPayrollView = new ImageView(itemProcessPayrollIcon);
        itemProcessPayrollView.setFitWidth(20);
        itemProcessPayrollView.setFitHeight(20);
        itemProcessPayroll.setGraphic(itemProcessPayrollView);//setting the disc to menuItem disciplinary

        //payroll
        //add the itemDashboard icon
        Image itemWagesBillingIcon = new Image(getClass().getResourceAsStream("/resources/icons/wages.png"));
        ImageView itemWagesBillingView = new ImageView(itemWagesBillingIcon);
        itemWagesBillingView.setFitWidth(20);
        itemWagesBillingView.setFitHeight(20);
        itemWagesBilling.setGraphic(itemWagesBillingView);//setting the disc to menuItem disciplinary

        //payroll
        //add the itemClose icon
        Image itemSalaryHistoryIcon = new Image(getClass().getResourceAsStream("/resources/icons/salary-history.png"));
        ImageView itemSalaryHistoryView = new ImageView(itemSalaryHistoryIcon);
        itemSalaryHistoryView.setFitWidth(20);
        itemSalaryHistoryView.setFitHeight(20);
        itemSalaryHistory.setGraphic(itemSalaryHistoryView);//setting the disc to menuItem disciplinary

        //payroll
        //add the itemDashboard icon
        Image itemLoanAdvancesIcon = new Image(getClass().getResourceAsStream("/resources/icons/loan.png"));
        ImageView itemLoanAdvancesView = new ImageView(itemLoanAdvancesIcon);
        itemLoanAdvancesView.setFitWidth(20);
        itemLoanAdvancesView.setFitHeight(20);
        itemLoanAdvances.setGraphic(itemLoanAdvancesView);//setting the disc to menuItem disciplinary

        //payroll
        //add the itemClose icon
        Image itemBankSheetIcon = new Image(getClass().getResourceAsStream("/resources/icons/bank-sheet.png"));
        ImageView itemBankSheetView = new ImageView(itemBankSheetIcon);
        itemBankSheetView.setFitWidth(20);
        itemBankSheetView.setFitHeight(20);
        itemBankSheet.setGraphic(itemBankSheetView);//setting the disc to menuItem disciplinary

        //payroll
        //add the itemDashboard icon
        Image itemSavingsGOSIIcon = new Image(getClass().getResourceAsStream("/resources/icons/savings.png"));
        ImageView itemSavingsGOSIView = new ImageView(itemSavingsGOSIIcon);
        itemSavingsGOSIView.setFitWidth(20);
        itemSavingsGOSIView.setFitHeight(20);
        itemSavingsGOSI.setGraphic(itemSavingsGOSIView);//setting the disc to menuItem disciplinary

        //payroll
        //add the itemClose icon
        Image itemPayOvertimeIcon = new Image(getClass().getResourceAsStream("/resources/icons/timesheet.png"));
        ImageView itemPayOvertimeView = new ImageView(itemPayOvertimeIcon);
        itemPayOvertimeView.setFitWidth(20);
        itemPayOvertimeView.setFitHeight(20);
        itemPayOvertime.setGraphic(itemPayOvertimeView);//setting the disc to menuItem disciplinary

        //payroll
        //add the itemDashboard icon
        Image itemPayrollAttributesIcon = new Image(getClass().getResourceAsStream("/resources/icons/payrol.png"));
        ImageView itemPayrollAttributesView = new ImageView(itemPayrollAttributesIcon);
        itemPayrollAttributesView.setFitWidth(20);
        itemPayrollAttributesView.setFitHeight(20);
        itemPayrollAttributes.setGraphic(itemPayrollAttributesView);//setting the disc to menuItem disciplinary

        //payroll
        //add the itemClose icon
        Image itemPayrollStructureIcon = new Image(getClass().getResourceAsStream("/resources/icons/salary-structure.png"));
        ImageView itemPayrollStructureView = new ImageView(itemPayrollStructureIcon);
        itemPayrollStructureView.setFitWidth(20);
        itemPayrollStructureView.setFitHeight(20);
        itemPayrollStructure.setGraphic(itemPayrollStructureView);//setting the disc to menuItem disciplinary

        //payroll
        //add the itemDashboard icon
        Image itemEarningFormulaIcon = new Image(getClass().getResourceAsStream("/resources/icons/pi.png"));
        ImageView itemEarningFormulaView = new ImageView(itemEarningFormulaIcon);
        itemEarningFormulaView.setFitWidth(20);
        itemEarningFormulaView.setFitHeight(20);
        itemEarningFormula.setGraphic(itemEarningFormulaView);//setting the disc to menuItem disciplinary

        //payroll
        //add the itemClose icon
        Image itemDeductionFormulaIcon = new Image(getClass().getResourceAsStream("/resources/icons/deduction-formula.png"));
        ImageView itemDeductionFormulaView = new ImageView(itemDeductionFormulaIcon);
        itemDeductionFormulaView.setFitWidth(20);
        itemDeductionFormulaView.setFitHeight(20);
        itemDeductionFormula.setGraphic(itemDeductionFormulaView);//setting the disc to menuItem disciplinary

        //payroll
        //add the itemDashboard icon
        Image itemContributionGOSISettingsIcon = new Image(getClass().getResourceAsStream("/resources/icons/sigma.png"));
        ImageView itemContributionGOSISettingsView = new ImageView(itemContributionGOSISettingsIcon);
        itemContributionGOSISettingsView.setFitWidth(20);
        itemContributionGOSISettingsView.setFitHeight(20);
        itemContributionGOSISettings.setGraphic(itemContributionGOSISettingsView);//setting the disc to menuItem disciplinary

        //payroll
        //add the itemClose icon
        Image itemOvertimeSettingsIcon = new Image(getClass().getResourceAsStream("/resources/icons/overtime.png"));
        ImageView itemOvertimeSettingsView = new ImageView(itemOvertimeSettingsIcon);
        itemOvertimeSettingsView.setFitWidth(20);
        itemOvertimeSettingsView.setFitHeight(20);
        itemOvertimeSettings.setGraphic(itemOvertimeSettingsView);//setting the disc to menuItem disciplinary

        //payroll
        //add the itemDashboard icon
        Image itemTaxationSettingsIcon = new Image(getClass().getResourceAsStream("/resources/icons/tax.png"));
        ImageView itemTaxationSettingsView = new ImageView(itemTaxationSettingsIcon);
        itemTaxationSettingsView.setFitWidth(20);
        itemTaxationSettingsView.setFitHeight(20);
        itemTaxationSettings.setGraphic(itemTaxationSettingsView);//setting the disc to menuItem disciplinary

        //payroll
        //add the itemClose icon
        Image itemHourlySettingsIcon = new Image(getClass().getResourceAsStream("/resources/icons/time-settings.png"));
        ImageView itemHourlySettingsView = new ImageView(itemHourlySettingsIcon);
        itemHourlySettingsView.setFitWidth(20);
        itemHourlySettingsView.setFitHeight(20);
        itemHourlySettings.setGraphic(itemHourlySettingsView);//setting the disc to menuItem disciplinary

        //payroll
        //add the itemDashboard icon
        Image itemExemptionSettingsIcon = new Image(getClass().getResourceAsStream("/resources/icons/exemption-settings.png"));
        ImageView itemExemptionSettingsView = new ImageView(itemExemptionSettingsIcon);
        itemExemptionSettingsView.setFitWidth(20);
        itemExemptionSettingsView.setFitHeight(20);
        itemExemptionSettings.setGraphic(itemExemptionSettingsView);//setting the disc to menuItem disciplinary

        //payroll
        //add the itemDashboard icon
        Image itemMonthlySalaryIcon = new Image(getClass().getResourceAsStream("/resources/icons/salary1.png"));
        ImageView itemMonthlySalaryView = new ImageView(itemMonthlySalaryIcon);
        itemMonthlySalaryView.setFitWidth(20);
        itemMonthlySalaryView.setFitHeight(20);
        itemMonthlySalary.setGraphic(itemMonthlySalaryView);//setting the disc to menuItem disciplinary

        //payroll
        //add the itemClose icon
        Image itemNotPaidSalaryIcon = new Image(getClass().getResourceAsStream("/resources/icons/not-paid.png"));
        ImageView itemNotPaidSalaryView = new ImageView(itemNotPaidSalaryIcon);
        itemNotPaidSalaryView.setFitWidth(20);
        itemNotPaidSalaryView.setFitHeight(20);
        itemNotPaidSalary.setGraphic(itemNotPaidSalaryView);//setting the disc to menuItem disciplinary

        //payroll
        //add the itemDashboard icon
        Image itemOvertimeIcon = new Image(getClass().getResourceAsStream("/resources/icons/overtime.png"));
        ImageView itemOvertimeView = new ImageView(itemOvertimeIcon);
        itemOvertimeView.setFitWidth(20);
        itemOvertimeView.setFitHeight(20);
        itemOvertime.setGraphic(itemOvertimeView);//setting the disc to menuItem disciplinary

        //payroll
        //add the itemClose icon
        Image itemEmployeeSalaryIcon = new Image(getClass().getResourceAsStream("/resources/icons/employee-salary.png"));
        ImageView itemEmployeeSalaryView = new ImageView(itemEmployeeSalaryIcon);
        itemEmployeeSalaryView.setFitWidth(20);
        itemEmployeeSalaryView.setFitHeight(20);
        itemEmployeeSalary.setGraphic(itemEmployeeSalaryView);//setting the disc to menuItem disciplinary

        //payroll
        //add the itemDashboard icon
        Image itemSalaryBudgetIcon = new Image(getClass().getResourceAsStream("/resources/icons/budget.png"));
        ImageView itemSalaryBudgetView = new ImageView(itemSalaryBudgetIcon);
        itemSalaryBudgetView.setFitWidth(20);
        itemSalaryBudgetView.setFitHeight(20);
        itemSalaryBudget.setGraphic(itemSalaryBudgetView);//setting the disc to menuItem disciplinary

        //payroll
        //add the itemClose icon
        Image itemAttendanceDeductionIcon = new Image(getClass().getResourceAsStream("/resources/icons/attendance-deduction.png"));
        ImageView itemAttendanceDeductionView = new ImageView(itemAttendanceDeductionIcon);
        itemAttendanceDeductionView.setFitWidth(20);
        itemAttendanceDeductionView.setFitHeight(20);
        itemAttendanceDeduction.setGraphic(itemAttendanceDeductionView);//setting the disc to menuItem disciplinary

        //payroll
        //add the itemDashboard icon
        Image itemLeaveDeductionIcon = new Image(getClass().getResourceAsStream("/resources/icons/leave.png"));
        ImageView itemLeaveDeductionView = new ImageView(itemLeaveDeductionIcon);
        itemLeaveDeductionView.setFitWidth(20);
        itemLeaveDeductionView.setFitHeight(20);
        itemLeaveDeduction.setGraphic(itemLeaveDeductionView);//setting the disc to menuItem disciplinary

          //payroll
        //add the itemClose icon
        Image itemAttendanceDashboardIcon = new Image(getClass().getResourceAsStream("/resources/icons/dashboard.png"));
        ImageView itemAttendanceDashboardView = new ImageView(itemAttendanceDashboardIcon);
        itemAttendanceDashboardView.setFitWidth(20);
        itemAttendanceDashboardView.setFitHeight(20);
        itemAttendanceDashboard.setGraphic(itemAttendanceDashboardView);//setting the disc to menuItem disciplinary

        //payroll
        //add the itemDashboard icon
        Image itemSIngleEmployeeIcon = new Image(getClass().getResourceAsStream("/resources/icons/head-count-report.png"));
        ImageView itemSIngleEmployeeView = new ImageView(itemSIngleEmployeeIcon);
        itemSIngleEmployeeView.setFitWidth(20);
        itemSIngleEmployeeView.setFitHeight(20);
        itemSIngleEmployee.setGraphic(itemSIngleEmployeeView);//setting the disc to menuItem disciplinary

        //payroll
        //add the itemClose icon
        Image itemMultiEmployeeIcon = new Image(getClass().getResourceAsStream("/resources/icons/employees.png"));
        ImageView itemMultiEmployeeView = new ImageView(itemMultiEmployeeIcon);
        itemMultiEmployeeView.setFitWidth(20);
        itemMultiEmployeeView.setFitHeight(20);
        itemMultiEmployee.setGraphic(itemMultiEmployeeView);//setting the disc to menuItem disciplinary

        //payroll
        //add the itemDashboard icon
        Image itemOrganisationCalendarIcon = new Image(getClass().getResourceAsStream("/resources/icons/calendar.png"));
        ImageView itemOrganisationCalendarView = new ImageView(itemOrganisationCalendarIcon);
        itemOrganisationCalendarView.setFitWidth(20);
        itemOrganisationCalendarView.setFitHeight(20);//staff-settings
        itemOrganisationCalendar.setGraphic(itemOrganisationCalendarView);//setting the disc to menuItem disciplinary
 
             //payroll
        //add the itemClose icon
        Image itemStaffSettingsIcon = new Image(getClass().getResourceAsStream("/resources/icons/staff-settings.png"));
        ImageView itemStaffSettingsView = new ImageView(itemStaffSettingsIcon);
        itemStaffSettingsView.setFitWidth(20);
        itemStaffSettingsView.setFitHeight(20);
        itemStaffSettings.setGraphic(itemStaffSettingsView);//setting the disc to menuItem disciplinary

        //payroll
        //add the itemDashboard icon
        Image itemPunchSettingsIcon = new Image(getClass().getResourceAsStream("/resources/icons/punch-settings.png"));
        ImageView itemPunchSettingsView = new ImageView(itemPunchSettingsIcon);
        itemPunchSettingsView.setFitWidth(20);
        itemPunchSettingsView.setFitHeight(20);
        itemPunchSettings.setGraphic(itemPunchSettingsView);//setting the disc to menuItem disciplinary

        //payroll
        //add the itemClose icon
        Image itemLateGracePeriodIcon = new Image(getClass().getResourceAsStream("/resources/icons/period.png"));
        ImageView itemLateGracePeriodView = new ImageView(itemLateGracePeriodIcon);
        itemLateGracePeriodView.setFitWidth(20);
        itemLateGracePeriodView.setFitHeight(20);
        itemLateGracePeriod.setGraphic(itemLateGracePeriodView);//setting the disc to menuItem disciplinary

        //payroll
        //add the itemDashboard icon
        Image itemLateOvertimeCalculatorIcon = new Image(getClass().getResourceAsStream("/resources/icons/calculator.png"));
        ImageView itemLateOvertimeCalculatorView = new ImageView(itemLateOvertimeCalculatorIcon);
        itemLateOvertimeCalculatorView.setFitWidth(20);
        itemLateOvertimeCalculatorView.setFitHeight(20);//staff-settings
        itemLateOvertimeCalculator.setGraphic(itemLateOvertimeCalculatorView);//setting the disc to menuItem disciplinary
 
                //payroll
        //add the itemClose icon
        Image itemAbsentIcon = new Image(getClass().getResourceAsStream("/resources/icons/absent.png"));
        ImageView itemAbsentView = new ImageView(itemAbsentIcon);
        itemAbsentView.setFitWidth(20);
        itemAbsentView.setFitHeight(20);
        itemAbsent.setGraphic(itemAbsentView);//setting the disc to menuItem disciplinary

        //payroll
        //add the itemDashboard icon
        Image itemMonthlyAttendanceIcon = new Image(getClass().getResourceAsStream("/resources/icons/monthly1.png"));
        ImageView itemMonthlyAttendanceView = new ImageView(itemMonthlyAttendanceIcon);
        itemMonthlyAttendanceView.setFitWidth(20);
        itemMonthlyAttendanceView.setFitHeight(20);
        itemMonthlyAttendance.setGraphic(itemMonthlyAttendanceView);//setting the disc to menuItem disciplinary

        //payroll
        //add the itemClose icon
        Image itemYealryAttendanceIcon = new Image(getClass().getResourceAsStream("/resources/icons/yearly.png"));
        ImageView itemYealryAttendanceView = new ImageView(itemYealryAttendanceIcon);
        itemYealryAttendanceView.setFitWidth(20);
        itemYealryAttendanceView.setFitHeight(20);
        itemYealryAttendance.setGraphic(itemYealryAttendanceView);//setting the disc to menuItem disciplinary

        //payroll
        //add the itemDashboard icon
        Image itemLateMinutesIcon = new Image(getClass().getResourceAsStream("/resources/icons/minutes.png"));
        ImageView itemLateMinutesView = new ImageView(itemLateMinutesIcon);
        itemLateMinutesView.setFitWidth(20);
        itemLateMinutesView.setFitHeight(20);//staff-settings
        itemLateMinutes.setGraphic(itemLateMinutesView);//setting the disc to menuItem disciplinary
 
        
        //payroll
        //add the itemDashboard icon
        Image itemLateOvertimeCalculator_Icon = new Image(getClass().getResourceAsStream("/resources/icons/calculator.png"));
        ImageView itemLateOvertimeCalculator_View = new ImageView(itemLateOvertimeCalculator_Icon);
        itemLateOvertimeCalculator_View.setFitWidth(20);
        itemLateOvertimeCalculator_View.setFitHeight(20);//staff-settings
        itemLateOvertimeCalculator.setGraphic(itemLateOvertimeCalculator_View);//setting the disc to menuItem disciplinary
 
                //payroll
        //add the itemClose icon
        Image itemAbsent_Icon = new Image(getClass().getResourceAsStream("/resources/icons/absent.png"));
        ImageView itemAbsent_View = new ImageView(itemAbsent_Icon);
        itemAbsent_View.setFitWidth(20);
        itemAbsent_View.setFitHeight(20);
        itemAbsent.setGraphic(itemAbsent_View);//setting the disc to menuItem disciplinary

        //payroll
        //add the itemDashboard icon
        Image itemLeaveDashboardIcon = new Image(getClass().getResourceAsStream("/resources/icons/dashboard.png"));
        ImageView itemLeaveDashboardView = new ImageView(itemLeaveDashboardIcon);
        itemLeaveDashboardView.setFitWidth(20);
        itemLeaveDashboardView.setFitHeight(20);
        itemLeaveDashboard.setGraphic(itemLeaveDashboardView);//setting the disc to menuItem disciplinary

        //payroll
        //add the itemClose icon
        Image itemPunchApplyleaveIcon = new Image(getClass().getResourceAsStream("/resources/icons/apply.png"));
        ImageView itemPunchApplyleaveView = new ImageView(itemPunchApplyleaveIcon);
        itemPunchApplyleaveView.setFitWidth(20);
        itemPunchApplyleaveView.setFitHeight(20);
        itemPunchApplyleave.setGraphic(itemPunchApplyleaveView);//setting the disc to menuItem disciplinary

        //payroll
        //add the itemDashboard icon
        Image itemApproveleaveIcon = new Image(getClass().getResourceAsStream("/resources/icons/punch-apply.png"));
        ImageView itemApproveleaveView = new ImageView(itemApproveleaveIcon);
        itemApproveleaveView.setFitWidth(20);
        itemApproveleaveView.setFitHeight(20);//staff-settings
        itemApproveleave.setGraphic(itemApproveleaveView);//setting the disc to menuItem disciplinary
 
          //payroll
        //add the itemClose icon
        Image itemOrganisationCalendar_Icon = new Image(getClass().getResourceAsStream("/resources/icons/calendar.png"));
        ImageView itemOrganisationCalendar_View = new ImageView(itemOrganisationCalendar_Icon);
        itemOrganisationCalendar_View.setFitWidth(20);
        itemOrganisationCalendar_View.setFitHeight(20);
        itemOrganisationCalendar_.setGraphic(itemOrganisationCalendar_View);//setting the disc to menuItem disciplinary

        //payroll
        //add the itemDashboard icon
        Image itemEmployeeLeaveCalendarIcon = new Image(getClass().getResourceAsStream("/resources/icons/leave.png"));
        ImageView itemEmployeeLeaveCalendarView = new ImageView(itemEmployeeLeaveCalendarIcon);
        itemEmployeeLeaveCalendarView.setFitWidth(20);
        itemEmployeeLeaveCalendarView.setFitHeight(20);//staff-settings
        itemEmployeeLeaveCalendar.setGraphic(itemEmployeeLeaveCalendarView);//setting the disc to menuItem disciplinary
 
                //payroll
        //add the itemClose icon
        Image itemLeaveTypesIcon = new Image(getClass().getResourceAsStream("/resources/icons/leave-type.png"));
        ImageView itemLeaveTypesView = new ImageView(itemLeaveTypesIcon);
        itemLeaveTypesView.setFitWidth(20);
        itemLeaveTypesView.setFitHeight(20);
        itemLeaveTypes.setGraphic(itemLeaveTypesView);//setting the disc to menuItem disciplinary

        //payroll
        //add the itemDashboard icon
        Image itemEmployeeLeaveSettingsIcon = new Image(getClass().getResourceAsStream("/resources/icons/manage-application.png"));
        ImageView itemEmployeeLeaveSettingsView = new ImageView(itemEmployeeLeaveSettingsIcon);
        itemEmployeeLeaveSettingsView.setFitWidth(20);
        itemEmployeeLeaveSettingsView.setFitHeight(20);//staff-settings
        itemEmployeeLeaveSettings.setGraphic(itemEmployeeLeaveSettingsView);//setting the disc to menuItem disciplinary
 
          //payroll
        //add the itemClose icon
        Image itemHolidayVacationsIcon = new Image(getClass().getResourceAsStream("/resources/icons/holiday.png"));
        ImageView itemHolidayVacationsView = new ImageView(itemHolidayVacationsIcon);
        itemHolidayVacationsView.setFitWidth(20);
        itemHolidayVacationsView.setFitHeight(20);
        itemHolidayVacations.setGraphic(itemHolidayVacationsView);//setting the disc to menuItem disciplinary

        //payroll
        //add the itemDashboard icon
        Image itemAboutIcon = new Image(getClass().getResourceAsStream("/resources/icons/about.png"));
        ImageView itemAboutView = new ImageView(itemAboutIcon);
        itemAboutView.setFitWidth(20);
        itemAboutView.setFitHeight(20);//staff-settings
        itemAbout.setGraphic(itemAboutView);//setting the disc to menuItem disciplinary
 
        
        
        
        
        
    }

    @FXML
    public void closeThisStage(Event event) {
        functions.closeWindow(event);
    
    }
}
