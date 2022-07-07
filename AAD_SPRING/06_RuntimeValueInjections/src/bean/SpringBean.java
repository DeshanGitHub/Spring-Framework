package bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class SpringBean {

    @Autowired(required = false)
    public SpringBean(@Value("C001") String id, @Value("28") int age, @Value("true") boolean b) {
        System.out.println("Spring bean one Instantiated");
        System.out.println(id);
        System.out.println(age);
        System.out.println(b);
    }

    @Autowired(required = false)
    public SpringBean(@Value("5") int num, @Value("Deshan") String myName, @Value("Kamal, Amara, Sampath") String[] names, @Value("26.8") double amount) {
        System.out.println("Spring Bean Instantiated");
        System.out.println(num);
        System.out.println(myName);

        /*Print names from names array*/
        for (String name : names
        ) {
            System.out.println(name);
        }

        System.out.println(amount);
    }
}