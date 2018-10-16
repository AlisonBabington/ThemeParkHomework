package themeparks.stalls;

import themeparks.ITicketed;
import themeparks.Visitor;

public class CandyFlossStall extends Stall implements ITicketed {

    public CandyFlossStall(String name, String ownersName, int parkingSpot) {
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
