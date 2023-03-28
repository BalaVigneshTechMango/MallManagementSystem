package com.mall.managementsystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mall.managementsystem.entity.StoresEntity;
@Repository
public interface StoreRepository extends JpaRepository<StoresEntity, Integer> {
	
}
