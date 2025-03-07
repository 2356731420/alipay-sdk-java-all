package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 车主车辆信息查询
 *
 * @author auto create
 * @since 1.0, 2021-07-02 11:33:39
 */
public class AlipayEcoMycarVehicleInfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4777993116582297281L;

	/**
	 * 车牌号
	 */
	@ApiField("plate_no")
	private String plateNo;

	public String getPlateNo() {
		return this.plateNo;
	}
	public void setPlateNo(String plateNo) {
		this.plateNo = plateNo;
	}

}
