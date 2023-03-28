package com.mall.managementsystem.request;

import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class ProductRequestPojo {

	private int productId;

	@NotBlank(message = "Not Blank")
	@NotNull(message = "Not Null")
	@Size(min = 2, message = "Name min 2 letters")
	private String productName;
	private float price;
	private Date productDate;
	private int storeId;
	private Boolean isDiscount;
	private float discountPrice;


	public Boolean getIsDiscount() {
		return isDiscount;
	}
	public float getDiscountPrice() {
		return discountPrice;
	}
	public void setIsDiscount(Boolean isDiscount) {
		this.isDiscount = isDiscount;
	}
	public void setDiscountPrice(float discountPrice) {
		this.discountPrice = discountPrice;
	}
	public int getStoreId() {
		return storeId;
	}
	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}
	public int getProductId() {
		return productId;
	}
	public String getProductName() {
		return productName;
	}
	public float getPrice() {
		return price;
	}
	public Date getProductDate() {
		return productDate;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public void setProductDate(Date productDate) {
		this.productDate = productDate;
	}
}
