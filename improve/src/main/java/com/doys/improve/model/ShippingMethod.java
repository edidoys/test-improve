package com.doys.improve.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import net.bytebuddy.dynamic.loading.InjectionClassLoader.Strategy;

@Entity
@Table(name="shippingMethod")
public class ShippingMethod {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "shipping_method_id")
  private long shippingMethodId;

  @Column(name="shipping_method")
  private String shippingMethod;

  public long getShippingMethodId() {
    return shippingMethodId;
  }

  public void setShippingMethodId(long shippingMethodId) {
    this.shippingMethodId = shippingMethodId;
  }

  public String getShippingMethod() {
    return shippingMethod;
  }

  public void setShippingMethod(String shippingMethod) {
    this.shippingMethod = shippingMethod;
  }
}
