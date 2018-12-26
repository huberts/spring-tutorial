package pl.hubiq.hubspringtut1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import pl.hubiq.hubspringtut1.properties.SomeExternalService;

@Configuration
@ComponentScan
@PropertySource("classpath:app.properties")
public class HubSpringPropertiesApplication {

    public static void main(String[] args) {

        try (AnnotationConfigApplicationContext applicationContext =
                     new AnnotationConfigApplicationContext(HubSpringPropertiesApplication.class)) {

            SomeExternalService someExternalService = applicationContext.getBean(SomeExternalService.class);
            System.out.println(someExternalService);
            System.out.println(someExternalService.returnServiceURL());
        }
    }
}
