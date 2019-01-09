package com.doys.improve.service.impl;

import com.doys.improve.dao.EmployeeRepository;
import com.doys.improve.model.Employee;
import com.doys.improve.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeServiceImpl implements EmployeeService {

  @Autowired
  EmployeeRepository employeeRepository;

  @Override
  public Employee createEmployee(Employee employee) {
    return employeeRepository.save(employee);
  }
}
