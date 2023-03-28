package com.mall.managementsystem.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "store_details")
public class StoresEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "store_id")
	private int storeId;
    @Column(name = "owner_name")
	private String ownerName;
    @Column(name = "store_name")
	private String storeName;
    
	@OneToOne
	@JoinColumn(name = "mallid")
    private MallDetailsEntity mallDetailsEntity;
    
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER, targetEntity = ProductEntity.class)
	@JoinColumn(name = "storeId",referencedColumnName = "store_id")
	private Set<ProductEntity>productEntities=new HashSet<>();
	
	
	
	public MallDetailsEntity getMallDetailsEntity() {
		return mallDetailsEntity;
	}

	public Set<ProductEntity> getProductEntities() {
		return productEntities;
	}

	public void setMallDetailsEntity(MallDetailsEntity mallDetailsEntity) {
		this.mallDetailsEntity = mallDetailsEntity;
	}

	public void setProductEntities(Set<ProductEntity> productEntities) {
		this.productEntities = productEntities;
	}

	public int getStoreId() {
		return storeId;
	}

	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}


	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public void addProduct() {

	}

	@Override
	public String toString() {
		return "StoresEntity [storeId=" + storeId + ", ownerName=" + ownerName + ", storeName=" + storeName
				+ ", mallDetailsEntity=" + mallDetailsEntity + ", productEntities=" + productEntities + "]";
	}

}
