package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 蚂蚁企业信用企业档案页二维码接口
 *
 * @author auto create
 * @since 1.0, 2021-07-08 17:18:03
 */
public class ZhimaCreditEpDossierQrcodeApplyModel extends AlipayObject {

	private static final long serialVersionUID = 5325931942738778867L;

	/**
	 * 企业社会统一信用代码或营业执照注册号
	 */
	@ApiField("ep_cert_no")
	private String epCertNo;

	public String getEpCertNo() {
		return this.epCertNo;
	}
	public void setEpCertNo(String epCertNo) {
		this.epCertNo = epCertNo;
	}

}
