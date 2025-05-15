package main;

import javax.swing.*;

public class Game {
    private GameWindow gameWindow;
    private GamePanel gamePanel;
    private JFrame jframe = new JFrame();
    public Game() {
    //   gamePanel = new GamePanel(jframe);
        gameWindow = new GameWindow(jframe);

        //gamePanel.requestFocus();
        gameWindow.requestFocusOnGamePanel();
    }

}
