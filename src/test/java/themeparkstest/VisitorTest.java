package themeparkstest;

import themeparks.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    Visitor visitor;

    @Before
    public void before() {
        visitor = new Visitor(17, 6.0, 200.00);
    }

    @Test
    public void canGetAge() {
        assertEquals(17, visitor.getAge());
    }

    @Test
    public void canGetHeight() {
        assertEquals(6.0, visitor.getHeight(), 0.01);
    }

    @Test
    public void canGetMoney() {
        assertEquals(200.00, visitor.getMoney(), 0.01);
    }
}
