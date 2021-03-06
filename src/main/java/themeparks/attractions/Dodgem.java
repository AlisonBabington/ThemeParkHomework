package themeparks.attractions;

import themeparks.ITicketed;
import themeparks.Visitor;

public class Dodgem extends Attraction implements ITicketed {

    public Dodgem(String name, int rating) {
        super(name, rating);
    }

    @Override
    public double defaultPrice() {
        return 4.50;
    }

    @Override
    public double priceFor(Visitor visitor) {
        if (visitor.getAge() < 12) return defaultPrice() / 2;
        return defaultPrice();
    }

    @Override
    public boolean isAllowedToVisitors(Visitor visitor) {
        return true;
    }
}
