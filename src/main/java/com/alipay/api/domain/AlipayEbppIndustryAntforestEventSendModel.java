package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 行业-蚂蚁森林能量事件上报接口
 *
 * @author auto create
 * @since 1.0, 2021-04-07 20:38:50
 */
public class AlipayEbppIndustryAntforestEventSendModel extends AlipayObject {

	private static final long serialVersionUID = 6771562842427594575L;

	/**
	 * 用于标识行业-蚂蚁森林能量事件的类别
	 */
	@ApiField("type")
	private String type;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
