package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.javabean.Product;
@Repository
public interface IProductRepository extends JpaRepository<Product, Integer>{
   Product getProductById(Integer id);
}
