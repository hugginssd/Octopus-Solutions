/*
 *  DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 * 
 *  Contributor(s):
 *  
 *  The Original Software is NetBeans. The Initial Developer of the Original
 *  Software is Sun Microsystems, Inc. Portions Copyright 1997-2010 Sun
 *  Microsystems, Inc.
//<<<<<<< HEAD
 *  The developer of this software is HUGGINS
//=======
 *  The developer of this software is SIR HUGGINS
//>>>>>>> f5c7a74c0fba43c1a593f4c9fd5c119e38b274d5
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
 * 
 */
package octopushr;

import java.awt.image.BufferedImage;
////<<<<<<< HEAD
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.Inet4Address;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.sql.Blob;
////=======
import java.io.File;
import java.io.IOException;
import javax.mail.PasswordAuthentication;
////>>>>>>> f5c7a74c0fba43c1a593f4c9fd5c119e38b274d5
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//<<<<<<< HEAD
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
////=======
////>>>>>>> f5c7a74c0fba43c1a593f4c9fd5c119e38b274d5
import javafx.embed.swing.SwingFXUtils;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Alert;
//<<<<<<< HEAD
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Multipart;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.Session;
import javax.mail.Transport;
import javax.swing.JFileChooser;
import jxl.CellView;
import jxl.Workbook;
import jxl.format.BorderLineStyle;
import jxl.format.Colour;
import jxl.format.RGB;
import jxl.format.UnderlineStyle;
import jxl.format.VerticalAlignment;
import jxl.read.biff.BiffException;
import jxl.write.WritableCellFormat;
import jxl.write.Alignment;
import jxl.write.WritableFont;
import jxl.write.WritableFont.FontName;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import octopushr.employees.ViewEmployeeDetails;
////=======
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javax.imageio.ImageIO;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.internet.AddressException;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMultipart;
import static javax.swing.text.StyleConstants.Alignment;
import jxl.format.Border;
import jxl.write.Label;
//import sun.plugin2.message.transport.Transport;
////>>>>>>> f5c7a74c0fba43c1a593f4c9fd5c119e38b274d5

/**
 *
 * @author Support
 */
//ALL_SYSTEM_FUNCTIONS_ARE_DECLARED_HERE
public class Functions {

    Connexion connexion = new Connexion();
    Connection connection;
    Statement st;
    PreparedStatement pst;
    ResultSet rs;
//<<<<<<< HEAD
    Stage stage;

    @FXML
    public ObservableList dataDepartments = FXCollections.observableArrayList();

    ImageView imageView = new ImageView();
    Alert alert;
    String password = "0782326160Ht";
    String email = "mafiguhuggins@gmail.com";

    // //=======//=======//=======//=======//=======//=======//=======//=======//=======//=========
    // Private Utilities
    // //=======//=======//=======//=======//=======//=======//=======//=======//=======//=========
    private static final Map<Integer, Colour> colorValueMap;
    private static final Map<String, Colour> colorNameMap;

    static {
        colorValueMap = new HashMap<>();
        colorNameMap = new HashMap<>();

        for (Colour color : Colour.getAllColours()) {
            RGB rgb = color.getDefaultRGB();
            int valueKey = (rgb.getRed() << 16) + (rgb.getGreen() << 8) + rgb.getBlue();
            String nameKey = color.getDescription();

            colorValueMap.put(valueKey, color);
            colorNameMap.put(nameKey, color);
        }
    }

    // //=======//=======//=======//=======//=======//=======//=======//=======//=======//=========
    // Global Values
    // //=======//=======//=======//=======//=======//=======//=======//=======//=======//=========
    public static final WritableFont TREBUCHET_MS = create("Trebuchet MS");
    public static final WritableFont CONSOLAS = create("Consolas", 9, "ocean blue", true, true, 0);
    public static final WritableFont ARIAL_ROUNDED_MT_BOLD = create("Arial Rounded MT Bold", 11, "black", false, false, 0); //Arial Rounded MT Bold
    public static final WritableFont ARIAL_ROUNDED_MT_BOLD_HEADER = create("Arial Rounded MT Bold", 16, "white", false, false, 0); //Arial Rounded MT Bold
    public static final WritableFont ARIAL_ROUNDED_MT_BOLD_CONTENT = create("Raleway", 10, "black", false, false, 0); //Arial Rounded MT Bold

