package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 物料信息同步
 *
 * @author auto create
 * @since 1.0, 2020-09-14 20:33:44
 */
public class AntMerchantExpandAssetinfoSyncModel extends AlipayObject {

	private static final long serialVersionUID = 2528864376143347881L;

	/**
	 * 传入需要反馈的物料信息对象列表.
	 */
	@ApiListField("asset_infos")
	@ApiField("asset_info_item")
	private List<AssetInfoItem> assetInfos;

	public List<AssetInfoItem> getAssetInfos() {
		return this.assetInfos;
	}
	public void setAssetInfos(List<AssetInfoItem> assetInfos) {
		this.assetInfos = assetInfos;
	}

}
