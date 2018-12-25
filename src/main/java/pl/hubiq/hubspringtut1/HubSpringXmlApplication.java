package pl.hubiq.hubspringtut1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.hubiq.hubspringtut1.xml.XmlPersonDAO;

public class HubSpringXmlApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(HubSpringXmlApplication.class);

    public static void main(String[] args) {

        try (ClassPathXmlApplicationContext applicationContext =
                     new ClassPathXmlApplicationContext("applicationContext.xml")) {

            XmlPersonDAO xmlPersonDAO = applicationContext.getBean(XmlPersonDAO.class);
            LOGGER.info("{}", xmlPersonDAO);
        }
    }
}
