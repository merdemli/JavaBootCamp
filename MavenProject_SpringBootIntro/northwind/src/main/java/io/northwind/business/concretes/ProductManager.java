package io.northwind.business.concretes;

import java.util.List;
		   //bean:proje class'ı//instance verir 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.northwind.business.abstracts.ProductService;
import io.northwind.dataAccess.abstracts.ProductDao;
import io.northwind.entities.concretes.Product;


@Service //bu class servis görevi görecek demektir 
public class ProductManager implements ProductService{

	private ProductDao productDao;
	
	                  //Spring'den gelir ProductDao'nun instance'ı olabilcek sınıfı üretir buraya verir
				     //ProductDao'nun ne oldugunu benim sana vereblmem için üzerinne bir autowired eklenir
	@Autowired   
	public ProductManager(ProductDao prodactDao) {
		super();
		this.productDao = prodactDao;
	}
	@Override
	public List<Product> getAll() {
		
		return this.productDao.findAll();
	}							//JPA repository'den gelir

}
