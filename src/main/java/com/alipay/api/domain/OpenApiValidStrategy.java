package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 生效策略条件组建
 *
 * @author auto create
 * @since 1.0, 2020-05-06 19:07:46
 */
public class OpenApiValidStrategy extends AlipayObject {

	private static final long serialVersionUID = 2598173958914299322L;

	/**
	 * 失效时间
	 */
	@ApiField("gmt_invalid")
	private Date gmtInvalid;

	/**
	 * 签约时间
	 */
	@ApiField("gmt_sign")
	private Date gmtSign;

	/**
	 * 生效日期
	 */
	@ApiField("gmt_valid")
	private Date gmtValid;

	/**
	 * 失效方式： 01:到期失效 02:通知失效 03:截止日期失效
	 */
	@ApiField("invalid_type")
	private String invalidType;

	/**
	 * 生效类型： 01:立即生效 02:通知生效 03:预约生效 04:倒签生效
	 */
	@ApiField("valid_type")
	private String validType;

	public Date getGmtInvalid() {
		return this.gmtInvalid;
	}
	public void setGmtInvalid(Date gmtInvalid) {
		this.gmtInvalid = gmtInvalid;
	}

	public Date getGmtSign() {
		return this.gmtSign;
	}
	public void setGmtSign(Date gmtSign) {
		this.gmtSign = gmtSign;
	}

	public Date getGmtValid() {
		return this.gmtValid;
	}
	public void setGmtValid(Date gmtValid) {
		this.gmtValid = gmtValid;
	}

	public String getInvalidType() {
		return this.invalidType;
	}
	public void setInvalidType(String invalidType) {
		this.invalidType = invalidType;
	}

	public String getValidType() {
		return this.validType;
	}
	public void setValidType(String validType) {
		this.validType = validType;
	}

}
