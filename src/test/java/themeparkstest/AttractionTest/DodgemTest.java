package themeparkstest.AttractionTest;

import themeparks.attractions.Dodgem;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemTest {

    Dodgem dodgem;

    @Before
    public void before() {
        dodgem = new Dodgem("Dodgems");
    }

    @Test
    public void canGetName() {
        assertEquals("Dodgems", dodgem.getName());
    }
}
