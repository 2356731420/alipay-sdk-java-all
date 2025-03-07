package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.merchant.externalbill.create response.
 * 
 * @author auto create
 * @since 1.0, 2021-06-15 17:12:35
 */
public class AlipayEbppMerchantExternalbillCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6662888869451991368L;

	/** 
	 * yyyyMMdd+0(DB_FLAG)+0070(SYSTEM_FLAG)+018(SUB_BIZ_FLAG,新建)+0000(预留)+DB_SPLIT(BIZ_TYPE+SUB_BIZTYPE+MERCHANT_CODE, 2位)+TABLE_FLAG(MERCHANT_CODE, 2位)+8位全局唯一nextValue
	 */
	@ApiField("alipay_bill_id")
	private String alipayBillId;

	public void setAlipayBillId(String alipayBillId) {
		this.alipayBillId = alipayBillId;
	}
	public String getAlipayBillId( ) {
		return this.alipayBillId;
	}

}
