package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询网商会员信息
 *
 * @author auto create
 * @since 1.0, 2018-07-26 14:19:59
 */
public class MybankCreditUserRoleQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6511662747253977816L;

	/**
	 * 站点会员信息
	 */
	@ApiField("member")
	private Member member;

	public Member getMember() {
		return this.member;
	}
	public void setMember(Member member) {
		this.member = member;
	}

}
