package inputs;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import main.GamePanel;
import static utilz.Constants.Directions.*;


public class KeyboardInputs implements KeyListener {

    private GamePanel gamePanel;

    public KeyboardInputs(GamePanel gamePanel) {
        this.gamePanel = gamePanel;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO: identical to keypressed but sets all cases set to false.

    }

    @Override
    public void keyPressed(KeyEvent e) {
        // TODO: don't do anything here.  UP, LEFT, DOWN, and RIGHT come from Constants.  Once you finish them
        // These shouldn't be red as I've already included the import.  above.
        switch (e.getKeyCode()) {
            case KeyEvent.VK_W:
                gamePanel.getGame().getPlayer().setUp(true);
                break;
            case KeyEvent.VK_A:
                //TODO: similiar to W, but left
                break;
            case KeyEvent.VK_S:
                // TODO: similar to W but down
                break;
            case KeyEvent.VK_D:
                // TODO: similar to D but right
                break;
        }

    }

}