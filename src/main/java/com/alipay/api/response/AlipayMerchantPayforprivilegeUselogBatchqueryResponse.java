package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PayForPrivilegeRechargeCardUseLog;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.payforprivilege.uselog.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2021-04-19 16:40:18
 */
public class AlipayMerchantPayforprivilegeUselogBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1568172175638885799L;

	/** 
	 * 余额使用记录
	 */
	@ApiListField("use_log_list")
	@ApiField("pay_for_privilege_recharge_card_use_log")
	private List<PayForPrivilegeRechargeCardUseLog> useLogList;

	public void setUseLogList(List<PayForPrivilegeRechargeCardUseLog> useLogList) {
		this.useLogList = useLogList;
	}
	public List<PayForPrivilegeRechargeCardUseLog> getUseLogList( ) {
		return this.useLogList;
	}

}
