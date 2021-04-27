package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.servicemarket.order.create response.
 * 
 * @author auto create
 * @since 1.0, 2020-11-27 16:26:25
 */
public class AlipayOpenServicemarketOrderCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7662755567224637918L;

	/** 
	 * 订单号
	 */
	@ApiField("commodity_order_id")
	private String commodityOrderId;

	/** 
	 * 支付宝分配给开发者的应用ID
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	public void setCommodityOrderId(String commodityOrderId) {
		this.commodityOrderId = commodityOrderId;
	}
	public String getCommodityOrderId( ) {
		return this.commodityOrderId;
	}

	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}
	public String getMiniAppId( ) {
		return this.miniAppId;
	}

}
