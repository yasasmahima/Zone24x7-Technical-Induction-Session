package calculatorAppWithSolidPriciples.v1;

import calculatorAppWithSolidPriciples.v1.input.CMDLineInputs;
import calculatorAppWithSolidPriciples.v1.input.InputsImpl;
import calculatorAppWithSolidPriciples.v1.operations.OperationImpl;
import calculatorAppWithSolidPriciples.v1.output.CMDOutput;
import calculatorAppWithSolidPriciples.v1.output.OutputsImpl;
import calculatorAppWithSolidPriciples.v1.repository.FileNumberRepository;
import calculatorAppWithSolidPriciples.v1.repository.NumberRepositoryImpl;

import java.util.List;

public class CalculatorApp {

    private NumberRepositoryImpl numberRepository;
    private String[] args;


    public CalculatorApp(NumberRepositoryImpl numberRepository, String[] args) {
        this.numberRepository = numberRepository;
        this.args = args;
    }

    public void run(){

        InputsImpl inputs=new CMDLineInputs(args);
        numberRepository=new FileNumberRepository();

        String operator = inputs.readOperator();
        List<Double> numberList = numberRepository.read();

        OperationFactory operationFactory=new OperationFactory();
        OperationImpl operation=operationFactory.getInstance(operator,numberList);

        OutputsImpl outputs=new CMDOutput();
        outputs.show("Result is : " +operation.perform());

    }
}
