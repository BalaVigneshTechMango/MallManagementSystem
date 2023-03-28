package com.mall.managementsystem.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Entity
@Table(name = "mall_details")
public class MallDetailsEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "mallid")
	private int mallid;
	@Column(name = "no_of_floor")
	private int noOfFloors;
	@Column(name = "no_of_stores")
	private int noOfStores;
	@Column(name = "mall_name")
	private String mallName;
	@Min(1)
	@Max(99)
	@Column(name = "discount")
	private int discount;

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "mallid", referencedColumnName = "mallid")
	private StoresEntity storesEntity;


	@Override
	public String toString() {
		return "MallDetailsEntity [mallid=" + mallid + ", noOfFloors=" + noOfFloors + ", noOfStores=" + noOfStores
				+ ", mallName=" + mallName + ", discount=" + discount + ", storesEntity=" + storesEntity + "]";
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public StoresEntity getStoresEntity() {
		return storesEntity;
	}

	public void setStoresEntity(StoresEntity storesEntity) {
		this.storesEntity = storesEntity;
	}

	public int getMallid() {
		return mallid;
	}

	public int getNoOfFloors() {
		return noOfFloors;
	}

	public int getNoOfStores() {
		return noOfStores;
	}

	public String getMallName() {
		return mallName;
	}

	public void setMallid(int mallid) {
		this.mallid = mallid;
	}

	public void setNoOfFloors(int noOfFloors) {
		this.noOfFloors = noOfFloors;
	}

	public void setNoOfStores(int noOfStores) {
		this.noOfStores = noOfStores;
	}

	public void setMallName(String name) {
		mallName = name;
	}

}
