package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.order.sync response.
 * 
 * @author auto create
 * @since 1.0, 2021-06-09 19:35:47
 */
public class AlipayMerchantOrderSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 6562843757763772739L;

	/** 
	 * 支付宝订单号
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * 订单状态
	 */
	@ApiField("order_status")
	private String orderStatus;

	/** 
	 * 同步订单记录id
（同步小程序订单成功必返回record_id）
	 */
	@ApiField("record_id")
	private String recordId;

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getOrderStatus( ) {
		return this.orderStatus;
	}

	public void setRecordId(String recordId) {
		this.recordId = recordId;
	}
	public String getRecordId( ) {
		return this.recordId;
	}

}
