package main;

import inputs.KeyboardInputs;
import inputs.MouseInputs;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {

    private MouseInputs mouseInputs;
    private Game game;

    public GamePanel(Game game) {
        mouseInputs = new MouseInputs(this);
        this.game = game;

        setPanelSize();
        addKeyListener(new KeyboardInputs(this));
        addMouseListener(mouseInputs);
        addMouseMotionListener(mouseInputs);
    }

    private void setPanelSize() {
        // TODO: create a Dimension called size and set to new Dimension passing in GAME_WIDTH, and GAME_HEIGHT
        // TODO: call setPreferredSize passing in size
    }

    public void updateGame() {

    }

    public void paintComponent(Graphics g) {
        // TODO: call super.paintComponent(g)
        // TODO: call game.render passing in g
    }

    public Game getGame() {
        return game;
    }

}