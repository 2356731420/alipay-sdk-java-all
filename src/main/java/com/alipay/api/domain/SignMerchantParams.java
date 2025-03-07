package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 在sdk支付并签约中，传入签约相关的商户参数。
 *
 * @author auto create
 * @since 1.0, 2020-11-20 13:06:28
 */
public class SignMerchantParams extends AlipayObject {

	private static final long serialVersionUID = 4861277354551241919L;

	/**
	 * 子商户的商户id
	 */
	@ApiField("sub_merchant_id")
	private String subMerchantId;

	/**
	 * 子商户的商户名称
	 */
	@ApiField("sub_merchant_name")
	private String subMerchantName;

	/**
	 * 子商户的服务描述
	 */
	@ApiField("sub_merchant_service_description")
	private String subMerchantServiceDescription;

	/**
	 * 子商户的服务名称
	 */
	@ApiField("sub_merchant_service_name")
	private String subMerchantServiceName;

	public String getSubMerchantId() {
		return this.subMerchantId;
	}
	public void setSubMerchantId(String subMerchantId) {
		this.subMerchantId = subMerchantId;
	}

	public String getSubMerchantName() {
		return this.subMerchantName;
	}
	public void setSubMerchantName(String subMerchantName) {
		this.subMerchantName = subMerchantName;
	}

	public String getSubMerchantServiceDescription() {
		return this.subMerchantServiceDescription;
	}
	public void setSubMerchantServiceDescription(String subMerchantServiceDescription) {
		this.subMerchantServiceDescription = subMerchantServiceDescription;
	}

	public String getSubMerchantServiceName() {
		return this.subMerchantServiceName;
	}
	public void setSubMerchantServiceName(String subMerchantServiceName) {
		this.subMerchantServiceName = subMerchantServiceName;
	}

}
