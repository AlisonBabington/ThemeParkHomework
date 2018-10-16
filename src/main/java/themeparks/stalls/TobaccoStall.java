package themeparks.stalls;

import themeparks.ISecurity;
import themeparks.ITicketed;
import themeparks.Visitor;

public class TobaccoStall extends Stall implements ITicketed, ISecurity {

    public TobaccoStall(String name, String ownersName, int parkingSpot) {
        super(name, ownersName, parkingSpot);
    }

    @Override
    public double defaultPrice() {
        return 6.60;
    }

    @Override
    public double priceFor(Visitor visitor) {
        return defaultPrice();
    }

    @Override
    public boolean isAllowedToVisitors(Visitor visitor) {
        return (visitor.getAge() >= 18);
    }
}
