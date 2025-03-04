package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.servindustry.exercise.notice.create response.
 * 
 * @author auto create
 * @since 1.0, 2020-06-18 11:51:41
 */
public class KoubeiServindustryExerciseNoticeCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2539676225514632446L;

	/** 
	 * 通知ID
	 */
	@ApiField("notice_id")
	private String noticeId;

	public void setNoticeId(String noticeId) {
		this.noticeId = noticeId;
	}
	public String getNoticeId( ) {
		return this.noticeId;
	}

}
