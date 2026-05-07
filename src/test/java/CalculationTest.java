import app.Calculation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculationTest {
    @Test
    public void testCalculation(){
        Assertions.assertThrows(ArithmeticException.class, () -> {
            Calculation.divide(1,0);
        });
    }
    @Test
    public void testCalculation2(){
        Assertions.assertEquals(1,Calculation.add(1,0));
    }
}
