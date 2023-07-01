package com.devsuperior.bdorm.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.bdorm.entities.Department;
import com.devsuperior.bdorm.entities.Product;
import com.devsuperior.bdorm.repositories.ProductRepository;

@RestController
@RequestMapping(value="/products")
public class ProductController {
	
	@Autowired
	private ProductRepository productRepository;
	
	@GetMapping
	public List<Product> getObjects () {
		
		List<Product> listProducts = productRepository.findAll();
		
		return listProducts;
		
	}

}
