public Character ch;

// once at the beginning
public void setup() {
  size(700,500);
  ch = new Character(width/2, height/2);
}

// infinite continuous loop, refresh rate/frame rate
public void draw() {
  background(240,240,240);
  
  fill(255,0,0);
  ch.display();
  ch.move();
}
