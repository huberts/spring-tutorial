package pl.hubiq.hubspringtut1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import pl.hubiq.hubspringtut1.scope.PersonDAO;

@Configuration
@ComponentScan
public class HubSpringScopeApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(HubSpringScopeApplication.class);

    public static void main(String[] args) {

        try (AnnotationConfigApplicationContext applicationContext =
                     new AnnotationConfigApplicationContext(HubSpringScopeApplication.class)) {

            PersonDAO personDao = applicationContext.getBean(PersonDAO.class);
            PersonDAO personDao2 = applicationContext.getBean(PersonDAO.class);

            LOGGER.info("{}", personDao);
            LOGGER.info("{}", personDao.getJdbcConnection());

            LOGGER.info("{}", personDao2);
            LOGGER.info("{}", personDao2.getJdbcConnection());
            LOGGER.info("{}", personDao2.getJdbcConnection());
            LOGGER.info("{}", personDao2.getJdbcConnection());
        }
    }
}
