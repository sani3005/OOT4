public abstract class Person {

    public String name;       // public
    private String phone;     // private
    protected int age;       // protected

    static int count = 0;

    // Constructor
    Person(String name, String phone, int age) {
        this.name = name;
        this.phone = phone;
        this.age = age;
        count++;
    }

    // Access private variable
    public String getPhone() {
        return phone;
    }

    public abstract void displayRole();

    // Static method
    public static void showCount() {
        System.out.println("Total Persons: " + count);
    }
}