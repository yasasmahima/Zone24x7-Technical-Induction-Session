package calculatorOOP.operations;

import calculatorOOP.Operation;

public class Division implements Operation {

    public double calculateResult(double first, double second) throws Exception {

      if(first==0.0 && second==0.0){
          throw new Exception();
      }else{
          return first/second;
      }
    }
}
