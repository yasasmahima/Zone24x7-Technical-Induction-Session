package zone24x7.records;

public class CSVRecord implements Record {

    private final String[] records;

    public CSVRecord(String[] records) {
        super();
        this.records = records;
    }

    @Override
    public String get(int i) {
        return records[i];
    }
}
