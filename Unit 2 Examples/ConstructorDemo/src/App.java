public class App {
    public static void main(String[] args) throws Exception {
        Record johndoe = new Record();
        Record janedoe = new Record("Jane", "HR", 2008);

        johndoe.printData();
        janedoe.printData();

        //Jane changes jobs
        janedoe.changeDept("Library Services");
        janedoe.printData();
    }   
}
