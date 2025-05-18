package inputs;

import main.Game;
import main.GamePanel;
import objects.AtariPlatform;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseInputs implements MouseListener, MouseMotionListener {

    private GamePanel gamePanel;
    private AtariPlatform atariPlatform;

    public MouseInputs(GamePanel gamePanel, AtariPlatform atariPlatform) {
        this.gamePanel = gamePanel;
        this.atariPlatform = atariPlatform;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Clicked the mouse");
       /* System.out.println(e.getX() + (gamePanel.getRectWidth()/2));
        if (gamePanel.getWidth() > (e.getX() + gamePanel.getRectWidth()/2)) {

            System.out.println(e.getX());
            System.out.println("It works!");
            System.out.println(gamePanel.getWidth());
        }*/
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        if (gamePanel.getWidth() >= (e.getX() + atariPlatform.getRectWidth()/2) && 0 <= (e.getX() - atariPlatform.getRectWidth()/2)) {
            gamePanel.setObjPos(e.getX() - (atariPlatform.getRectWidth()/2));
        }

       // System.out.println("X: From " + atariPlatform.getXDelta() + " to " + (atariPlatform.getXDelta() + atariPlatform.getRectWidth()));
    }
}
