package themeparks.attractions;

import themeparks.Visitor;

public class Park extends Attraction{

    public Park(String name, int rating) {
        super(name, rating);
    }

    @Override
    public boolean isAllowedToVisitors(Visitor visitor) {
        return true;
    }
}
