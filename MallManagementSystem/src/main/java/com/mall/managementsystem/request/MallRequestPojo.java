package com.mall.managementsystem.request;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class MallRequestPojo {
    
	private int mallid;
	private int noOfFloors;
	private int noOfStores;
	@Min(1)
	@Max(99)
	private int discount;
	@NotNull(message = "mall Name should not be null ")
	@NotBlank(message = "mall Name should not be blank")
	private String mallName;
	
	public int getNoOfFloors() {
		return noOfFloors;
	}
	public int getNoOfStores() {
		return noOfStores;
	}
	public String getMallName() {
		return mallName;
	}
	public int getDiscount() {
		return discount;
	}
	
	public void setNoOfFloors(int noOfFloors) {
		this.noOfFloors = noOfFloors;
	}
	public void setNoOfStores(int noOfStores) {
		this.noOfStores = noOfStores;
	}
	public void setMallName(String mallName) {
		this.mallName = mallName;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public int getMallid() {
		return mallid;
	}
	public void setMallid(int mallid) {
		this.mallid = mallid;
	}

	


}
