
package odevınheritance;

public class Course {

    private int id;
    private String courseName;
    private String instructorName;
    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the courseName
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * @return the instructorName
     */
    public String getInstructorName() {
        return instructorName;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @param courseName the courseName to set
     */
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    /**
     * @param instructorName the instructorName to set
     */
    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }
    
}
