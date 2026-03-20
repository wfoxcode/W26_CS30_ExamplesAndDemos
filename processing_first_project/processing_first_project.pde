public int x = 50;

public void setup() {
  size(700,500);
  background(150,50,50);
}

public void draw() {
  background(150,50,50);
  fill(255);
  circle(x,50,50);
  rect(100,100,200,50);
  
  x++;
}
