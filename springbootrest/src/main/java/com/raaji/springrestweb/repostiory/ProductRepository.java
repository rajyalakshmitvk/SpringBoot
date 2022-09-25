package com.raaji.springrestweb.repostiory;

import org.springframework.data.repository.CrudRepository;

import com.raaji.springrestweb.entities.Product;


public interface ProductRepository extends CrudRepository<Product, Integer>{

	
	
}
