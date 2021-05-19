package io.northwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import io.northwind.entities.concretes.Product;

public interface ProductDao extends JpaRepository<Product,Integer>{

}
