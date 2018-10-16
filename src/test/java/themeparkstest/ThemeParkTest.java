package themeparkstest;

import themeparks.ThemePark;
import themeparks.Visitor;
import themeparks.attractions.Dodgem;
import org.junit.Before;
import org.junit.Test;
import themeparks.stalls.CandyFlossStall;
import themeparks.stalls.IceCreamStall;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themePark;
    IceCreamStall iceCreamStall;
    Dodgem dodgem;
    CandyFlossStall candyFlossStall;
    Visitor visitor;
    Visitor visitor2;

    @Before
    public void before() {
        themePark = new ThemePark();
        iceCreamStall = new IceCreamStall("Ice Cream", "Tam", 5);
        candyFlossStall = new CandyFlossStall("Candy", "Tom", 1);
        dodgem = new Dodgem("Dodgems");
        visitor = new Visitor(17, 210, 200.00);
        visitor2 = new Visitor(17, 190, 200.00);
    }

    @Test
    public void canAddStall() {
        themePark.addStall(iceCreamStall);
        themePark.addStall(candyFlossStall);
        assertEquals(2, themePark.getStallsSize());
    }

    @Test
    public void canAddAttraction() {
        themePark.addAttraction(dodgem);
        assertEquals(1, themePark.getAttractionsSize());
    }

    @Test
    public void canVisitAttraction() {
        assertEquals("A visitor is visiting the Dodgems", themePark.visit(visitor, dodgem));
    }

}
