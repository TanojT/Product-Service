package com.Mparche.productservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.Mparche.productservice.model.Product;

public interface ProductRepository extends MongoRepository<Product, String>{
    
}
