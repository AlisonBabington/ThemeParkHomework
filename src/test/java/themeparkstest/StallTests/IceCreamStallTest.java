package themeparkstest.StallTests;

import org.junit.Before;
import org.junit.Test;
import themeparks.stalls.IceCreamStall;

import static org.junit.Assert.assertEquals;

public class IceCreamStallTest {
    
    IceCreamStall iceCreamStall;
    
    @Before
    public void before() {
        iceCreamStall = new IceCreamStall("Ice Cream", "Tam", 5);
    }

    @Test
    public void canGetName() {
        assertEquals("Ice Cream", iceCreamStall.getName());
    }

    @Test
    public void canGetOwnersName() {
        assertEquals("Tam", iceCreamStall.getOwnersName());
    }

    @Test
    public void canGetParkingSpot() {
        assertEquals(5, iceCreamStall.getParkingSpot());
    }
}
