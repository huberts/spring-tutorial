package pl.hubiq.hubspringtut1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import pl.hubiq.componentscan.ComponentDAO;

@Configuration
@ComponentScan("pl.hubiq.componentscan")
public class HubSpringComponentScanApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(HubSpringComponentScanApplication.class);

    public static void main(String[] args) {

        try (AnnotationConfigApplicationContext applicationContext =
                     new AnnotationConfigApplicationContext(HubSpringComponentScanApplication.class)) {

            ComponentDAO componentDAO = applicationContext.getBean(ComponentDAO.class);

            LOGGER.info("{}", componentDAO);
        }
    }
}
