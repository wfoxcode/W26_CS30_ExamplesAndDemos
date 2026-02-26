public class TurkeyRunner {
    public static void main(String[] args) throws Exception {
        Turkey bird = new Turkey();
        
        System.out.println("Hello, World!");

        bird.speak();
        bird.sayName();

        insideFunc();
    }

    public void insideFunction() {
        System.out.println("this is an internal function");
    }
}
