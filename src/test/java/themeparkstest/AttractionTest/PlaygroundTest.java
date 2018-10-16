package themeparkstest.AttractionTest;

import themeparks.attractions.Playground;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {

    Playground playground;

    @Before
    public void before() {
        playground = new Playground("Kids playground");
    }

    @Test
    public void canGetName() {
        assertEquals("Kids playground", playground.getName());
    }
}
