package objects;

import javax.swing.*;
import java.awt.*;

public class AtariBall {

    private final int ovalWidth= 20, ovalHeight = 20;
    private float xDelta, yDelta;
    private float xDir= 0.05f, yDir= 0.05f;
    private final Color color = Color.RED;
    private JFrame jFrame;
    private AtariPlatform atariPlatform;

    public AtariBall(JFrame jframe, AtariPlatform atariPlatform) {
        this.jFrame = jframe;
        this.atariPlatform = atariPlatform;
        xDelta = (float) jframe.getWidth()/2;
        yDelta = (float) jframe.getHeight()/2;
    }

    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval((int) xDelta, (int) yDelta, ovalWidth, ovalHeight);
    }

    public void move() {
        this.xDelta += xDir;
        if(xDelta + (this.ovalWidth) > jFrame.getWidth() || xDelta < 0) {
            xDir *= -1;

        }

        this.yDelta += yDir;
        if(yDelta + (this.ovalHeight) > jFrame.getHeight() || yDelta < 0) {
            yDir *= -1;

        }

        //The ball needs to be between two x-values and under a certain y-value to register a hit on the platform
        if(xDelta + this.ovalWidth > atariPlatform.getXDelta() && xDelta < (atariPlatform.getXDelta()+ atariPlatform.getRectWidth()) &&
                yDelta + (this.ovalHeight) > atariPlatform.getYDelta()) {
            yDir *= -1;
        }

       /* if(yDelta + (this.ovalHeight) > atariPlatform.getYDelta() && yDelta < (atariPlatform.getYDelta()+ atariPlatform.getRectHeight()) &&
        xDelta + this.ovalWidth > atariPlatform.getXDelta()) {
            xDir *= -1;
        }*/



    }



    public int getRectWidth() {
        return ovalWidth;
    }

    public int getRectHeight() {
        return ovalHeight;
    }
}
