package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 碎屏险退保
 *
 * @author auto create
 * @since 1.0, 2021-06-18 16:20:32
 */
public class AlipayInsSceneMobileScreenRefundModel extends AlipayObject {

	private static final long serialVersionUID = 7667635935711366244L;

	/**
	 * 请求渠道来源
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 退保保单号
	 */
	@ApiField("policy_no")
	private String policyNo;

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getPolicyNo() {
		return this.policyNo;
	}
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}

}
