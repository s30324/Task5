import java.util.ArrayList;
public class Studies {
    public static ArrayList<Student>Students = new ArrayList<>();
    public String studiesProgramName;
    public String description;
    public int numOfSemesters;
    public int numOfMaxItn;


    public static ArrayList<Student> getStudents() {
        return Students;
    }
    public Studies(String studiesProgramName, String description, int numOfSemesters, int numOfMaxItn) {
        this.studiesProgramName = studiesProgramName;
        this.description=description;
        this.numOfSemesters = numOfSemesters;
        this.numOfMaxItn = numOfMaxItn;
    }
}
