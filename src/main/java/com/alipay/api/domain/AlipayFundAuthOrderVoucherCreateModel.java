package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资金授权发码接口
 *
 * @author auto create
 * @since 1.0, 2021-02-22 11:16:20
 */
public class AlipayFundAuthOrderVoucherCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6728791219391328658L;

	/**
	 * 需要冻结的金额，单位为：元（人民币），精确到小数点后两位
取值范围：[0.01,100000000.00]
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 商户可用该参数指定禁止使用的支付渠道，本期支持两种禁用渠道：信用卡快捷（OPTIMIZED_MOTO）、信用卡卡通（BIGAMOUNT_CREDIT_CARTOON）。商户可设置一种支付渠道，也可设置多种支付渠道。与可用支付渠道不能同时传入
	 */
	@ApiField("disable_pay_channels")
	private String disablePayChannels;

	/**
	 * 商户可用该参数指定用户可使用的支付渠道，本期支持商户可支持三种支付渠道，余额宝（MONEY_FUND）、花呗（PCREDIT_PAY）以及芝麻信用（CREDITZHIMA）。商户可设置一种支付渠道，也可设置多种支付渠道。与禁用支付渠道不可同时传入
	 */
	@ApiField("enable_pay_channels")
	private String enablePayChannels;

	/**
	 * 业务扩展参数，用于商户的特定业务信息的传递，json格式。 1.间联模式必须传入二级商户ID，key为secondaryMerchantId; 2. 当面资金授权业务对应的类目，key为category，value由支付宝分配，酒店业务传 "HOTEL",若使用信用预授权，则该值必传； 3. 外部商户的门店编号，key为outStoreCode，间联场景下建议传； 4. 外部商户的门店简称，key为outStoreAlias，可选; 5.间联模式必须传入二级商户所属机构id，key为requestOrgId;6.信用服务Id，key为serviceId，信用场景下必传，具体值需要联系芝麻客服。
	 */
	@ApiField("extra_param")
	private String extraParam;

	/**
	 * 用户实名信息参数，包含：姓名+身份证号的hash值、指定用户的uid。商户传入用户实名信息参数，支付宝会对比用户在支付宝端的实名信息。
姓名+身份证号hash值使用SHA256摘要方式与UTF8编码,返回十六进制的字符串。
identity_hash和alipay_user_id都是可选的，如果两个都传，则会先校验identity_hash，然后校验alipay_user_id。其中identity_hash的待加密字样如"张三4566498798498498498498"
	 */
	@ApiField("identity_params")
	private String identityParams;

	/**
	 * 业务订单的简单描述，如商品名称等
	 */
	@ApiField("order_title")
	private String orderTitle;

	/**
	 * 商户授权资金订单号，创建后不能修改，需要保证在商户端不重复。
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 商户本次资金操作的请求流水号，用于标示请求流水的唯一性，需要保证在商户端不重复。
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 该笔订单允许的最晚付款时间，逾期将关闭该笔订单
取值范围：1m～15d。m-分钟，h-小时，d-天。 该参数数值不接受小数点， 如 1.5h，可转换为90m
如果为空，默认15m
	 */
	@ApiField("pay_timeout")
	private String payTimeout;

	/**
	 * 收款方支付宝账号（Email或手机号），如果收款方支付宝登录号(payee_logon_id)和用户号(payee_user_id)同时传递，则以用户号(payee_user_id)为准，如果商户有勾选花呗渠道，收款方支付宝登录号(payee_logon_id)和用户号(payee_user_id)不能同时为空。
	 */
	@ApiField("payee_logon_id")
	private String payeeLogonId;

	/**
	 * 收款方的支付宝唯一用户号,以2088开头的16位纯数字组成，如果非空则会在支付时校验交易的的收款方与此是否一致，如果商户有勾选花呗渠道，收款方支付宝登录号(payee_logon_id)和用户号(payee_user_id)不能同时为空。
	 */
	@ApiField("payee_user_id")
	private String payeeUserId;

	/**
	 * 销售产品码，后续新接入预授权当面付的业务，新当面预授权产品取值PRE_AUTH，境外预授权产品取值OVERSEAS_INSTORE_AUTH。
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 商户指定的结算币种。支持澳元：AUD, 新西兰元：NZD, 台币：TWD, 美元：USD, 欧元：EUR, 英镑：GBP
	 */
	@ApiField("settle_currency")
	private String settleCurrency;

	/**
	 * 标价币种,  amount 对应的币种单位。支持澳元：AUD, 新西兰元：NZD, 台币：TWD, 美元：USD, 欧元：EUR, 英镑：GBP
	 */
	@ApiField("trans_currency")
	private String transCurrency;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getDisablePayChannels() {
		return this.disablePayChannels;
	}
	public void setDisablePayChannels(String disablePayChannels) {
		this.disablePayChannels = disablePayChannels;
	}

	public String getEnablePayChannels() {
		return this.enablePayChannels;
	}
	public void setEnablePayChannels(String enablePayChannels) {
		this.enablePayChannels = enablePayChannels;
	}

	public String getExtraParam() {
		return this.extraParam;
	}
	public void setExtraParam(String extraParam) {
		this.extraParam = extraParam;
	}

	public String getIdentityParams() {
		return this.identityParams;
	}
	public void setIdentityParams(String identityParams) {
		this.identityParams = identityParams;
	}

	public String getOrderTitle() {
		return this.orderTitle;
	}
	public void setOrderTitle(String orderTitle) {
		this.orderTitle = orderTitle;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public String getPayTimeout() {
		return this.payTimeout;
	}
	public void setPayTimeout(String payTimeout) {
		this.payTimeout = payTimeout;
	}

	public String getPayeeLogonId() {
		return this.payeeLogonId;
	}
	public void setPayeeLogonId(String payeeLogonId) {
		this.payeeLogonId = payeeLogonId;
	}

	public String getPayeeUserId() {
		return this.payeeUserId;
	}
	public void setPayeeUserId(String payeeUserId) {
		this.payeeUserId = payeeUserId;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getSettleCurrency() {
		return this.settleCurrency;
	}
	public void setSettleCurrency(String settleCurrency) {
		this.settleCurrency = settleCurrency;
	}

	public String getTransCurrency() {
		return this.transCurrency;
	}
	public void setTransCurrency(String transCurrency) {
		this.transCurrency = transCurrency;
	}

}
