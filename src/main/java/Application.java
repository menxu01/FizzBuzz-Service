import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * the program Application implements FizzBuzz as service
 * @author meng
 */
@ComponentScan
@Configuration
@EnableAutoConfiguration
public class Application {
		
	public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }	
}
