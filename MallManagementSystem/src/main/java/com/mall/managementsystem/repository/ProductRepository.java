package com.mall.managementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mall.managementsystem.entity.ProductEntity;
@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Integer> {

}
