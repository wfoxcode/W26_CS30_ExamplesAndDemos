import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        //Switch Case Vs Conditionals
        int season = 3;

        if (season == 0) {
            System.out.println("Winter");
        }
        else if(season == 1)
        {
            System.out.println("Spring");
        }
        else if(season == 2) {
            System.out.println("Summer");
        }
        else if(season == 3) {
            System.out.println("Fall");
        }

        switch (season) {
            case 0:
                System.out.println("Switch Winter");
                break;
            case 1:
                System.out.println("Switch Spring");
                break;
            case 2:
                System.out.println("Switch Summer");
                break;
            case 3:
                System.out.println("Switch Fall");
                break;
            default:
                System.out.println("Season unknown");
        }

        //Random Numbers
        Random r = new Random();

        for (int i = 0; i < 100; i++) {
            System.out.println(r.nextInt(-100,100));
            //System.out.println( Math.round(Math.random() * 4) );
        }



    }
}
