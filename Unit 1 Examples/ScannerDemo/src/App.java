import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // String name = "fox";
        // String name2 = new String("wolf");

        Scanner keys = new Scanner("miller comp sci yqr 123");
        String word;

        word = keys.next();
        System.out.println(word);

        word = keys.next();
        System.out.println(word);

        word = keys.next();
        System.out.println(word);

        word = keys.next();
        System.out.println(word);

        int num = keys.nextInt();
        System.out.println(num);

        // example 2 --------------------------------------
        Scanner keys2 = new Scanner(System.in);

        System.out.print("Type a word: ");
        word = keys2.next();
        System.out.println("input = " + word);

        System.out.print("Type a int: ");
        num = keys2.nextInt();
        System.out.println("input = " + num);

        System.out.print("Type a decimal: ");
        double num2 = keys2.nextDouble();
        System.out.println("input = " + num2);

        System.out.print("Type a line of words: ");
        word = keys2.nextLine();
        System.out.println("input = " + word);

    }
}
