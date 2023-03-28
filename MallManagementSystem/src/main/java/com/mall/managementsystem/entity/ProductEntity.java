package com.mall.managementsystem.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "product_details")
public class ProductEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "product_Id")
	private int productId;
	@Column(name = "product_name")
	private String productName;
	@Column(name = "product_price")
	private float price;
	@Column(name = "product_date")
	private Date productDate;
	@Column(name = "is_discount")
	private Boolean isDiscount;
	@Column(name = "discount_price")
	private float discountPrice;

	@JsonBackReference("storeId")
	@ManyToOne
	@JoinColumn(name = "storeId")
	private StoresEntity storesEntity;

	@Override
	public String toString() {
		return "ProductEntity [productName=" + productName + ", price=" + price + ", discountPrice=" + ", productId="
				+ productId + ", productDate=" + productDate + "]";
	}

	public StoresEntity getStoresEntity() {
		return storesEntity;
	}

	public void setStoresEntity(StoresEntity storesEntity) {
		this.storesEntity = storesEntity;
	}

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

	public Date getProductDate() {
		return productDate;
	}

	public void setProductDate(Date productDate) {
		this.productDate = productDate;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public float getPrice() {
		return price;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public void setPrice(float price) {
		this.price = price;
	}

}
