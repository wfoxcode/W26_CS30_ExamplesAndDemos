public class App {
    public static void main(String[] args) throws Exception {
        int x = 5;
        int y = 11;

        if (x>5) {
            System.out.println("Greater than five");
        }
        else if (y < 10) {
            System.out.println("Less than ten");
        }
        else {
            System.out.println("Something else");
        }

        // Boolean Variables
        boolean running = false;

        // if (running == true) --> alternative
        if (running) {
            System.out.println("Running is true!");
        }
        else {
            System.out.println("Running is false!");
        }

        // Not operator
        if (!running) { // !running means 'not running'
            System.out.println("Not running equals true");
        }
        else {
            System.out.println("Not running equals false");
        }

        // AND(&&), OR(||), logical operators
        x = 4;
        y = 8;
        if (x < 5 && y > 5) {
            System.out.println("AND --> True Case");
        }
        if (x < 5 || y > 5) {
            System.out.println("OR --> True Case");
        }

    }
}
