import java.awt.*;
import java.util.Random;

public class Tiger extends Critter {
    private Color color;
    String appearance;
    int moveCount;

    public Tiger() {
        setColor();
        appearance = "TGR";
        moveCount = 0;
    }

    public String toString() {
        return appearance;
    }

    @Override
    public Color getColor() {
        if (moveCount == 3) {
            moveCount = 0;
            setColor(); // color must change every third move
        }
        return color;
    }

    // always infect if an enemy is in front,
    // otherwise if a wall is in front or to the right, then turn left,
    // otherwise if a fellow Tiger is in front, then turn right,
    // otherwise hop.
    public Action getMove (CritterInfo info) {
        moveCount++;
        if (info.getFront() == Neighbor.OTHER) {
            return Action.INFECT;
        }
        if (info.getFront() == Neighbor.WALL || info.getRight() == Neighbor.WALL) {
            return Action.LEFT;
        }
        if (info.getFront() == Neighbor.SAME) {
            return Action.RIGHT;
        }
        return Action.HOP;
    }

    private void setColor() {
        Random number = new Random();
        switch (number.nextInt(3)) {
            case 0:
                color = Color.RED;
                break;
            case 1:
                color = Color.GREEN;
                break;
            case 2:
                color = Color.BLUE;
                break;
        }
    }
}
