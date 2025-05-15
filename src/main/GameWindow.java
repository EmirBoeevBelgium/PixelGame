package main;

import javax.swing.*;

public class GameWindow {
    private JFrame jframe;
    private GamePanel gamePanel;
    public GameWindow(JFrame jframe) {
        this.jframe = jframe;

        jframe.setExtendedState(JFrame.MAXIMIZED_BOTH);
        jframe.setUndecorated(false);

        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jframe.setLocationRelativeTo(null);
        jframe.setVisible(true);

        gamePanel = new GamePanel(jframe);
        jframe.add(gamePanel);
    }

    public void requestFocusOnGamePanel() {
        gamePanel.requestFocus();
    }
}
