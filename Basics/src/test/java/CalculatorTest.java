import org.apache.commons.lang3.builder.ToStringExclude;
import org.junit.Test;
import static junit.framework.Assert.assertEquals;


import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest {

    @Test
    public void addNumbers() throws Exception {
        final long result = new Calculator().add(2, 3);
        assertThat(result, is(5L));
    }

    @Test
    public void addNumbersWayTwo(){
        final long result=new Calculator().add(2,3);
        assertEquals("Output is not equal to expected answer",5L,5L);
    }

    @Test
    public void subtractNumbers(){
        final long result=new Calculator().subtract(3,2);
        assertThat(result,is(1L));
    }

    @Test
    public void multiply(){
        final long result=new Calculator().multiply(3,2);
        assertThat(result,is(6L));
    }

    @Test
    public void divideWithException(){
        final long result=new Calculator().divide(1,0);
        assertThat(result,is(0L));
//        assertEquals("Throws an Exception",0,result);
    }

    @Test
    public void divideNumbers(){
        final long result=new Calculator().divide(6,3);
        assertThat(result,is(2L));

    }



}
