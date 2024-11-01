package entities;

import java.awt.image.BufferedImage;

public class Player extends Entity{
    private BufferedImage [][] animation;
    private int aniTick, aniIndex, aniSpeed = 25;
    private int playerAction = IDLE;
    private boolean moving = false;
    private boolean left, up, right, down;
    private float PlayerSpeed =  2.0f;


    public Player(float x, float y) {
        super(x, y);
    }


}
