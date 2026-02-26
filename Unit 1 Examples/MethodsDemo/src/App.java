public class App {
    public static void main(String[] args) throws Exception {
        Speak charlie = new Speak();

        System.out.println("Hello, World!");
        internalFunc();
        charlie.talk();
        charlie.sayName();

    }

    public static void internalFunc() {
        System.out.println("This is inside the App class");
    }

}
