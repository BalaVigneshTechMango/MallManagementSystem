package com.mall.managementsystem.service.impl;

import java.text.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mall.managementsystem.dao.ProductDao;
import com.mall.managementsystem.date.DateLogic;
import com.mall.managementsystem.discount.ProductDiscount;
import com.mall.managementsystem.entity.ProductEntity;
import com.mall.managementsystem.entity.StoresEntity;
import com.mall.managementsystem.exception.BadRequestException;
import com.mall.managementsystem.repository.MallRepository;
import com.mall.managementsystem.request.ProductRequestPojo;
import com.mall.managementsystem.response.ResponsePojo;
import com.mall.managementsystem.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao productDao;
	@Autowired
	private MallRepository mallRepository;

	@Override
	public ResponsePojo addProduct(ProductRequestPojo productRequestPojo) throws ParseException {
		ProductEntity productEntity = new ProductEntity();
		StoresEntity storesEntity = new StoresEntity();
		ProductDiscount productDiscount = new ProductDiscount();
		DateLogic dateLogic = new DateLogic();

		productEntity.setProductId(productRequestPojo.getProductId());
		productEntity.setProductName(productRequestPojo.getProductName());
		productEntity.setPrice(productRequestPojo.getPrice());
		storesEntity.setStoreId(productRequestPojo.getStoreId());
		productEntity.setStoresEntity(storesEntity);
		productEntity.setProductDate(productRequestPojo.getProductDate());
		Object discountProduct = mallRepository.findByIdDetails(productRequestPojo.getStoreId());

		System.out.println(discountProduct);
		if (productEntity.getProductDate().after(dateLogic.getDateCurrent())) {
			throw new BadRequestException("bad request check the date");
		} else {
			ProductEntity discount = productDiscount.discountProduct(productEntity, (int) discountProduct);
			return productDao.addProduct(discount);
		}

	}

	@Override
	public ResponsePojo getProductDetails(ProductRequestPojo productRequestPojo) {
		int productId = productRequestPojo.getProductId();
		return productDao.getProductDetails(productId);
	}

	@Override
	public ProductEntity getdetailsProduct(ProductRequestPojo productRequestPojo) {
		int productId = productRequestPojo.getProductId();
		return productDao.getDetailsProduct(productId);
	}

	@Override
	public ResponsePojo getProductWithDiscount(ProductRequestPojo productRequestPojo) {
		ResponsePojo responsePojo = new ResponsePojo();
		ProductDiscount productDiscount = new ProductDiscount();

		Object discountProduct = productDao.findByProductId(productRequestPojo.getProductId());
		ProductEntity productEntity = getdetailsProduct(productRequestPojo);
		if (productEntity.getIsDiscount().equals(false)) {
			ProductEntity discount = productDiscount.discountProduct(productEntity, (int) discountProduct);
			responsePojo.setObj(discount);
			return responsePojo;
		} else {
			responsePojo.setObj(productEntity);
			return responsePojo;
		}
	}

	@Override
	public ResponsePojo getAllDetails(ProductRequestPojo productRequestPojo) {

		return productDao.getAllDetails(productRequestPojo);
	}

}
