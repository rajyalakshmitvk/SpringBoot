package com.raaji.springrestweb.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.raaji.springrestweb.entities.Product;
import com.raaji.springrestweb.repostiory.ProductRepository;

@RestController
public class ProductRestController {
	
	@Autowired
	ProductRepository repository;
	
	@RequestMapping(value="/products", method = RequestMethod.GET)
	public List<Product> getProducts()
	{
		return (List<Product>) repository.findAll();
	}
	
	@RequestMapping(value="/products/{id}", method = RequestMethod.GET)
	public Product readProduct(@PathVariable("id") int id)
	{
		return repository.findById(id).get();
	}
	
	/*@RequestMapping(value="/products/", method = RequestMethod.POST)
	public Product createProduct(Product product)
	{
		return repository.save(product);
	}
	
	@RequestMapping(value="/products/", method = RequestMethod.PUT)
	public Product updateProduct(Product product)
	{
		return repository.save(product);
	}
	
	@RequestMapping(value="/products/{id}", method = RequestMethod.DELETE)
	public void deleteProduct(@PathVariable("id") int id)
	{
		repository.deleteById(id);
	}*/
}
