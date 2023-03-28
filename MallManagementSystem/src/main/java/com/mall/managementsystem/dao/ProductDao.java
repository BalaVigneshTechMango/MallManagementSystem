package com.mall.managementsystem.dao;

import java.text.ParseException;

import com.mall.managementsystem.entity.ProductEntity;
import com.mall.managementsystem.request.ProductRequestPojo;
import com.mall.managementsystem.response.ResponsePojo;

public interface ProductDao {

	ResponsePojo addProduct(ProductEntity productEntity) throws ParseException;

	ResponsePojo getProductDetails(int productId);

	ProductEntity getDetailsProduct(int productId);

	ResponsePojo getAllDetails(ProductRequestPojo productRequestPojo);
	
	Object findByProductId(int productId);

}
