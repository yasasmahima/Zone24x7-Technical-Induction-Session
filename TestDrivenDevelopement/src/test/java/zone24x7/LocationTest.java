package zone24x7;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import zone24x7.location.Location;
import zone24x7.location.SimpleLocation;

public class LocationTest {

    @Test
    public void should_CreateSimpleLocation_when_XandYisGiven() {
        Location l = new SimpleLocation(25.5, 35.234);
    }

    @Test
    public void should_ReturnDistance_when_LocationIsGiven() {

        Location location = new SimpleLocation(3, 1);
        Location anotherLocation = new SimpleLocation(6, 5);

        double distance = location.distanceTo(anotherLocation);

        assertThat(distance, is(5.0));

    }

    @Test
    public void should_ReturnDistance_when_LocationIsNegative() {

        Location location = new SimpleLocation(-3, -1);
        Location anotherLocation = new SimpleLocation(-6, -5);

        double distance = location.distanceTo(anotherLocation);

        assertThat(distance, is(5.0));

    }

}
