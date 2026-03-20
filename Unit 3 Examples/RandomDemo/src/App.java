import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Random rdn = new Random();
        for (int i = 0; i < 100; i++) {
            //System.out.println( Math.round(Math.random() * 100) % 7 );
            System.out.println( rdn.nextDouble(20,100) );
        }
    }
}
