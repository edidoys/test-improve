package com.doys.improve.service.impl;

import com.doys.improve.dao.ProductRespository;
import com.doys.improve.model.Product;
import com.doys.improve.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

  @Autowired
  ProductRespository productRespository;

  @Override
  public Product createProduct(Product product) {
    return productRespository.save(product);
  }

}
