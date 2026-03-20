public class Record {
    private String name;
    private String dept;
    private int yearStarted;

    // Default Constructor - default/fallback data for new objects
    public Record() {
        name = "";
        dept = "";
        yearStarted = -1;
    }

    // Initialization Constructor - allows you to define the data right away
    public Record(String tempName, String tempDept, int tempYear) {
        name = tempName;
        dept = tempDept;
        yearStarted = tempYear;
    }

    // Accessor Method - access/output the data from the object
    public void display() {
        System.out.println("Employee Record Information.....");
        System.out.println("Employee Name: " + name);
        System.out.println("Deptartment: " + dept);
        System.out.println("Year Employement Started: " + yearStarted);
        System.out.println();
    }

    // Modifier Method - allow a change of deptmartment variable
    public void changeDept(String tempDept) {
        dept = tempDept;
    }

}
