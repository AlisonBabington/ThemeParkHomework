package themeparks.stalls;

public abstract class Stall {

    private String name;
    private String ownersName;
    private int parkingSpot;

    public Stall (String name, String ownersName, int parkingSpot) {
        this.name = name;
        this.ownersName = ownersName;
        this.parkingSpot = parkingSpot;
    }

    public String getName() {
        return name;
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
