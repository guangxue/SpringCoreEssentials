import com.guangxuezhang.aop.AppConfig;
import com.guangxuezhang.aop.logging.service.Calculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.junit.jupiter.api.Test;

@SpringJUnitConfig(AppConfig.class)
public class LoggingAspectTest {

    private final Calculator calculator;

    @Autowired
    public LoggingAspectTest(Calculator calculator) {
        this.calculator = calculator;
    }

    @Test
    public void AdvicesTest() {
        this.calculator.add(3, 5);
        this.calculator.sub(3,5);
    }
}
