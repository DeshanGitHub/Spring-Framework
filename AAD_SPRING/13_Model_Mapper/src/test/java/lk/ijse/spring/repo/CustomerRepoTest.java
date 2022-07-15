package lk.ijse.spring.repo;

import lk.ijse.spring.config.JPAConfig;
import lk.ijse.spring.entity.Customer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;

@WebAppConfiguration // State test configuration class
@ContextConfiguration(classes = {JPAConfig.class}) // import configurations for Test Context
@ExtendWith(SpringExtension.class)
        // Run with Spring Extension
class CustomerRepoTest {
    @Autowired
    CustomerRepo customerRepo; // Inject the dependency of Customer Repo

    @Test
    public void searchCustomerByName() {
        Customer c1 = customerRepo.findCustomerByName("Kasun");
        System.out.println(c1.toString());
    }

    @Test
    public void searchCustomerByAddress() {
        Customer c1 = customerRepo.findCustomerByAddress("Kaluthara");
        System.out.println(c1.toString());
    }

    @Test
    public void searchCustomerByNameAndAddress() {
        Customer c1 = customerRepo.findCustomerByNameAndAddress("Kasun", "Kaluthara");
        System.out.println(c1.toString());
    }

}