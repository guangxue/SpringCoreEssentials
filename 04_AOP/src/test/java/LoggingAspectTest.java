import com.guangxuezhang.aop.AppConfig;
import com.guangxuezhang.aop.logging.service.Calculator;
import com.guangxuezhang.aop.logging.service.MoreCalculator;
import com.guangxuezhang.aop.logging.service.SimpleCalculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.junit.jupiter.api.Test;

@SpringJUnitConfig(AppConfig.class)
public class LoggingAspectTest {

    private final SimpleCalculator calculator;
    private final MoreCalculator moreCalculator;

    @Autowired
    LoggingAspectTest(SimpleCalculator calculator, MoreCalculator moreCalculator) {
        this.calculator = calculator;
        this.moreCalculator = moreCalculator;
    }

    @Test
    public void SimpleCalculatorTest() {
        this.calculator.add(3, 5);
        this.calculator.sub(3,5);
    }

    @Test
    public void MoreCalculatorTest() {
        this.moreCalculator.add(3, 5);
        this.moreCalculator.sub(3,5);
    }
}
