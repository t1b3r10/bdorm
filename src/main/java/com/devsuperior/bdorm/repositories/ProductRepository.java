package com.devsuperior.bdorm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.bdorm.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
