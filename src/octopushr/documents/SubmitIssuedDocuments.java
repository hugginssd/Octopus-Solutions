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

import java.sql.Date;

/**
 *
 * @author user
 */
public class SubmitIssuedDocuments {

    private int id;
    private String documentName;
    private String documentType;
    private Date submittedDate;
    private Date expiryDate;
    private String duplicate;

    //INTERNAL DOCUMENTS
    private int iid;
    private String employeeno;
    private String name;
    private String title;
    private String documenttype;
    private Boolean submitted;
    private String authority;

    public SubmitIssuedDocuments(int id, String documentName, String documentType, Date submittedDate, Date expiryDate, String duplicate) {
        this.id = id;
        this.documentName = documentName;
        this.documentType = documentType;
        this.submittedDate = submittedDate;
        this.expiryDate = expiryDate;
        this.duplicate = duplicate;
    }

    public SubmitIssuedDocuments(int iid, String employeeno, String name, String title, String documenttype, Boolean submitted, String authority) {
        this.iid = iid;
        this.employeeno = employeeno;
        this.name = name;
        this.title = title;
        this.documenttype = documenttype;
        this.submitted = submitted;
        this.authority = authority;
    }

    //INTERNAL DOCUMENTS
    public int getiId() {
        return iid;
    }

    public void setiId(int iid) {
        this.iid = iid;
    }

    public String getEmployeeno() {
        return employeeno;
    }

    public void setEmployeeno(String employeeno) {
        this.employeeno = employeeno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDocumenttype() {
        return documenttype;
    }

    public void setDocumenttype(String documenttype) {
        this.documenttype = documenttype;
    }

    public Boolean getSubmitted() {
        return submitted;
    }

    public void setSubmitted(Boolean submitted) {
        this.submitted = submitted;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDocumentName() {
        return documentName;
    }

    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public Date getSubmittedDate() {
        return submittedDate;
    }

    public void setSubmittedDate(Date submittedDate) {
        this.submittedDate = submittedDate;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getDuplicate() {
        return duplicate.toUpperCase();
    }

    public void setDuplicate(String duplicate) {
        this.duplicate = duplicate;
    }

}
