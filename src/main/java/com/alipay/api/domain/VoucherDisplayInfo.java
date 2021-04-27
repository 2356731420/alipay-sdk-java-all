package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 券展示信息
 *
 * @author auto create
 * @since 1.0, 2021-04-24 14:57:50
 */
public class VoucherDisplayInfo extends AlipayObject {

	private static final long serialVersionUID = 2614449175379683382L;

	/**
	 * 商户品牌名称，字数上限为12。如果不设置品牌名称，则默认使用支付宝商家系统中维护的商家别名。如果没有维护商家别名，则使用默认名称。
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 券详细使用说明。会在卡包等对用户展示券的使用详情说明。
	 */
	@ApiField("voucher_description")
	private String voucherDescription;

	public String getBrandName() {
		return this.brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getVoucherDescription() {
		return this.voucherDescription;
	}
	public void setVoucherDescription(String voucherDescription) {
		this.voucherDescription = voucherDescription;
	}

}
