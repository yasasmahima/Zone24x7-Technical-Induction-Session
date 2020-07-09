package calculatorAppWithSolidPriciples.v1;

import calculatorAppWithSolidPriciples.v1.repository.FileNumberRepository;
import calculatorAppWithSolidPriciples.v1.repository.NumberRepositoryImpl;

import java.util.List;

public class Main{

    public static void main(String[] args) {

            NumberRepositoryImpl numberRepository=new FileNumberRepository();
            CalculatorApp calculatorApp=new CalculatorApp(numberRepository,args);
            calculatorApp.run();
    }
}
