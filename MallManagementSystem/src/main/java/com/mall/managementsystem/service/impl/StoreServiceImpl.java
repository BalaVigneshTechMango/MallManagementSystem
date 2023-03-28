package com.mall.managementsystem.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mall.managementsystem.dao.StoreDao;
import com.mall.managementsystem.entity.MallDetailsEntity;
import com.mall.managementsystem.entity.StoresEntity;
import com.mall.managementsystem.request.StoreRequestPojo;
import com.mall.managementsystem.response.ResponsePojo;
import com.mall.managementsystem.service.StoreService;

@Service
public class StoreServiceImpl implements StoreService {

	@Autowired
	private StoreDao storeDao;

	@Override
	public ResponsePojo addStore(StoreRequestPojo storeRequestPojo) {
		MallDetailsEntity mallDetailsEntity = new MallDetailsEntity();
		StoresEntity storesEntity = new StoresEntity();
		storesEntity.setStoreName(storeRequestPojo.getStoreName());
		storesEntity.setOwnerName(storeRequestPojo.getOwnerName());
		mallDetailsEntity.setMallid(storeRequestPojo.getMallid());
		storesEntity.setMallDetailsEntity(mallDetailsEntity);
		return storeDao.addStore(storesEntity);

	}

	@Override
	public ResponsePojo getStoreDetails(StoreRequestPojo storeRequestPojo) {
		
		
		return storeDao.getStoreDetails(storeRequestPojo);
	}

}
