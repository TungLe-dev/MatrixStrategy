package app;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class Calculation {
    private static final Logger logger = LoggerFactory.getLogger(Calculation.class);
    public static double add(int a, int b){
        logger.trace("Adding {} + {}", a, b);
        return a + b;
    }
    public static double subtract(int a, int b){
        logger.trace("Subtracting {} + {}", a, b);
        return a - b;
    }
    public static double multiply(int a, int b){
        logger.trace("Multiplying {} * {}", a, b);
        return a * b;
    }
    public static double divide(int a, int b){
        if(b == 0){
            logger.error("Dividing by zero");
            throw new ArithmeticException("Division by zero");
        }
        logger.trace("Dividing {} / {}", a, b);
        return a / b;
    }

}
