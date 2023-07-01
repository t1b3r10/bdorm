package com.devsuperior.bdorm.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.bdorm.entities.Department;
import com.devsuperior.bdorm.entities.Product;

@RestController
@RequestMapping(value="/products")
public class ProductController {
	
	@GetMapping
	public List<Product> getObjects () {
		
		Department d1 = new Department(1L, "UCTI");
		Department d2 = new Department(2L, "UCFC");
		
		Product p1 = new Product(1L, "Tibério", 1.00, d1);
		Product p2 = new Product(2L, "Pablo", 2.00, d1);
		Product p3 = new Product(3L, "Marcos", 3.00, d2);
		
		List<Product> listProducts = Arrays.asList(p1, p2, p3);
		
		return listProducts;
		
	}

}
