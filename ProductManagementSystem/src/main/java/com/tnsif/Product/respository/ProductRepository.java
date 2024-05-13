package com.tnsif.Product.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tnsif.Product.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>  {

}
	