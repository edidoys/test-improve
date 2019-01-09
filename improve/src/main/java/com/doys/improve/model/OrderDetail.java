package com.doys.improve.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "order_detail")
public class OrderDetail {

  @Id
  @Column(name="order_detail_id")
  private long orderDetailId;

  @Column(name="order_id")
  private long orderId;

  @Column(name="product_id")
  private long productId;

  @Column(name="quantity")
  private Integer quantity;

  @Column(name="unit_price")
  private long unitPrice;

  @Column(name="discount")
  private Integer discount;

}
