import static org.junit.jupiter.api.Assertions.*;
import java.awt.*;

class CritterTest {

    @org.junit.jupiter.api.Test
    void getBearColor() {
        Bear polarBear = new Bear(true);
        Bear blackBear = new Bear(false);
        assertEquals(Color.WHITE, polarBear.getColor(), "Polar bear should be white.");
        assertEquals(Color.BLACK, blackBear.getColor(), "Black bear should be black.");
    }

    @org.junit.jupiter.api.Test
    void getBearString() {
        Bear polarBear = new Bear(true);
        Bear blackBear = new Bear(false);
        assertEquals("/", polarBear.toString(),"String should be '/' on first move");
        assertEquals("\\", polarBear.toString(),"String should be '\\' on first move");
        assertEquals("/", blackBear.toString(),"String should be '/' on first move");
        assertEquals("\\", blackBear.toString(),"String should be '/' on first move");

    }
}