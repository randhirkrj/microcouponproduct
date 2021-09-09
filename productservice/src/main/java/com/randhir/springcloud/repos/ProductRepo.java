package com.randhir.springcloud.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.randhir.springcloud.model.Product;

public interface ProductRepo extends JpaRepository<Product, Long> {

}
