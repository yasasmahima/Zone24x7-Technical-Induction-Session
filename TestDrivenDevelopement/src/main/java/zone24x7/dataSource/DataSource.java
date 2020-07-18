package zone24x7.dataSource;

import zone24x7.records.Record;

import java.util.List;

public interface DataSource {

//    List<Cluster> getClusters();

    String getFilepath();

    List<Record> getRecords() throws DataSourceException;

}
