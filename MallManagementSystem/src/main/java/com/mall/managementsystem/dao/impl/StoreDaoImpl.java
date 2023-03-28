package com.mall.managementsystem.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mall.managementsystem.dao.StoreDao;
import com.mall.managementsystem.entity.StoresEntity;
import com.mall.managementsystem.repository.StoreRepository;
import com.mall.managementsystem.request.StoreRequestPojo;
import com.mall.managementsystem.response.ResponsePojo;

@Service
public class StoreDaoImpl implements StoreDao {

	@Autowired
	private StoreRepository storeRepository;

	@Override
	public ResponsePojo addStore(StoresEntity storesEntity) {
		ResponsePojo responsePojo = new ResponsePojo();
		StoresEntity storesEntityResponse = storeRepository.save(storesEntity);
		responsePojo.setObj(storesEntityResponse);
		responsePojo.setMessage("Added Store");
		responsePojo.setIstrue(true);
		return responsePojo;

	}

	@Override
	public ResponsePojo getStoreDetails(StoreRequestPojo storeRequestPojo) {
		ResponsePojo responsePojo = new ResponsePojo();
		StoresEntity storesEntity = storeRepository.findById(storeRequestPojo.getStoreId()).get();
		responsePojo.setObj(storesEntity.toString());
		responsePojo.setIstrue(true);
		responsePojo.setMessage("Details Of the Store");
		return responsePojo;
	}

}
