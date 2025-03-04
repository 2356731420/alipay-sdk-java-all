package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 车主车辆认证查询
 *
 * @author auto create
 * @since 1.0, 2021-05-14 10:23:30
 */
public class AlipayEcoMycarVehicleCertifiedQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6749766413126578673L;

	/**
	 * 车牌列表
	 */
	@ApiListField("plate_no_list")
	@ApiField("string")
	private List<String> plateNoList;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public List<String> getPlateNoList() {
		return this.plateNoList;
	}
	public void setPlateNoList(List<String> plateNoList) {
		this.plateNoList = plateNoList;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
