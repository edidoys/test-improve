package com.doys.improve.dao;

import com.doys.improve.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRespository extends JpaRepository<Product,Long> {

}
