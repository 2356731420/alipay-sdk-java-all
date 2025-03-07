package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ZolozDeviceInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zoloz.identification.deviceinfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-02 15:43:44
 */
public class ZolozIdentificationDeviceinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6354923746615128673L;

	/** 
	 * device_info
	 */
	@ApiField("device_info")
	private ZolozDeviceInfo deviceInfo;

	public void setDeviceInfo(ZolozDeviceInfo deviceInfo) {
		this.deviceInfo = deviceInfo;
	}
	public ZolozDeviceInfo getDeviceInfo( ) {
		return this.deviceInfo;
	}

}
