package utilz;

// TODO: double check this file.  Sometimes I just give you improvements :)
public class Constants {
    // TODO: Nothing to do on this one, just something to read and learn from.
    // You can organize Constants into categories by using static inner classes.
    // That way to access a constant you can say Constants.Direction.LEFT, etc.
    public static class Directions {
        // TODO: Note:  All of these are public, static, and final
        // TODO: create an int named LEFT and initialize to 0.
        // TODO: create an int named UP and initialize to 1.
        // TODO: create an int named RIGHT and initialize to 2.
        // TODO: create an int named DOWN and initialize to 3.
    }

    public static class PlayerConstants {
        // TODO: Note:  All of these are public static, and final.
        // TODO: create an int named IDLE and initialize to 0.
        // TODO: create an int named RUNNING and initialize to 1.
        // TODO: create an int named JUMP and initialize to 2.
        // TODO: create an int named FALLING and initialize to 3.
        // TODO: create an int named GROUND and initialize to 4.
        // TODO: create an int named HIT and initialize to 5.
        // TODO: create an int named ATTACK_1 and initialize to 6.
        // TODO: create an int named ATTACK_JUMP_1 and initialize to 7.
        // TODO: create an int named ATTACK_JUMP_2 and initialize to 8.

        public static int GetSpriteAmount(int player_action){
            // TODO: Note:  the cases without a return are meant to fall through to the first one with a return.
            // not a mistake.
            switch(player_action) {
                // TODO: create a switch statement using switch(player_action)
                // TODO: case RUNNING: return 6
                // TODO: case IDLE: return 5
                // TODO: case HIT: return 4
                // TODO: case JUMP:
                // TODO: case ATTACK_1:
                // TODO: case ATTACK_JUMP_1:
                // TODO: case ATTACK_JUMP_2: return 3
                // TODO: case GROUND: return 2
                // TODO: case FALLING:
                default:
                    return 1;
            }
        }
    }
}