package themeparks.stalls;

import themeparks.ITicketed;
import themeparks.Visitor;

public class IceCreamStall extends Stall implements ITicketed {

    public IceCreamStall(String name, String ownersName, int parkingSpot) {
        super(name, ownersName, parkingSpot);
    }


    @Override
    public double defaultPrice() {
        return 2.80;
    }

    @Override
    public double priceFor(Visitor visitor) {
        return defaultPrice();
    }
}
