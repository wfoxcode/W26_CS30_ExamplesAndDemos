public class App {
    public static void main(String[] args) throws Exception {
        // Default Constructor used Record()
        Record johndoe = new Record();

        johndoe.display();
        johndoe.changeDept("HR");
        johndoe.display();

        // Initialization Constructor used Record(String, String, int)
        Record janedoe = new Record("Jane Doe", "Library Services", 2005);
        janedoe.display();
        janedoe.changeDept("Management");
        janedoe.display();
    }
}
