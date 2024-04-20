public class StudyProgramme {
    private String name;
    private String description;
    int howManySemesters;
    int allowedItn;

    public StudyProgramme(String name, String description, int howManySemesters, int allowedItn) {
        this.name = name;
        this.description = description;
        this.howManySemesters = howManySemesters;
        this.allowedItn = allowedItn;
    }

    @java.lang.Override
    public String toString() {
        return " [Name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", howManySemesters=" + howManySemesters +
                ", allowedItn=" + allowedItn + " ]";
    }
}
