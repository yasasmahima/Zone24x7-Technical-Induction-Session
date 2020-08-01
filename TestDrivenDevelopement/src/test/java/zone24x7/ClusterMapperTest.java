package zone24x7;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import zone24x7.cluster.Cluster;
import zone24x7.mappers.ClusterMapper;
import zone24x7.mappers.Mapper;
import zone24x7.records.CSVRecord;
import zone24x7.records.Record;

public class ClusterMapperTest {

    @Test
    public void should_ReturnACluster_when_ValidRecordIsGiven(){

        Mapper<Record, Cluster> mapper=new ClusterMapper();
        Record r=new CSVRecord(new String[]{"ClusterA","3","4","5"});
        Cluster cluster=mapper.map(r);

        assertThat(cluster.getName(),is("ClusterA"));
        assertThat(cluster.getCenter().getLatitude(),is(3.0));
        assertThat(cluster.getCenter().getLongitude(),is(4.0));
        assertThat(cluster.getRadius(),is(5));

    }


}
