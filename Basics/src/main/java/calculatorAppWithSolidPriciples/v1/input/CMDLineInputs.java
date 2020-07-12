package calculatorAppWithSolidPriciples.v1.input;

public class CMDLineInputs implements InputsImpl {

    private String [] arguments;

    public CMDLineInputs(String[] args) {
        this.arguments = args;
    }

    @Override
    public String readOperator() {
        return this.arguments[0];
    }
}
