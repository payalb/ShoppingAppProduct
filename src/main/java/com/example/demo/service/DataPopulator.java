package com.example.demo.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ProductRepo;
import com.example.demo.dto.Category;
import com.example.demo.dto.Product;


@Profile("!prod")
@Service
public class DataPopulator implements CommandLineRunner {
	
	@Autowired ProductRepo rep;
	
	@Override
	public void run(String... args) throws Exception {
			
		Category c1= new Category(1,"Laptop");
		Category c2= new Category(2,"Computer");
		Category c3= new Category(3,"Apple");
		ArrayList<Category> list1= new ArrayList<>();
		list1.add(c1);
		list1.add(c2);
		Product p1 = Product.builder().id("1").name("thinkpad").model("X1").brand("lenovo").categories(list1).price(2210f).build();
		Product p2 = Product.builder().id("2").name("Macbook").model("16.3 inch").price(2400f).categories(list1).build();
		rep.save(p1);
		rep.save(p2);
	}
	
}