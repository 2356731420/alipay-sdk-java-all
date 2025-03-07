package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CustomReportCondition;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.data.customreport.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2020-09-02 19:22:45
 */
public class KoubeiMarketingDataCustomreportBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4644624514875569351L;

	/** 
	 * 分页输出自定义开放数据规则列表
	 */
	@ApiListField("report_condition_list")
	@ApiField("custom_report_condition")
	private List<CustomReportCondition> reportConditionList;

	public void setReportConditionList(List<CustomReportCondition> reportConditionList) {
		this.reportConditionList = reportConditionList;
	}
	public List<CustomReportCondition> getReportConditionList( ) {
		return this.reportConditionList;
	}

}
