package io.northwind.business.abstracts;

import java.util.List;

import io.northwind.core.utilities.results.DataResult;
import io.northwind.core.utilities.results.Result;
import io.northwind.entities.concretes.Product;

public interface ProductService {
	
	DataResult<List<Product>>getAll(); //tek başına veri döndürmez, başarılı mı, mesajını vs de döndürür
		
	Result add(Product product); //result döndürür
}
