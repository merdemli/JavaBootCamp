package io.northwind.business.abstracts;

import java.util.List;

import io.northwind.entities.concretes.Product;

public interface ProductService {
	
	List<Product>getAll();

}
