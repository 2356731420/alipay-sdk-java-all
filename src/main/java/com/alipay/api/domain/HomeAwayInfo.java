package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 主客队数据
 *
 * @author auto create
 * @since 1.0, 2020-11-17 10:07:50
 */
public class HomeAwayInfo extends AlipayObject {

	private static final long serialVersionUID = 1417773773993955143L;

	/**
	 * 客队数据
	 */
	@ApiField("away")
	private Long away;

	/**
	 * 主队数据
	 */
	@ApiField("home")
	private Long home;

	public Long getAway() {
		return this.away;
	}
	public void setAway(Long away) {
		this.away = away;
	}

	public Long getHome() {
		return this.home;
	}
	public void setHome(Long home) {
		this.home = home;
	}

}
