package com.alipay.api.response;

import java.util.Date;
import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RecruitEnrollRule;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.recruit.plan.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-02 14:50:22
 */
public class AlipayMarketingRecruitPlanQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2555953539542424352L;

	/** 
	 * 招商方案描述：富文本内容，可能包含html标签
	 */
	@ApiField("description")
	private String description;

	/** 
	 * 报名结束时间
	 */
	@ApiField("enroll_end_time")
	private Date enrollEndTime;

	/** 
	 * 招商报名规则
	 */
	@ApiListField("enroll_rules")
	@ApiField("recruit_enroll_rule")
	private List<RecruitEnrollRule> enrollRules;

	/** 
	 * 报名开始时间
	 */
	@ApiField("enroll_start_time")
	private Date enrollStartTime;

	/** 
	 * 方案头图链接，150x150 以上尺寸的方形图片
	 */
	@ApiField("logo")
	private String logo;

	/** 
	 * 招商方案ID
	 */
	@ApiField("plan_id")
	private String planId;

	/** 
	 * 招商方案名称
	 */
	@ApiField("plan_name")
	private String planName;

	/** 
	 * 方案状态: 不可用:DISABLED;可用:ENABLED
	 */
	@ApiField("status")
	private String status;

	public void setDescription(String description) {
		this.description = description;
	}
	public String getDescription( ) {
		return this.description;
	}

	public void setEnrollEndTime(Date enrollEndTime) {
		this.enrollEndTime = enrollEndTime;
	}
	public Date getEnrollEndTime( ) {
		return this.enrollEndTime;
	}

	public void setEnrollRules(List<RecruitEnrollRule> enrollRules) {
		this.enrollRules = enrollRules;
	}
	public List<RecruitEnrollRule> getEnrollRules( ) {
		return this.enrollRules;
	}

	public void setEnrollStartTime(Date enrollStartTime) {
		this.enrollStartTime = enrollStartTime;
	}
	public Date getEnrollStartTime( ) {
		return this.enrollStartTime;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}
	public String getLogo( ) {
		return this.logo;
	}

	public void setPlanId(String planId) {
		this.planId = planId;
	}
	public String getPlanId( ) {
		return this.planId;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public String getPlanName( ) {
		return this.planName;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
