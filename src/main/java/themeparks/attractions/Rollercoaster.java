package themeparks.attractions;
import themeparks.ITicketed;
import themeparks.Visitor;


public class Rollercoaster extends Attraction implements ITicketed {

    public Rollercoaster(String name) {
        super(name);
    }

    @Override
    public double defaultPrice() {
        return 8.40;
    }

    @Override
    public double priceFor(Visitor visitor) {
        if (visitor.getHeight() > 200) return defaultPrice();
        return 0.00;
    }
}