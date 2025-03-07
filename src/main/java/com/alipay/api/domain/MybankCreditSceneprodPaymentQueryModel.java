package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 场景金融代收付结果查询
 *
 * @author auto create
 * @since 1.0, 2018-01-23 11:37:34
 */
public class MybankCreditSceneprodPaymentQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5618324487827321167L;

	/**
	 * 网商内部代收付申请单编号，外部机构根据此编号查询申请状态。
	 */
	@ApiField("in_apply_no")
	private String inApplyNo;

	public String getInApplyNo() {
		return this.inApplyNo;
	}
	public void setInApplyNo(String inApplyNo) {
		this.inApplyNo = inApplyNo;
	}

}