    public static final int NO_UNDERLINE = 0x0;
    public static final int SINGLE = 0x1;
    public static final int DOUBLE = 0x2;
    public static final int SINGLE_ACCOUNTING = 0x21;
    public static final int DOUBLE_ACCOUNTING = 0x22;
    public static final int CELL_DEFAULT_WIDTH = 150;
    //public static final int CELL_DEFAULT_HEIGHT = 150;

    @FXML
    public boolean checkId(String empId, String table) throws SQLException, ClassNotFoundException {
        connection = connexion.getConnetion();
        pst = connection.prepareStatement(table);
        pst.setString(1, empId);
        rs = pst.executeQuery();
        return rs.next() != true;

    }
    public void showConfirmation(AlertType alertType, String headerText, String title, String update, String message) {
        alert = new Alert(alertType);
        alert.setTitle(title);
        // alert.setAlertType(alertType.getAlertType());

        alert.setHeaderText(headerText);
        alert.setContentText(message);
        alert.showAndWait();

    }

    public String getLoggedInUser(String object) {

        return object;
    }

    @FXML
//<<<<<<< HEAD
    public void sendMail(String username, String password, String memberName) throws javax.mail.MessagingException {
        Properties props = System.getProperties();
        String host = "mail";
        String from = "mafiguhuggins@gmail.com";

        props.put("mail.smtp.host", "888");
        props.put("mail.smtp.connectiontimeout", "3000");
        props.put("mail.smtp.timeout", "3000");
        Session session = Session.getDefaultInstance(props, null);
        MimeMessage mimeMessage = new MimeMessage(session);

        mimeMessage.setFrom(new InternetAddress(from));
        mimeMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(email));
        mimeMessage.setSubject("Password Recovery! Confirmation email");
        mimeMessage.setText("Hi " + memberName + " \n\nYour password is " + password + "\nRegards" + from);
        Transport.send(mimeMessage);
        
