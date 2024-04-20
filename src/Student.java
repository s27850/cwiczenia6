import java.util.ArrayList;
import java.util.Date;

public class Student {
    private String es;
    private String fname;
    private String lname;
    private String mail;
    private String address;
    private String phoneNumber;
    private Date birthDate;
    private StudentStatus studentStatus;
    private int studentSemester;
    private StudyProgramme studyProgramme;
    private int itnCount;
    private ArrayList<Grade> grades = new ArrayList();
    private static int studentCount = 0;
    private static ArrayList<Student> allStudents = new ArrayList();

    public Student(String fname, String lname, String mail, String address, String phoneNumber, Date birthDate) {
        this.fname = fname;
        this.lname = lname;
        this.mail = mail;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.birthDate = birthDate;
        this.itnCount = 0;
        studentCount++;
        this.es = "s" + String.valueOf(studentCount);
        this.studentStatus = StudentStatus.KANDYDAT;
        allStudents.add(this);
    }
    public static void promoteAllStudents(){
        for (Student s : allStudents){
            if (s.studyProgramme == null) continue;
            if (s.itnCount > s.studyProgramme.allowedItn) continue;
            if (s.studentSemester == s.studyProgramme.howManySemesters){
                s.studentStatus = StudentStatus.ABSOLWENT;
                continue;
            }
            if (s.studentSemester != 0)s.studentSemester++;

        }
    }
    public void enrollStudent(StudyProgramme sp){
        this.studyProgramme = sp;
        this.studentSemester = 1;
        this.studentStatus = StudentStatus.STUDENT;
    }

    public void addGrade(int grade, String subject){
        this.grades.add(new Grade(grade, subject));
    }

    @java.lang.Override
    public String toString() {
        String gradesString = "";
        for (Grade g : grades){
            gradesString += g.toString();
        }

        return "PERSONAL DATA: \n" +
                "First name='" + fname + '\'' +
                ", Lastname='" + lname + '\'' +
                ", Mail='" + mail + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", birthDate=" + birthDate +
                "\nSTUDENT DATA: \n" +
                "es='" + es + '\'' +
                ", studentStatus=" + studentStatus +
                ", studentSemester=" + studentSemester +
                ", studyProgramme=" + studyProgramme +
                ", itnCount=" + itnCount +
                ", grades=" + grades + "\n";
    }
}
