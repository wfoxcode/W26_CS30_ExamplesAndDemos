public class Speak {

    private String name = "Miller";

    public void talk() {
        System.out.println("This is a object function");
    }

    public void sayName() {
        System.out.println("My name is " + name);
        talk();
    }

}
