package com.example.demo.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dto.Product;

@Transactional
public interface ProductRepo extends MongoRepository<Product, String>{
	
/*	@Query(value="{'categories._id': ?0}")*/
	public List<Product> findProductsByCategoriesId(int id);
}
