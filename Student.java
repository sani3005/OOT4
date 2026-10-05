import java.util.ArrayList;
import java.util.Scanner;


public class Student extends Person
        implements Reportable, Cloneable {

    static Scanner sc = new Scanner(System.in);

    private String studentId;
    private String course;
    private int year;

    // Constructor
    public Student(String studentId,
                   String name,
                   String phone,
                   int age,
                   String course,
                   int year) {

        super(name, phone, age);

        this.studentId = studentId;
        this.course = course;
        this.year = year;
    }

    // Getters
    public String getStudentId() {
        return studentId;
    }

    public String getCourse() {
        return course;
    }

    public int getYear() {
        return year;
    }

    // Method overriding
    @Override
    public void displayRole() {

        System.out.println(
                "Role: Student"
        );
    }

    // Interface method
    @Override
    public void generateReport() {

        System.out.println(
                "Student Report"
        );

        System.out.println(
                "ID     : " + studentId
        );

        System.out.println(
                "Name   : " + name
        );

        System.out.println(
                "Course : " + course
        );

        System.out.println(
                "Year   : " + year
        );
    }

    // Method overloading
    public void displayStudent() {

        System.out.println(
                studentId + " | "
                + name + " | "
                + course + " | Year "
                + year
        );
    }

    public void displayStudent(boolean detailed) {

        if (detailed) {
            generateReport();
        }
        else {
            displayStudent();
        }
    }

    static ArrayList<Student> students =
            new ArrayList<>();

    static void addStudent() {

        System.out.println(
                "\n===== ADD STUDENT ====="
        );

        System.out.print("Student ID: ");
        String id = sc.nextLine();

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Phone: ");
        String phone = sc.nextLine();

        System.out.print("Age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Course: ");
        String course = sc.nextLine();

        System.out.print("Year: ");
        int year = sc.nextInt();
        sc.nextLine();


        Student s = new Student(
                id,
                name,
                phone,
                age,
                course,
                year
        );

        students.add(s);

        System.out.println(
                "Student added successfully!"
        );
    }


     // DISPLAY STUDENTS
    
    static void displayStudents() {

        System.out.println(
                "\n===== STUDENT LIST ====="
        );

        if (students.isEmpty()) {

            System.out.println(
                    "No students available."
            );

            return;
        }

        for (Student s : students) {

            s.displayStudent();
        }
    }

    
    // Cloning
    @Override
    public Student clone() {

        try {
            return (Student) super.clone();
        }
        catch (CloneNotSupportedException e) {
            return null;
        }
    }


}