package pl.hubiq.hubspringtut1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import pl.hubiq.hubspringtut1.scope.PersonDAO;

@SpringBootApplication
public class HubSpringScopeApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(HubSpringScopeApplication.class);

    public static void main(String[] args) {

        ApplicationContext applicationContext = SpringApplication.run(HubSpringScopeApplication.class, args);

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
