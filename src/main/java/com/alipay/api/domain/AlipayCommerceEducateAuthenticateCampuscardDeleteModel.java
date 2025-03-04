package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * isv解除认证关系
 *
 * @author auto create
 * @since 1.0, 2020-08-13 21:15:39
 */
public class AlipayCommerceEducateAuthenticateCampuscardDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 6656126824153131259L;

	/**
	 * 证件号
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 学生证件类型，默认为1: 1 居民身份证
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 学校国标码
	 */
	@ApiField("school_stdcode")
	private String schoolStdcode;

	/**
	 * 用户姓名
	 */
	@ApiField("user_name")
	private String userName;

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getCertType() {
		return this.certType;
	}
	public void setCertType(String certType) {
		this.certType = certType;
	}

	public String getSchoolStdcode() {
		return this.schoolStdcode;
	}
	public void setSchoolStdcode(String schoolStdcode) {
		this.schoolStdcode = schoolStdcode;
	}

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
