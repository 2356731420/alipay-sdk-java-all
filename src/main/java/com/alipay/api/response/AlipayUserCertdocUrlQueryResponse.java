package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.certdoc.url.query response.
 * 
 * @author auto create
 * @since 1.0, 2020-05-07 10:09:02
 */
public class AlipayUserCertdocUrlQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7488727697467215546L;

	/** 
	 * 链接
	 */
	@ApiField("url")
	private String url;

	public void setUrl(String url) {
		this.url = url;
	}
	public String getUrl( ) {
		return this.url;
	}

}
