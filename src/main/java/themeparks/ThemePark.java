package themeparks;

import themeparks.attractions.Attraction;
import themeparks.stalls.Stall;

import java.util.ArrayList;

public class ThemePark {

    private ArrayList<Stall> stalls;
    private ArrayList<Attraction> attractions;

    public ThemePark() {
        this.stalls = new ArrayList<>();
        this.attractions = new ArrayList<>();
    }

    public int getStallsSize() {
        return stalls.size();
    }

    public int getAttractionsSize() {
        return attractions.size();
    }

    public void addStall(Stall stall) {
        stalls.add(stall);
    }

    public void addAttraction(Attraction attraction) {
        attractions.add(attraction);
    }

    public String visit(Visitor visitor, Attraction attraction) {
        return "A visitor is visiting the " + attraction.getName();
    }
}
