package themeparkstest.AttractionTest;

import themeparks.Visitor;
import themeparks.attractions.Dodgem;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemTest {

    Dodgem dodgem;
    Visitor visitor;
    Visitor visitor2;

    @Before
    public void before() {
        dodgem = new Dodgem("Dodgems");
        visitor = new Visitor(17, 210, 200.00);
        visitor2 = new Visitor(11, 190, 200.00);
    }

    @Test
    public void canGetName() {
        assertEquals("Dodgems", dodgem.getName());
    }

    @Test
    public void canCharge() { assertEquals(4.50, dodgem.priceFor(visitor), 0.01);}

    @Test
    public void canChargeHalfPriceForKids() {assertEquals(2.25, dodgem.priceFor(visitor2), 0.01);}
}
