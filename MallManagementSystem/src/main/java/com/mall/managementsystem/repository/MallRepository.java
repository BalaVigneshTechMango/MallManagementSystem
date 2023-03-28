package com.mall.managementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mall.managementsystem.entity.MallDetailsEntity;

@Repository
public interface MallRepository extends JpaRepository<MallDetailsEntity, Integer> {

	@Query("SELECT m.discount from MallDetailsEntity m join StoresEntity s "
			+ "on m.mallid=s.mallDetailsEntity.mallid where s.storeId=?1")
	public Object findByIdDetails(int storeId);

	
	@Query("SELECT m.discount from MallDetailsEntity m join StoresEntity s "
			+ "on m.mallid=s.mallDetailsEntity.mallid join ProductEntity p on s.storeId=p.storesEntity.storeId where p.productId=?1")
	public Object findByIdDetail(int productId);
	
}
