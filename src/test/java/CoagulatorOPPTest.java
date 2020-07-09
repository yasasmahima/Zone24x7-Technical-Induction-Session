import calculatorOOP.CalculatorController;
import org.apache.commons.lang3.builder.ToStringExclude;
import org.hamcrest.CoreMatchers;
import org.hamcrest.Matcher;
import org.junit.Test;
import static junit.framework.Assert.assertEquals;


import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CoagulatorOPPTest {

    @Test
    public void testAddition(){
        CalculatorController cal=new CalculatorController('+',2,3);
        assertThat(cal.getResult(),is(5.0));
    }

    @Test
    public void testSubtraction(){
        CalculatorController cal=new CalculatorController('-',2,3);
        assertThat(cal.getResult(),is(-1.0));
    }

    @Test
    public void testMultiplication(){
        CalculatorController cal=new CalculatorController('*',2,3);
        assertThat(cal.getResult(),is(6.0));
    }

    @Test
    public void testDivision(){
        CalculatorController cal=new CalculatorController('/',6,2);
        assertThat(cal.getResult(),is(3.0));
    }

    @Test
    public void testDivisionDivideByZero(){
        CalculatorController cal=new CalculatorController('/',6,0);
        assertEquals("UnHandled Arithmetic Exception","Arithmetic Exception Occurs","Arithmetic Exception Occurs");
    }

    @Test
    public void InvalidOperation(){
        CalculatorController cal=new CalculatorController('$',2,4);
        assertEquals("Do not handle the exception correctly","Invalid Operation","Invalid Operation");
    }

}
