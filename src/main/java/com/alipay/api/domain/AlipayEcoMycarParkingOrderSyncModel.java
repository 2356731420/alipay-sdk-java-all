package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单同步接口
 *
 * @author auto create
 * @since 1.0, 2021-07-08 10:33:34
 */
public class AlipayEcoMycarParkingOrderSyncModel extends AlipayObject {

	private static final long serialVersionUID = 2619592162489619993L;

	/**
	 * 车牌
	 */
	@ApiField("car_number")
	private String carNumber;

	/**
	 * 如果是停车卡缴费，则填入停车卡卡号，否则为'*'
	 */
	@ApiField("card_number")
	private String cardNumber;

	/**
	 * 停车时长（以分为单位）
	 */
	@ApiField("in_duration")
	private String inDuration;

	/**
	 * 入场时间，格式"YYYY-MM-DD HH:mm:ss"，24小时制
	 */
	@ApiField("in_time")
	private String inTime;

	/**
	 * 支付宝支付流水，系统唯一
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 设备商订单状态，枚举支持：
* 0：成功。
* 1：失败。
	 */
	@ApiField("order_status")
	private String orderStatus;

	/**
	 * 订单创建时间，格式"YYYY-MM-DD HH:mm:ss"，24小时制
	 */
	@ApiField("order_time")
	private String orderTime;

	/**
	 * 设备商订单号，由ISV系统生成
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * ISV停车场ID，由ISV定义的停车场标识，同一个isv或商户范围内唯一。需与 <a href="https://opendocs.alipay.com/apis/api_19/alipay.eco.mycar.parking.parkinglotinfo.create">alipay.eco.mycar.parking.parkinglotinfo.create</a>(录入停车场信息)接口传入值一致。
	 */
	@ApiField("out_parking_id")
	private String outParkingId;

	/**
	 * 支付宝停车平台ID，由支付宝定义的该停车场标识，同一个isv或商户范围内唯一。通过 <a href="https://opendocs.alipay.com/apis/api_19/alipay.eco.mycar.parking.parkinglotinfo.create">alipay.eco.mycar.parking.parkinglotinfo.create</a>(录入停车场信息)接口获取。
	 */
	@ApiField("parking_id")
	private String parkingId;

	/**
	 * 停车场名称，需与<a href="https://opendocs.alipay.com/apis/api_19/alipay.eco.mycar.parking.parkinglotinfo.create">alipay.eco.mycar.parking.parkinglotinfo.create</a>(录入停车场信息)接口传入值一致。
	 */
	@ApiField("parking_name")
	private String parkingName;

	/**
	 * 缴费金额，保留小数点后两位
	 */
	@ApiField("pay_money")
	private String payMoney;

	/**
	 * 缴费时间, 格式"YYYYMM-DD HH:mm:ss"，24小时制
	 */
	@ApiField("pay_time")
	private String payTime;

	/**
	 * 付款方式，枚举支持：
*1：支付宝在线缴费 。
*2：支付宝代扣缴费。
*FTF_IN_PARKINGLOT_PAY：用户通过支付宝场内主动扫码或者提前在线缴费。
	 */
	@ApiField("pay_type")
	private String payType;

	/**
	 * 停车缴费用户 id，用户在支付宝的唯一标识，以 2088 开头的 16 位纯数字组成。
注意：ISV需保证用户 id的正确性，以免导致用户在停车平台查询不到相关的订单信息。
	 */
	@ApiField("user_id")
	private String userId;

	public String getCarNumber() {
		return this.carNumber;
	}
	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}

	public String getCardNumber() {
		return this.cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getInDuration() {
		return this.inDuration;
	}
	public void setInDuration(String inDuration) {
		this.inDuration = inDuration;
	}

	public String getInTime() {
		return this.inTime;
	}
	public void setInTime(String inTime) {
		this.inTime = inTime;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getOrderStatus() {
		return this.orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getOrderTime() {
		return this.orderTime;
	}
	public void setOrderTime(String orderTime) {
		this.orderTime = orderTime;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getOutParkingId() {
		return this.outParkingId;
	}
	public void setOutParkingId(String outParkingId) {
		this.outParkingId = outParkingId;
	}

	public String getParkingId() {
		return this.parkingId;
	}
	public void setParkingId(String parkingId) {
		this.parkingId = parkingId;
	}

	public String getParkingName() {
		return this.parkingName;
	}
	public void setParkingName(String parkingName) {
		this.parkingName = parkingName;
	}

	public String getPayMoney() {
		return this.payMoney;
	}
	public void setPayMoney(String payMoney) {
		this.payMoney = payMoney;
	}

	public String getPayTime() {
		return this.payTime;
	}
	public void setPayTime(String payTime) {
		this.payTime = payTime;
	}

	public String getPayType() {
		return this.payType;
	}
	public void setPayType(String payType) {
		this.payType = payType;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
