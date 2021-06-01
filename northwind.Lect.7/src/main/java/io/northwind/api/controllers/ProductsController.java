package io.northwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.northwind.business.abstracts.ProductService;
import io.northwind.core.utilities.results.DataResult;
import io.northwind.core.utilities.results.Result;
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


	@GetMapping ("/getall")             //kodlama.io/api/products/getAll diye bir istekte bulunursak, bu çalışır.
	public DataResult<List<Product>> getAll() 
	{
		return this.productService.getAll();  
	}
	
	
	@PostMapping ("/add")                                                            //ürün ekleme
	public Result add(@RequestBody Product product) {     
		return productService.add(product);
	};
	
																																//requestParam
	@GetMapping("/getByProductName")         //endPoint : istek yapılan yer,bu endPoint'e bir istek yapılır ve productName gösnderilir,yani parametre
	public DataResult<Product>getByProductName(@RequestParam String productName){            //kullanıcıdan alınan bilgi, yapılan istek
		return productService.getByProductName(productName);
		
		//yapılan istegin parametrelerine bak, orada product name diye bir şey olacak,request param olarak ataması yapaılacak
	}

	@GetMapping("/getByProductNameAndCategoryId") //url adresi oluşturulur //top 1 yapar,1 ürün döner
	public DataResult<Product> getByProductNameAndCategoryId(@RequestParam("productName") String productName, @RequestParam ("categoryId")int categoryId){
		return productService.getByProductNameAndCategoryId(productName, categoryId);
	}
	
	@GetMapping("/getByProductNameContains")
	public DataResult<List<Product>>getByProductNameContains(@RequestParam String productName){
		return productService.getByProductNameContains(productName);
	}

	@GetMapping("/getAllByPage")
	public DataResult<List<Product>> getAll(int pageNo, int pageSize){
		return productService.getAll(pageNo, pageSize);
	}
	
	@GetMapping("/getAllAsc")
	public DataResult<List<Product>> getAllSorted(){
		return productService.getAllSorted();
	}
	
}


//kodlama.io/api/products isteği geldiğinde Productscontroller karşılar
