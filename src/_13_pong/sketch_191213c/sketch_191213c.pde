int x;
int y;
int xdirection = 1;
int ydirection = 1;
PImage backgroundImage;
import ddf.minim.*;
Minim minim;
AudioSample sound;
void setup(){
 size(600,600);
 
 minim = new Minim (this);
sound = minim.loadSample("pong.wav", 128);
backgroundImage = loadImage("braekout.png");
}
void draw(){
 fill(255,255,255);
 stroke(255,255,255);
 image(backgroundImage, 0, 0);
image(backgroundImage, 0, 0, width, height);
 ellipse(x,y,20,20);
 rect(mouseX,550, 100, 10);
 x+=5*xdirection;
 y+=5*ydirection;
 if(x > width){
   xdirection = -1;
}else if(x<0){
  xdirection = 1;
}
if(y > height){
   ydirection = -1;
   
}else if(y<0){
  ydirection = 1;
}
if( y == 550 && x < mouseX + 100 && x > mouseX -100){
  ydirection = ydirection * -1;
  sound.trigger();
 
}
}
