package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.auth.userinfo.apply response.
 * 
 * @author auto create
 * @since 1.0, 2020-08-05 17:25:37
 */
public class AlipayUserAuthUserinfoApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6283225222316553834L;

	/** 
	 * 授权的码
	 */
	@ApiField("auth_code")
	private String authCode;

	/** 
	 * 用户的支付宝id
	 */
	@ApiField("user_id")
	private String userId;

	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}
	public String getAuthCode( ) {
		return this.authCode;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

}
