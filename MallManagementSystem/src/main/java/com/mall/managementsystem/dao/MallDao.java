package com.mall.managementsystem.dao;

import com.mall.managementsystem.entity.MallDetailsEntity;
import com.mall.managementsystem.request.MallRequestPojo;
import com.mall.managementsystem.response.ResponsePojo;

public interface MallDao {

	ResponsePojo getMallDetails();

	ResponsePojo addMallDetails(MallDetailsEntity mallDetailsEntity);

	ResponsePojo updateDiscount(MallDetailsEntity mallDetailsEntity);

	ResponsePojo getDiscount(MallRequestPojo mallRequestPojo);

	MallDetailsEntity getMallDetailsJdbc(int mallid);

	Object findByIdDetails(int storeId);

}
