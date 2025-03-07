package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 餐饮服务标准化门店信息
 *
 * @author auto create
 * @since 1.0, 2021-06-18 11:02:40
 */
public class CateringStoreInfo extends AlipayObject {

	private static final long serialVersionUID = 4116239658382261486L;

	/**
	 * 门店营业时间
	 */
	@ApiField("business_hours")
	private BusinessHoursInfo businessHours;

	/**
	 * 外卖相关参数
	 */
	@ApiField("delivery_info")
	private CateringStoreDeliveryInfo deliveryInfo;

	/**
	 * 人均消费。单位为元，精确到小数点后两位。
	 */
	@ApiField("per_consumption")
	private String perConsumption;

	/**
	 * 支付宝门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 门店地址信息
	 */
	@ApiField("store_address_info")
	private StoreAddressInfo storeAddressInfo;

	/**
	 * 门店城市
	 */
	@ApiField("store_city")
	private String storeCity;

	/**
	 * 门店扩展字段，key：store_marking，value：pre_authorization
	 */
	@ApiListField("store_extra_info")
	@ApiField("extra_info")
	private List<ExtraInfo> storeExtraInfo;

	/**
	 * 商家门店id
	 */
	@ApiField("store_id")
	private String storeId;

	/**
	 * 门店名称
	 */
	@ApiField("store_name")
	private String storeName;

	/**
	 * 门店联系方式，支持手机号和固定电话。请输入合法的手机号码或者固定号码，其中其中固定号码的区号3到4位，电话7到8位，分机号选填(例：固定电话：0834-1133567 或者 0834-1133567-1234）
	 */
	@ApiField("store_phone")
	private String storePhone;

	public BusinessHoursInfo getBusinessHours() {
		return this.businessHours;
	}
	public void setBusinessHours(BusinessHoursInfo businessHours) {
		this.businessHours = businessHours;
	}

	public CateringStoreDeliveryInfo getDeliveryInfo() {
		return this.deliveryInfo;
	}
	public void setDeliveryInfo(CateringStoreDeliveryInfo deliveryInfo) {
		this.deliveryInfo = deliveryInfo;
	}

	public String getPerConsumption() {
		return this.perConsumption;
	}
	public void setPerConsumption(String perConsumption) {
		this.perConsumption = perConsumption;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public StoreAddressInfo getStoreAddressInfo() {
		return this.storeAddressInfo;
	}
	public void setStoreAddressInfo(StoreAddressInfo storeAddressInfo) {
		this.storeAddressInfo = storeAddressInfo;
	}

	public String getStoreCity() {
		return this.storeCity;
	}
	public void setStoreCity(String storeCity) {
		this.storeCity = storeCity;
	}

	public List<ExtraInfo> getStoreExtraInfo() {
		return this.storeExtraInfo;
	}
	public void setStoreExtraInfo(List<ExtraInfo> storeExtraInfo) {
		this.storeExtraInfo = storeExtraInfo;
	}

	public String getStoreId() {
		return this.storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	public String getStoreName() {
		return this.storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getStorePhone() {
		return this.storePhone;
	}
	public void setStorePhone(String storePhone) {
		this.storePhone = storePhone;
	}

}
