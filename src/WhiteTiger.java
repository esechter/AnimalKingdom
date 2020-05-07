import java.awt.*;

public class WhiteTiger extends Critter {
    Color color;
    boolean hasInfectedACritter;

    public WhiteTiger() {
        color = Color.WHITE;
        hasInfectedACritter = false;
    }

    @Override
    public Color getColor() {
        return color;
    }

    public String toString() {
        String appearance = (hasInfectedACritter) ? "TGR" : "tgr";
        return appearance;
    }

    public Action getMove(CritterInfo info) {
        if (info.getFront() == Neighbor.OTHER) {
            hasInfectedACritter = true;
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
}
