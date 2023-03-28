package com.mall.managementsystem.controller;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mall.managementsystem.entity.MallDetailsEntity;
import com.mall.managementsystem.request.MallRequestPojo;
import com.mall.managementsystem.request.StoreRequestPojo;
import com.mall.managementsystem.response.ResponsePojo;
import com.mall.managementsystem.service.MallService;

@RestController
@RequestMapping("/mall")
public class MallController {

	@Autowired
	private MallService mallService;

	@PostMapping("/addMall")
	public ResponsePojo addMallDetails(@RequestBody @Valid MallRequestPojo mallRequestPojo) {
		return mallService.addMallDetails(mallRequestPojo);

	}

	@PostMapping("/getMallDetails")
	public ResponsePojo getMallDetails() {
		return mallService.getMallDetails();
	}

	@PostMapping("/setDiscount")
	public ResponsePojo setDiscount(@RequestBody MallRequestPojo mallRequestPojo) {
		return mallService.setDiscount(mallRequestPojo);

	}

	@PostMapping("/getDiscount")
	public ResponsePojo getDiscount(@RequestBody MallRequestPojo mallRequestPojo) {

		return mallService.getDiscount(mallRequestPojo);
	}
	
	@PostMapping("/getById")
	public MallDetailsEntity getMallDetailsJDBC(@RequestBody MallRequestPojo mallRequestPojo) {
		return mallService.getMallDetailsJdbc(mallRequestPojo);
	}
	@PostMapping("/mallDetails")
	public Object getDetails(@RequestBody StoreRequestPojo storeRequestPojo){
		Object object= mallService.getMallDetails(storeRequestPojo);
		System.out.println(object.toString());
		return object;
		
	}
	
	
}
