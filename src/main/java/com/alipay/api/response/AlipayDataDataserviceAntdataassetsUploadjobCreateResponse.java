package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.antdataassets.uploadjob.create response.
 * 
 * @author auto create
 * @since 1.0, 2019-04-30 15:13:01
 */
public class AlipayDataDataserviceAntdataassetsUploadjobCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1137944875872213642L;

	/** 
	 * 创建上云任务之后生成的任务ID
	 */
	@ApiField("uca_dataset_id")
	private Long ucaDatasetId;

	public void setUcaDatasetId(Long ucaDatasetId) {
		this.ucaDatasetId = ucaDatasetId;
	}
	public Long getUcaDatasetId( ) {
		return this.ucaDatasetId;
	}

}
