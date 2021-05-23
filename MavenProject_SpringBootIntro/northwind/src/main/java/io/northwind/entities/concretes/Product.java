package io.northwind.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;//jpa alt yapısını kullanır
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity  //anotation, bu class'ın derleme anında bilgi toplanmasını sağlar,hangi katmana denk geldiğini söyler
@Table(name="products")                              //dB'de hangi tabloya karşılık geliyor
@AllArgsConstructor
@NoArgsConstructor
public class Product {
	


	@Id      
	@GeneratedValue(strategy = GenerationType.IDENTITY)     //işlemlerini id'ye göre yapacak,jpa için sorgular bu id'ye göre yapılandırılır
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
