package objects;

import main.GamePanel;

import javax.swing.*;
import java.awt.*;

public class AtariPlatform {
    private final int rectWidth= 200, rectHeight = 50;
    private int xDelta, yDelta;
    private final Color color = Color.BLACK;
    private JFrame jFrame;

    public AtariPlatform(JFrame jframe) {
        this.jFrame = jframe;
        xDelta = jframe.getWidth()/2;
        yDelta = jframe.getHeight()-100;
    }

    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(xDelta, yDelta, rectWidth, rectHeight);
    }

    public void move(int x, int y) {
        this.xDelta = x;
        // this.yDelta = y;

    }



    public int getRectWidth() {
        return rectWidth;
    }

    public int getRectHeight() {
        return rectHeight;
    }
}
