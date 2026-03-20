public class Record {
    private String name; 
    private String dept;
    private int empYear; //year of employement

    // Default Constructor
    public Record() {
        name = "New Employee Record";
        dept = "No Dept Selected";
        empYear = 0;
    }
    // Initialization Constructor
    public Record(String tempName, String tempDept, int tempYear) {
        name = tempName;
        dept = tempDept;
        empYear = tempYear;
    }

    // Modifier Method
    public void changeDept(String tempDept) {
        dept = tempDept;
    }

    public void printData() {
        System.out.println("Employee Information...");
        System.out.println("Name: " + name);
        System.out.println("Deptartment: " + dept);
        System.out.println("Employement Year: " + empYear);
    }

}
