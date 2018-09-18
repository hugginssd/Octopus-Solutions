package octopushr.organization;

/**
 *
 * @author Huggins
 */
public class HrandadminConstructor {

    private String empID;
    private String name;
    private String designation;
    private String department;
//<<<<<<< HEAD
    private Boolean verify;
    private Boolean active;
    private String location;

    public HrandadminConstructor(String empID, String name, String designation, String department, Boolean verify, Boolean active, String location) {
//>>>>>>> f5c7a74c0fba43c1a593f4c9fd5c119e38b274d5
        this.empID = empID;
        this.name = name;
        this.designation = designation;
        this.department = department;
        this.verify = verify;
        this.active = active;
        this.location = location;

    }

    public String getEmpID() {
        return empID;
    }

    public void setEmpID(String empID) {
        this.empID = empID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

//<<<<<<< HEAD
    public Boolean getVerify() {
        return verify;
    }

    public void setVerify(Boolean verify) {
        this.verify = verify;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }


    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}
