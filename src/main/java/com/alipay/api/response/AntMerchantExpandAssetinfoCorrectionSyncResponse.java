package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AssetResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.assetinfo.correction.sync response.
 * 
 * @author auto create
 * @since 1.0, 2020-09-14 20:31:38
 */
public class AntMerchantExpandAssetinfoCorrectionSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 6346326546661618556L;

	/** 
	 * 物料更正请求响应。
	 */
	@ApiListField("correction_results")
	@ApiField("asset_result")
	private List<AssetResult> correctionResults;

	public void setCorrectionResults(List<AssetResult> correctionResults) {
		this.correctionResults = correctionResults;
	}
	public List<AssetResult> getCorrectionResults( ) {
		return this.correctionResults;
	}

}
