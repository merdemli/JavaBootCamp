package io.northwind.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import io.northwind.entities.concretes.Product;
import io.northwind.entities.dtos.ProductWithCategoryDto;

public interface ProductDao extends JpaRepository<Product,Integer>{   
	
	//JPA

	Product getByProductName(String productName);
	//JPA get'i gördüğü yerde where koşşulunu çalıştırır
	
	Product getByProductNameAndCategory_CategoryId(String productName, int categoryId);
	//kolon isimleriyazılır; and operatörü where koşulu ile çalışır
	
	List<Product>getByProductNameOrCategory_CategoryId(String productName, int category); 
	
	List<Product>getByCategoryIn(List<Integer>categories);
   //select* from products where category_id in(1,2,3,4)
	
	List<Product> getByProductNameContains(String productName);
	
	List<Product> getByProductNameStartsWith(String productName);
	
	
	//JPQL
	           //entity'dir -entity'dekialanımız-parametre                                       //entity'deki alanalar
	@Query("From Product where productName=:productName and categoryId=:categoryId") //:xxx parametre isimlendirmesidir
	List<Product>getByNameAndCategory(String productName, int categoryId);
	
	//select * from products where product_name = a and category_id = b 
	
	
																		//entity
	@Query("Select new io.northwind.entities.dtos.ProductWithCategoryDto(p.id, p.productName, c.categoryName)"
															+ "From Category c Inner Join c.products p ")                //category ve category ile																												//ilişkilendirilmiş productlardan
	List<ProductWithCategoryDto>getProductWithCategoryDetails();											        //ana tablodan join edilecek productlar tablosuna
	//istediğin alanları verir
	
	//select p.product_id, p.product_name, c category_name from Category c inner join Product p 
	//on c.category_Id = p.category_Id 
	
	
	
	
	
}
