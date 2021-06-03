package com.example.demo.productservice;

import java.util.List;

import com.example.demo.javabean.Product;

public interface IProductService {
public Integer saveProduct(Product p);
public List<Product> getAllProducts();
public void deleteProduct(Integer id);
public Product getProductById(Integer id);
}
