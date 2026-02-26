public class SubMethods {
    private int health;

    public void setHealth(int tempH) {
        health = tempH; //set the private variable w/ param
    }

    public void damage() {
        health--; //decrease health by 1
    }

    public void viewHealth() {
        System.out.println("The current health is at " + health);
    }

}
