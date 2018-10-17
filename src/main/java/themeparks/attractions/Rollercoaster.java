package themeparks.attractions;
import themeparks.ISecurity;
import themeparks.ITicketed;
import themeparks.Visitor;


public class Rollercoaster extends Attraction implements ITicketed, ISecurity {

    public Rollercoaster(String name, int rating) {
        super(name, rating);
    }

    @Override
    public double defaultPrice() {
        return 8.40;
    }

    @Override
    public double priceFor(Visitor visitor) {
        if (visitor.getHeight() > 200) return defaultPrice() * 2;
        return defaultPrice();
    }

    @Override
    public boolean isAllowedToVisitors(Visitor visitor) {
        return (visitor.getAge() > 14 && visitor.getHeight() > 145);
    }
}