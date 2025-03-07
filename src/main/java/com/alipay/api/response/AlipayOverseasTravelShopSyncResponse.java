package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.travel.shop.sync response.
 * 
 * @author auto create
 * @since 1.0, 2021-02-25 19:15:18
 */
public class AlipayOverseasTravelShopSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 7722945995895636986L;

	/** 
	 * 当前店铺业务状态。NORMAL：正常开业中；CLOSED
：已停业
	 */
	@ApiField("shop_biz_status")
	private String shopBizStatus;

	/** 
	 * 同步返回的请求处理结果。PROCESSING：处理中；SUCCESS:处理成功；FAILED:处理失败。当返回状态为PROCESSING时需要等到最终处理成功再发起同步请求进行更新操作。
	 */
	@ApiField("sync_status")
	private String syncStatus;

	public void setShopBizStatus(String shopBizStatus) {
		this.shopBizStatus = shopBizStatus;
	}
	public String getShopBizStatus( ) {
		return this.shopBizStatus;
	}

	public void setSyncStatus(String syncStatus) {
		this.syncStatus = syncStatus;
	}
	public String getSyncStatus( ) {
		return this.syncStatus;
	}

}
