package zone24x7;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import zone24x7.dataSource.CSVFile;
import zone24x7.dataSource.DataSource;
import zone24x7.dataSource.DataSourceException;
import zone24x7.records.Record;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.mockito.Mockito.mock;

import java.util.List;

public class CSVTest {

//    DataSource source=new CSVfile(path)
//    LIst<Clusters> clusters=source.getClusters()

    @Test
    public void should_ReturnListOfClusters_when_ValidCSVFileIsGiven() throws DataSourceException {

        String filePath="D:\\Zone24x7\\TestDrivenDevelopement\\src\\test\\java\\resourcers\\data.csv";
        DataSource source=new CSVFile(filePath);
        List<Record> records=source.getRecords();

        assertThat(records,hasSize(2));

        Record record=records.get(0);
        assertThat(record.get(0),is("clusterA"));
        assertThat(record.get(1),is("3"));

    }


    @Test
    public void should_ReturnException_when_FilePathIdInvalid(){

        String filePath="D:\\Zone24x7\\TestDrivenDevelopement\\src\\test\\java\\resourcers\\data3.csv";
        DataSource source=new CSVFile(filePath);
        Exception e= Assertions.assertThrows(DataSourceException.class,()->source.getRecords());
        assertThat(e.getMessage(),is("The File is not Found"));

    }

    @Test
    public void should_ReturnEmptyList_when_EmptyCsvIsGiven() throws DataSourceException {

        String filePath="D:\\Zone24x7\\TestDrivenDevelopement\\src\\test\\java\\resourcers\\non.csv";
        DataSource source=new CSVFile(filePath);
        List<Record> records=source.getRecords();

        assertThat(records,hasSize(0));

    }


}
