package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 包裹授权关系
 *
 * @author auto create
 * @since 1.0, 2020-07-02 10:03:46
 */
public class PkgAuthRelation extends AlipayObject {

	private static final long serialVersionUID = 2388217823997978842L;

	/**
	 * 手机号
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 家人称谓
	 */
	@ApiField("role")
	private String role;

	/**
	 * 支付宝uid
	 */
	@ApiField("user_id")
	private String userId;

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getRole() {
		return this.role;
	}
	public void setRole(String role) {
		this.role = role;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
