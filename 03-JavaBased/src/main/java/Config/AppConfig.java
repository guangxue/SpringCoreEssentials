package Config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@ComponentScan("com.guangxuezhang")
@PropertySource(value="classpath:db.properties")
@Configuration
public class AppConfig {


}
