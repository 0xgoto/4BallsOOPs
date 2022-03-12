import processing.core.PApplet;

public class DrawBall extends PApplet{
    private int BALL_NUMBER ;
    private int X_AXIS;
    private final int HEIGHT;
    private final int DIAMETER;

    public DrawBall(int ball_number, int height) {
        this.BALL_NUMBER = ball_number;
        this.X_AXIS = 0;
        this.HEIGHT = height;
        this.DIAMETER = 10;
    }

    public void drawBall(FourBalls fourBalls) {
        fourBalls.ellipse(X_AXIS, HEIGHT, DIAMETER, DIAMETER);
        X_AXIS = X_AXIS + BALL_NUMBER;
    }
}
