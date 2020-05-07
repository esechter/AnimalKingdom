import java.awt.*;

public class Giant extends Critter {
    Color color;
    int moveCount;

    public Giant() {
        color = Color.GRAY;
        moveCount = 0;
    }

    @Override
    public Color getColor() {
        return color;
    }

    public Action getMove(CritterInfo info) {
        moveCount++;
        if (info.getFront() == Neighbor.OTHER) {
            return Action.INFECT;
        }
        if (info.getFront() == Neighbor.EMPTY) {
            return Action.HOP;
        }
        return Action.RIGHT;
    }

    public String toString() {
        if (moveCount == 24) {
            moveCount = 0;
        }
        String appearance = "";
        if ((moveCount / 6) < 1) {
            appearance = "fee";
        } else if (moveCount / 6 == 1) {
            appearance = "fie";
        } else if (moveCount / 6 == 2) {
            appearance = "foe";
        } else {
            appearance = "fum";
        }
        return appearance;
    }
}
