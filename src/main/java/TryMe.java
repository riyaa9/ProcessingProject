import processing.core.PApplet;
public class TryMe extends PApplet{
    public static void main(String[] args){
        PApplet.main("TryMe",args);
    }
    public static final int WIDTH=640;
    public static final int HEIGHT=480;
    public static final int DIAMETER=10;

    @Override
    public void settings() {
        super.settings();
        size(WIDTH,HEIGHT);
    }

    @Override
    public void setup(){
//        ellipse(100,100,100,100);
    }
    int x,y,z,w=0;

    @Override
    public void draw(){
//        paintWhite();
        ellipse(x,100,DIAMETER,DIAMETER);
        x++;
        ellipse(y,200,DIAMETER,DIAMETER);
        y+=2;
        ellipse(z,300,DIAMETER,DIAMETER);
        z+=3;
        ellipse(w,400,DIAMETER,DIAMETER);
        w+=4;

    }
    public void paintWhite(){
        background(255);
    }

}
