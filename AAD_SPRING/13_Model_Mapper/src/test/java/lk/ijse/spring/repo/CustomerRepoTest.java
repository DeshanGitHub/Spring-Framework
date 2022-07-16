package lk.ijse.spring.repo;

import lk.ijse.spring.config.JPAConfig;
import lk.ijse.spring.entity.Customer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;

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
        Customer c2 = customerRepo.findByName("Kasun");
        System.out.println(c1.toString());
        System.out.println(c2.toString());
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

    @Test
    public void searchByName() {
        List<Customer> customers = customerRepo.searchByName("Dasun");
        for (Customer customer : customers) {
            System.out.println(customer.toString());
        }
    }

    @Test
    public void t1() {
        Customer c1 = customerRepo.findByName("Dasun");
        System.out.println(c1.toString());

        Customer c2 = customerRepo.readByName("Dasun");
        System.out.println(c2.toString());

        Customer c3 = customerRepo.getByName("Dasun");
        System.out.println(c3.toString());

        Customer c4 = customerRepo.queryByName("Dasun");
        System.out.println(c4.toString());

//        Customer c5 = customerRepo.searchByName("Kasun");
//        System.out.println(c5.toString());

        Customer c6 = customerRepo.streamByName("Kasun");
        System.out.println(c6.toString());
    }

    @Test
    public void testCountBy(){
        long ramal = customerRepo.countByName("Kamal");
        System.out.println(ramal);
    }

    @Test
    public void testExistBy(){
        boolean b = customerRepo.existsByNameAndAddress("Dasun", "Panadura");
        System.out.println(b);
    }

}