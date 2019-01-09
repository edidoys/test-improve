package com.doys.improve.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "order")
public class Order {

  @Id
  @Column(name = "order_id")
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long orderId;

  @Column(name = "customer_id")
  private long customerId;

  @Column(name = "employee_id")
  private long employeeId;

  @Column(name = "order_date")
  private Date orderDate;

  @Column(name = "purchase_order_number")
  private String purchaseOrderNumber;

  @Column(name = "ship_date")
  private Date shipDate;

  @Column(name = "shipping_method_id")
  private long shippingMethodId;

  @Column(name="freight_charge")
  private long freightCharge;

  @Column(name="taxes")
  private long taxes;

  @Column(name="payment_received")
  private boolean paymentReceived;

  @Column(name="comment")
  private String comment;

  public long getOrderId() {
    return orderId;
  }

  public void setOrderId(long orderId) {
    this.orderId = orderId;
  }

  public long getCustomerId() {
    return customerId;
  }

  public void setCustomerId(long customerId) {
    this.customerId = customerId;
  }

  public long getEmployeeId() {
    return employeeId;
  }

  public void setEmployeeId(long employeeId) {
    this.employeeId = employeeId;
  }

  public Date getOrderDate() {
    return orderDate;
  }

  public void setOrderDate(Date orderDate) {
    this.orderDate = orderDate;
  }

  public String getPurchaseOrderNumber() {
    return purchaseOrderNumber;
  }

  public void setPurchaseOrderNumber(String purchaseOrderNumber) {
    this.purchaseOrderNumber = purchaseOrderNumber;
  }

  public Date getShipDate() {
    return shipDate;
  }

  public void setShipDate(Date shipDate) {
    this.shipDate = shipDate;
  }

  public long getShippingMethodId() {
    return shippingMethodId;
  }

  public void setShippingMethodId(long shippingMethodId) {
    this.shippingMethodId = shippingMethodId;
  }

  public long getFreightCharge() {
    return freightCharge;
  }

  public void setFreightCharge(long freightCharge) {
    this.freightCharge = freightCharge;
  }

  public long getTaxes() {
    return taxes;
  }

  public void setTaxes(long taxes) {
    this.taxes = taxes;
  }

  public boolean isPaymentReceived() {
    return paymentReceived;
  }

  public void setPaymentReceived(boolean paymentReceived) {
    this.paymentReceived = paymentReceived;
  }

  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  @Override
  public String toString() {
    return "Order{" +
        "orderId=" + orderId +
        ", customerId='" + customerId + '\'' +
        ", employeeId='" + employeeId + '\'' +
        ", orderDate=" + orderDate +
        ", purchaseOrderNumber='" + purchaseOrderNumber + '\'' +
        ", shipDate=" + shipDate +
        ", shippingMethodId=" + shippingMethodId +
        ", freightCharge=" + freightCharge +
        ", taxes=" + taxes +
        ", paymentReceived=" + paymentReceived +
        ", comment='" + comment + '\'' +
        '}';
  }
}
