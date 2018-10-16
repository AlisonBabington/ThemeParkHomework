package themeparkstest.StallTests;

import org.junit.Before;
import org.junit.Test;
import themeparks.stalls.TobaccoStall;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {
    
    TobaccoStall tobaccoStall;
    
    @Before
    public void before() {
        tobaccoStall = new TobaccoStall("Tobacco", "Tim", 3);
    }

    @Test
    public void canGetName() {
        assertEquals("Tobacco", tobaccoStall.getName());
    }

    @Test
    public void canGetOwnersName() {
        assertEquals("Tim", tobaccoStall.getOwnersName());
    }

    @Test
    public void canGetParkingSpot() {
        assertEquals(3, tobaccoStall.getParkingSpot());
    }
}
