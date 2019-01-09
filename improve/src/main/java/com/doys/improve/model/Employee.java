package com.doys.improve.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {

  @Id
  @Column(name= "employee_id")
  private long employeeId;

  @Column(name= "first_name")
  private String firstName;

  @Column(name= "last_name")
  private String lastName;

  @Column(name= "work_phone")
  private String workPhone;


  public long getEmployeeId() {
    return employeeId;
  }

  public void setEmployeeId(long employeeId) {
    this.employeeId = employeeId;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getWorkPhone() {
    return workPhone;
  }

  public void setWorkPhone(String workPhone) {
    this.workPhone = workPhone;
  }
}
