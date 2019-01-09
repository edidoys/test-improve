package com.doys.improve.controller;

import com.doys.improve.dao.CustomerRepository;
import com.doys.improve.exception.ResourceNotFoundException;
import com.doys.improve.model.Customer;
import com.doys.improve.service.CustomerService;
import com.doys.improve.utils.CsvUtils;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/customer")
public class CustomerController{

  @Autowired
  private CustomerService customerService;

  @Autowired
  private CustomerRepository customerRepository;

  @GetMapping("/find/{lastName}")
  public Customer findCustomerByLastName( @PathVariable String lastName){
    return customerService.findCustomerByLastName(lastName);
  }

  @PostMapping("/create")
  @ResponseStatus(HttpStatus.CREATED)
  public Customer createCustomer(@Valid @RequestBody Customer customer){
   return customerService.createNewCustomer(customer);
  }

  @PutMapping
  public ResponseEntity<Customer> updateCustomer(@PathVariable(value="id") long customerId,
      @Valid @RequestBody Customer customer) throws ResourceNotFoundException {
    final Customer cust = customerService.updateCustomer(customer,customerId);
    return ResponseEntity.ok(cust);
  }

  @PostMapping(value = "/upload",consumes = "text/csv")
  public void uploadCsvFile(@RequestParam("file") MultipartFile file) throws IOException {
    customerRepository.saveAll(CsvUtils.read(Customer.class,file.getInputStream()));
  }


}
