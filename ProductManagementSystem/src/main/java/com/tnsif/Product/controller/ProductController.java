package com.tnsif.Product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tnsif.Product.entity.Product;
import com.tnsif.Product.respository.ProductRepository;

@RestController
public class ProductController {
	
	@Autowired
	ProductRepository repo;
	
	@PostMapping("/Product")
	public Product addProduct (@RequestBody Product p)
	{
		
		return repo.save(p);
	}
	@GetMapping("/Product")
	public List<Product> getProducts()
	{
		return repo.findAll();
	}
	 @GetMapping("/Product/{id}")
	public Product getProductById(@PathVariable Integer id)
	{
		return repo.findById(id).get();
	}
	 
	 @DeleteMapping("/Product/{id}")
	 public void deleteProduct(@PathVariable Integer id)
	 {
		 repo.deleteById(id);
	 }
	 
	 @DeleteMapping("/Product")
	 public Product updateProduct (@PathVariable Integer id, @RequestBody Product P)
	 {
		 P.setId(id);
		return repo.save(null);
	 }
}































