package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 预授权退税完成确认
 *
 * @author auto create
 * @since 1.0, 2020-06-08 11:25:33
 */
public class AlipayOverseasTaxAdvancedUnfreezeModel extends AlipayObject {

	private static final long serialVersionUID = 8716543489289459848L;

	/**
	 * 支付宝退税资金订单号
	 */
	@ApiField("tax_refund_no")
	private String taxRefundNo;

	public String getTaxRefundNo() {
		return this.taxRefundNo;
	}
	public void setTaxRefundNo(String taxRefundNo) {
		this.taxRefundNo = taxRefundNo;
	}

}
