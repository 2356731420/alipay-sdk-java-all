package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.transfer.payment.precreate response.
 * 
 * @author auto create
 * @since 1.0, 2020-08-19 20:26:16
 */
public class AlipayOverseasTransferPaymentPrecreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2632633689247988845L;

	/** 
	 * pass_through_info
	 */
	@ApiField("pass_through_info")
	private String passThroughInfo;

	/** 
	 * transfer_id
	 */
	@ApiField("transfer_id")
	private String transferId;

	public void setPassThroughInfo(String passThroughInfo) {
		this.passThroughInfo = passThroughInfo;
	}
	public String getPassThroughInfo( ) {
		return this.passThroughInfo;
	}

	public void setTransferId(String transferId) {
		this.transferId = transferId;
	}
	public String getTransferId( ) {
		return this.transferId;
	}

}
