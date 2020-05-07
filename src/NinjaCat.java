import java.awt.*;

public class NinjaCat extends Critter{
    Color color;
    int moveCount;

    public NinjaCat() {
        color = Color.ORANGE;
        moveCount = 0;
    }

    public Color getColor() {
        return color;
    }

    public String toString() {
        if (moveCount < 50) {
            return "o~";
        }
        return "~O";
    }

    public Action getMove(CritterInfo info) {
        moveCount++;
        if (info.getFront() == Neighbor.SAME) {
            return Action.RIGHT;
        }
        if (info.getFront() == Neighbor.OTHER) {
            return Action.INFECT;
        } if (info.getFront() == Neighbor.WALL) {
            return Action.LEFT;
        }
        return Action.HOP;
    }

}
