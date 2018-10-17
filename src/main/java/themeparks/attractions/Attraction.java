package themeparks.attractions;

import themeparks.IReviewed;
import themeparks.ISecurity;

public abstract class Attraction implements IReviewed, ISecurity {
    private String name;
    private int rating;

    public Attraction(String name, int rating) {
        this.name = name;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public int getRating() {return rating;}
}
