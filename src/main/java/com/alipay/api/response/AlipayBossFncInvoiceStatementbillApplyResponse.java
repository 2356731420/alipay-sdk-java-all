package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.invoice.statementbill.apply response.
 * 
 * @author auto create
 * @since 1.0, 2019-09-05 16:28:12
 */
public class AlipayBossFncInvoiceStatementbillApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1236411176941575231L;

	/** 
	 * 开票申请ID，唯一性ID
	 */
	@ApiField("result_set")
	private String resultSet;

	public void setResultSet(String resultSet) {
		this.resultSet = resultSet;
	}
	public String getResultSet( ) {
		return this.resultSet;
	}

}
