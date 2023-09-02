package com.product.manage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.product.manage.entity.ProductEntity;

@Repository
public interface ProductDao extends JpaRepository<ProductEntity, Integer> {

}
