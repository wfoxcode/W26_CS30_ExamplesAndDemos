// CoolNumber Starter Code
// You only need one class for this project!
public class App {
    // Main method
    public static void main(String[] args) throws Exception {
        System.out.println("count: " + countCoolNum(250)); //example of a test case
    }

    // isCoolNum() test - returns true or false based on if it is a "cool number"
        // defn: a cool number is a number where you will get a remainer of 1 when divided by 3, 4, 5, and 6
        // remember MOD (%) gives you the remainer of a division statement
        // e.g.)   10 / 3.0 = 3.33 or 3 1/3   --> 10 % 3 = 1 meaning remainder 1
    public static boolean isCoolNum(int num) {
        
        return false; //Replace or remove when your code is added
    }

    // countCoolNum() method - returns the number of coolnums within the range between 6 to stop.
        // Note that the range is   6 < num < stop   or an interval of (6,stop) --> not equal to
    public static int countCoolNum(int stop) {
        int count = 0;  

        for(int val = 6; val < stop; val++) {
            
        }

        return count; //Final running total of cool numbers in range
    }
}




// public class App {
//     public static void main(String[] args) throws Exception {
//         int num = 0;
//         while (num < 5) {
//             System.out.println(num);
//             num++;
//         }

//         System.out.println("FOR LOOP: ");

//         for (int i = 0; i < 5; i++ ) {
//             System.out.println(i);
//         }
//     }
// }
