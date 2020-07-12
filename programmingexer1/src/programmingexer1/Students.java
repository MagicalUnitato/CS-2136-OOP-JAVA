package programmingexer1;
/**
 *
 * @author Bryce Philbert Murphy Salvador
 */
public class Students {
    int id;
    String Name;
    String Course;
    String Address;
    public Students() {
        this(0,"","","");
    }
    public Students(int id, String Name, String Course, String Address) {
        this.id = id;
        this.Name = Name;
        this.Course = Course;
        this.Address = Address;
    }
    
}

