 package io.northwind.business.concretes;


import java.util.List;
		   //bean:proje class'ı//instance verir 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
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


	@Override
	public DataResult<Product> getByProductName(String productName) {
		return new SuccessDataResult<Product>(this.productDao.getByProductName(productName),"Data Listelendi"); 
	}


	@Override
	public DataResult<Product> getByProductNameAndCategoryId(String productName, int categoryId) {

		return new SuccessDataResult<Product>(this.productDao.getByProductNameAndCategory_CategoryId(productName, categoryId),
				"Data listelendi");
	}


	@Override
	public DataResult<List<Product>> getByProductNameOrCategoryId(String productName, int categoryId) {
		
		return new SuccessDataResult<List<Product>>(this.productDao.getByProductNameOrCategory_CategoryId(productName, categoryId));
	}


	@Override
	public DataResult<List<Product>> getByCategoryIdIn(List<Integer> categories) {
		
		return new SuccessDataResult<List<Product>>(this.productDao.getByCategoryIn(categories), "data listelendi");
	}


	@Override
	public DataResult<List<Product>> getByProductNameContains(String productName) {
		//business codes,eğer bundan geçmezse daoya gitmez
		return new SuccessDataResult<List<Product>>(this.productDao.getByProductNameContains(productName), "data listelendi");
	}


	@Override
	public DataResult<List<Product>> getByProductNameStartsWith(String productName) {
		
		return new SuccessDataResult<List<Product>>(this.productDao.getByProductNameStartsWith(productName), "data listelendi");
	}


	@Override
	public DataResult<List<Product>> getByNameAndCategory(String productName, int categoryId) {
		
		return new SuccessDataResult<List<Product>>(this.productDao.getByNameAndCategory(productName, categoryId), "");
	}


	@Override
	public DataResult<List<Product>> getAll(int pageNo, int pageSize) {  //Sayfalama
		
		Pageable pageable = PageRequest.of(pageNo-1, pageSize); //pageable nesnesi oluşturulur
		
		return new SuccessDataResult<List<Product>>(this.productDao.findAll(pageable).getContent(), "basarılı");
	}


	@Override
	public DataResult<List<Product>> getAllSorted() {
		
		Sort sort = Sort.by(Sort.Direction.ASC, "productName");   //Sort nesnesi oluşturulur//hangi yönde sıralayacagını sööyleriz
		return new SuccessDataResult<List<Product>>(this.productDao.findAll(sort), "Başarılı");
	}

}//arayüzün bana verdiği parametreleri dao'ya gönderiyorum
