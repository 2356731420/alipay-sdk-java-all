package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 券展示信息
 *
 * @author auto create
 * @since 1.0, 2021-06-30 16:09:35
 */
public class VoucherDisplayInfo extends AlipayObject {

	private static final long serialVersionUID = 7361982248629558964L;

	/**
	 * 商家logo

需要通过
alipay.marketing.material.image.upload接口上传图片，指定file_key为PROMO_BRAND_LOGO，返回的resource_id即为该参数的值

限制:
服务商平台模式必传
上传图片尺寸600*600，支持格式：png、jpg、jpeg、bmp，大小不超过2MB
	 */
	@ApiField("brand_logo")
	private String brandLogo;

	/**
	 * 商户品牌名称。

如果不设置品牌名称，则默认使用支付宝商家系统中维护的商家别名。

如果没有维护商家别名，则使用默认名称：

商家优惠。

用户领取优惠券后，品牌名称会对用户进行展示

限制:
服务商平台模式必传
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 券补充说明，该字段为可运营字段，可描述商品特色
会展示在用户支付宝卡包券详情页

限制:
该字段在兑换券场景下必传
	 */
	@ApiField("voucher_comment")
	private String voucherComment;

	/**
	 * 券详细使用说明。
	 */
	@ApiField("voucher_description")
	private String voucherDescription;

	/**
	 * 券详情页封面图，会展示在用户支付宝卡包券详情页

需要通过
alipay.marketing.material.image.upload接口上传图片，指定file_key为PROMO_VOUCHER_IMAGE，接口返回的resource_id即为该参数的值


限制:
该字段在兑换券场景下必传
上传图片尺寸670*335，支持格式：png、jpg、jpeg、bmp，大小不超过2MB
	 */
	@ApiField("voucher_image")
	private String voucherImage;

	public String getBrandLogo() {
		return this.brandLogo;
	}
	public void setBrandLogo(String brandLogo) {
		this.brandLogo = brandLogo;
	}

	public String getBrandName() {
		return this.brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getVoucherComment() {
		return this.voucherComment;
	}
	public void setVoucherComment(String voucherComment) {
		this.voucherComment = voucherComment;
	}

	public String getVoucherDescription() {
		return this.voucherDescription;
	}
	public void setVoucherDescription(String voucherDescription) {
		this.voucherDescription = voucherDescription;
	}

	public String getVoucherImage() {
		return this.voucherImage;
	}
	public void setVoucherImage(String voucherImage) {
		this.voucherImage = voucherImage;
	}

}
