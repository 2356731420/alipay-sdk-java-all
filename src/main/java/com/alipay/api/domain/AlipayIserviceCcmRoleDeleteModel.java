package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 删除角色
 *
 * @author auto create
 * @since 1.0, 2020-12-10 14:24:47
 */
public class AlipayIserviceCcmRoleDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 5598244559292649641L;

	/**
	 * 部门id（即租户实例ID、数据权限ID），如果不传入，使用租户id
	 */
	@ApiField("ccs_instance_id")
	private String ccsInstanceId;

	/**
	 * 角色id
	 */
	@ApiField("id")
	private String id;

	public String getCcsInstanceId() {
		return this.ccsInstanceId;
	}
	public void setCcsInstanceId(String ccsInstanceId) {
		this.ccsInstanceId = ccsInstanceId;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

}
