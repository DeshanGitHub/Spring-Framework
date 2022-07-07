package bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpringBean {

    public SpringBean(@Value("5") int num, @Value("Deshan") String myName, @Value("Kamal, Amara, Sampath") String[] names) {
        System.out.println("Spring Bean Instantiated");
        System.out.println(num);
        System.out.println(myName);

        /*Print names from names array*/
        for (String name : names
        ) {
            System.out.println(name);
        }
    }
}