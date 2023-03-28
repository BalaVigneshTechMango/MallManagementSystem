package com.mall.managementsystem.discount;


import com.mall.managementsystem.date.DateLogic;
import com.mall.managementsystem.entity.ProductEntity;

public class ProductDiscount extends DateLogic {
	/**
	 * This discountProduct method will get the product details and verify the date
	 * is this product date is 3 month before date or not.
	 */
	public ProductEntity discountProduct(ProductEntity productEntity,int productDiscount) {

		float discount;
		if (productEntity.getProductDate().before(getDate())) {
			discount = (productEntity.getPrice() * productDiscount) / 100;
			productEntity.setDiscountPrice(productEntity.getPrice()-discount);
			//productEntity.setPrice(productEntity.getPrice() - discount);
			productEntity.setIsDiscount(true);
			return productEntity;
		} else {
			productEntity.setIsDiscount(false);
			productEntity.setDiscountPrice(productEntity.getPrice());
			return productEntity;
		}
	}

}
