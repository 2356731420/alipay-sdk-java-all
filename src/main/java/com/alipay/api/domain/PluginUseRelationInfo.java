package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 插件使用关系
 *
 * @author auto create
 * @since 1.0, 2021-05-08 12:03:28
 */
public class PluginUseRelationInfo extends AlipayObject {

	private static final long serialVersionUID = 4265973143763181462L;

	/**
	 * 激活时间
	 */
	@ApiField("gmt_active")
	private Date gmtActive;

	/**
	 * 订购时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 插件失效时间
	 */
	@ApiField("gmt_invalid")
	private Date gmtInvalid;

	/**
	 * 应用ID
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 插件构建版本
	 */
	@ApiField("plugin_deploy_version")
	private String pluginDeployVersion;

	/**
	 * 插件ID
	 */
	@ApiField("plugin_id")
	private String pluginId;

	/**
	 * 插件状态，取值包括EXECUTING/WAIT_WORKING/WORKING/STOP_WORKING/WAIT_BUY
	 */
	@ApiField("plugin_status")
	private String pluginStatus;

	/**
	 * 插件版本
	 */
	@ApiField("plugin_version")
	private String pluginVersion;

	/**
	 * 插件运行状态，取值包括ONLINE/TRIAL/REVIEW/DEBUG
	 */
	@ApiField("run_mode_type")
	private String runModeType;

	/**
	 * 渠道来源，取值包括SHOP_MINI/PLUGIN_DEBUG/PLUGIN_TRIAL/PLUGIN_AUDIT/GENERAL_SHOP_ID
	 */
	@ApiField("source_from")
	private String sourceFrom;

	public Date getGmtActive() {
		return this.gmtActive;
	}
	public void setGmtActive(Date gmtActive) {
		this.gmtActive = gmtActive;
	}

	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Date getGmtInvalid() {
		return this.gmtInvalid;
	}
	public void setGmtInvalid(Date gmtInvalid) {
		this.gmtInvalid = gmtInvalid;
	}

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

	public String getPluginDeployVersion() {
		return this.pluginDeployVersion;
	}
	public void setPluginDeployVersion(String pluginDeployVersion) {
		this.pluginDeployVersion = pluginDeployVersion;
	}

	public String getPluginId() {
		return this.pluginId;
	}
	public void setPluginId(String pluginId) {
		this.pluginId = pluginId;
	}

	public String getPluginStatus() {
		return this.pluginStatus;
	}
	public void setPluginStatus(String pluginStatus) {
		this.pluginStatus = pluginStatus;
	}

	public String getPluginVersion() {
		return this.pluginVersion;
	}
	public void setPluginVersion(String pluginVersion) {
		this.pluginVersion = pluginVersion;
	}

	public String getRunModeType() {
		return this.runModeType;
	}
	public void setRunModeType(String runModeType) {
		this.runModeType = runModeType;
	}

	public String getSourceFrom() {
		return this.sourceFrom;
	}
	public void setSourceFrom(String sourceFrom) {
		this.sourceFrom = sourceFrom;
	}

}
