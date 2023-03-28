package com.mall.managementsystem.service;

import com.mall.managementsystem.request.StoreRequestPojo;
import com.mall.managementsystem.response.ResponsePojo;

public interface StoreService {

	public ResponsePojo addStore(StoreRequestPojo storeRequestPojo);

	public ResponsePojo getStoreDetails(StoreRequestPojo storeRequestPojo);

}
