import java.awt.*;

public class Bear extends Critter {
    private Color color;
    private int moveCount; // assignment says to not worry about integer overflow

    public Bear(boolean polar) {
        color = (polar) ? Color.WHITE : Color.BLACK;
        moveCount = 0;
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        if (moveCount % 2 == 0) {
            moveCount++;
            return "/";
        }
        moveCount++;
        return "\\";
    }

    @Override
    // always infect if an enemy is in front, otherwise hop if possible, otherwise turn left.
    public Action getMove(CritterInfo info) {
        switch (info.getFront()) {
            case OTHER:
                return Action.INFECT;
            case EMPTY:
                return Action.HOP;
            default:
                return Action.LEFT;
        }
    }
}
