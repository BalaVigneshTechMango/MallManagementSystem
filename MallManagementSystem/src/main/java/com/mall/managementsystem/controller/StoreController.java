package com.mall.managementsystem.controller;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mall.managementsystem.request.StoreRequestPojo;
import com.mall.managementsystem.response.ResponsePojo;
import com.mall.managementsystem.service.StoreService;

@RestController
@RequestMapping("/store")
public class StoreController {

	@Autowired
	private StoreService storeService;

	@PostMapping("/addStore")
	public ResponsePojo addNewStores(@RequestBody @Valid StoreRequestPojo storeRequestPojo) {
		return storeService.addStore(storeRequestPojo);

	}
	@PostMapping("/getStoreDetails")
	public ResponsePojo getStoreDetails(@RequestBody StoreRequestPojo storeRequestPojo) {
		
		return storeService.getStoreDetails(storeRequestPojo);
	}
	
}
