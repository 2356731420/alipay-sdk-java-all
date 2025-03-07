package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序poi数据同步
 *
 * @author auto create
 * @since 1.0, 2021-05-26 19:09:53
 */
public class AlipayOpenMiniDataPoiSyncModel extends AlipayObject {

	private static final long serialVersionUID = 8264432477567559292L;

	/**
	 * poi回流数据
	 */
	@ApiField("poi_data")
	private PoiSyncData poiData;

	public PoiSyncData getPoiData() {
		return this.poiData;
	}
	public void setPoiData(PoiSyncData poiData) {
		this.poiData = poiData;
	}

}
