package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 营业执照图片识别对外接口服务
 *
 * @author auto create
 * @since 1.0, 2019-09-06 18:14:44
 */
public class AlipayEcoLicenseOcrIdentifyModel extends AlipayObject {

	private static final long serialVersionUID = 7392495411978575839L;

	/**
	 * 图片字节byte[]经过base64处理的字符串
	 */
	@ApiField("image")
	private String image;

	public String getImage() {
		return this.image;
	}
	public void setImage(String image) {
		this.image = image;
	}

}
