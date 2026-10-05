public class Subject {

    private String subjectCode;
    private String subjectName;
    private int credits;

    // Constructor
    public Subject(String subjectCode,
                   String subjectName,
                   int credits) {

        this.subjectCode = subjectCode;
        this.subjectName = subjectName;
        this.credits = credits;
    }

    public void displaySubject() {

        System.out.println(
                subjectCode
                + " | "
                + subjectName
                + " | Credits: "
                + credits
        );
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public String getSubjectName() {
        return subjectName;
    }
}