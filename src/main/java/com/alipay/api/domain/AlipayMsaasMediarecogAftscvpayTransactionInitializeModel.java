package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 多媒体afts平台视觉付交易初始化接口
 *
 * @author auto create
 * @since 1.0, 2020-12-23 16:08:38
 */
public class AlipayMsaasMediarecogAftscvpayTransactionInitializeModel extends AlipayObject {

	private static final long serialVersionUID = 6363426661473788975L;

	/**
	 * 商品信息,列表
	 */
	@ApiListField("goods_infos")
	@ApiField("good_info")
	private List<GoodInfo> goodsInfos;

	/**
	 * 视觉货柜机型信息
	 */
	@ApiField("machine_type")
	private String machineType;

	/**
	 * 标识是什么场景下的视觉识别请求
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 售卖设备编号
	 */
	@ApiField("terminal_id")
	private String terminalId;

	/**
	 * 视觉货柜设备总层数
	 */
	@ApiField("total_floors")
	private Long totalFloors;

	/**
	 * 云平台请求唯一标示,保证用户请求的幂等性.
	 */
	@ApiField("transaction_id")
	private String transactionId;

	/**
	 * 货柜类型，1:友宝货柜, 2:产品化货柜
	 */
	@ApiField("type")
	private Long type;

	/**
	 * 用户uid
	 */
	@ApiField("uid")
	private String uid;

	public List<GoodInfo> getGoodsInfos() {
		return this.goodsInfos;
	}
	public void setGoodsInfos(List<GoodInfo> goodsInfos) {
		this.goodsInfos = goodsInfos;
	}

	public String getMachineType() {
		return this.machineType;
	}
	public void setMachineType(String machineType) {
		this.machineType = machineType;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

	public String getTerminalId() {
		return this.terminalId;
	}
	public void setTerminalId(String terminalId) {
		this.terminalId = terminalId;
	}

	public Long getTotalFloors() {
		return this.totalFloors;
	}
	public void setTotalFloors(Long totalFloors) {
		this.totalFloors = totalFloors;
	}

	public String getTransactionId() {
		return this.transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public Long getType() {
		return this.type;
	}
	public void setType(Long type) {
		this.type = type;
	}

	public String getUid() {
		return this.uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}

}
