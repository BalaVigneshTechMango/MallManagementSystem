package com.mall.managementsystem.dao;

import com.mall.managementsystem.entity.StoresEntity;
import com.mall.managementsystem.request.StoreRequestPojo;
import com.mall.managementsystem.response.ResponsePojo;

public interface StoreDao {

	ResponsePojo addStore(StoresEntity storesEntity);

	ResponsePojo getStoreDetails(StoreRequestPojo storeRequestPojo);
}
