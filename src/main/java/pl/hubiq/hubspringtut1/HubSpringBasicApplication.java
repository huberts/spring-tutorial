package pl.hubiq.hubspringtut1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import pl.hubiq.hubspringtut1.basic.BinarySearchImpl;

@Configuration
@ComponentScan
public class HubSpringBasicApplication {

    public static void main(String[] args) {

        try (AnnotationConfigApplicationContext applicationContext =
                     new AnnotationConfigApplicationContext(HubSpringBasicApplication.class)) {

            BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
            int result = binarySearch.binarySearch(new int[] {12, 4, 6}, 3);

            BinarySearchImpl binarySearch1 = applicationContext.getBean(BinarySearchImpl.class);
            System.out.println(result);

            System.out.println(binarySearch);
            System.out.println(binarySearch1);
            System.out.println(binarySearch==binarySearch1);
        }
    }
}
