package calculatorAppWithSolidPriciples.v1.repository;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileNumberRepository implements NumberRepositoryImpl {



    @Override
    public List<Double> read(){

        List<Double> numberList = new ArrayList<>();
        List<String> numbersString=null;

        try {

            numbersString = Files.readAllLines(Paths.get("D:\\Zone24x7\\Java_test\\src\\main\\java\\number"));

            for (String number : numbersString) {
                numberList.add(Double.parseDouble(number));
            }

        }catch (IOException e){

            e.printStackTrace();
        }

        return numberList;
    }
}
