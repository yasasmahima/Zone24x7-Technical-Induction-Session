package calculatorOOP;

import calculatorOOP.operations.Addition;
import calculatorOOP.operations.Division;
import calculatorOOP.operations.Multiplication;
import calculatorOOP.operations.Subtraction;

import java.util.Map;
import java.util.HashMap;

public class CalculatorController {
    private char operation;
    private double num1;
    private double num2;
    private Map<Character,Operation> operationMap = new HashMap<Character, Operation>();

    public CalculatorController(char operation,double num1,double num2){
        this.operation=operation;
        this.num1=num1;
        this.num2=num2;

        operationMap.put('+',new Addition());
        operationMap.put('-',new Subtraction());
        operationMap.put('*',new Multiplication());
        operationMap.put('/',new Division());

    }

    public double getResult(){
        Operation option=null;
        if(operationMap.containsKey(operation)){
            try {
                option = operationMap.get(operation);
                return option.calculateResult(num1, num2);

            }catch (Exception e){

                System.out.println("Arithmetic Exception Occurs");
            }
        }else{
            System.out.println("Invalid Operation");
        }
        return 0;
    }

}
