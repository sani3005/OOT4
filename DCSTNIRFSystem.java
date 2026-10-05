import java.util.ArrayList;
import java.util.Scanner;

public class DCSTNIRFSystem {

    static Scanner sc = new Scanner(System.in);

    // Collections
    static ArrayList<Student> students =
            new ArrayList<>();

    static ArrayList<Staff> staff =
            new ArrayList<>();

    static ArrayList<Course> courses =
            new ArrayList<>();

    static ArrayList<Activity> activities =
            new ArrayList<>();


    // ==========================================
    // ADD STUDENT
    // ==========================================

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


  
    // ADD STAFF

    static void addStaff() {

        System.out.println(
                "\n===== ADD STAFF ====="
        );

        System.out.print("Staff ID: ");
        String id = sc.nextLine();

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Phone: ");
        String phone = sc.nextLine();

        System.out.print("Age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Designation: ");
        String designation = sc.nextLine();

        System.out.print(
                "Staff Type (Teaching/Non-Teaching): "
        );

        String type = sc.nextLine();


        Staff s = new Staff(
                id,
                name,
                phone,
                age,
                designation,
                type
        );

        staff.add(s);

        System.out.println(
                "Staff added successfully!"
        );
    }

   
    // DISPLAY STAFF
    
    static void displayStaff() {

        System.out.println(
                "\n===== STAFF LIST ====="
        );

        if (staff.isEmpty()) {

            System.out.println(
                    "No staff available."
            );

            return;
        }

        for (Staff s : staff) {

            s.displayStaff();
        }
    }


    // ADD COURSE
   

    static void addCourse() {

        System.out.println(
                "\n===== ADD COURSE ====="
        );

        System.out.print("Course Code: ");
        String code = sc.nextLine();

        System.out.print("Course Name: ");
        String name = sc.nextLine();

        System.out.print("Duration in years: ");
        int duration = sc.nextInt();
        sc.nextLine();


        Course c = new Course(
                code,
                name,
                duration
        );

        courses.add(c);

        System.out.println(
                "Course added successfully!"
        );
    }


    // ADD SUBJECT TO COURSE
   
    static void addSubject() {

        if (courses.isEmpty()) {

            System.out.println(
                    "Please add a course first."
            );

            return;
        }

        System.out.println(
                "\n===== SELECT COURSE ====="
        );

        for (int i = 0; i < courses.size(); i++) {

            System.out.println(
                    (i + 1)
                    + ". "
                    + courses.get(i).getCourseName()
            );
        }

        System.out.print("Select course: ");

        int choice = sc.nextInt();
        sc.nextLine();

        if (choice < 1 ||
                choice > courses.size()) {

            System.out.println(
                    "Invalid choice."
            );

            return;
        }

        Course course =
                courses.get(choice - 1);


        System.out.print("Subject Code: ");
        String code = sc.nextLine();

        System.out.print("Subject Name: ");
        String name = sc.nextLine();

        System.out.print("Credits: ");
        int credits = sc.nextInt();
        sc.nextLine();


        Subject subject =
                new Subject(
                        code,
                        name,
                        credits
                );

        course.addSubject(subject);
    }


   
    // DISPLAY COURSES
    
    static void displayCourses() {

        System.out.println(
                "\n===== COURSE LIST ====="
        );

        if (courses.isEmpty()) {

            System.out.println(
                    "No courses available."
            );

            return;
        }

        for (Course c : courses) {

            c.displayCourse();
        }
    }


    // ADD ACTIVITY
    

    static void addActivity() {

        System.out.println(
                "\n===== ADD ACTIVITY ====="
        );

        System.out.print("Activity ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Activity Name: ");
        String name = sc.nextLine();

        System.out.print(
                "Category (Academic/Non-Academic): "
        );

        String category = sc.nextLine();

        System.out.print("Year: ");
        String year = sc.nextLine();

        System.out.print("Coordinator: ");
        String coordinator = sc.nextLine();


        Activity activity =
                new Activity(
                        id,
                        name,
                        category,
                        year,
                        coordinator
                );

        activities.add(activity);

        System.out.println(
                "Activity added successfully!"
        );
    }



    // DISPLAY ACTIVITIES
  

    static void displayActivities() {

        System.out.println(
                "\n===== ACTIVITY LIST ====="
        );

        if (activities.isEmpty()) {

            System.out.println(
                    "No activities available."
            );

            return;
        }

        for (Activity a : activities) {

            a.displayActivity();
        }
    }


    
    // NIRF SUMMARY
  

    static void nirfSummary() {

        System.out.println(
                "\n======================================"
        );

        System.out.println(
                "       DCST NIRF SUMMARY"
        );

        System.out.println(
                "======================================"
        );

        System.out.println(
                "Total Students : "
                + students.size()
        );

        System.out.println(
                "Total Staff    : "
                + staff.size()
        );

        System.out.println(
                "Total Courses  : "
                + courses.size()
        );

        System.out.println(
                "Total Activities: "
                + activities.size()
        );

        int academic = 0;
        int nonAcademic = 0;

        for (Activity a : activities) {

            if (a.getCategory()
                    .equalsIgnoreCase("Academic")) {

                academic++;
            }
            else {

                nonAcademic++;
            }
        }

        System.out.println(
                "Academic Activities : "
                + academic
        );

        System.out.println(
                "Non-Academic Activities : "
                + nonAcademic
        );

        System.out.println(
                "======================================"
        );
    }




    // ==========================================
    // MESSAGE PASSING
    // ==========================================

    static void generateReport(
            Reportable obj) {

        obj.generateReport();
    }


    //Main 

    public static void main(String[] args) {

        int choice;

        do {

            System.out.println(
                    "\n\n======================================"
            );

            System.out.println(
                    "     DCST NIRF MANAGEMENT SYSTEM"
            );

            System.out.println(
                    "======================================"
            );

            System.out.println(
                    "1.  Add Student"
            );

            System.out.println(
                    "2.  Display Students"
            );

            System.out.println(
                    "3.  Add Staff"
            );

            System.out.println(
                    "4.  Display Staff"
            );

            System.out.println(
                    "5.  Add Course"
            );

            System.out.println(
                    "6.  Add Subject to Course"
            );

            System.out.println(
                    "7.  Display Courses"
            );

            System.out.println(
                    "8.  Add Activity"
            );

            System.out.println(
                    "9.  Display Activities"
            );

            System.out.println(
                    "10. Summary"
            );

           
            System.out.println(
                    "11. Exit"
            );

            System.out.println(
                    "======================================"
            );

            System.out.print(
                    "Enter your choice: "
            );

            choice = sc.nextInt();
            sc.nextLine();


            switch (choice) {

                case 1:
                    addStudent();
                    break;

                case 2:
                    displayStudents();
                    break;

                case 3:
                    addStaff();
                    break;

                case 4:
                    displayStaff();
                    break;

                case 5:
                    addCourse();
                    break;

                case 6:
                    addSubject();
                    break;

                case 7:
                    displayCourses();
                    break;

                case 8:
                    addActivity();
                    break;

                case 9:
                    displayActivities();
                    break;

                case 10:
                    nirfSummary();
                    break;

                

                case 11:
                    System.out.println(
                            "Thank you!"
                    );
                    break;

                default:
                    System.out.println(
                            "Invalid choice!"
                    );
            }

        } while (choice != 12);

        sc.close();
    }
}