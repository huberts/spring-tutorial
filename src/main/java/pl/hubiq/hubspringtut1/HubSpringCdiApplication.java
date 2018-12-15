package pl.hubiq.hubspringtut1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import pl.hubiq.hubspringtut1.cdi.SomeCdiBusiness;

@Configuration
@ComponentScan
public class HubSpringCdiApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(HubSpringCdiApplication.class);

    public static void main(String[] args) {

        try (AnnotationConfigApplicationContext applicationContext =
                     new AnnotationConfigApplicationContext(HubSpringCdiApplication.class)) {

            SomeCdiBusiness someCdiBusiness = applicationContext.getBean(SomeCdiBusiness.class);

            LOGGER.info(">>> {} - dao: {}", someCdiBusiness, someCdiBusiness.getSomeCdiDAO());
        }
    }
}
