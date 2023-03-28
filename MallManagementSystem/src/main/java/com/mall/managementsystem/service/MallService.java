package com.mall.managementsystem.service;
import com.mall.managementsystem.entity.MallDetailsEntity;
import com.mall.managementsystem.request.MallRequestPojo;
import com.mall.managementsystem.request.StoreRequestPojo;
import com.mall.managementsystem.response.ResponsePojo;

public interface MallService {

	public ResponsePojo addMallDetails(MallRequestPojo mallRequestPojo);
	
	public ResponsePojo getMallDetails();

	public ResponsePojo setDiscount(MallRequestPojo mallRequestPojo);

	public ResponsePojo getDiscount(MallRequestPojo mallRequestPojo);

	public MallDetailsEntity getMallDetailsJdbc(MallRequestPojo mallRequestPojo);

	public Object getMallDetails(StoreRequestPojo storeRequestPojo);
	
}
