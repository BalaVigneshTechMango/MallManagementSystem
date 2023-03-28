package com.mall.managementsystem.controller;

import java.text.ParseException;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mall.managementsystem.request.ProductRequestPojo;
import com.mall.managementsystem.response.ResponsePojo;
import com.mall.managementsystem.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductService productService;

	@PostMapping("/addProduct")
	public ResponsePojo addProduct(@RequestBody @Valid ProductRequestPojo productRequestPojo) throws ParseException {

		return productService.addProduct(productRequestPojo);

	}

	@PostMapping("/getProductDetails")
	public ResponsePojo getProductDetails(@RequestBody ProductRequestPojo productRequestPojo) {

		return productService.getProductDetails(productRequestPojo);
	}

	@PostMapping("/getProductWithDiscount")
	public ResponsePojo getProductWithDiscount(@RequestBody ProductRequestPojo productRequestPojo) {
		return productService.getProductWithDiscount(productRequestPojo);
	}

	@PostMapping("/getAllDetails")
	public ResponsePojo getAllDetails(@RequestBody ProductRequestPojo productRequestPojo) {
		return productService.getAllDetails(productRequestPojo);
	}

}
