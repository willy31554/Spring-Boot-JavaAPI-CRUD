package com.mycrofttechie.springboot.crud.repository;

import com.mycrofttechie.springboot.crud.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
	Product findByName(String name);
}
