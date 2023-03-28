package com.mall.managementsystem.service;

import java.text.ParseException;

import com.mall.managementsystem.entity.ProductEntity;
import com.mall.managementsystem.request.ProductRequestPojo;
import com.mall.managementsystem.response.ResponsePojo;

public interface ProductService {

	public ResponsePojo getProductDetails(ProductRequestPojo productRequestPojo);

	public ResponsePojo addProduct(ProductRequestPojo productRequestPojo) throws ParseException;

	public ResponsePojo getProductWithDiscount(ProductRequestPojo productRequestPojo);

	public ProductEntity getdetailsProduct(ProductRequestPojo productRequestPojo);

	public ResponsePojo getAllDetails(ProductRequestPojo productRequestPojo);

	
}
