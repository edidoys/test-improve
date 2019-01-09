package com.doys.improve.service.impl;

import com.doys.improve.dao.CustomerRepository;
import com.doys.improve.exception.ResourceNotFoundException;
import com.doys.improve.model.Customer;
import com.doys.improve.service.CustomerService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {


  @Autowired
  CustomerRepository customerRepository;

  @Override
  public Customer findCustomerByLastName(String lastName) {
    return customerRepository.findCustomersByLastName(lastName);
  }

  @Override
  public Customer createNewCustomer(Customer customer) {
    return customerRepository.save(customer);
  }

  @Override
  public Customer updateCustomer(Customer customer, long id) throws ResourceNotFoundException {
    Customer cust = customerRepository.findById(id)
        .orElseThrow(() -> new ResourceNotFoundException("customer not found" + id ));

    cust.setBillingAddress(customer.getBillingAddress());
    cust.setCity(customer.getCity());
    cust.setCompanyName(customer.getCompanyName());
    cust.setCompanyWebsite(customer.getCompanyWebsite());
    cust.setEmail(customer.getEmail());
    cust.setFaxNumber(customer.getFaxNumber());
    cust.setFirstName(customer.getFirstName());
    cust.setLastName(customer.getLastName());
    cust.setPhoneNumber(customer.getPhoneNumber());
    cust.setShipPhoneNumber(customer.getShipPhoneNumber());

    return customerRepository.save(cust);
  }
}
