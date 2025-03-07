package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 授权应用aes密钥查询
 *
 * @author auto create
 * @since 1.0, 2020-01-08 11:54:16
 */
public class AlipayOpenAuthAppAesGetModel extends AlipayObject {

	private static final long serialVersionUID = 2125232467874744285L;

	/**
	 * 商家应用appId
	 */
	@ApiField("merchant_app_id")
	private String merchantAppId;

	public String getMerchantAppId() {
		return this.merchantAppId;
	}
	public void setMerchantAppId(String merchantAppId) {
		this.merchantAppId = merchantAppId;
	}

}
