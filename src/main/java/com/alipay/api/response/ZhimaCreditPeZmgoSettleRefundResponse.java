package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.pe.zmgo.settle.refund response.
 * 
 * @author auto create
 * @since 1.0, 2021-03-04 12:15:18
 */
public class ZhimaCreditPeZmgoSettleRefundResponse extends AlipayResponse {

	private static final long serialVersionUID = 7522521379849264727L;

	/** 
	 * 退款操作错误原因描述
	 */
	@ApiField("fail_reason")
	private String failReason;

	/** 
	 * 外部请求号
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/** 
	 * 本次请求退款金额
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/** 
	 * 此字段含义，商家接入时需咨询对接技术。
	 */
	@ApiField("retry")
	private Boolean retry;

	/** 
	 * 本次退款的扣款计划单号
	 */
	@ApiField("withhold_plan_no")
	private String withholdPlanNo;

	public void setFailReason(String failReason) {
		this.failReason = failReason;
	}
	public String getFailReason( ) {
		return this.failReason;
	}

	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}
	public String getOutRequestNo( ) {
		return this.outRequestNo;
	}

	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}
	public String getRefundAmount( ) {
		return this.refundAmount;
	}

	public void setRetry(Boolean retry) {
		this.retry = retry;
	}
	public Boolean getRetry( ) {
		return this.retry;
	}

	public void setWithholdPlanNo(String withholdPlanNo) {
		this.withholdPlanNo = withholdPlanNo;
	}
	public String getWithholdPlanNo( ) {
		return this.withholdPlanNo;
	}

}
