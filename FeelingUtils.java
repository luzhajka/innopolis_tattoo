public class FeelingUtils {
    public void main(String[] args) {
        var innopolis = new Location(55.752085, 48.744618);
        while (LocationListener.currentLocation().equals(innopolis)) {
            youFeelLove();
        }
    }
}

/*
As stub:

private void youFeelLove() {}

class Location {
    public Location(double latitude, double longitude) {
    }
}

class LocationListener {
    static Location currentLocation() {
        return new Location(actualLatitude, actualLongitude);
    }
}
 */
