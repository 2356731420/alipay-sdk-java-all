package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 费控规则
 *
 * @author auto create
 * @since 1.0, 2021-07-09 11:53:57
 */
public class ExpenseCtrRuleInfo extends AlipayObject {

	private static final long serialVersionUID = 2521259261187532234L;

	/**
	 * 规则类型（QUOTA_TOTAL("QUOTA_TOTAL","有效期总额度"),
QUOTA_DAY("QUOTA_DAY","日额度"),
QUOTA_MONTH("QUOTA_MONTH","月额度"),
QUOTA_ONCE("QUOTA_ONCE","单笔额度");）
	 */
	@ApiField("rule_factor")
	private String ruleFactor;

	/**
	 * 规则id
	 */
	@ApiField("rule_id")
	private String ruleId;

	/**
	 * 规则名称
	 */
	@ApiField("rule_name")
	private String ruleName;

	/**
	 * 费控规则操作符
 LT("<","小于")
LE("<=","小于等于")
EQ("=","等于")
NE("!=","不等于")
GE(">=","大于等于")
GT(">","大于")
	 */
	@ApiField("rule_operator")
	private String ruleOperator;

	/**
	 * 规则值
	 */
	@ApiField("rule_value")
	private String ruleValue;

	public String getRuleFactor() {
		return this.ruleFactor;
	}
	public void setRuleFactor(String ruleFactor) {
		this.ruleFactor = ruleFactor;
	}

	public String getRuleId() {
		return this.ruleId;
	}
	public void setRuleId(String ruleId) {
		this.ruleId = ruleId;
	}

	public String getRuleName() {
		return this.ruleName;
	}
	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
	}

	public String getRuleOperator() {
		return this.ruleOperator;
	}
	public void setRuleOperator(String ruleOperator) {
		this.ruleOperator = ruleOperator;
	}

	public String getRuleValue() {
		return this.ruleValue;
	}
	public void setRuleValue(String ruleValue) {
		this.ruleValue = ruleValue;
	}

}
