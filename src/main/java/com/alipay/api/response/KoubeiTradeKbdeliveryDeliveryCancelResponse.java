package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.trade.kbdelivery.delivery.cancel response.
 * 
 * @author auto create
 * @since 1.0, 2020-11-24 15:52:18
 */
public class KoubeiTradeKbdeliveryDeliveryCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 8629447435295687343L;

	/** 
	 * 成功关闭时间，时间格式:
yyyyMMddHHmmss
	 */
	@ApiField("gmt_close")
	private String gmtClose;

	/** 
	 * 口碑物流单号
	 */
	@ApiField("logistics_order_no")
	private String logisticsOrderNo;

	public void setGmtClose(String gmtClose) {
		this.gmtClose = gmtClose;
	}
	public String getGmtClose( ) {
		return this.gmtClose;
	}

	public void setLogisticsOrderNo(String logisticsOrderNo) {
		this.logisticsOrderNo = logisticsOrderNo;
	}
	public String getLogisticsOrderNo( ) {
		return this.logisticsOrderNo;
	}

}
