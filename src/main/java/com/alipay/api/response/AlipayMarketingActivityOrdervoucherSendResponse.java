package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.activity.ordervoucher.send response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-03 11:02:35
 */
public class AlipayMarketingActivityOrdervoucherSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 6556556165479176639L;

	/** 
	 * 本次发放的券码
	 */
	@ApiField("voucher_code")
	private String voucherCode;

	public void setVoucherCode(String voucherCode) {
		this.voucherCode = voucherCode;
	}
	public String getVoucherCode( ) {
		return this.voucherCode;
	}

}
