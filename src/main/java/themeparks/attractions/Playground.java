package themeparks.attractions;

import themeparks.ISecurity;
import themeparks.Visitor;

public class Playground extends Attraction implements ISecurity {

    public Playground(String name, int rating) {
        super(name, rating);
    }

    @Override
    public boolean isAllowedToVisitors(Visitor visitor) {
        return (visitor.getAge() < 15);
    }
}
