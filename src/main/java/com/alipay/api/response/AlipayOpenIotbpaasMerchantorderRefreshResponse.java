package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.IoTBPaaSMerchantOrderInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.iotbpaas.merchantorder.refresh response.
 * 
 * @author auto create
 * @since 1.0, 2021-01-29 12:00:16
 */
public class AlipayOpenIotbpaasMerchantorderRefreshResponse extends AlipayResponse {

	private static final long serialVersionUID = 5573619299513552114L;

	/** 
	 * 订单列表
	 */
	@ApiListField("order_list")
	@ApiField("io_t_b_paa_s_merchant_order_info")
	private List<IoTBPaaSMerchantOrderInfo> orderList;

	public void setOrderList(List<IoTBPaaSMerchantOrderInfo> orderList) {
		this.orderList = orderList;
	}
	public List<IoTBPaaSMerchantOrderInfo> getOrderList( ) {
		return this.orderList;
	}

}
