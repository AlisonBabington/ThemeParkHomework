package themeparks.stalls;

import themeparks.ITicketed;
import themeparks.Visitor;

public class CandyFlossStall extends Stall implements ITicketed {

    public CandyFlossStall(String name, String ownersName, int parkingSpot, int rating) {
        super(name, ownersName, parkingSpot, rating);
    }

    @Override
    public double defaultPrice() {
        return 2.80;
    }

    @Override
    public double priceFor(Visitor visitor) {
        return defaultPrice();
    }

    @Override
    public boolean isAllowedToVisitors(Visitor visitor) {
        return true;
    }
}
