import processing.core.PApplet;

public class EllipseMaker extends PApplet {
    private float x_coordinate;
    private float y_coordinate;
    private float width;
    private float height;
    private float speed;

    public EllipseMaker() {
    }

    public EllipseMaker(float x_coordinate, float y_coordinate, float width, float height, float speed) {
        this.x_coordinate = x_coordinate;
        this.y_coordinate = y_coordinate;
        this.width = width;
        this.height = height;
        this.speed = speed;
    }

//    public void make() {
//        ellipse(speed * x_coordinate, y_coordinate, width, height);
//    }

    public float getX_coordinate() {
        return x_coordinate;
    }

    public float getY_coordinate() {
        return y_coordinate;
    }

    public float getWidth() {
        return width;
    }

    public float getHeight() {
        return height;
    }

    public float getSpeed() {
        return speed;
    }

    public float moveX_coordinate() {
        return x_coordinate+=speed;
    }
}
