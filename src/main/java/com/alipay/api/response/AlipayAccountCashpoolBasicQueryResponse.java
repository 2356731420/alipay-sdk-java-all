package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.account.cashpool.basic.query response.
 * 
 * @author auto create
 * @since 1.0, 2020-07-06 11:21:20
 */
public class AlipayAccountCashpoolBasicQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4895897947789594813L;

	/** 
	 * 资金池总数量
	 */
	@ApiField("count")
	private Long count;

	/** 
	 * 资金池基本信息查询结果
	 */
	@ApiListField("inst_basic_cash_pool_list")
	@ApiField("string")
	private List<String> instBasicCashPoolList;

	public void setCount(Long count) {
		this.count = count;
	}
	public Long getCount( ) {
		return this.count;
	}

	public void setInstBasicCashPoolList(List<String> instBasicCashPoolList) {
		this.instBasicCashPoolList = instBasicCashPoolList;
	}
	public List<String> getInstBasicCashPoolList( ) {
		return this.instBasicCashPoolList;
	}

}
