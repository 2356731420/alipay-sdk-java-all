package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 物流金融统一route沙箱环境接口
 *
 * @author auto create
 * @since 1.0, 2020-06-01 11:08:09
 */
public class AnttechBlockchainFinanceMylogisticfinsandboxMessagePublishModel extends AlipayObject {

	private static final long serialVersionUID = 8822266427343294648L;

	/**
	 * 路由方法的参数
	 */
	@ApiField("data")
	private String data;

	/**
	 * 方法路由
	 */
	@ApiField("method_name")
	private String methodName;

	public String getData() {
		return this.data;
	}
	public void setData(String data) {
		this.data = data;
	}

	public String getMethodName() {
		return this.methodName;
	}
	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}

}
