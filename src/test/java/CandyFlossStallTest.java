import org.junit.Before;
import org.junit.Test;
import stalls.CandyFlossStall;

import static org.junit.Assert.assertEquals;

public class CandyFlossStallTest {

    CandyFlossStall candyFlossStall;

    @Before
    public void before() {
        candyFlossStall = new CandyFlossStall("Candy", "Tom", 1);
    }

    @Test
    public void canGetName() {
        assertEquals("Candy", candyFlossStall.getName());
    }

    @Test
    public void canGetOwnersName() {
        assertEquals("Tom", candyFlossStall.getOwnersName());
    }

    @Test
    public void canGetParkingSpot() {
        assertEquals(1, candyFlossStall.getParkingSpot());
    }



}
