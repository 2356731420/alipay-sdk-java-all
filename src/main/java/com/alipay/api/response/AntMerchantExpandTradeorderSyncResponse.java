package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.tradeorder.sync response.
 * 
 * @author auto create
 * @since 1.0, 2021-03-23 18:59:28
 */
public class AntMerchantExpandTradeorderSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 2499633823588962614L;

	/** 
	 * 订单创建成功后返回的id
	 */
	@ApiField("order_id")
	private String orderId;

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

}
