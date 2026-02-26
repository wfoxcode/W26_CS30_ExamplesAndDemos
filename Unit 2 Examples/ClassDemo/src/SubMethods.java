public class SubMethods {
    private int health;

    public void setNum(int tempNum) {
        health = tempNum;
    }

    public void getHealth() {
        System.out.println("The current health is " + health);
    }

    public void damage() {
        health--;
    }
}
