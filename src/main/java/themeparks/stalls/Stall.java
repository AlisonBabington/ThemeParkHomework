package themeparks.stalls;

import themeparks.IReviewed;
import themeparks.ISecurity;

public abstract class Stall implements IReviewed, ISecurity {

    private String name;
    private String ownersName;
    private int parkingSpot;
    private int rating;

    public Stall (String name, String ownersName, int parkingSpot, int rating) {
        this.name = name;
        this.ownersName = ownersName;
        this.parkingSpot = parkingSpot;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwnersName() {
        return ownersName;
    }

    public void setOwnersName(String ownersName) {
        this.ownersName = ownersName;
    }

    public int getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(int parkingSpot) {
        this.parkingSpot = parkingSpot;
    }
}
