package zone24x7.location;
import java.lang.Math;

public class SimpleLocation implements Location{

    private final double latitude;
    private final double longitude;
    public SimpleLocation(double latitude, double longitude) {
        this.latitude =latitude;
        this.longitude =longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    @Override
    public double distanceTo(Location anotherLocation) {
            return Math.sqrt(Math.pow(this.latitude-anotherLocation.getLatitude(),2)
                    +Math.pow(this.longitude-anotherLocation.getLongitude(),2));
    }
}
