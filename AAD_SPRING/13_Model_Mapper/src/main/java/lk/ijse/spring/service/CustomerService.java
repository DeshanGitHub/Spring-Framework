package lk.ijse.spring.service;

import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.entity.Customer;

import java.util.List;

public interface CustomerService {

    void saveCustomer(CustomerDTO entity);
    void deleteCustomer(String id);
    void updateCustomer(CustomerDTO entity);
    CustomerDTO searchCustomer(String id);
    List<CustomerDTO> getAllCustomers();

}
