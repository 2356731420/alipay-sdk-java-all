package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.pe.industry.trade.close response.
 * 
 * @author auto create
 * @since 1.0, 2021-03-12 10:53:26
 */
public class ZhimaCreditPeIndustryTradeCloseResponse extends AlipayResponse {

	private static final long serialVersionUID = 8816214877528351922L;

	/** 
	 * 传入的资金单号
	 */
	@ApiField("out_fund_no")
	private String outFundNo;

	/** 
	 * 平台订单号
	 */
	@ApiField("zm_order_id")
	private String zmOrderId;

	public void setOutFundNo(String outFundNo) {
		this.outFundNo = outFundNo;
	}
	public String getOutFundNo( ) {
		return this.outFundNo;
	}

	public void setZmOrderId(String zmOrderId) {
		this.zmOrderId = zmOrderId;
	}
	public String getZmOrderId( ) {
		return this.zmOrderId;
	}

}
