package lk.ijse.spring.repo;

import lk.ijse.spring.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepo extends JpaRepository<Customer, String> {
    //query methods
    Customer findCustomerByName(String name);

    Customer findCustomerByAddress(String address);

    Customer findCustomerByNameAndAddress(String name,String address);

    Customer findByName(String name);

    Customer readByName(String name);

    Customer getByName(String name);

    Customer queryByName(String name);

//    Customer searchByName(String name);

    Customer streamByName(String name);

    List<Customer> searchByName(String name);

    //test countBy
    long countByName(String name);

    //test existBy
    boolean existsByNameAndAddress(String name,String address);

    //    native sql
    @Query(value = "select * from Customer",nativeQuery = true)
    List<Customer> getAllCustomers();
}
