import java.util.Date;
public class Main {

    public static void main(String[] args) {



        Student student1 = new Student("Jan", "Nowak", "jannowak@poczta.pl", "Złota 44", "555666777", new Date(1999,1,1));
        System.out.println(student1);
        Student student2 = new Student("Adam", "Nowak", "adamnowak@poczta.pl", "Złota 45", "555666778", new Date(1999,2,1));
        System.out.println(student2);
        StudyProgramme it = new StudyProgramme("IT", "Komputerki i gierki", 8,6);
        student1.enrollStudent(it);
        System.out.println(student1);
        Student.promoteAllStudents();
        System.out.println(student1);
        System.out.println(student2);
        Student.promoteAllStudents();
        System.out.println(student1);
        System.out.println(student2);
        Student.promoteAllStudents();
        System.out.println(student1);
        System.out.println(student2);
        student1.addGrade(5, "PBO");
        student1.addGrade(3, "MAT");
        student2.addGrade(4, "RPG");
        student2.addGrade(4, "PRI");
        System.out.println(student1);
        System.out.println(student2);
    }
}