package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AmpeDeviceVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.ampe.device.query response.
 * 
 * @author auto create
 * @since 1.0, 2020-07-14 10:50:17
 */
public class AlipayOpenMiniAmpeDeviceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1436321595775825464L;

	/** 
	 * 设备列表
	 */
	@ApiListField("device_list")
	@ApiField("ampe_device_v_o")
	private List<AmpeDeviceVO> deviceList;

	/** 
	 * 总条数
	 */
	@ApiField("total_count")
	private Long totalCount;

	public void setDeviceList(List<AmpeDeviceVO> deviceList) {
		this.deviceList = deviceList;
	}
	public List<AmpeDeviceVO> getDeviceList( ) {
		return this.deviceList;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

}
