package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.UnfreezeOrderDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.micropay.order.unfreeze response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-08 15:29:11
 */
public class AlipayMicropayOrderUnfreezeResponse extends AlipayResponse {

	private static final long serialVersionUID = 3248199842416445525L;

	/** 
	 * 冻结订单详情结果
	 */
	@ApiField("unfreeze_order_detail")
	private UnfreezeOrderDetail unfreezeOrderDetail;

	public void setUnfreezeOrderDetail(UnfreezeOrderDetail unfreezeOrderDetail) {
		this.unfreezeOrderDetail = unfreezeOrderDetail;
	}
	public UnfreezeOrderDetail getUnfreezeOrderDetail( ) {
		return this.unfreezeOrderDetail;
	}

}
