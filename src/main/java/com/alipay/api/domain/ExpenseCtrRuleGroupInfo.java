package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 费控规则组
 *
 * @author auto create
 * @since 1.0, 2021-07-09 13:42:33
 */
public class ExpenseCtrRuleGroupInfo extends AlipayObject {

	private static final long serialVersionUID = 5598296353375651476L;

	/**
	 * 费控规则列表
	 */
	@ApiListField("expense_ctrl_rule_info_list")
	@ApiField("expense_ctr_rule_info")
	private List<ExpenseCtrRuleInfo> expenseCtrlRuleInfoList;

	/**
	 * 费用类型（餐饮：MEAL
 ，地铁：METRO
 ，通用：DEFAULT
）
	 */
	@ApiField("expense_type")
	private String expenseType;

	/**
	 * 规则组id
	 */
	@ApiField("group_id")
	private String groupId;

	/**
	 * 规则组名称
	 */
	@ApiField("group_name")
	private String groupName;

	public List<ExpenseCtrRuleInfo> getExpenseCtrlRuleInfoList() {
		return this.expenseCtrlRuleInfoList;
	}
	public void setExpenseCtrlRuleInfoList(List<ExpenseCtrRuleInfo> expenseCtrlRuleInfoList) {
		this.expenseCtrlRuleInfoList = expenseCtrlRuleInfoList;
	}

	public String getExpenseType() {
		return this.expenseType;
	}
	public void setExpenseType(String expenseType) {
		this.expenseType = expenseType;
	}

	public String getGroupId() {
		return this.groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getGroupName() {
		return this.groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

}
