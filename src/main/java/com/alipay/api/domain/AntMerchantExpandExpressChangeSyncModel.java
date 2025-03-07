package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 物流状态信息反馈接口
 *
 * @author auto create
 * @since 1.0, 2020-09-14 20:33:54
 */
public class AntMerchantExpandExpressChangeSyncModel extends AlipayObject {

	private static final long serialVersionUID = 6681494126473237642L;

	/**
	 * 传入需要上传的附件内容及相关业务参数
	 */
	@ApiField("asset_logistics_record")
	private AssetLogisticsRecord assetLogisticsRecord;

	public AssetLogisticsRecord getAssetLogisticsRecord() {
		return this.assetLogisticsRecord;
	}
	public void setAssetLogisticsRecord(AssetLogisticsRecord assetLogisticsRecord) {
		this.assetLogisticsRecord = assetLogisticsRecord;
	}

}
