public class Grade {
    private int grade;
    private String subject;

    public Grade(int grade, String subject) {
        this.grade = grade;
        this.subject = subject;
    }

    @java.lang.Override
    public String toString() {
        return subject + ": " + grade + "\t";
    }
}
