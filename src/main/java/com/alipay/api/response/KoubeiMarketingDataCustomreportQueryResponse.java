package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ReportDataItem;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.data.customreport.query response.
 * 
 * @author auto create
 * @since 1.0, 2020-08-31 10:33:10
 */
public class KoubeiMarketingDataCustomreportQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2241265782479245898L;

	/** 
	 * 数据量
	 */
	@ApiField("count")
	private String count;

	/** 
	 * 满足自定义报表规则的报表数据
	 */
	@ApiListField("report_data")
	@ApiField("report_data_item")
	private List<ReportDataItem> reportData;

	public void setCount(String count) {
		this.count = count;
	}
	public String getCount( ) {
		return this.count;
	}

	public void setReportData(List<ReportDataItem> reportData) {
		this.reportData = reportData;
	}
	public List<ReportDataItem> getReportData( ) {
		return this.reportData;
	}

}
