import processing.core.PApplet;

import java.util.ArrayList;
import java.util.List;

public class TryProcessingOOP extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;
    public static float xPos = 0;
    public static final int yAxisDivider = 5;

    List<Circle> circle = new ArrayList<>();

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

        float yPos = HEIGHT / yAxisDivider;
        for (int speed = 1; speed < 5; speed++) {
            circle.add(new Circle(xPos, speed * yPos, DIAMETER, speed, this));
        }
    }

    @Override
    public void draw() {
        drawCircle();
    }

    private void drawCircle() {
        for (int speed = 1; speed < 5; speed++) {
            circle.get(speed - 1).make(); // 0 based indexing
        }
    }

}