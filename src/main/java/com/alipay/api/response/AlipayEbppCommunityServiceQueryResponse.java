package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CommunityServiceInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.community.service.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-02-03 10:33:40
 */
public class AlipayEbppCommunityServiceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8787894916976156858L;

	/** 
	 * 服务查询列表
	 */
	@ApiListField("service_info_list")
	@ApiField("community_service_info")
	private List<CommunityServiceInfo> serviceInfoList;

	public void setServiceInfoList(List<CommunityServiceInfo> serviceInfoList) {
		this.serviceInfoList = serviceInfoList;
	}
	public List<CommunityServiceInfo> getServiceInfoList( ) {
		return this.serviceInfoList;
	}

}
