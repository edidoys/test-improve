package com.doys.improve.dao;

import com.doys.improve.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends PagingAndSortingRepository<Customer, Long>,
    JpaRepository<Customer, Long> {

  Customer findCustomersByLastName(String lastName);
}
