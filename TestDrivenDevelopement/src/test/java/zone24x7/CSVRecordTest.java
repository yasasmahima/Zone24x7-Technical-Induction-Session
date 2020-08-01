package zone24x7;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import zone24x7.records.CSVRecord;
import zone24x7.records.Record;

public class CSVRecordTest  {

    @Test
    public void should_ReturnValidArray_when_RecordIsGiven(){
        Record r=new CSVRecord(new String[]{"ClusterA","B"});
        assertThat(r.get(0),is("ClusterA"));

    }

}
