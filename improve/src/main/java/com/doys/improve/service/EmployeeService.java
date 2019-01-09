package com.doys.improve.service;

import com.doys.improve.model.Employee;
import org.springframework.stereotype.Service;

@Service
public interface EmployeeService {

  Employee createEmployee(Employee employee);


}
