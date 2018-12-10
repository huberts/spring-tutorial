package pl.hubiq.hubspringtut1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import pl.hubiq.hubspringtut1.cdi.SomeCdiBusiness;

@SpringBootApplication
public class HubSpringCdiApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(HubSpringCdiApplication.class);

    public static void main(String[] args) {

        ApplicationContext applicationContext = SpringApplication.run(HubSpringCdiApplication.class, args);

        SomeCdiBusiness someCdiBusiness = applicationContext.getBean(SomeCdiBusiness.class);

        LOGGER.info(">>> {} - dao: {}", someCdiBusiness, someCdiBusiness.getSomeCdiDAO());
    }
}
