package com.mall.managementsystem.dao.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.mall.managementsystem.dao.MallDao;
import com.mall.managementsystem.entity.MallDetailsEntity;
import com.mall.managementsystem.repository.MallRepository;
import com.mall.managementsystem.request.MallRequestPojo;
import com.mall.managementsystem.response.ResponsePojo;

@Service
public class MallDaoImpl implements MallDao {

	@Autowired
	private MallRepository mallRepository;
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public ResponsePojo addMallDetails(MallDetailsEntity mallDetailsEntity) {
		ResponsePojo responsePojo = new ResponsePojo();
		MallDetailsEntity mallDetails = mallRepository.save(mallDetailsEntity);
		responsePojo.setObj(mallDetails);
		responsePojo.setMessage("Added Mall Details to dao");
		responsePojo.setIstrue(true);
		return responsePojo;
	}

	@Override
	public ResponsePojo getMallDetails() {
		ResponsePojo responsePojo = new ResponsePojo();
		List<MallDetailsEntity> mallResponDetailsEntity = mallRepository.findAll();
		responsePojo.setObj(mallResponDetailsEntity);
		responsePojo.setMessage("All Mall Details");
		responsePojo.setIstrue(true);
		return responsePojo;
	}

	@Override
	public ResponsePojo updateDiscount(MallDetailsEntity mallDetailsEntity) {
		ResponsePojo responsePojo = new ResponsePojo();
		MallDetailsEntity detailsById = mallRepository.findById(mallDetailsEntity.getMallid()).get();
		detailsById.setDiscount(mallDetailsEntity.getDiscount());
		MallDetailsEntity returnResponsEntity = mallRepository.save(detailsById);
		responsePojo.setObj(returnResponsEntity);
		responsePojo.setMessage("Discount Update for the Mall" + detailsById.getMallName());
		responsePojo.setIstrue(true);
		return responsePojo;
	}

	@Override
	public ResponsePojo getDiscount(MallRequestPojo mallRequestPojo) {
		ResponsePojo responsePojo = new ResponsePojo();
		MallDetailsEntity getDiscount = mallRepository.findById(mallRequestPojo.getMallid()).get();
		int percent = getDiscount.getDiscount();
		responsePojo.setIstrue(true);
		responsePojo.setObj(percent);
		responsePojo.setMessage("Discount Of the Mall" + getDiscount.getMallName() + "-is::" + percent);
		return responsePojo;
	}

	@Override
	public MallDetailsEntity getMallDetailsJdbc(int mallid) {
		
		return jdbcTemplate.queryForObject("Select * from mall_details where mallid=?", 
				BeanPropertyRowMapper.newInstance(MallDetailsEntity.class), mallid);
	}

	@Override
	public Object findByIdDetails(int storeId) {
		return mallRepository.findByIdDetails(storeId);
	}
	
}
