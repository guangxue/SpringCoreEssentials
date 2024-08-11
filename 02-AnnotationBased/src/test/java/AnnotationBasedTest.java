import Annotation.AnyClass;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBasedTest {
    private final ClassPathXmlApplicationContext beans = new ClassPathXmlApplicationContext("AnnotationBasedConfig.xml");

    @Test
    public void componentTest() {
        AnyClass anyClass = beans.getBean("anyClass", AnyClass.class);
        anyClass.AnyMethod();
    }

}
