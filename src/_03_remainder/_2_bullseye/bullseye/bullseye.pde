
void setup() {
 
  // set the size of your sketch
  size(250, 250);
}

void draw() {
  int x = 100;
  int y = 100;
  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.
  
  for(int w = 10; w < 20; w++){
    if (w % 2 == 0){
      fill(255, 0 , 0);
    }else{
      fill(0, 0, 0);
    }
    ellipse(125, 125, x, y);
    fill(255, 255, 255);
    x = x - 10;
    y = y - 10;

    
  }
  //Use an if statement and remainder to alternate the color of your rings.
  
  
}
