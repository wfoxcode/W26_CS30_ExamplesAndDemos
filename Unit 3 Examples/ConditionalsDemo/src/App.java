public class App {
    public static void main(String[] args) throws Exception {
        int x = 4;
        int y = 11;

        if (x >= 5) {
            System.out.println("Greater than five");
        }
        else if (y < 10) {
            System.out.println("Less than ten");
        }
        else {
            System.out.println("Something else");
        }

        boolean running = true;
      //if (running == true) alternatively
        if (running) {    
            System.out.println("Running is true");
        }
        else if (!running) { // !running is "not running"
            System.out.println("Running not true");
        }

    }
}
