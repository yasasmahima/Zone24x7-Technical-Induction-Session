package zone24x7;


import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.jupiter.api.Assertions;


public class MaxCalculatorTest {


//    Format when_precondition_return_TheReturnvalue

    @Test
    public void when_ArrayWithOneNumberGiven_then_ReturnTheNumberAsTheMax(){
        MaxCalculator calculator=new MaxCalculator();
        int max=calculator.calculate(new int[]{5});
        assertThat(max,is(5));
    }

    @Test
    public void when_ArrayWithManyNumberGiven_then_ReturnTheMax(){
        MaxCalculator calculator=new MaxCalculator();
        int max=calculator.calculate(new int[]{5,7});
        assertThat(max,is(7));

    }

    @Test
    public void when_ArrayWithZeroNumberGiven_then_ReturnTheMax(){
        MaxCalculator calculator=new MaxCalculator();
        int max=calculator.calculate(new int[]{-5,-7,-1});
        assertThat(max,is(-1));

    }

    @Test
    public void when_AnEmptyArrayGiven_then_ThrowAnException(){
        final MaxCalculator calculator=new MaxCalculator();
        Exception e=Assertions.assertThrows(IllegalArgumentException.class,() -> calculator.calculate(new int[]{}));
        assertThat(e.getMessage(),is("The Array is Empty or Null"));

    }
}
