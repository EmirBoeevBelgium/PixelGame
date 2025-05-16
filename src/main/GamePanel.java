package main;

import inputs.KeyboardInputs;
import inputs.MouseInputs;
import objects.AtariPlatform;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GamePanel extends JPanel {

    private MouseInputs mouseInputs;
    private JFrame jFrame;
    private int xDelta, yDelta;
    private int rectWidth= 200, rectHeight = 50;
    private AtariPlatform atariPlatform;

    public GamePanel(JFrame jframe) {
        this.jFrame = jframe;
        xDelta = jframe.getWidth()/2;
        yDelta = jframe.getHeight()-100;

        atariPlatform = new AtariPlatform(jFrame);
        mouseInputs = new MouseInputs(this, atariPlatform);
        addKeyListener(new KeyboardInputs(this));
        addMouseListener(mouseInputs);
        addMouseMotionListener(mouseInputs);
    }


    public void changeXDelta(int value) {
        this.xDelta += value;
        repaint();
    }
    public void changeYDelta(int value) {
        this.yDelta += value;
        repaint();
    }


   public void setRectPos(int x, int y) {
        atariPlatform.move(x, y);
        repaint();
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        atariPlatform.draw(g);

    }

    public int getRectWidth() {
        return rectWidth;
    }

    public int getRectHeight() {
        return rectHeight;
    }

}
