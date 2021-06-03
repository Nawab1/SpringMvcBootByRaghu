package com.example.demo.productservice;

import java.util.List;

import javax.transaction.Transactional;

import com.example.demo.javabean.Product;
import com.example.demo.repository.IProductRepository;

import lombok.AllArgsConstructor;
@AllArgsConstructor
public class ProductServiceImpl implements IProductService {

private IProductRepository productRepo;

@Transactional
public Integer saveProduct(Product p) {
	p =  productRepo.save(p);
	return p.getPId();
}

@Override
public List<Product> getAllProducts() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public void deleteProduct(Integer id) {
	// TODO Auto-generated method stub
	
}

@Override
public Product getProductById(Integer id) {
	// TODO Auto-generated method stub
	return null;
}
	
}
