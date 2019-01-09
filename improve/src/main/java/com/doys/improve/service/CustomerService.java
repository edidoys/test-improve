package com.doys.improve.service;

import com.doys.improve.exception.ResourceNotFoundException;
import com.doys.improve.model.Customer;
import java.util.List;
import org.springframework.data.domain.Page;

public interface CustomerService {

  Customer findCustomerByLastName(String lastName);

  Customer createNewCustomer(Customer customer);

  Customer updateCustomer(Customer customer, long id) throws ResourceNotFoundException;
}
