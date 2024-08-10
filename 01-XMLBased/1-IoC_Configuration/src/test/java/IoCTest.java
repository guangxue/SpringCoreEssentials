import NoArgs.Constructor.BasicObject;
import NoArgs.FactoryMethod.UserService;
import NoArgs.StaticFactoryMethod.Singleton;
import WithArgs.Constructor.ArgObject;
import WithArgs.FactoryMethod.Circle;
import WithArgs.FactoryMethod.Square;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IoCTest {
    private final ClassPathXmlApplicationContext beans = new ClassPathXmlApplicationContext("IoC_Configuration.xml");

    @Test
    public void NoArgsConstructor() {
        BasicObject obj = beans.getBean("basicObject", BasicObject.class);
        obj.test();
    }
    @Test
    public void NoArgsSingleton() {
        Singleton.test();
    }
    @Test
    public void NoArgsFactoryMethod() {
        UserService userService = beans.getBean("userService", UserService.class);
        userService.test();
    }

    /**
     * With Args IoC Configurations
     */
    @Test
    public void WithArgsConstructor() {
        ArgObject argObject = beans.getBean("argObject", ArgObject.class);
        argObject.test();
    }
    @Test
    public void WithArgsFactoryMethod() {
        Circle circle = beans.getBean("circle", Circle.class);
        circle.draw();
        Square square = beans.getBean("square", Square.class);
        square.draw();
    }
    @Test
    public void WithArgsStaticFactoryMethod() {

    }
}
