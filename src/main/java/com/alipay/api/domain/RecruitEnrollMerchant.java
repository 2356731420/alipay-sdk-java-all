package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 报名商户信息
 *
 * @author auto create
 * @since 1.0, 2021-06-30 23:43:15
 */
public class RecruitEnrollMerchant extends AlipayObject {

	private static final long serialVersionUID = 7237836736541615652L;

	/**
	 * 商户唯一ID(商户pid或商户smid)
	 */
	@ApiField("merchant_uid")
	private String merchantUid;

	public String getMerchantUid() {
		return this.merchantUid;
	}
	public void setMerchantUid(String merchantUid) {
		this.merchantUid = merchantUid;
	}

}
