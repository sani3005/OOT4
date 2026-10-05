public class Staff extends Person
        implements Reportable {

    private String staffId;
    private String designation;
    private String staffType;

    // Constructor
    public Staff(String staffId,
                 String name,
                 String phone,
                 int age,
                 String designation,
                 String staffType) {

        super(name, phone, age);

        this.staffId = staffId;
        this.designation = designation;
        this.staffType = staffType;
    }

    // Method overriding
    @Override
    public void displayRole() {

        System.out.println(
                "Role: " + staffType + " Staff"
        );
    }

    // Interface method
    @Override
    public void generateReport() {

        System.out.println(
                "\nStaff Report"
        );

        System.out.println(
                "ID          : " + staffId
        );

        System.out.println(
                "Name        : " + name
        );

        System.out.println(
                "Designation : " + designation
        );

        System.out.println(
                "Type        : " + staffType
        );
    }

    public void displayStaff() {

        System.out.println(
                staffId + " | "
                + name + " | "
                + designation + " | "
                + staffType
        );
    }
}