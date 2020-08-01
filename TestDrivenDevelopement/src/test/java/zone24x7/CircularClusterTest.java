package zone24x7;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import zone24x7.cluster.CircularCluster;
import zone24x7.cluster.Cluster;
import zone24x7.location.Location;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CircularClusterTest {

    @Test
    public void should_ReturnTrue_when_ALocationGivenWithInTheCluster(){

        Location center=mock(Location.class);
        Location branch=mock(Location.class);

        when(center.distanceTo(branch)).thenReturn(25.0);

        Cluster cluster=new CircularCluster("ClusterA",center,30);
        boolean result=cluster.isWithInCluster(branch);
        assertThat(result,is(true));

    }

    @Test
    public void should_ReturnTrue_when_ALocationGivenOutOfTheCluster(){

        Location center=mock(Location.class);
        Location branch=mock(Location.class);

        when(center.distanceTo(branch)).thenReturn(35.0);

        Cluster cluster=new CircularCluster("ClusterA",center,30);
        boolean result=cluster.isWithInCluster(branch);
        assertThat(result,is(false));

    }



}
