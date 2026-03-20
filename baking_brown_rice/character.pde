public class Character {
  public int x,y,r;
  
  // constructer
  public Character(int tempX, int tempY) {
    x = tempX;
    y = tempY;
    r = 100;
  }
  
  public void display() {
    fill(255,0,0);
    circle(x,y,r);
  }
  
  public void move() {
    x = x + 1;
  }
  
}
