package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.sign.token.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-06-01 14:05:21
 */
public class AlipayCommerceEducateSignTokenQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6371749924566581345L;

	/** 
	 * 业务场景类型标识
	 */
	@ApiField("biz_code")
	private String bizCode;

	/** 
	 * 需要将该字段返回给学校
	 */
	@ApiField("cert_no")
	private String certNo;

	/** 
	 * 证件类型（"1","居民身份证"）
	 */
	@ApiField("cert_type")
	private String certType;

	/** 
	 * 家长支付宝账户的脱敏信息
	 */
	@ApiField("parent_logon_id")
	private String parentLogonId;

	/** 
	 * 家长id，如是本人开通，当前id与用户id相同
	 */
	@ApiField("parent_user_id")
	private String parentUserId;

	/** 
	 * 学校内标
	 */
	@ApiField("school_code")
	private String schoolCode;

	/** 
	 * 校园一脸通行开通状态。OPEN：开通，CLOSE：关闭
	 */
	@ApiField("school_face_pass_status")
	private String schoolFacePassStatus;

	/** 
	 * 校园一脸通行刷脸支付开通状态。OPEN：开通，CLOSE：关闭
	 */
	@ApiField("school_face_payment_status")
	private String schoolFacePaymentStatus;

	/** 
	 * 学校外标（即学校的统一信用编码）
	 */
	@ApiField("school_stdcode")
	private String schoolStdcode;

	/** 
	 * 用户id
	 */
	@ApiField("user_id")
	private String userId;

	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}
	public String getBizCode( ) {
		return this.bizCode;
	}

	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}
	public String getCertNo( ) {
		return this.certNo;
	}

	public void setCertType(String certType) {
		this.certType = certType;
	}
	public String getCertType( ) {
		return this.certType;
	}

	public void setParentLogonId(String parentLogonId) {
		this.parentLogonId = parentLogonId;
	}
	public String getParentLogonId( ) {
		return this.parentLogonId;
	}

	public void setParentUserId(String parentUserId) {
		this.parentUserId = parentUserId;
	}
	public String getParentUserId( ) {
		return this.parentUserId;
	}

	public void setSchoolCode(String schoolCode) {
		this.schoolCode = schoolCode;
	}
	public String getSchoolCode( ) {
		return this.schoolCode;
	}

	public void setSchoolFacePassStatus(String schoolFacePassStatus) {
		this.schoolFacePassStatus = schoolFacePassStatus;
	}
	public String getSchoolFacePassStatus( ) {
		return this.schoolFacePassStatus;
	}

	public void setSchoolFacePaymentStatus(String schoolFacePaymentStatus) {
		this.schoolFacePaymentStatus = schoolFacePaymentStatus;
	}
	public String getSchoolFacePaymentStatus( ) {
		return this.schoolFacePaymentStatus;
	}

	public void setSchoolStdcode(String schoolStdcode) {
		this.schoolStdcode = schoolStdcode;
	}
	public String getSchoolStdcode( ) {
		return this.schoolStdcode;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

}
