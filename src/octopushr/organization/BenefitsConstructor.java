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
public class BenefitsConstructor {

    private int id;
    private String facilityid;
    private String facilities;
    private String description;

    public BenefitsConstructor(int id, String facilityid, String facilities, String description) {
        this.id = id;
        this.facilityid = facilityid;
        this.facilities = facilities;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFacilityid() {
        return facilityid;
    }

    public void setFacilityid(String facilityid) {
        this.facilityid = facilityid;
    }

    public String getFacilities() {
        return facilities;
    }

    public void setFacilities(String facilities) {
        this.facilities = facilities;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
