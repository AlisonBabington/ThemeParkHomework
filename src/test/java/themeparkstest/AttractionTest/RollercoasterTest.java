package themeparkstest.AttractionTest;

import themeparks.Visitor;
import themeparks.attractions.Rollercoaster;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    Rollercoaster rollercoaster;
    Visitor visitor;
    Visitor visitor2;
    Visitor visitor3;

    @Before
    public void before() {
        rollercoaster = new Rollercoaster("Leviathan");
        visitor = new Visitor(17, 210, 200.00);
        visitor2 = new Visitor(10, 120, 200.00);
        visitor3 = new Visitor(13, 140, 10.00);
    }

    @Test
    public void canGetName() {
        assertEquals("Leviathan", rollercoaster.getName());
    }

    @Test
    public void canChargeTallPeople() {
        assertEquals(16.80, rollercoaster.priceFor(visitor), 0.01);
        assertEquals(8.40, rollercoaster.priceFor(visitor2), 0.01);
    }

    @Test
    public void canCheckIfAllowed() {
        assertEquals(true, rollercoaster.isAllowedToVisitors(visitor));
        assertEquals(false, rollercoaster.isAllowedToVisitors(visitor2));
        assertEquals(false, rollercoaster.isAllowedToVisitors(visitor3));
    }
}
