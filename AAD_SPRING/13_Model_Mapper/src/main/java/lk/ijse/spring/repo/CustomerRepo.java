package lk.ijse.spring.repo;

import lk.ijse.spring.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer, String> {
    //query methods
    Customer findCustomerByName(String name);

    Customer findCustomerByAddress(String address);

    Customer findCustomerByNameAndAddress(String name,String address);
}
