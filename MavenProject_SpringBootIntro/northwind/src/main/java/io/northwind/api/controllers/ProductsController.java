package io.northwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.northwind.business.abstracts.ProductService;
import io.northwind.entities.concretes.Product;

@RestController
@RequestMapping("/api/products")
public class ProductsController  //çoğul isimlendirilir 

{
	@Autowired  
	private ProductService productService; 
	
	public ProductsController(ProductService productService) {
		super();
		this.productService = productService;
	}


	@GetMapping ("/getall")  //kodlama.io/api/products/getAll diye bir istekte bulunursak, bu çalışırız
	public List<Product> getAll() 
	{
		return this.productService.getAll();  
	}

}


//kodlama.io/api/products isteği geldiğinde Productscontroller karşılar
