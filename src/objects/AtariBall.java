package objects;

import javax.swing.*;
import java.awt.*;

public class AtariBall {

    private final int ovalWidth= 20, ovalHeight = 20;
    private int xDelta, yDelta;
    private final Color color = Color.RED;
    private JFrame jFrame;

    public AtariBall(JFrame jframe) {
        this.jFrame = jframe;
        xDelta = jframe.getWidth()/2;
        yDelta = jframe.getHeight()/2;
    }

    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(xDelta, yDelta, ovalWidth, ovalHeight);
    }

    public void move(int x) {
        this.xDelta = x;

    }



    public int getRectWidth() {
        return ovalWidth;
    }

    public int getRectHeight() {
        return ovalHeight;
    }
}
