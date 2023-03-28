package com.mall.managementsystem.dao.impl;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.mall.managementsystem.dao.ProductDao;
import com.mall.managementsystem.entity.MallDetailsEntity;
import com.mall.managementsystem.entity.ProductEntity;
import com.mall.managementsystem.repository.MallRepository;
import com.mall.managementsystem.repository.ProductRepository;
import com.mall.managementsystem.request.ProductRequestPojo;
import com.mall.managementsystem.response.ResponsePojo;

@Service
public class ProductDaoImpl implements ProductDao {

	@Autowired
	private ProductRepository productRepository;
	@Autowired
	private MallRepository mallRepository;

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public ResponsePojo addProduct(ProductEntity productEntity) throws ParseException {
		ResponsePojo responsePojo = new ResponsePojo();
		ProductEntity product = productRepository.save(productEntity);
		responsePojo.setIstrue(true);
		responsePojo.setObj(product);
		responsePojo.setMessage("Add Proudct to Dao");
		return responsePojo;

	}

	@Override
	public ResponsePojo getProductDetails(int productId) {
		ResponsePojo responsePojo = new ResponsePojo();

		ProductEntity productEntity = productRepository.findById(productId).get();
		responsePojo.setIstrue(true);
		responsePojo.setMessage("Product Details::" + productEntity.getProductName());
		responsePojo.setObj(productEntity);
		return responsePojo;

	}

	@Override
	public ProductEntity getDetailsProduct(int productId) {
		ProductEntity productEntity = productRepository.findById(productId).get();
		return productEntity;
	}

	@Override
	public ResponsePojo getAllDetails(ProductRequestPojo productRequestPojo) {
		ResponsePojo responsePojo = new ResponsePojo();
		Object object = jdbcTemplate.query(
				"Select store.store_id,mall.mall_name,mall.discount from store_details as store join mall_details as mall "
						+ "on mall.mallid=store.mallid where store_id=?",
				BeanPropertyRowMapper.newInstance(MallDetailsEntity.class), productRequestPojo.getStoreId());
		responsePojo.setObj(object);
		responsePojo.setMessage("working");
		return responsePojo;

	}

	@Override
	public Object findByProductId(int productId) {

		return mallRepository.findByIdDetail(productId);
	}

}
