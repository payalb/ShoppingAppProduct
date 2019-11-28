package com.example.demo.dto;

import java.util.ArrayList;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.example.demo.dto.CategoryConverter.CategoryDeserializer;
import com.example.demo.dto.CategoryConverter.CategorySerializer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@Document
@AllArgsConstructor
@NoArgsConstructor
public class Product {
	@JsonIgnore
	@Id
	private String id;
	private String name;
	private String colortype = "default color/type";
	private String model = "default model";
	private String brand = "no brand info";
	private float price =100f;
	private String description = "no description.";
	/*@JsonSerialize(using=CategorySerializer.class)
	@JsonDeserialize(using=CategoryDeserializer.class)*/
	private ArrayList<Category> categories;
	
	
}
