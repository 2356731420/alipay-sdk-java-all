package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.asset.point.voucherprod.benefittemplate.add response.
 * 
 * @author auto create
 * @since 1.0, 2021-04-28 00:00:21
 */
public class AlipayAssetPointVoucherprodBenefittemplateAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 7281341197757884918L;

	/** 
	 * 实际追加金额，单元元
	 */
	@ApiField("append_amount")
	private String appendAmount;

	/** 
	 * 结算平台的流水号
	 */
	@ApiField("bill_no")
	private String billNo;

	public void setAppendAmount(String appendAmount) {
		this.appendAmount = appendAmount;
	}
	public String getAppendAmount( ) {
		return this.appendAmount;
	}

	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}
	public String getBillNo( ) {
		return this.billNo;
	}

}
