import Config.AppConfig;
import com.guangxuezhang.controller.ProductController;
import com.guangxuezhang.model.Product;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaBasedTest {
    @Test
    public void firstTest() {
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(AppConfig.class);
        ProductController controller = app.getBean(ProductController.class);
        controller.findZipperByItemCode("013812-147PEACH");
    }
}
