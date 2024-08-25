import Config.AppConfig;
import com.guangxuezhang.controller.ProductController;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaBasedTest {
    @Test
    public void firstTest() {
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(AppConfig.class);
        ProductController controller = app.getBean(ProductController.class);
        System.out.println(controller);
    }
}
