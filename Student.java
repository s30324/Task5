import java.util.ArrayList;

public class Student {
    public static int studentsCounter = 1;
    public String indexNum;
    public String name;
    public String lname;
    public String email;
    public String address;
    public String status; //candidate, student, graduate
    public Studies studies;
    public int currentSemester;
    public ArrayList<Double> GradeList = new ArrayList<>();
    public ArrayList<String> SubjectsList = new ArrayList<>();
    public int numOfInt;

    public Student(String name, String lname, String email, String address, Date Date) {
        this.name = name;
        this.lname = lname;
        this.email = email;
        this.address = address;
        this.indexNum = "s" + studentsCounter;
        studentsCounter++;
        numOfInt = 0;
        status = "candidate";
    }

    public void enrollStudent(Studies studies, Student student) {
        this.studies = studies;
        currentSemester = 1;
        studies.Students.add(student);
        status = "student";
    }

    public void addGrade(double grade, String subjectName) {
        GradeList.add(grade);
        SubjectsList.add(subjectName);
    }

    public void addItn() {
        numOfInt++;
    }

    public int getCurrentSemester() {
        return currentSemester;
    }

    public static void displayInfoAboutAllStudents() {

        ArrayList<Student> students = Studies.getStudents();

        for (Student student : students) {
            System.out.println(student.indexNum + " is on semester number: " + student.currentSemester);
        }
    }

    public static void promoteAllStudents() {
        ArrayList<Student> students = Studies.getStudents();
        for (Student student : students) {
            if (student.currentSemester >= 1 && student.currentSemester <= 6) {
                student.currentSemester++;
            }
            if (student.currentSemester == 7) {
                student.status = "graduate";
            }
            if (student.numOfInt >= student.studies.numOfMaxItn) {
                throw new IllegalArgumentException("too many Itns");
            }
        }


    }
}
