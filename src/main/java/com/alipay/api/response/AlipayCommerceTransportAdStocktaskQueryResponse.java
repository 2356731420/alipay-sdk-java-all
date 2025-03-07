package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.StockTask;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.ad.stocktask.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayCommerceTransportAdStocktaskQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4443593178156357952L;

	/** 
	 * 库存任务执行情况
	 */
	@ApiField("stock_task")
	private StockTask stockTask;

	public void setStockTask(StockTask stockTask) {
		this.stockTask = stockTask;
	}
	public StockTask getStockTask( ) {
		return this.stockTask;
	}

}
