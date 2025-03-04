package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.dossier.info.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-05-28 09:42:34
 */
public class ZhimaCreditEpDossierInfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8272694557127911998L;

	/** 
	 * 经营期限自
	 */
	@ApiField("business_period_from")
	private String businessPeriodFrom;

	/** 
	 * 经营期限至
	 */
	@ApiField("business_period_to")
	private String businessPeriodTo;

	/** 
	 * 经营范围
	 */
	@ApiField("business_scope")
	private String businessScope;

	/** 
	 * 负责人姓名
	 */
	@ApiField("charge_person_name")
	private String chargePersonName;

	/** 
	 * 负责人类型，例如：法定代表人、法人代表、执行合伙人等
	 */
	@ApiField("charge_person_type")
	private String chargePersonType;

	/** 
	 * 统一社会信用代码或营业执照注册号
	 */
	@ApiField("ep_cert_no")
	private String epCertNo;

	/** 
	 * 企业全称
	 */
	@ApiField("ep_name")
	private String epName;

	/** 
	 * 经营状态，如存续、在业、吊销、注销、迁入、迁出等
	 */
	@ApiField("ep_status")
	private String epStatus;

	/** 
	 * 企业类型
	 */
	@ApiField("ep_type")
	private String epType;

	/** 
	 * 成立时间
	 */
	@ApiField("established_time")
	private String establishedTime;

	/** 
	 * 所属行业
	 */
	@ApiField("industry")
	private String industry;

	/** 
	 * 所在地
	 */
	@ApiField("location")
	private String location;

	/** 
	 * 注册地址
	 */
	@ApiField("registered_address")
	private String registeredAddress;

	/** 
	 * 注册资本
	 */
	@ApiField("registered_capital")
	private String registeredCapital;

	/** 
	 * 登记机关
	 */
	@ApiField("registered_org")
	private String registeredOrg;

	public void setBusinessPeriodFrom(String businessPeriodFrom) {
		this.businessPeriodFrom = businessPeriodFrom;
	}
	public String getBusinessPeriodFrom( ) {
		return this.businessPeriodFrom;
	}

	public void setBusinessPeriodTo(String businessPeriodTo) {
		this.businessPeriodTo = businessPeriodTo;
	}
	public String getBusinessPeriodTo( ) {
		return this.businessPeriodTo;
	}

	public void setBusinessScope(String businessScope) {
		this.businessScope = businessScope;
	}
	public String getBusinessScope( ) {
		return this.businessScope;
	}

	public void setChargePersonName(String chargePersonName) {
		this.chargePersonName = chargePersonName;
	}
	public String getChargePersonName( ) {
		return this.chargePersonName;
	}

	public void setChargePersonType(String chargePersonType) {
		this.chargePersonType = chargePersonType;
	}
	public String getChargePersonType( ) {
		return this.chargePersonType;
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

	public void setEpStatus(String epStatus) {
		this.epStatus = epStatus;
	}
	public String getEpStatus( ) {
		return this.epStatus;
	}

	public void setEpType(String epType) {
		this.epType = epType;
	}
	public String getEpType( ) {
		return this.epType;
	}

	public void setEstablishedTime(String establishedTime) {
		this.establishedTime = establishedTime;
	}
	public String getEstablishedTime( ) {
		return this.establishedTime;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}
	public String getIndustry( ) {
		return this.industry;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	public String getLocation( ) {
		return this.location;
	}

	public void setRegisteredAddress(String registeredAddress) {
		this.registeredAddress = registeredAddress;
	}
	public String getRegisteredAddress( ) {
		return this.registeredAddress;
	}

	public void setRegisteredCapital(String registeredCapital) {
		this.registeredCapital = registeredCapital;
	}
	public String getRegisteredCapital( ) {
		return this.registeredCapital;
	}

	public void setRegisteredOrg(String registeredOrg) {
		this.registeredOrg = registeredOrg;
	}
	public String getRegisteredOrg( ) {
		return this.registeredOrg;
	}

}
