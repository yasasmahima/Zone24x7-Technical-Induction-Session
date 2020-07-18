package zone24x7.dataSource;

import zone24x7.records.CSVRecord;
import zone24x7.records.Record;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CSVFile implements DataSource {

    private final String filepath;

    public CSVFile(String filePath) {

        this.filepath=filePath;
    }

    public String getFilepath() {
        return filepath;
    }

    @Override
    public List<Record> getRecords() throws DataSourceException {

        try {
            List<Record> output = new ArrayList<>();

            Scanner fileScanner = new Scanner(new FileInputStream(filepath));

            while (fileScanner.hasNextLine()){
                String[]record=fileScanner.nextLine().split(",");
                output.add(new CSVRecord(record));
            }


      return output;

        }catch (FileNotFoundException e){

           throw new DataSourceException("The File is not Found");
        }



    }
}
