package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 机构商户签约服务
 *
 * @author auto create
 * @since 1.0, 2021-03-04 14:33:38
 */
public class AlipayFinancialnetAuthContractMerchantSignModel extends AlipayObject {

	private static final long serialVersionUID = 2617926489564515425L;

	/**
	 * 商家银行账号
	 */
	@ApiField("account_no")
	private String accountNo;

	/**
	 * json串格式的扩展字段
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 费率模型
	 */
	@ApiField("fee_value")
	private FeeValue feeValue;

	/**
	 * 机构ID
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 场景码
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 生效失效策略模型
	 */
	@ApiField("valid_strategy")
	private ValidStrategy validStrategy;

	public String getAccountNo() {
		return this.accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public FeeValue getFeeValue() {
		return this.feeValue;
	}
	public void setFeeValue(FeeValue feeValue) {
		this.feeValue = feeValue;
	}

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public ValidStrategy getValidStrategy() {
		return this.validStrategy;
	}
	public void setValidStrategy(ValidStrategy validStrategy) {
		this.validStrategy = validStrategy;
	}

}
