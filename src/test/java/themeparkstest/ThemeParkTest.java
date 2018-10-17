package themeparkstest;

import themeparks.ThemePark;
import themeparks.Visitor;
import themeparks.attractions.Dodgem;
import org.junit.Before;
import org.junit.Test;
import themeparks.attractions.Park;
import themeparks.attractions.Playground;
import themeparks.attractions.Rollercoaster;
import themeparks.stalls.CandyFlossStall;
import themeparks.stalls.IceCreamStall;
import themeparks.stalls.TobaccoStall;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themePark;
    TobaccoStall tobaccoStall;
    IceCreamStall iceCreamStall;
    Dodgem dodgem;
    Playground playground;
    Rollercoaster rollercoaster;
    Park park;
    CandyFlossStall candyFlossStall;
    Visitor visitor;
    Visitor visitor2;

    @Before
    public void before() {
        themePark = new ThemePark();
        iceCreamStall = new IceCreamStall("Ice Cream", "Tam", 5, 6);
        candyFlossStall = new CandyFlossStall("Candy", "Tom", 1,4);
        park = new Park("ParkInsideAPark", 8);
        tobaccoStall = new TobaccoStall("Tobacco", "Tim", 3, 1);
        playground = new Playground("Kids playground", 2);
        dodgem = new Dodgem("Dodgems", 7);
        rollercoaster = new Rollercoaster("Leviathan", 9);
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

    @Test
    public void canGetAllRatings() {
        themePark.addStall(iceCreamStall);
        themePark.addStall(candyFlossStall);
        themePark.addStall(tobaccoStall);
        themePark.addStall(candyFlossStall);
        assertEquals(4, themePark.getAllRatings());
    }

    @Test
    public void canGetAllAllowedToVisit() {
        themePark.addStall(iceCreamStall);
        themePark.addStall(candyFlossStall);
        themePark.addStall(tobaccoStall);
        themePark.addAttraction(playground);
        themePark.addAttraction(dodgem);
        themePark.addAttraction(rollercoaster);
        themePark.addAttraction(park);
        assertEquals(5, themePark.getAllAllowedToVisit(visitor));
    }

}
