import Annotation.AnyClass;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBasedTest {
    private final ClassPathXmlApplicationContext beans = new ClassPathXmlApplicationContext("AnnotationBasedConfig.xml");

    @Test
    public void componentTest() {
        AnyClass anyClass = beans.getBean("anyClass", AnyClass.class);
        anyClass.AnyMethod();
    }

    // No xml files needed
    @Test
    public void AnnotationClassTest() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("Annotation");
        context.refresh();
        AnyClass anyClass = context.getBean("anyClass", AnyClass.class);
        anyClass.AnyMethod();

    }
}
