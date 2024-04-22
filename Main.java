public class Main {
    public static void main(String[] args) {
        Student s = new Student("Leon","Sobota","l.sobota@pjwstk.edu.pl","Warsaw, Koszykowa 86",new Date(2004,6,9));
        Student s1 = new Student("Adam","Wierzba","wierzba@pjwstk.edu.pl","Warsaw, Dolna 3",new Date(2002,4,7));

        System.out.println(s.indexNum);
        System.out.println(s1.indexNum);

        Studies it = new Studies("IT","x",7,4);

        s.enrollStudent(it,s);


        s.addGrade(4,"PGO");

        Student.promoteAllStudents();
        System.out.println(s.currentSemester);
        System.out.println(s1.currentSemester);

        s1.enrollStudent(it,s1);

        Student.promoteAllStudents();
        System.out.println(s.currentSemester);
        System.out.println(s1.currentSemester);

        Student.displayInfoAboutAllStudents();

    }
}
