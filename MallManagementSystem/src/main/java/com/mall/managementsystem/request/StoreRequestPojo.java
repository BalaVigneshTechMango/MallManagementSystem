package com.mall.managementsystem.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class StoreRequestPojo {

	private int storeId;
	@NotBlank(message = "Not Blank")
	@NotNull(message = "Not Null")
	private String ownerName;
	@NotBlank(message = "Not Blank")
	@NotNull(message = "Not Null")
	private String storeName;

	private int mallid;
	
	public int getMallid() {
		return mallid;
	}

	public void setMallid(int mallid) {
		this.mallid = mallid;
	}
	

	public int getStoreId() {
		return storeId;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

}
