public class Character {
  public int x,y,r;
  public int cr, cg, cb; // colours
  
  public Character(int tempX, int tempY, int tempR) {
    x = tempX;
    y = tempY;
    r = tempR;
    
    //set colours
    cr = (int) random(256);
    cg = (int) random(256);
    cb = (int) random(256);
    
  }
  
  public void display() {
    fill(cr, cg, cb);
    circle(x,y,r*2); // circle takes x, y, extent (diameter)
    
    fill(255,0,0);
    circle(x, y-40,30);
  }
  
  public void move(int dir) {
    // 0 = up, 1 = right, 2 = down, 3 = left
    
    if (dir == 0) { 
      y = y - 1; //up - remember y is inverted scale
    }
    else if ( dir == 1) {
      x = x + 1; //right
    }
    else if (dir == 2) {
      y = y + 1; //down
    }
    else if (dir == 3) {
      x = x - 1; //left
    }
  }
  
}
