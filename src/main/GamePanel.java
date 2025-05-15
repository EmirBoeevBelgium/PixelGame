package main;

import inputs.KeyboardInputs;
import inputs.MouseInputs;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GamePanel extends JPanel {

    private MouseInputs mouseInputs;
    private JFrame jFrame;
    private int xDelta, yDelta;

    public GamePanel(JFrame jframe) {
        this.jFrame = jframe;
        xDelta = jframe.getWidth()/2;
        yDelta = jframe.getHeight()-100;
        mouseInputs = new MouseInputs(this);
        addKeyListener(new KeyboardInputs(this));
        addMouseListener(mouseInputs);
        addMouseMotionListener(mouseInputs);
    }

    public void printHeight() {
        System.out.println("Height: " + jFrame.getHeight());
        System.out.println("Width: " + jFrame.getWidth());
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
        this.xDelta = x;
       // this.yDelta = y;
        repaint();
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.fillRect(xDelta, yDelta, 200, 50);
    }
}
