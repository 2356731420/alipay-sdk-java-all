package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 *  餐饮服务标准化服务申报
 *
 * @author auto create
 * @since 1.0, 2021-06-18 11:02:40
 */
public class AlipayCommerceOperationIsvServiceSubmitModel extends AlipayObject {

	private static final long serialVersionUID = 6435785184695565465L;

	/**
	 * 扩展字段，服务扩展字段，示例：key：service_levle，value：standard
	 */
	@ApiListField("extra_info")
	@ApiField("extra_info")
	private List<ExtraInfo> extraInfo;

	/**
	 * 商户信息
	 */
	@ApiField("merchant_info")
	private CateringMerchantInfo merchantInfo;

	/**
	 * 服务描述
	 */
	@ApiField("service_description")
	private String serviceDescription;

	/**
	 * 服务名称
	 */
	@ApiField("service_name")
	private String serviceName;

	/**
	 * 服务状态（ServiceStatus枚举）
SERVICE_CREATE：服务创建
SERVICE_UPDATE：服务更新
SERVICE_OFFLINE：服务下线
	 */
	@ApiField("service_status")
	private String serviceStatus;

	/**
	 * 服务子类型（ServiceSubType枚举）
PICK_UP:自提
TAKE_AWAY:外卖
	 */
	@ApiField("service_sub_type")
	private String serviceSubType;

	/**
	 * 服务类型（餐饮固定为CATERING，ServiceType枚举）
	 */
	@ApiField("service_type")
	private String serviceType;

	/**
	 * 服务url（可直接跳转对应的服务子类型小程序页面）
	 */
	@ApiField("service_url")
	private String serviceUrl;

	/**
	 * 门店信息
	 */
	@ApiField("store_info")
	private CateringStoreInfo storeInfo;

	public List<ExtraInfo> getExtraInfo() {
		return this.extraInfo;
	}
	public void setExtraInfo(List<ExtraInfo> extraInfo) {
		this.extraInfo = extraInfo;
	}

	public CateringMerchantInfo getMerchantInfo() {
		return this.merchantInfo;
	}
	public void setMerchantInfo(CateringMerchantInfo merchantInfo) {
		this.merchantInfo = merchantInfo;
	}

	public String getServiceDescription() {
		return this.serviceDescription;
	}
	public void setServiceDescription(String serviceDescription) {
		this.serviceDescription = serviceDescription;
	}

	public String getServiceName() {
		return this.serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getServiceStatus() {
		return this.serviceStatus;
	}
	public void setServiceStatus(String serviceStatus) {
		this.serviceStatus = serviceStatus;
	}

	public String getServiceSubType() {
		return this.serviceSubType;
	}
	public void setServiceSubType(String serviceSubType) {
		this.serviceSubType = serviceSubType;
	}

	public String getServiceType() {
		return this.serviceType;
	}
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public String getServiceUrl() {
		return this.serviceUrl;
	}
	public void setServiceUrl(String serviceUrl) {
		this.serviceUrl = serviceUrl;
	}

	public CateringStoreInfo getStoreInfo() {
		return this.storeInfo;
	}
	public void setStoreInfo(CateringStoreInfo storeInfo) {
		this.storeInfo = storeInfo;
	}

}
