package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.tuitioncode.apply.send response.
 * 
 * @author auto create
 * @since 1.0, 2021-05-06 16:41:26
 */
public class AlipayCommerceEducateTuitioncodeApplySendResponse extends AlipayResponse {

	private static final long serialVersionUID = 2417426758787215332L;

	/** 
	 * 申请id
	 */
	@ApiField("apply_id")
	private String applyId;

	public void setApplyId(String applyId) {
		this.applyId = applyId;
	}
	public String getApplyId( ) {
		return this.applyId;
	}

}
