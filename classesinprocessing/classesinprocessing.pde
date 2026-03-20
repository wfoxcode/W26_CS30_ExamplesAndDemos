public Character john;

public void setup() {
  size(700,500);
  john = new Character(width/2, height/2, 100);
}

public void draw() {
  background(200,200,200);
  
  john.display();
  
}

public void keyPressed() {
  switch (key) {
    case 'w':
      john.move(0);
      break;
    case 'a':
      john.move(3);
      break;
    case 's':
      john.move(2);
      break;
    case 'd':
      john.move(1);
      break;
  }
}
