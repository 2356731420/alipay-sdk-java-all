package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.yufanlingsanyaowu.yufalingsanyaowu.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayOpenAppYufanlingsanyaowuYufalingsanyaowuQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4554272417713663756L;

	/** 
	 * 10
	 */
	@ApiField("userid")
	private String userid;

	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUserid( ) {
		return this.userid;
	}

}
