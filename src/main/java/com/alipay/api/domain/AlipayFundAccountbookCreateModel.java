package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资金授权记账账号开通
 *
 * @author auto create
 * @since 1.0, 2021-05-06 15:35:17
 */
public class AlipayFundAccountbookCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3822571469642579618L;

	/**
	 * JSON格式，传递业务扩展参数
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 外部商户系统会员的唯一标识
	 */
	@ApiField("merchant_user_id")
	private String merchantUserId;

	/**
	 * 外部商户用户类型:BUSINESS_EMPLOYEE
	 */
	@ApiField("merchant_user_type")
	private String merchantUserType;

	/**
	 * 资金记账本的业务场景
	 */
	@ApiField("scene_code")
	private String sceneCode;

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getMerchantUserId() {
		return this.merchantUserId;
	}
	public void setMerchantUserId(String merchantUserId) {
		this.merchantUserId = merchantUserId;
	}

	public String getMerchantUserType() {
		return this.merchantUserType;
	}
	public void setMerchantUserType(String merchantUserType) {
		this.merchantUserType = merchantUserType;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

}
