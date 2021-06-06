package io.northwind.business.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import io.northwind.core.utilities.results.DataResult;
import io.northwind.core.utilities.results.Result;
import io.northwind.entities.concretes.Product;
import io.northwind.entities.dtos.ProductWithCategoryDto;

public interface ProductService {
	
	DataResult<List<Product>>getAll(); //tek başına veri döndürmez, başarılı mı, mesajını vs de döndürür
	
	DataResult<List<Product>>getAll(int pageNo, int pageSize);
	//sayfalama    //hangi sayfa ve 1 sayfada kaç data var
	
	DataResult<List<Product>>getAllSorted();
		
	Result add(Product product); //result döndürür
	
	
	DataResult<Product>getByProductName(String productName);
	//JPA get'i gördüğü yerde where koşşulunu çalıştırır
	
	
	DataResult<Product> getByProductNameAndCategoryId(String productName, int categoryId);
	//kolon isimleriyazılır; and operatörü where koşulu ile çalışır
	
	
	DataResult<List<Product>>getByProductNameOrCategoryId(String productName, int categoryId);
	
	
	DataResult<List<Product>>getByCategoryIdIn(List<Integer>categories);
   //select* from products where category_id in(1,2,3,4)
	
	
	DataResult<List<Product>>getByProductNameContains(String productName);
	
	DataResult<List<Product>> getByProductNameStartsWith(String productName);
	
	//JPQL
	            
	DataResult<List<Product>>getByNameAndCategory(String productName, int categoryId);
	
	DataResult<List<ProductWithCategoryDto>>getProductWithCategoryDetails();
	
}
