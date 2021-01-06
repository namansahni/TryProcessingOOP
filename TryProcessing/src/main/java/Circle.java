import processing.core.PApplet;

public class Circle {

    private float xCoordinate;
    private float yCoordinate;
    private float diameter;
    private float speed;
    private PApplet pApplet;

    public Circle(float xCoordinate, float yCoordinate, float diameter, float speed, PApplet pApplet) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.diameter = diameter;
        this.speed = speed;
        this.pApplet = pApplet;
    }

    public void make() {
        pApplet.ellipse(moveXCoordinate(), yCoordinate, diameter, diameter);
    }

    private float moveXCoordinate() {
        return xCoordinate += speed;
    }

}