package com.doys.improve.controller;


import com.doys.improve.dao.ProductRespository;
import com.doys.improve.model.Customer;
import com.doys.improve.model.Product;
import com.doys.improve.service.ProductService;
import com.doys.improve.utils.CsvUtils;
import java.io.IOException;
import java.io.InputStream;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {

  @Autowired
  private ProductService productService;

  @Autowired
  private ProductRespository productRespository;


  @PostMapping("/create")
  @ResponseStatus(HttpStatus.CREATED)
  public Product createProduct(@Valid @RequestBody Product product){
    return productService.createProduct(product);
  }

  @PostMapping("/upload")
  public void uploadProduct(@RequestParam(value = "file")InputStream file) throws IOException {
    productRespository.saveAll(CsvUtils.read(Product.class,file));
  }

}
