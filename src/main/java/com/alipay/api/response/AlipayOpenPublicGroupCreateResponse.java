package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.group.create response.
 * 
 * @author auto create
 * @since 1.0, 2021-05-27 16:45:51
 */
public class AlipayOpenPublicGroupCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1724126434256485694L;

	/** 
	 * 分组id
	 */
	@ApiField("group_id")
	private String groupId;

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}
	public String getGroupId( ) {
		return this.groupId;
	}

}
