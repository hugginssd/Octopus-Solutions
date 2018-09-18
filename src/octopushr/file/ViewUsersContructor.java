/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package octopushr.file;

//import javafx.beans.property.int;

/**
 *
 * @author user
 */

public class ViewUsersContructor {
    private int ID;
    private String EmployeeId;
    private String Surname;
    private String Firstname;
    private String Role;
    private String Department;

    public ViewUsersContructor(int ID, String EmployeeId, String Surname, String Firstname,String Role, String Department) {
        this.ID = ID;
        this.EmployeeId = EmployeeId;
        this.Surname = Surname;
        this.Firstname = Firstname;
        this.Role = Role;
        this.Department = Department;
    }

    
    
    public void setID(int ID) {
        this.ID = ID;
    }

    public void setEmployeeId(String EmployeeId) {
        this.EmployeeId = EmployeeId;
    }

    public void setSurname(String Surname) {
        this.Surname = Surname;
    }

    public void setFirstname(String Firstname) {
        this.Firstname = Firstname;
    }

    public void setRole(String Role) {
        this.Role = Role;
    }

    public void setDepartment(String Department) {
        this.Department = Department;
    }
    
    //getters
    public int getID() {
        return ID;
    }

    public String getEmployeeId() {
        return EmployeeId;
    }

    public String getSurname() {
        return Surname;
    }

    public String getFirstname() {
        return Firstname;
    }

    public String getRole() {
        return Role;
    }

    public String getDepartment() {
        return Department;
    }
}
