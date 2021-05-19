package io.northwind.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;//jpa alt yapısını kullanır
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity  //anotation, bu class'ın derleme anında bilgi toplanmasını sağlar,hangi katmana denk geldiğini söyler
@Table(name="products")                              //dB'de hangi tabloya karşılık geliyor
@Data   //
public class Product {
	
	public Product(int id, int categoryId, String productName, double unitPrice, short unitsInStock,
			String quantityPerUnit) {
		super();
		this.id = id;
		this.categoryId = categoryId;
		this.productName = productName;
		this.unitPrice = unitPrice;
		this.unitsInStock = unitsInStock;
		this.quantityPerUnit = quantityPerUnit;
	}
	
	public Product() {}

	@Id      
	@GeneratedValue     //işlemlerini id'ye göre yapacak,jpa için sorgular bu id'ye göre yapılandırılır
	@Column(name="product_id")
	private int id;
	
	@Column(name="category_id")
	private int categoryId;
	
	@Column(name="product_name")
	private String productName;
	
	@Column(name="unit_price")
	private double unitPrice;
	
	@Column(name="units_in_stock")
	private short unitsInStock;
	
	@Column(name="quantity_per_unit")
	private String quantityPerUnit;
	
	

}
