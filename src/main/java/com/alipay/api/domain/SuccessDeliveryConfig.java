package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建成功的投放信息配置
 *
 * @author auto create
 * @since 1.0, 2021-06-11 13:32:13
 */
public class SuccessDeliveryConfig extends AlipayObject {

	private static final long serialVersionUID = 5651292827947117166L;

	/**
	 * 投放配置。
	 */
	@ApiField("delivery_config")
	private DeliveryConfig deliveryConfig;

	public DeliveryConfig getDeliveryConfig() {
		return this.deliveryConfig;
	}
	public void setDeliveryConfig(DeliveryConfig deliveryConfig) {
		this.deliveryConfig = deliveryConfig;
	}

}
