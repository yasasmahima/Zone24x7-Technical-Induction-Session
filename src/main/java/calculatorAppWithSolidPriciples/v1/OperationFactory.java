package calculatorAppWithSolidPriciples.v1;

import calculatorAppWithSolidPriciples.v1.operations.*;
import calculatorOOP.Operation;

import java.util.List;

public class OperationFactory {

    public OperationImpl getInstance(String operator, List<Double> numberList){
        OperationImpl operation=null;

        if ("add".equals(operator)) {

            operation=new AddOperation(numberList.get(0),numberList.get(1));

        }else if("sub".equals(operator)){

            operation=new SubOperation(numberList.get(0),numberList.get(1));

        }else if("mul".equals(operator)){

            operation=new MulOperation(numberList.get(0),numberList.get(1));

        }else if("div".equals(operator)) {

            operation=new DivOperation(numberList.get(0),numberList.get(1));

        }

        return operation;
    }
}
