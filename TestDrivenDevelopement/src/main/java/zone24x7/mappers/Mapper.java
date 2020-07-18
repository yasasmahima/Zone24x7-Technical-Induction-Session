package zone24x7.mappers;

public interface Mapper<Record, Cluster> {

    Cluster map(Record r);
}
