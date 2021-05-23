 package io.northwind.business.concretes;

import java.util.List;
		   //bean:proje class'ı//instance verir 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.northwind.business.abstracts.ProductService;
import io.northwind.core.utilities.results.DataResult;
import io.northwind.core.utilities.results.Result;
import io.northwind.core.utilities.results.SuccessDataResult;
import io.northwind.core.utilities.results.SuccessResult;
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
	public DataResult<List<Product>> getAll() {
		
		return new SuccessDataResult<List<Product>>(this.productDao.findAll(),"Data Listelendi");
				//DataResult; bir entity'nin dönüşünü anlatır.
				 
	}							//JPA repository'den gelir


	@Override
	public Result add(Product product) {
		this.productDao.save(product);
		return new SuccessResult("Ürün eklendi");//data dönmediğiimiz için direkt SuccessResult'la mesaj döneriz
	}

}
