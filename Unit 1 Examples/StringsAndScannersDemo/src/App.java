import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // String word = "miller comp sci yqr";
        // String target = "comp ";

        // int idx = word.indexOf(target);
        // int len = target.length();

        // String newmsg = word.substring(idx+len);
        // System.out.println(newmsg);

        Scanner keys = new Scanner("this is a crazy message");
        String word;

        word = keys.next();
        System.out.println(word);

        word = keys.next();
        System.out.println(word);

        word = keys.next();
        System.out.println(word);

        word = keys.nextLine();
        System.out.println(word);

        // example 2 -------------------------
        Scanner keys2 = new Scanner(System.in);

        System.out.print("Enter a word: ");
        word = keys2.next();
        System.out.println(word);

        System.out.print("Enter a phrase: ");
        keys2.nextLine(); //throw away input to clear console
        word = keys2.nextLine();
        System.out.println(word);

        System.out.print("Enter a whole number: ");
        int num = keys2.nextInt();
        System.out.println(num);

        System.out.print("Enter a dec number: ");
        double num2 = keys2.nextDouble();
        System.out.println(num2);

    }
}
