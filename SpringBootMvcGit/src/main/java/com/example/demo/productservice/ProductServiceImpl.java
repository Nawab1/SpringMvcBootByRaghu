package com.example.demo.productservice;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.demo.javabean.Product;
import com.example.demo.repository.IProductRepository;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
//@AllArgsConstructor
//@NoArgsConstructor
@Service
public class ProductServiceImpl implements IProductService {

	@Autowired
private IProductRepository productRepo;

@Transactional
public Integer saveProduct(Product p) {
	p =  productRepo.save(p);
	return p.getPId();
}

@Override


public List<Product> getAllProducts() {
	
	return productRepo.findAll();
}

@Override
@Transactional
@Modifying
public void deleteProduct(Integer id) {
	productRepo.deleteById(id);
	
}

@Override
public Product getProductById(Integer id) {
	
	return productRepo.getProductById(id);
}
	
}
