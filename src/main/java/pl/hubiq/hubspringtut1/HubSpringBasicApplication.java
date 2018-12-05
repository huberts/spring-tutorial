package pl.hubiq.hubspringtut1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import pl.hubiq.hubspringtut1.basic.BinarySearchImpl;

@SpringBootApplication
public class HubSpringBasicApplication {

    public static void main(String[] args) {

        ApplicationContext applicationContext = SpringApplication.run(HubSpringBasicApplication.class, args);

        BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
        int result = binarySearch.binarySearch(new int[] {12, 4, 6}, 3);

        BinarySearchImpl binarySearch1 = applicationContext.getBean(BinarySearchImpl.class);
        System.out.println(result);

        System.out.println(binarySearch);
        System.out.println(binarySearch1);
        System.out.println(binarySearch==binarySearch1);

    }
}
