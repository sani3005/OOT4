import java.util.ArrayList;

public class Course {

    private String courseCode;
    private String courseName;
    private int duration;

    // Collection of subjects
    private ArrayList<Subject> subjects;

    // Constructor
    public Course(String courseCode,
                  String courseName,
                  int duration) {

        this.courseCode = courseCode;
        this.courseName = courseName;
        this.duration = duration;

        subjects = new ArrayList<>();
    }

    // Add subject
    public void addSubject(Subject subject) {

        subjects.add(subject);

        System.out.println(
                "Subject added successfully."
        );
    }

    // Display course
    public void displayCourse() {

        System.out.println(
                "\n--------------------------------"
        );

        System.out.println(
                "Course Code : " + courseCode
        );

        System.out.println(
                "Course Name : " + courseName
        );

        System.out.println(
                "Duration    : " + duration + " years"
        );

        System.out.println(
                "Subjects:"
        );

        if (subjects.isEmpty()) {

            System.out.println(
                    "No subjects added."
            );

        }
        else {

            for (Subject s : subjects) {

                s.displaySubject();
            }
        }

        System.out.println(
                "--------------------------------"
        );
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseName() {
        return courseName;
    }
}