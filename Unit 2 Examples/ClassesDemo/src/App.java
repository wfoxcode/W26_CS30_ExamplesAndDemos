public class App {
    public static void main(String[] args) throws Exception {
        SubMethods fn = new SubMethods();

        fn.setHealth(100); //set health to 100 points
        fn.viewHealth();
        
        fn.damage();
        fn.damage();
        fn.damage();
        fn.viewHealth();

    }
}
