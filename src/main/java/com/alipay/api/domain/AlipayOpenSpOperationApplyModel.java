package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 向商户发起代运营操作
 *
 * @author auto create
 * @since 1.0, 2021-01-01 13:24:46
 */
public class AlipayOpenSpOperationApplyModel extends AlipayObject {

	private static final long serialVersionUID = 8647792668788862881L;

	/**
	 * 接入的产品编号。 枚举如下：
* OPENAPI_BIND_DEFAULT：操作类型为账号绑定。
* OPENAPI_AUTH_DEFAULT：操作类型为代运营授权时。
	 */
	@ApiField("access_product_code")
	private String accessProductCode;

	/**
	 * 支付宝登录账号，通常为手机号或者邮箱。
间连场景必填。
直连场景选填，特别注意merchant_no和alipay_account不能同时为空，都有值优先取merchant_no。
	 */
	@ApiField("alipay_account")
	private String alipayAccount;

	/**
	 * 支付宝商户号。
间连场景，merchant_no必填，传入商户smid，特别注意仅支持2088开头的间连商户。
直连场景，merchant_no选填，传入商户支付宝pid，特别注意merchant_no和alipay_account不能同时为空，优先取merchant_no。
	 */
	@ApiField("merchant_no")
	private String merchantNo;

	/**
	 * 代运营操作类型。枚举如下：
* ACCOUNT_BIND：代表绑定支付宝账号，仅对于间连商户。
* OPERATION_AUTH：代表代运营授权，支持间连和直连商户，其中间连场景包含绑定支付宝账号。
	 */
	@ApiField("operate_type")
	private String operateType;

	/**
	 * 外部操作流水，ISV自定义。每次操作需要确保唯一。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public String getAccessProductCode() {
		return this.accessProductCode;
	}
	public void setAccessProductCode(String accessProductCode) {
		this.accessProductCode = accessProductCode;
	}

	public String getAlipayAccount() {
		return this.alipayAccount;
	}
	public void setAlipayAccount(String alipayAccount) {
		this.alipayAccount = alipayAccount;
	}

	public String getMerchantNo() {
		return this.merchantNo;
	}
	public void setMerchantNo(String merchantNo) {
		this.merchantNo = merchantNo;
	}

	public String getOperateType() {
		return this.operateType;
	}
	public void setOperateType(String operateType) {
		this.operateType = operateType;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

}
