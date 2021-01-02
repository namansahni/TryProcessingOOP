import processing.core.PApplet;

public class TryProcessingOOP extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;
    private static final int NO_OF_CIRCLES = 4;
    public static float x_pos = 0;

    EllipseMaker ellipseMaker1;
    EllipseMaker ellipseMaker2;
    EllipseMaker ellipseMaker3;
    EllipseMaker ellipseMaker4;


    public static void main(String args[]) {
        PApplet.main("TryProcessingOOP", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        super.setup();

        float y_pos = (HEIGHT) / 5;
        ellipseMaker1 = new EllipseMaker(x_pos, 1 * y_pos, DIAMETER, DIAMETER, 1);
        ellipseMaker2 = new EllipseMaker(x_pos, 2 * y_pos, DIAMETER, DIAMETER, 2);
        ellipseMaker3 = new EllipseMaker(x_pos, 3 * y_pos, DIAMETER, DIAMETER, 3);
        ellipseMaker4 = new EllipseMaker(x_pos, 4 * y_pos, DIAMETER, DIAMETER, 4);
    }

    @Override
    public void draw() {
        drawSketch();
    }

    private void drawSketch() {
        ellipse(ellipseMaker1.moveX_coordinate(),ellipseMaker1.getY_coordinate(),ellipseMaker1.getWidth(),ellipseMaker1.getHeight());
        ellipse(ellipseMaker2.moveX_coordinate(),ellipseMaker2.getY_coordinate(),ellipseMaker2.getWidth(),ellipseMaker2.getHeight());
        ellipse(ellipseMaker3.moveX_coordinate(),ellipseMaker3.getY_coordinate(),ellipseMaker3.getWidth(),ellipseMaker3.getHeight());
        ellipse(ellipseMaker4.moveX_coordinate(),ellipseMaker4.getY_coordinate(),ellipseMaker4.getWidth(),ellipseMaker4.getHeight());
    }

}