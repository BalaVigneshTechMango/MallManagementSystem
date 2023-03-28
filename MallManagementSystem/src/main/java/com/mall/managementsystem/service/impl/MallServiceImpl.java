package com.mall.managementsystem.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mall.managementsystem.dao.MallDao;
import com.mall.managementsystem.entity.MallDetailsEntity;
import com.mall.managementsystem.request.MallRequestPojo;
import com.mall.managementsystem.request.StoreRequestPojo;
import com.mall.managementsystem.response.ResponsePojo;
import com.mall.managementsystem.service.MallService;

@Service
public class MallServiceImpl implements MallService {

	@Autowired
	private MallDao mallDao;

	@Override
	public ResponsePojo addMallDetails(MallRequestPojo mallRequestPojo) {
		MallDetailsEntity mallDetailsEntity = new MallDetailsEntity();
		mallDetailsEntity.setMallName(mallRequestPojo.getMallName());
		mallDetailsEntity.setNoOfFloors(mallRequestPojo.getNoOfFloors());
		mallDetailsEntity.setNoOfStores(mallRequestPojo.getNoOfStores());
		mallDetailsEntity.setDiscount(mallRequestPojo.getDiscount());
		return mallDao.addMallDetails(mallDetailsEntity);

	}

	@Override
	public ResponsePojo getMallDetails() {

		return mallDao.getMallDetails();

	}

	@Override
	public ResponsePojo setDiscount(MallRequestPojo mallRequestPojo) {
		MallDetailsEntity mallDetailsEntity = new MallDetailsEntity();
		
		mallDetailsEntity.setDiscount(mallRequestPojo.getDiscount());
		mallDetailsEntity.setMallid(mallRequestPojo.getMallid());
		return mallDao.updateDiscount(mallDetailsEntity);
	}

	@Override
	public ResponsePojo getDiscount(MallRequestPojo mallRequestPojo) {
		
		return mallDao.getDiscount(mallRequestPojo);
	} 

	@Override
	public MallDetailsEntity getMallDetailsJdbc(MallRequestPojo mallRequestPojo) {

		int mallid = mallRequestPojo.getMallid();
		return mallDao.getMallDetailsJdbc(mallid);
	}

	@Override
	public Object getMallDetails(StoreRequestPojo storeRequestPojo) {
		int storeId = storeRequestPojo.getStoreId();
		return mallDao.findByIdDetails(storeId);
	}

}
