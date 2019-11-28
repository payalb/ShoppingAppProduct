package com.example.demo.dto;

import java.io.IOException;

import org.springframework.boot.jackson.JsonComponent;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.TreeNode;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
//obj=new CategoryConverter(); obj.new CategorySerializer()
@JsonComponent
public class CategoryConverter {
	public static class CategorySerializer extends JsonSerializer<Category> {

		@Override
		public void serialize(Category category, JsonGenerator gen, SerializerProvider serializers) throws IOException {
		//	gen.writeNumberField("id",category.getId());
		//	gen.writeStringField("name",category.getName());
			gen.writeString(category.getName());
		}

	}

	public static class CategoryDeserializer extends JsonDeserializer<Category> {

		@Override
		public Category deserialize(JsonParser p, DeserializationContext ctxt)
				throws IOException, JsonProcessingException {
		/*TreeNode node=p.readValueAsTree();
		
			int id =Integer.parseInt(node.get("id").toString());
			String name =node.get("name").toString();
			Category c = new Category(id, name);
			return c;*/
			
			String name=p.readValueAs(String.class);
			Category c= new Category(-1, name);
			return c;
		}

	}
}