        alert = new Alert(AlertType.CONFIRMATION);
        alert.setHeaderText(null);
        alert.setContentText("Hi " + memberName + " \n\nYour password is " + password + "\nRegards" + from);
        Optional<ButtonType> result = alert.showAndWait();
        if (result.get() == ButtonType.OK) {

        }

    }

    @FXML
    public void sendAttachment(final String username, final String password, String mailId, String from, String to, String subject, String textBody, String filePath, String fileName) throws SQLException, ClassNotFoundException, UnknownHostException, AddressException, MessagingException {
        //final String username = "mafiguhuggins@gmail.com";
        //final String password = "0782326160Ht";
        if (username.isEmpty()
                || password.isEmpty()
                || to.isEmpty()
                || subject.isEmpty()
                || textBody.isEmpty()
                || filePath.isEmpty()
                || fileName.isEmpty()) {
            alertWarning(alert, "Invalid entry\nPlease make sure all input fields are filled correctly");
            return;
        }
        Properties props = new Properties();
        props.put("mail.smtp.auth", true);
        props.put("mail.smtp.starttls.enable", true);
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session;
        session = Session.getInstance(props,
                new javax.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(to));
            message.setSubject(subject);
            message.setText(textBody);

            MimeBodyPart messageBodyPart = new MimeBodyPart();

            Multipart multipart = new MimeMultipart();

            messageBodyPart = new MimeBodyPart();
            // String filePath = "C:\\OctopusHR Documents\\APPOINTMENT LETTER\\CARD.pdf";
            //String fileName = "CARD.pdf";
            DataSource source = new FileDataSource(filePath);
            messageBodyPart.setDataHandler(new DataHandler(source));
            messageBodyPart.setFileName(fileName);
            multipart.addBodyPart(messageBodyPart);

            message.setContent(multipart);

            System.out.println("Sending");

            Transport.send(message);

            System.out.println("Done");
            connection = connexion.getConnetion();
            pst = connection.prepareStatement("INSERT INTO `tblemaildocs`(`emailid`, `efrom`, `eto`, `subject`, `filename`,"
                    + " `filepath`, `textbody`, `username`, `password`, `datecreated`, `usercreated`, `machinecreatedon`)"
                    + " VALUES (?,?,?,?,?,?,?,?,?,CURDATE(),?,?)");
            pst.setString(1, mailId);
            pst.setString(2, from);
            pst.setString(3, to);
            pst.setString(4, subject);
            pst.setString(5, fileName);
            pst.setString(6, filePath);
            pst.setString(7, textBody);
            pst.setString(8, username);
            pst.setString(9, password);
            pst.setString(10, Inet4Address.getLocalHost().getHostName());
            pst.setString(11, Inet4Address.getLocalHost().getHostName());
            pst.execute();
            alertSuccessful(alert, "Successfully send");

        } catch (MessagingException e) {
            alertError(alert, e.toString());
        }
    }

    @FXML
    public void closeWindow(Event event) {
        alert = new Alert(AlertType.CONFIRMATION);
        alert.setHeaderText(null);
        alert.setContentText("Do you want to close this form?");
        Optional<ButtonType> result = alert.showAndWait();
        if (result.get() == ButtonType.OK) {
            ((Node) (event.getSource())).getScene().getWindow().hide();
        }
    }

    public int getRowCount(String table) throws SQLException, ClassNotFoundException {
        int a = 0;
        connection = connexion.getConnetion();
        st = connection.createStatement();
        rs = st.executeQuery("SELECT count(*) FROM " + table);
        while (rs.next()) {

            a = rs.getRow();
        }

        st.close();
        rs.close();
//<<<<<<< HEAD
        return a - 1;

    }

    public int getLastId(String column, String table) throws SQLException, ClassNotFoundException {
        int i = 0;
        connection = connexion.getConnetion();
        st = connection.createStatement();
        rs = st.executeQuery("SELECT MAX(" + column + ") AS id FROM " + table);

        while (rs.next()) {
            i = rs.getInt("id");
        }

        st.close();
        rs.close();
        return i + 1;
    }

    public static String toTitleCase(String input) {
        StringBuilder titleCase = new StringBuilder();
        boolean nextTitleCase = true;

        for (char c : input.toCharArray()) {
            if (Character.isSpaceChar(c)) {
                nextTitleCase = true;
            } else if (nextTitleCase) {
                c = Character.toTitleCase(c);
                nextTitleCase = false;
            }

            titleCase.append(c);
        }

        return titleCase.toString();
    }

    public void alertSuccessful(Alert alert, String message) {
        alert = new Alert(AlertType.CONFIRMATION);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();

    }

    public void alertError(Alert alert, String message) {
        alert = new Alert(AlertType.ERROR);
        alert.setHeaderText(null);
        alert.setTitle("Error");
        alert.setContentText(message);
        alert.showAndWait();

    }

    public void alertWarning(Alert alert, String message) {
        alert = new Alert(AlertType.WARNING);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();

    }

    public void alertInformation(Alert alert, String message) {
        alert = new Alert(AlertType.INFORMATION);
        alert.setHeaderText("Information");
        alert.setContentText(message);
        alert.showAndWait();

    }

    public void loadDepartments(String sql, String departmentName, Object object) throws SQLException, ClassNotFoundException {
        connection = connexion.getConnetion();
        st = connection.createStatement();
        rs = st.executeQuery(sql);
        while (rs.next()) {
            //object = rs.getString(departmentName));
            object.equals(rs.getString(departmentName));
        }
        st.close();
        rs.close();
    }

    public void createExcel() {
        try {
            WritableWorkbook wb = Workbook.createWorkbook(new File("employeelist.xls"));
            wb.createSheet("Employee List", 0);
            wb.write();
            wb.close();
            alertSuccessful(alert, "Successfully created file");
            System.out.println("Successfully created file");
        } catch (IOException | WriteException ex) {
            alertSuccessful(alert, ex.toString());
            Logger.getLogger(Functions.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void writeExcel(TableView tableView, ViewEmployeeDetails viewEmployeeDetails) {
        try {
            int size = tableView.getItems().size();
            switch (size) {
                case 0:
                    alertInformation(alert, "No employee in the table.\nTo download employee sheet you should have at least on employee in the table.");
                    break;
                default:

                    Workbook wb = Workbook.getWorkbook(new File("employeelist.xls"));
                    WritableWorkbook copy = Workbook.createWorkbook(new File("employeelist.xls"), wb);
                    WritableSheet copySheet = copy.getSheet(0);
                    jxl.Cell header = copySheet.getCell(0, 0);

                    WritableCellFormat cellFormat = new WritableCellFormat(Functions.ARIAL_ROUNDED_MT_BOLD);
                    WritableCellFormat cellFormat1 = new WritableCellFormat(Functions.ARIAL_ROUNDED_MT_BOLD_HEADER);
                    WritableCellFormat cellFormatContent = new WritableCellFormat(Functions.ARIAL_ROUNDED_MT_BOLD_CONTENT);
                    WritableCellFormat cellFormatContentLine = new WritableCellFormat(Functions.ARIAL_ROUNDED_MT_BOLD_HEADER);

                    cellFormat.setBackground(Colour.SKY_BLUE);
                    cellFormat.setShrinkToFit(true);
                    cellFormat.setAlignment(jxl.format.Alignment.CENTRE);
                    cellFormat.setVerticalAlignment(VerticalAlignment.CENTRE);
                    cellFormat.setBorder(Border.ALL, BorderLineStyle.THIN);
                    int fontPointSize = 30;
                    int rowHeight = (int) ((1.5d * fontPointSize) * 20);
                    copySheet.setRowView(0, rowHeight, false);
                    Label label1 = new Label(0, 4, "EMPLOYEE ID", cellFormat);
                    Label label2 = new Label(1, 4, "NAME", cellFormat);
                    Label label3 = new Label(2, 4, "DESIGNATION", cellFormat);
                    Label label4 = new Label(3, 4, "DEPARTMENT", cellFormat);
                    Label label5 = new Label(4, 4, "VERIFIED", cellFormat);
                    Label label6 = new Label(5, 4, "ACTIVE", cellFormat);
                    Label label7 = new Label(6, 4, "LOCATION", cellFormat);

                    cellFormat1.setBackground(Colour.SKY_BLUE);

                    Label labelHeaderColor1 = new Label(0, 0, "            ", cellFormat1);
                    Label labelHeaderColor2 = new Label(1, 0, "           ", cellFormat1);
                    Label labelHeaderColor3 = new Label(2, 0, "Employee List", cellFormat1);
                    Label labelHeaderColor4 = new Label(3, 0, "              ", cellFormat1);
                    Label labelHeaderColor5 = new Label(4, 0, "               ", cellFormat1);
                    Label labelHeaderColor6 = new Label(5, 0, "               ", cellFormat1);
                    Label labelHeaderColor7 = new Label(6, 0, "              ", cellFormat1);

                    copySheet.addCell(label1);
                    copySheet.addCell(label2);
                    copySheet.addCell(label3);
                    copySheet.addCell(label4);
                    copySheet.addCell(label5);
                    copySheet.addCell(label6);
                    copySheet.addCell(label7);
                    //header color
                    copySheet.addCell(labelHeaderColor1);
                    copySheet.addCell(labelHeaderColor2);
                    copySheet.addCell(labelHeaderColor3);
                    copySheet.addCell(labelHeaderColor4);
                    copySheet.addCell(labelHeaderColor5);
                    copySheet.addCell(labelHeaderColor6);
                    copySheet.addCell(labelHeaderColor7);
                    int row = 5;
                    int col = 0;
                    //ObservableList<TableColumn<ViewEmployeeDetails, ?>> tableColumns = tableView.getColumns();
                    ArrayList<String> values = new ArrayList<>();
                    ObservableList<TableColumn> columns = tableView.getColumns();
                    for (Object tableRow : tableView.getItems()) {

                        for (TableColumn column : columns) {

                            values.add(String.valueOf((String) column.getCellObservableValue(tableRow).getValue().toString()));

                            CellView cv = copySheet.getColumnView(0);
                            int highest = 10;
                            cv.setSize((highest + ((highest / 2) + (highest / 4))) * 256);
                            copySheet.setColumnView(col, cv);
                            copySheet.setColumnView(1, cv);
                            copySheet.setColumnView(2, cv);
                            copySheet.setColumnView(3, cv);
                            copySheet.setColumnView(4, cv);
                            copySheet.setColumnView(5, cv);
                            copySheet.setColumnView(6, cv);
                        }

                        Label labelRow1 = new Label(0, row, values.get(0).toUpperCase(), cellFormatContent);
                        Label labelRow2 = new Label(1, row, values.get(1).toUpperCase(), cellFormatContent);
                        Label labelRow3 = new Label(2, row, values.get(2).toUpperCase(), cellFormatContent);
                        Label labelRow4 = new Label(3, row, values.get(3).toUpperCase(), cellFormatContent);
                        Label labelRow5 = new Label(4, row, values.get(4).toUpperCase(), cellFormatContent);
                        Label labelRow6 = new Label(5, row, values.get(5).toUpperCase(), cellFormatContent);
                        Label labelRow7 = new Label(6, row, values.get(6).toUpperCase(), cellFormatContent);

                        copySheet.addCell(labelRow1);
                        copySheet.addCell(labelRow2);
                        copySheet.addCell(labelRow3);
                        copySheet.addCell(labelRow4);
                        copySheet.addCell(labelRow5);
                        copySheet.addCell(labelRow6);
                        copySheet.addCell(labelRow7);
                        row++;
                    }
                    copySheet.mergeCells(2, 0, 3, 0);
                    copy.write();
                    copy.close();
                    alertSuccessful(alert, "Successfully downloaded employee sheet");
                    System.out.println("Successfully written to file");
            }
        } catch (IOException | BiffException ex) {
            if ("java.io.FileNotFoundException".equals(ex.getClass().getName())) {
                alertSuccessful(alert, "You cannot execute this file. Please close the excel file first if it is open and proceed. ");
                return;
            }
            Logger.getLogger(Functions.class.getName()).log(Level.SEVERE, null, ex);
        } catch (WriteException ex) {
            alertSuccessful(alert, ex.toString());
            Logger.getLogger(Functions.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void sheetAutoFitColumns(WritableSheet sheet) {
        for (int i = 0; i < sheet.getColumns(); i++) {
            jxl.Cell[] cells = sheet.getColumn(i);
            int longestStrLen = -1;

            if (cells.length == 0) {
                continue;
            }

            /* Find the widest cell in the column. */
            for (int j = 0; j < cells.length; j++) {
                if (cells[j].getContents().length() > longestStrLen) {
                    String str = cells[j].getContents();
                    if (str == null || str.isEmpty()) {
                        continue;
                    }
                    longestStrLen = str.trim().length();
                }
            }

            /* If not found, skip the column. */
            if (longestStrLen == -1) {
                continue;
            }

            /* If wider than the max width, crop width */
            if (longestStrLen > 500) {
                longestStrLen = 255;
            }

            CellView cv = sheet.getColumnView(i);
            //cv.setSize(longestStrLen * 256 + 100); /* Every character is 256 units wide, so scale it. */
            cv.setAutosize(true);
            sheet.setColumnView(i, cv);
        }
    }

    private void setImage(WritableSheet s) throws MalformedURLException, IOException, WriteException {

        BufferedImage input = ImageIO.read(new URL("http://example.com/image.jpg"));
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ImageIO.write(input, "PNG", baos);
        //s.addImage(new WritableImage(0, 0, input.getWidth() / CELL_DEFAULT_WIDTH, input.getHeight() / CELL_DEFAULT_HEIGHT, baos.toByteArray()));
        //s.addImage(new WritableImage(PixelReader,0,0));
        s.mergeCells(0, 0, 0, 2);
    }

    //writablecolor
    public static WritableFont create(String name, int size, Colour color, boolean bold, boolean italic,
            int underline) {
        UnderlineStyle underlineStyle = UnderlineStyle.getStyle(underline);
        FontName font = WritableFont.createFont(name);

        if (bold) {
            return new WritableFont(font, size, WritableFont.BOLD, italic, underlineStyle, color);
        } else {
            return new WritableFont(font, size, WritableFont.NO_BOLD, italic, underlineStyle, color);
        }
    }

    public static WritableFont create(String name, int size, int color, boolean bold, boolean italic, int underline) {
        return create(name, size, lookupColor(color), bold, italic, underline);
    }

    public static WritableFont create(String name, int size, String color, boolean bold, boolean italic,
            int underline) {
        return create(name, size, lookupColor(color.toLowerCase()), bold, italic, underline);
    }

    public static WritableFont create(String fontName, int size, int color) {
        return create(fontName, size, color, false, false, NO_UNDERLINE);
    }

    public static WritableFont create(String fontName, int size, String color) {
        return create(fontName, size, color, false, false, NO_UNDERLINE);
    }

    public static WritableFont create(String fontName, int size) {
        return create(fontName, size, 0x000000);
    }

    public static WritableFont create(String fontName) {
        return create(fontName, WritableFont.DEFAULT_POINT_SIZE);
    }

    public static Colour lookupColor(int value) {
        return colorValueMap.containsKey(value) ? colorValueMap.get(value) : Colour.AUTOMATIC;
    }

    public static Colour lookupColor(String value) {
        return colorNameMap.containsKey(value) ? colorNameMap.get(value) : Colour.AUTOMATIC;
    }

    public void loadImageView(ImageView imageView) {

        FileChooser fileChooser = new FileChooser();

        //Set extension filter
        FileChooser.ExtensionFilter extFilterJPG = new FileChooser.ExtensionFilter("JPG files (*.jpg)", "*.JPG");
        FileChooser.ExtensionFilter extFilterPNG = new FileChooser.ExtensionFilter("PNG files (*.png)", "*.PNG");
        fileChooser.getExtensionFilters().addAll(extFilterJPG, extFilterPNG);

        //Show open file dialog
        File file = fileChooser.showOpenDialog(null);

        try {
            BufferedImage bufferedImage = ImageIO.read(file);
            Image image = SwingFXUtils.toFXImage(bufferedImage, null);
            imageView.getId();
            imageView.setImage(image);
            ScrollPane scrollPane = new ScrollPane();
            scrollPane.setContent(null);
            scrollPane.setContent(imageView);
        } catch (IOException ex) {
            // System.err.println(ex.toString());
            imageView.setImage(new Image("/resources/icons/no-image.jpg", 102, 114, false, false));
        }
        imageView.minHeight(102);
        imageView.minWidth(102);

    }

    public void saveImage(Stage stage, ImageView imageView, String employeeid) throws SQLException, ClassNotFoundException {
        FileChooser fc = new FileChooser();
        FileChooser.ExtensionFilter ext1 = new FileChooser.ExtensionFilter("JPG files(*.jpg)", "*.JPG");
        FileChooser.ExtensionFilter ext2 = new FileChooser.ExtensionFilter("PNG files(*.png)", "*.PNG");
        fc.getExtensionFilters().addAll(ext1, ext2);
        File file = fc.showOpenDialog(stage);

        BufferedImage bf;
        try {
            bf = ImageIO.read(file);
            Image image = SwingFXUtils.toFXImage(bf, null);
            imageView.setImage(image);
            FileInputStream fin = new FileInputStream(file);
            int len = (int) file.length();
            connection = connexion.getConnetion();
            pst = connection.prepareStatement("UPDATE `tblguards` SET `picture`=? WHERE `employeeid`=?");
            pst.setBinaryStream(1, fin, len);
            pst.setString(2, employeeid);
            int status = pst.executeUpdate();
            if (status > 0) {
                alertSuccessful(alert, "Profile photo updated");
            }
        } catch (IOException ex) {
            alertError(alert, ex.toString());
        }
    }

    public void retrieveImage(ImageView imageView, ResultSet result) throws SQLException, IOException {
        //get blob
        Blob blob = result.getBlob("picture");

        //convert blob to byte[]
        InputStream input = blob.getBinaryStream();
        byte[] img = new byte[new Long(blob.length()).intValue()];
        input.read(img);
        System.out.println("Blob to byte converted\n\n");

        //convert byte[] to image
        InputStream inputStream = new ByteArrayInputStream(img);
        BufferedImage image = ImageIO.read(inputStream);
        System.out.println("Byte to image converted\n\n");

        //show in label
        Image image1 = SwingFXUtils.toFXImage(image, null);
        imageView.setImage(image1);
        System.out.println("image set\n\n");

    }

    public void loadFile(String fileName) {

        FileChooser chooseFile = new FileChooser();
        chooseFile.setTitle("Select document name");
        chooseFile.showOpenDialog(this.stage);
        fileName = chooseFile.getInitialFileName();

    }

    public ObservableList loadDepartments() throws SQLException, ClassNotFoundException {
        connection = connexion.getConnetion();
        pst = connection.prepareStatement("SELECT `id`, `departmentid`, `departmentname`"
                + " FROM `tbldepartments`");
        rs = pst.executeQuery();
        while (rs.next()) {
            dataDepartments.add(rs.getString("departmentname"));
        }
        return dataDepartments.sorted();
    }

    public void selectDocument(String applicationFile, String path) {
        String fileName;
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new java.io.File("."));
        chooser.setDialogTitle("Select document name");
        chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        chooser.setAcceptAllFileFilterUsed(false);

        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            fileName = chooser.getSelectedFile().getName();
            applicationFile = fileName;
            path = chooser.getCurrentDirectory().getAbsolutePath();
            System.out.println("getCurrentDirectory(): " + chooser.getCurrentDirectory());
            System.out.println("getSelectedFile() : " + chooser.getSelectedFile());
        } else {
            System.out.println("No Selection ");
        }
    }

}
