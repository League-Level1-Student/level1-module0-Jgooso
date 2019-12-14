int y;
int x;
int score;
int z;
void setup(){
  size(600,600);
  background(255,0,0);
  x = (int) random(600);
  
}
void draw(){
 //x=500;
 fill(0,255,0);
 
  y+=5;
  fill(0,0,255);
  stroke(0,0,255);
  background(255,0,0);
   rect(mouseX,570,30,30);
  ellipse(x,y,20,50);
 if(y >=600){
   y=0;
    x = (int) random(600);
    z = 1;
    
}
fill(0, 0, 0);
textSize(16);
text("Score: " + score, 20, 20);
checkCatch(x,y,z);
}
void checkCatch(int x, int y, int z){
  if(x > mouseX-30 && x < mouseX+100 && y > 590){
    score++;
    
  }else if (score > 0 && y >=600){
      score--;
      z = 0;
    }
    println("Your score is now: " + score);
  }
