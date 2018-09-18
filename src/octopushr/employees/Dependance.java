package octopushr.employees;

/**
 *
 * @author HUGGINS
 */
public class Dependance {

    private String id;
    private String dependantname;
    private String relationship;
    private String dependanceNotes;

    public Dependance(String id, String dependantname, String relationship, String dependanceNotes) {
        this.id = id;
        this.dependantname = dependantname;
        this.relationship = relationship;
        this.dependanceNotes = dependanceNotes;
    }

    public String getDependanceNotes() {
        return dependanceNotes;
    }

    public void setDependanceNotes(String dependanceNotes) {
        this.dependanceNotes = dependanceNotes;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDependantname() {
        return dependantname;
    }

    public void setDependantname(String dependantname) {
        this.dependantname = dependantname;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

}
