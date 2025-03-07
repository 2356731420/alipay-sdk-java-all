package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AdPlan;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.ad.plan.get response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayCommerceTransportAdPlanGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 2293531735647644495L;

	/** 
	 * 计划详情
	 */
	@ApiField("plan_result")
	private AdPlan planResult;

	public void setPlanResult(AdPlan planResult) {
		this.planResult = planResult;
	}
	public AdPlan getPlanResult( ) {
		return this.planResult;
	}

}
