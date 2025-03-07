package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户会员交易习惯查询接口
 *
 * @author auto create
 * @since 1.0, 2020-08-31 10:32:46
 */
public class KoubeiMarketingDataTradeHabbitQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2696627413582346735L;

	/**
	 * 业务日期，格式：yyyyMMdd。
	 */
	@ApiField("biz_date")
	private String bizDate;

	/**
	 * 门店列表，多个门店用 ',' 分割，最多支持 10 个门店。不填时，默认为商户维度汇总数据。
	 */
	@ApiField("store_ids")
	private String storeIds;

	public String getBizDate() {
		return this.bizDate;
	}
	public void setBizDate(String bizDate) {
		this.bizDate = bizDate;
	}

	public String getStoreIds() {
		return this.storeIds;
	}
	public void setStoreIds(String storeIds) {
		this.storeIds = storeIds;
	}

}
