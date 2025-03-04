package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 订单券核销
 *
 * @author auto create
 * @since 1.0, 2021-05-12 20:32:31
 */
public class AlipayMarketingActivityOrdervoucherUseModel extends AlipayObject {

	private static final long serialVersionUID = 6257325432375713662L;

	/**
	 * 优惠券活动id
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 外部优惠券的核销时间。



格式为：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("biz_dt")
	private Date bizDt;

	/**
	 * 商品明细信息。



限制：

当前交易中存在商品信息，则建议传入商品明细信息。
	 */
	@ApiListField("goods_detail")
	@ApiField("goods_detail_d_t_o")
	private List<GoodsDetailDTO> goodsDetail;

	/**
	 * 外部业务单号，用作幂等控制。



幂等作用：

参数不变的情况下，再次请求返回与上一次相同的结果。



外部接入方需保证业务单号唯一。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 支付宝门店id
	 */
	@ApiField("store_id")
	private String storeId;

	/**
	 * 订单优惠前的总金额



限制：

该笔订单的资金总额，取值范围[0.01,100000000]，精确到小数点后2位。
	 */
	@ApiField("total_fee")
	private String totalFee;

	/**
	 * 交易渠道。



枚举值：

ZHIFUBAO_TRADE_CHANNEL：

支付宝交易渠道



WX_TRADE_CHANNEL：

微信交易渠道



OTHER_TRADE_CHANNEL：

其他交易渠道
	 */
	@ApiField("trade_channel")
	private String tradeChannel;

	/**
	 * 该交易在支付宝系统中的交易流水号。
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 待核销的券码。
	 */
	@ApiField("voucher_code")
	private String voucherCode;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public Date getBizDt() {
		return this.bizDt;
	}
	public void setBizDt(Date bizDt) {
		this.bizDt = bizDt;
	}

	public List<GoodsDetailDTO> getGoodsDetail() {
		return this.goodsDetail;
	}
	public void setGoodsDetail(List<GoodsDetailDTO> goodsDetail) {
		this.goodsDetail = goodsDetail;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getStoreId() {
		return this.storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	public String getTotalFee() {
		return this.totalFee;
	}
	public void setTotalFee(String totalFee) {
		this.totalFee = totalFee;
	}

	public String getTradeChannel() {
		return this.tradeChannel;
	}
	public void setTradeChannel(String tradeChannel) {
		this.tradeChannel = tradeChannel;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getVoucherCode() {
		return this.voucherCode;
	}
	public void setVoucherCode(String voucherCode) {
		this.voucherCode = voucherCode;
	}

}
