package themeparkstest.AttractionTest;

import themeparks.attractions.Park;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParkTest {

    Park park;

    @Before
    public void before() {
        park = new Park("ParkInsideAPark", 8);
    }

    @Test
    public void canGetName() {
        assertEquals("ParkInsideAPark", park.getName());
    }


}
