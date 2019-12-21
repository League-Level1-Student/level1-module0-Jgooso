PImage pictureOfRecord; 
int angle;
import ddf.minim.*; //at the very top of your sketch
Minim minim; //as a member variable
AudioPlayer song; //as a member variable

void setup(){
  minim = new Minim(this); //in the setup method
song = minim.loadFile("dio.mp3", 512);//in the setup method

      //as member variable
size(600,600);     //in setup method
pictureOfRecord= loadImage("record.png");     //in setup method
pictureOfRecord.resize(600,600);
}
void draw(){
  angle+=1;
  image(pictureOfRecord, 0, 0);     //in draw method
 if(mousePressed == true){
    rotateImage(pictureOfRecord, angle);
 image(pictureOfRecord,25,25);
 song.play();
}else{
  song.pause();
}
}
void rotateImage(PImage image, int amountToRotate) {
     translate(width/2, height/2);
     rotate(amountToRotate*TWO_PI/360);
     translate(-image.width/2, -image.height/2);
}
