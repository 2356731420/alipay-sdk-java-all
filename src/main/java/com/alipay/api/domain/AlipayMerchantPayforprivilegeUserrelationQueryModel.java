package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询会员关系
 *
 * @author auto create
 * @since 1.0, 2021-04-19 16:39:49
 */
public class AlipayMerchantPayforprivilegeUserrelationQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6353357284349527323L;

	/**
	 * 该字段已废弃，请使用user_id查询
	 */
	@ApiField("member_id")
	private String memberId;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getMemberId() {
		return this.memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
