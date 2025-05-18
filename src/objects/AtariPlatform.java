package objects;

import main.GamePanel;

import javax.swing.*;
import java.awt.*;

public class AtariPlatform {
    private final int rectWidth= 200, rectHeight = 50;
    private float xDelta, yDelta;
    private final Color color = Color.BLACK;
    private JFrame jFrame;

    public AtariPlatform(JFrame jframe) {
        this.jFrame = jframe;
        xDelta = (float)jframe.getWidth()/2;
        yDelta = jframe.getHeight()-100;
    }

    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect((int) xDelta, (int) yDelta, rectWidth, rectHeight);
    }

    public void move(int x) {
        this.xDelta = x;

    }

    public int getXDelta() {
        return (int) xDelta;
    }

    public int getYDelta() {
        return (int) yDelta;
    }

    public int getRectWidth() {
        return rectWidth;
    }

    public int getRectHeight() {
        return rectHeight;
    }
}
