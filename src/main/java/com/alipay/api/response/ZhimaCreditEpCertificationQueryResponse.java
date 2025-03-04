package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.certification.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-09 10:05:22
 */
public class ZhimaCreditEpCertificationQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5229442596373476544L;

	/** 
	 * 代理函有效访问地址，有效时间2分钟，接口返回后开始计时，字段SUCCESS为true时返回，特定场景下返回值为空
	 */
	@ApiField("attorney_letter")
	private String attorneyLetter;

	/** 
	 * 授权状态，从用户授权开始计时，时间窗口3天
取值如下：
SUCCESS，代表用户已授权
FAIL，代表用户未授权或授权失效
	 */
	@ApiField("auth_status")
	private String authStatus;

	/** 
	 * 营业执照有效访问地址，有效时间2分钟，接口返回后开始计时，字段SUCCESS为true时返回，特定场景下返回值为空
	 */
	@ApiField("business_license")
	private String businessLicense;

	/** 
	 * 认证状态，取值如下：
SUCCESS，代表成功
INIT，代表初始化
CERTIFYING，代表认证中
FAIL，代表失败
	 */
	@ApiField("certify_status")
	private String certifyStatus;

	/** 
	 * 统一社会信用代码或营业执照注册号，字段auth_status为SUCCESS时返回
	 */
	@ApiField("ep_cert_no")
	private String epCertNo;

	/** 
	 * 企业全称，字段auth_status为SUCCESS时返回
	 */
	@ApiField("ep_name")
	private String epName;

	/** 
	 * 法人身份证反面有效访问定制，有效时间2分钟，接口返回后开始计时，特定场景下返回
	 */
	@ApiField("legal_person_id_card_back")
	private String legalPersonIdCardBack;

	/** 
	 * 法人身份证正面有效访问地址，有效时间2分钟，接口返回后开始计时，特定场景下返回
	 */
	@ApiField("legal_person_id_card_front")
	private String legalPersonIdCardFront;

	/** 
	 * 个人用户姓名，字段auth_status为SUCCESS时返回
	 */
	@ApiField("user_name")
	private String userName;

	public void setAttorneyLetter(String attorneyLetter) {
		this.attorneyLetter = attorneyLetter;
	}
	public String getAttorneyLetter( ) {
		return this.attorneyLetter;
	}

	public void setAuthStatus(String authStatus) {
		this.authStatus = authStatus;
	}
	public String getAuthStatus( ) {
		return this.authStatus;
	}

	public void setBusinessLicense(String businessLicense) {
		this.businessLicense = businessLicense;
	}
	public String getBusinessLicense( ) {
		return this.businessLicense;
	}

	public void setCertifyStatus(String certifyStatus) {
		this.certifyStatus = certifyStatus;
	}
	public String getCertifyStatus( ) {
		return this.certifyStatus;
	}

	public void setEpCertNo(String epCertNo) {
		this.epCertNo = epCertNo;
	}
	public String getEpCertNo( ) {
		return this.epCertNo;
	}

	public void setEpName(String epName) {
		this.epName = epName;
	}
	public String getEpName( ) {
		return this.epName;
	}

	public void setLegalPersonIdCardBack(String legalPersonIdCardBack) {
		this.legalPersonIdCardBack = legalPersonIdCardBack;
	}
	public String getLegalPersonIdCardBack( ) {
		return this.legalPersonIdCardBack;
	}

	public void setLegalPersonIdCardFront(String legalPersonIdCardFront) {
		this.legalPersonIdCardFront = legalPersonIdCardFront;
	}
	public String getLegalPersonIdCardFront( ) {
		return this.legalPersonIdCardFront;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserName( ) {
		return this.userName;
	}

}
