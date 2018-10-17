package themeparkstest.StallTests;

import org.junit.Before;
import org.junit.Test;
import themeparks.Visitor;
import themeparks.stalls.TobaccoStall;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {
    
    TobaccoStall tobaccoStall;
    Visitor visitor;
    Visitor visitor2;
    
    @Before
    public void before() {
        tobaccoStall = new TobaccoStall("Tobacco", "Tim", 3, 1);
        visitor = new Visitor(18, 210, 200.00);
        visitor2 = new Visitor(11, 190, 200.00);
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

    @Test
    public void canCheckAge() {
        assertEquals(true, tobaccoStall.isAllowedToVisitors(visitor));
        assertEquals(false, tobaccoStall.isAllowedToVisitors(visitor2));
    }
}
