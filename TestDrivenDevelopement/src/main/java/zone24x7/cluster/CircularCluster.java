package zone24x7.cluster;

import zone24x7.location.Location;

public class CircularCluster implements Cluster {

    private final String cluster;
    private final Location center;
    private final int radius;


    public CircularCluster(String cluster, Location center, int raduis) {

        this.cluster=cluster;
        this.center=center;
        this.radius=raduis;
    }

    @Override
    public String getName() {
        return this.cluster;
    }

    public Location getCenter(){
        return this.center;
    }

    public int getRadius(){
        return this.radius;
    }

    @Override
    public boolean isWithInCluster(Location branch) {
       return (center.distanceTo(branch)<=radius);
    }
}
