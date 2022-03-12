import processing.core.PApplet;
import java.util.ArrayList;

public class FourBalls extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static ArrayList<DrawBall> balls = new ArrayList();
    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        for(int ball_number=1; ball_number<=4 ;ball_number++ ) {
            balls.add(new DrawBall(ball_number, ball_number*HEIGHT/5));
        }
    }

    @Override
    public void draw() {
        for(DrawBall ball : balls)
            ball.drawBall(this);
    }

    public static void main(String[] args) {
        PApplet.main("FourBalls",args);
    }
}
