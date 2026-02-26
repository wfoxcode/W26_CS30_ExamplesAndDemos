public class App {
    public static void main(String[] args) throws Exception {
        // STRING METHODS
        String msg = "this word is a string";   
        String target = "word";
        int idx = msg.indexOf(target);
        int len = target.length();
        
        String newmsg = msg.substring(idx+len);
        System.out.println(idx);
        System.out.println(len);
        System.out.println(newmsg);

    }
}
