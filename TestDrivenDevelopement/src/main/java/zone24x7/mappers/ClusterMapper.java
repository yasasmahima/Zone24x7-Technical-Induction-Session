package zone24x7.mappers;

import zone24x7.cluster.CircularCluster;
import zone24x7.cluster.Cluster;
import zone24x7.location.Location;
import zone24x7.location.SimpleLocation;
import zone24x7.records.Record;

public class ClusterMapper implements Mapper<Record, Cluster> {

    @Override
    public Cluster map(Record r) {

       Location location=new SimpleLocation(Double.parseDouble(r.get(1)),Double.parseDouble(r.get(2)));
       Cluster cluster=new CircularCluster(r.get(0),location,Integer.parseInt(r.get(3)));
       return cluster;

    }
}
