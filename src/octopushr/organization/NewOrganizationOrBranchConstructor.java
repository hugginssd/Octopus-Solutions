/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package octopushr.organization;

/**
 *
 * @author user
 */
public class NewOrganizationOrBranchConstructor {

    private String sno;
    private String orgName;
    private String headManager;
    private String contactPerson;
    private String phone;
    private String email;
    private String department;

    public NewOrganizationOrBranchConstructor(String sno, String orgName, String headManager, String contactPerson, String phone, String email, String department) {
        this.sno = sno;
        this.orgName = orgName;
        this.headManager = headManager;
        this.contactPerson = contactPerson;
        this.phone = phone;
        this.email = email;
        this.department = department;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getHeadManager() {
        return headManager;
    }

    public void setHeadManager(String headManager) {
        this.headManager = headManager;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    
    
    
}
