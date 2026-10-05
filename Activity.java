public class Activity {

    private int activityId;
    private String activityName;
    private String category;
    private String year;
    private String coordinator;

    // Constructor
    public Activity(int activityId,
                    String activityName,
                    String category,
                    String year,
                    String coordinator) {

        this.activityId = activityId;
        this.activityName = activityName;
        this.category = category;
        this.year = year;
        this.coordinator = coordinator;
    }

    public void displayActivity() {

        System.out.println(
                "\n--------------------------------"
        );

        System.out.println(
                "Activity ID : " + activityId
        );

        System.out.println(
                "Name        : " + activityName
        );

        System.out.println(
                "Category    : " + category
        );

        System.out.println(
                "Year        : " + year
        );

        System.out.println(
                "Coordinator : " + coordinator
        );

        System.out.println(
                "--------------------------------"
        );
    }

    public String getCategory() {
        return category;
    }

    public String getActivityName() {
        return activityName;
    }
}