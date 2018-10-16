package themeparkstest.AttractionTest;

import themeparks.Visitor;
import themeparks.attractions.Playground;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {

    Playground playground;
    Visitor visitor;
    Visitor visitor2;

    @Before
    public void before() {
        playground = new Playground("Kids playground");
        visitor = new Visitor(17, 210, 200.00);
        visitor2 = new Visitor(10, 190, 200.00);
    }

    @Test
    public void canGetName() {
        assertEquals("Kids playground", playground.getName());
    }

    @Test
    public void hasMaxAge() {
        assertEquals(false, playground.isAllowedToVisitors(visitor));
        assertEquals(true, playground.isAllowedToVisitors(visitor2));
    }
}
