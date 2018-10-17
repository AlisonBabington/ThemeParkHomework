package themeparks.stalls;

import themeparks.ITicketed;
import themeparks.Visitor;

public class IceCreamStall extends Stall implements ITicketed {

    public IceCreamStall(String name, String ownersName, int parkingSpot, int rating) {
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
