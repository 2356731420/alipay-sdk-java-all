package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 蚂蚁会员积分退还接口(需要用户授权)
 *
 * @author auto create
 * @since 1.0, 2020-08-17 21:14:41
 */
public class AlipayUserPointRefundModel extends AlipayObject {

	private static final long serialVersionUID = 2459485369788295749L;

	/**
	 * 业务大类，与调用扣减积分接口时传入的值一致。
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 业务流水号，用来映射需要回退积分的订单号，与调用扣减积分接口时传入的值一致。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 业务子类型，与调用扣减积分接口时传入的值一致。
	 */
	@ApiField("sub_biz_type")
	private String subBizType;

	/**
	 * 订单所属支付宝用户的uid，与调用扣减积分接口时传入的值一致。
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getSubBizType() {
		return this.subBizType;
	}
	public void setSubBizType(String subBizType) {
		this.subBizType = subBizType;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
