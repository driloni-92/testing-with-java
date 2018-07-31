import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;


public class FactorialTest {

    private Factorial factorial;

    @Before
    public void setUp(){
        factorial = new Factorial();
    }

    @Test
    public void calculate_0() {
        //Factorial factorial = new Factorial();
        int testStartValue = 0;
        int expectedResult = 0;

        assertEquals(expectedResult, factorial.calculate(testStartValue));
    }

    @Test
    public void calculate_1() {
        // Factorial factorial = new Factorial();
        int testStartValue = 1;
        int expectedResult = 1;

        assertEquals(expectedResult, factorial.calculate(testStartValue));
    }

    @Test
    public void calculate_5(){
        int testStartValue = 5;
        int expectedResult = 120;

        assertEquals(expectedResult, factorial.calculate(testStartValue));
    }

    @Test(expected=IllegalArgumentException.class)
    public void calculate_negative() {
        factorial.calculate(-5);
    }

}

