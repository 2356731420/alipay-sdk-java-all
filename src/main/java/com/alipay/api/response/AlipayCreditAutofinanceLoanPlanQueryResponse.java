package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.credit.autofinance.loan.plan.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayCreditAutofinanceLoanPlanQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3529747693292535967L;

	/** 
	 * 贷款方案列表，是一个List结构,针对不同的业务平台有不同的返回值，目前大搜车业务只支持的返回值有：firstpayamt 首付租金，firstpayprop 首付比例，lastpayamt 回购尾款，loantenor 贷款期数，monthpayamt 每月还款额度
	 */
	@ApiField("loanplan")
	private String loanplan;

	public void setLoanplan(String loanplan) {
		this.loanplan = loanplan;
	}
	public String getLoanplan( ) {
		return this.loanplan;
	}

}
