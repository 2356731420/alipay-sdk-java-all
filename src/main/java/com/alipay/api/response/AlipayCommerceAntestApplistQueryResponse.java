package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.EcoAppInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.antest.applist.query response.
 * 
 * @author auto create
 * @since 1.0, 2020-04-21 15:50:09
 */
public class AlipayCommerceAntestApplistQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3788554241912186457L;

	/** 
	 * 小程序列表
	 */
	@ApiListField("data")
	@ApiField("eco_app_info")
	private List<EcoAppInfo> data;

	public void setData(List<EcoAppInfo> data) {
		this.data = data;
	}
	public List<EcoAppInfo> getData( ) {
		return this.data;
	}

}
