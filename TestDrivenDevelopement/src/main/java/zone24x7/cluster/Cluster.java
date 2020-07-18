package zone24x7.cluster;

import zone24x7.location.Location;

public interface Cluster {

    boolean isWithInCluster(Location branch);

    String getName();

    Location getCenter();

    int getRadius();



}

