package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.OpenApiPassStatus;
import com.alipay.api.domain.OpenApiResponseHeader;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.applepay.pbstatus.query response.
 * 
 * @author auto create
 * @since 1.0, 2020-06-18 19:27:28
 */
public class AlipayUserApplepayPbstatusQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8114377941753247246L;

	/** 
	 * 卡状态列表
	 */
	@ApiField("pass_status_list")
	private OpenApiPassStatus passStatusList;

	/** 
	 * ApplePay公用响应头
	 */
	@ApiField("response_header")
	private OpenApiResponseHeader responseHeader;

	/** 
	 * 状态
	 */
	@ApiField("state")
	private String state;

	public void setPassStatusList(OpenApiPassStatus passStatusList) {
		this.passStatusList = passStatusList;
	}
	public OpenApiPassStatus getPassStatusList( ) {
		return this.passStatusList;
	}

	public void setResponseHeader(OpenApiResponseHeader responseHeader) {
		this.responseHeader = responseHeader;
	}
	public OpenApiResponseHeader getResponseHeader( ) {
		return this.responseHeader;
	}

	public void setState(String state) {
		this.state = state;
	}
	public String getState( ) {
		return this.state;
	}

}
