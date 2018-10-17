package themeparks;

import themeparks.attractions.Attraction;
import themeparks.stalls.Stall;

import java.util.ArrayList;

public class ThemePark {

    private ArrayList<Stall> stalls;
    private ArrayList<Attraction> attractions;
    private ArrayList<IReviewed> reviewedList;

    public ThemePark() {
        this.stalls = new ArrayList<>();
        this.attractions = new ArrayList<>();
        this.reviewedList = new ArrayList<>();
    }

    public int getStallsSize() {
        return stalls.size();
    }

    public int getAttractionsSize() {
        return attractions.size();
    }

    public void addStall(Stall stall) {
        stalls.add(stall);
    }

    public void addAttraction(Attraction attraction) {
        attractions.add(attraction);
    }

    public String visit(Visitor visitor, Attraction attraction) {
        return "A visitor is visiting the " + attraction.getName();
    }

    public int getAllRatings() {
        reviewedList.addAll(stalls);
        reviewedList.addAll(attractions);
        return reviewedList.size();
    }

    public int getAllAllowedToVisit(Visitor visitor) {
        ArrayList<IReviewed> idArrayList = new ArrayList<>();
        attractions.forEach((attraction) -> {if (attraction.isAllowedToVisitors(visitor)) idArrayList.add(attraction);});
        stalls.forEach((stall) -> {if(stall.isAllowedToVisitors(visitor)) idArrayList.add(stall);});
      return idArrayList.size();
    }

//    public String getAllReviews() {
//        getAllRatings();
//        String review = "";
//        reviewedList.forEach((place) -> {review + place.getName() + " : " place.getRating()});
//    }
}
