package calculatorAppWithSolidPriciples.v1.operations;

import calculatorOOP.Operation;

public class AddOperation implements OperationImpl {

    private double num1;
    private  double num2;

    public AddOperation(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public double perform() {
        return num1+num2;
    }
}
