package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.EbppBillKey;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.common.billkey.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayEbppCommonBillkeyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6221188232538799489L;

	/** 
	 * 户号列表
	 */
	@ApiListField("bill_key_list")
	@ApiField("ebpp_bill_key")
	private List<EbppBillKey> billKeyList;

	public void setBillKeyList(List<EbppBillKey> billKeyList) {
		this.billKeyList = billKeyList;
	}
	public List<EbppBillKey> getBillKeyList( ) {
		return this.billKeyList;
	}

}
