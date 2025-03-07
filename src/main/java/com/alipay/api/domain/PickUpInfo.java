package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 自提业务信息
 *
 * @author auto create
 * @since 1.0, 2021-06-17 14:01:04
 */
public class PickUpInfo extends AlipayObject {

	private static final long serialVersionUID = 2825252464753547656L;

	/**
	 * 自提地址（展示的地址）
	 */
	@ApiField("pick_up_address")
	private String pickUpAddress;

	/**
	 * 类型对应取餐码，待自取及之后状态必填。建议生成该字段时即回传。
	 */
	@ApiField("pick_up_code")
	private String pickUpCode;

	/**
	 * 自提门店名称
	 */
	@ApiField("pick_up_shop_name")
	private String pickUpShopName;

	/**
	 * 取餐凭证类型。待自取及之后状态必填。整体状态生命周期中，必须回传1次。枚举支持：自提码-SELF_PICK_CODE ；口令-PASSWORD。
	 */
	@ApiField("pick_up_type")
	private String pickUpType;

	public String getPickUpAddress() {
		return this.pickUpAddress;
	}
	public void setPickUpAddress(String pickUpAddress) {
		this.pickUpAddress = pickUpAddress;
	}

	public String getPickUpCode() {
		return this.pickUpCode;
	}
	public void setPickUpCode(String pickUpCode) {
		this.pickUpCode = pickUpCode;
	}

	public String getPickUpShopName() {
		return this.pickUpShopName;
	}
	public void setPickUpShopName(String pickUpShopName) {
		this.pickUpShopName = pickUpShopName;
	}

	public String getPickUpType() {
		return this.pickUpType;
	}
	public void setPickUpType(String pickUpType) {
		this.pickUpType = pickUpType;
	}

}
