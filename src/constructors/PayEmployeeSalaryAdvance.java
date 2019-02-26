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
package constructors;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author user
 */
public class PayEmployeeSalaryAdvance {

    private final IntegerProperty ID;
    private final StringProperty Name;
    private final DoubleProperty AdvanceAmount;
    private final DoubleProperty Balance;
    private final DoubleProperty EnterAmount;
    private final BooleanProperty DeductFromSalary;
    private final BooleanProperty TakeSeperate;

    public PayEmployeeSalaryAdvance(int ID, String Name, Double AdvanceAmount, Double Balance, Double EnterAmount, Boolean DeductFromSalary, Boolean TakeSeperate) {
        this.ID = new SimpleIntegerProperty(ID);
        this.Name = new SimpleStringProperty(Name);
        this.AdvanceAmount = new SimpleDoubleProperty(AdvanceAmount);
        this.Balance = new SimpleDoubleProperty(Balance);
        this.EnterAmount = new SimpleDoubleProperty(EnterAmount);
        this.DeductFromSalary = new SimpleBooleanProperty(DeductFromSalary);
        this.TakeSeperate = new SimpleBooleanProperty(TakeSeperate);
    }

    public final int getID() {
        return ID.get();
    }

    public final void setID(int value) {
        ID.set(value);
    }

    public IntegerProperty IDProperty() {
        return ID;
    }

    public final String getName() {
        return Name.get();
    }

    public final void setName(String value) {
        Name.set(value);
    }

    public StringProperty NameProperty() {
        return Name;
    }

    public final double getAdvanceAmount() {
        return AdvanceAmount.get();
    }

    public final void setAdvanceAmount(double value) {
        AdvanceAmount.set(value);
    }

    public DoubleProperty AdvanceAmountProperty() {
        return AdvanceAmount;
    }

    public final double getBalance() {
        return Balance.get();
    }

    public final void setBalance(double value) {
        Balance.set(value);
    }

    public DoubleProperty BalanceProperty() {
        return Balance;
    }

    public final double getEnterAmount() {
        return EnterAmount.get();
    }

    public final void setEnterAmount(double value) {
        EnterAmount.set(value);
    }

    public DoubleProperty EnterAmountProperty() {
        return EnterAmount;
    }

    public final boolean isDeductFromSalary() {
        return DeductFromSalary.get();
    }

    public final void setDeductFromSalary(boolean value) {
        DeductFromSalary.set(value);
    }

    public BooleanProperty DeductFromSalaryProperty() {
        return DeductFromSalary;
    }

    public final boolean isTakeSeperate() {
        return TakeSeperate.get();
    }

    public final void setTakeSeperate(boolean value) {
        TakeSeperate.set(value);
    }

    public BooleanProperty TakeSeperateProperty() {
        return TakeSeperate;
    }

}
