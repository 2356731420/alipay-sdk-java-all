package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 学生身份单次核验接口
 *
 * @author auto create
 * @since 1.0, 2021-02-25 13:50:24
 */
public class AlipayCommerceEducateStudentIdentityVerifyModel extends AlipayObject {

	private static final long serialVersionUID = 2327117819431731443L;

	/**
	 * 单次核验业务token
	 */
	@ApiField("biz_token")
	private String bizToken;

	public String getBizToken() {
		return this.bizToken;
	}
	public void setBizToken(String bizToken) {
		this.bizToken = bizToken;
	}

}
