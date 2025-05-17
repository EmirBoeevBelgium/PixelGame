package main;

import inputs.KeyboardInputs;
import inputs.MouseInputs;
import objects.AtariBall;
import objects.AtariPlatform;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GamePanel extends JPanel {

    private MouseInputs mouseInputs;
    private JFrame jFrame;
    private AtariPlatform atariPlatform;
    private AtariBall atariBall;
    private int frames = 0;
    private long lastCheck = 0;

    public GamePanel(JFrame jframe) {
        this.jFrame = jframe;

        atariPlatform = new AtariPlatform(jframe);
        atariBall = new AtariBall(jframe);
        mouseInputs = new MouseInputs(this, atariPlatform);
        addKeyListener(new KeyboardInputs(this));
        addMouseListener(mouseInputs);
        addMouseMotionListener(mouseInputs);
    }





   public void setObjPos(int x) {
        atariPlatform.move(x);
   }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        atariPlatform.draw(g);
        atariBall.draw(g);

        frames++;
        if(System.currentTimeMillis() - lastCheck >= 1000) {
            lastCheck = System.currentTimeMillis();
            System.out.println("Frames: " + frames);
            frames = 0;
        }

        repaint();
    }


}
