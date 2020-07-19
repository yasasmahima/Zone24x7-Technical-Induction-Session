package zone24x7;

import zone24x7.cluster.Cluster;
import zone24x7.dataSource.CSVFile;
import zone24x7.dataSource.DataSource;
import zone24x7.dataSource.DataSourceException;
import zone24x7.location.Location;
import zone24x7.location.SimpleLocation;
import zone24x7.mappers.ClusterMapper;
import zone24x7.mappers.Mapper;
import zone24x7.records.Record;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args)  {

//        Create a new Branch
        Double lat=Double.parseDouble(args[0]);
        Double lon=Double.parseDouble(args[1]);

        Location branch=new SimpleLocation(lat,lon);

//        Mapping each clusters
        Mapper<Record, Cluster> mapper=new ClusterMapper();

//        List to store clusters get from the file
        List<Cluster> clusterList=new ArrayList<>();

        DataSource source=new CSVFile("D:\\Zone24x7\\TestDrivenDevelopement\\src\\test\\java\\resourcers\\data.csv");

        try {
            for (Record r : source.getRecords()) {
                clusterList.add(mapper.map(r));
            }

        }catch (DataSourceException e){
            e.getMessage();
        }

        List<String> output=new ArrayList<>();

//        Check what are the clusters that branch is in
        for (Cluster cluster:clusterList){

            if(cluster.isWithInCluster(branch)){
                output.add(cluster.getName());
            }
        }

        output.forEach(s-> System.out.println(s));

    }
}
