package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 公众号标签管理-删除标签
 *
 * @author auto create
 * @since 1.0, 2021-06-23 14:41:28
 */
public class AlipayOpenPublicLabelDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 7126612671421193295L;

	/**
	 * 标签id
	 */
	@ApiField("id")
	private String id;

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

}
