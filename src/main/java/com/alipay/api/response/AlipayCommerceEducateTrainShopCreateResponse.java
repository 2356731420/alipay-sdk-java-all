package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.train.shop.create response.
 * 
 * @author auto create
 * @since 1.0, 2021-04-28 20:41:26
 */
public class AlipayCommerceEducateTrainShopCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7248685142471187884L;

	/** 
	 * 支付宝内部店铺id
	 */
	@ApiField("shop_id")
	private String shopId;

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}
	public String getShopId( ) {
		return this.shopId;
	}

}
