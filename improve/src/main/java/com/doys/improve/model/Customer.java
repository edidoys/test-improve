package com.doys.improve.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {

  public Customer(){}

  public Customer(long customerId, String companyName, String firstName, String lastName,
      String billingAddress, String city, String stateOrProvince, String zipCode,
      String email, String companyWebsite, String phoneNumber, String faxNumber,
      String shipAddress, String shipCity, String shipStateOrProvince, String shipZipCode,
      String shipPhoneNumber) {
    this.customerId = customerId;
    this.companyName = companyName;
    this.firstName = firstName;
    this.lastName = lastName;
    this.billingAddress = billingAddress;
    this.city = city;
    this.stateOrProvince = stateOrProvince;
    this.zipCode = zipCode;
    this.email = email;
    this.companyWebsite = companyWebsite;
    this.phoneNumber = phoneNumber;
    this.faxNumber = faxNumber;
    this.shipAddress = shipAddress;
    this.shipCity = shipCity;
    this.shipStateOrProvince = shipStateOrProvince;
    this.shipZipCode = shipZipCode;
    this.shipPhoneNumber = shipPhoneNumber;
  }

  @Id
  @GeneratedValue(strategy =  GenerationType.AUTO)
  @Column(name = "customer_id")
  private long customerId;

  @Column(name = "company_name")
  private String companyName;

  @Column(name= "first_name")
  private String firstName;

  @Column(name= "last_name")
  private String lastName;

  @Column(name = "billing_address")
  private String billingAddress;

  @Column(name = "city")
  private String city;

  @Column(name="state_or_province")
  private String stateOrProvince;

  @Column(name="zip_code")
  private String zipCode;

  @Column(name="email")
  private String email;

  @Column(name="company_website")
  private String companyWebsite;

  @Column(name="phone_number")
  private String phoneNumber;

  @Column(name ="fax_number")
  private String faxNumber;

  @Column(name ="ship_address")
  private String shipAddress;

  @Column(name ="ship_city")
  private String shipCity;

  @Column(name ="ship_state_or_province")
  private String shipStateOrProvince;

  @Column(name ="ship_zip_code")
  private String shipZipCode;

  @Column(name ="ship_phone_number")
  private String shipPhoneNumber;

  public long getCustomerId() {
    return customerId;
  }

  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
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

  public String getBillingAddress() {
    return billingAddress;
  }

  public void setBillingAddress(String billingAddress) {
    this.billingAddress = billingAddress;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getStateOrProvince() {
    return stateOrProvince;
  }

  public void setStateOrProvince(String stateOrProvince) {
    this.stateOrProvince = stateOrProvince;
  }

  public String getZipCode() {
    return zipCode;
  }

  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getCompanyWebsite() {
    return companyWebsite;
  }

  public void setCompanyWebsite(String companyWebsite) {
    this.companyWebsite = companyWebsite;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public String getFaxNumber() {
    return faxNumber;
  }

  public void setFaxNumber(String faxNumber) {
    this.faxNumber = faxNumber;
  }

  public String getShipAddress() {
    return shipAddress;
  }

  public void setShipAddress(String shipAddress) {
    this.shipAddress = shipAddress;
  }

  public String getShipCity() {
    return shipCity;
  }

  public void setShipCity(String shipCity) {
    this.shipCity = shipCity;
  }

  public String getShipStateOrProvince() {
    return shipStateOrProvince;
  }

  public void setShipStateOrProvince(String shipStateOrProvince) {
    this.shipStateOrProvince = shipStateOrProvince;
  }

  public String getShipZipCode() {
    return shipZipCode;
  }

  public void setShipZipCode(String shipZipCode) {
    this.shipZipCode = shipZipCode;
  }

  public String getShipPhoneNumber() {
    return shipPhoneNumber;
  }

  public void setShipPhoneNumber(String shipPhoneNumber) {
    this.shipPhoneNumber = shipPhoneNumber;
  }

  @Override
  public String toString() {
    return "Customer{" +
        "customerId=" + customerId +
        ", companyName='" + companyName + '\'' +
        ", firstName='" + firstName + '\'' +
        ", lastName='" + lastName + '\'' +
        ", billingAddress='" + billingAddress + '\'' +
        ", city='" + city + '\'' +
        ", stateOrProvince='" + stateOrProvince + '\'' +
        ", zipCode='" + zipCode + '\'' +
        ", email='" + email + '\'' +
        ", companyWebsite='" + companyWebsite + '\'' +
        ", phoneNumber='" + phoneNumber + '\'' +
        ", faxNumber='" + faxNumber + '\'' +
        ", shipAddress='" + shipAddress + '\'' +
        ", shipCity='" + shipCity + '\'' +
        ", shipStateOrProvince='" + shipStateOrProvince + '\'' +
        ", shipZipCode='" + shipZipCode + '\'' +
        ", shipPhoneNumber='" + shipPhoneNumber + '\'' +
        '}';
  }
}
