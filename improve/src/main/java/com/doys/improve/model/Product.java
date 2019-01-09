package com.doys.improve.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "product_id")
  private long productId;

  @Column(name = "product_name")
  private String productName;

  @Column(name = "unit_price")
  private String Integer;

  @Column(name="in_stock")
  private boolean inStock;

  public long getIdProduct() {
    return productId;
  }

  public void setIdProduct(long idProduct) {
    this.productId = idProduct;
  }

  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public String getInteger() {
    return Integer;
  }

  public void setInteger(String integer) {
    Integer = integer;
  }

  public boolean isInStock() {
    return inStock;
  }

  public void setInStock(boolean inStock) {
    this.inStock = inStock;
  }
}
