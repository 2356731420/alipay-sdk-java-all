package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 场馆入驻
 *
 * @author auto create
 * @since 1.0, 2021-04-23 17:29:45
 */
public class AlipayCommerceSportsVenueCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8741162512613417285L;

	/**
	 * 具体地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 区域code
	 */
	@ApiField("area_code")
	private String areaCode;

	/**
	 * 场馆是否可预定Y/N，不传默认可预定
	 */
	@ApiField("bookable")
	private String bookable;

	/**
	 * 城市code
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 场馆描述
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 纬度
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 经度
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 场馆名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 营业时间
开始时间 - 结束时间；
(注：全英文符号）
	 */
	@ApiField("opening_hours")
	private String openingHours;

	/**
	 * 服务商场馆ID
	 */
	@ApiField("out_venue_id")
	private String outVenueId;

	/**
	 * 联系电话，多个逗号隔开
	 */
	@ApiListField("phone")
	@ApiField("string")
	private List<String> phone;

	/**
	 * 场馆图片编码列表 最多5张，逗号隔开 图片要求参考场馆主图
	 */
	@ApiListField("picture_list")
	@ApiField("string")
	private List<String> pictureList;

	/**
	 * POI
	 */
	@ApiField("poi")
	private String poi;

	/**
	 * 场馆主图海报图片的Base64编码
（注：1.图片的格式必须是jpg的；2.图片大小不超过125KB；3.非Data URI格式，请直接填写原文件的base64编码）
	 */
	@ApiField("poster")
	private String poster;

	/**
	 * 场馆售卖产品类型集合，逗号隔开
calendar：价格日历
ticket：票券
course: 课程
	 */
	@ApiListField("product_type_list")
	@ApiField("string")
	private List<String> productTypeList;

	/**
	 * 省份code
	 */
	@ApiField("province_code")
	private String provinceCode;

	/**
	 * 子场馆列表
	 */
	@ApiListField("sub_venue_list")
	@ApiField("sub_venue_create_info")
	private List<SubVenueCreateInfo> subVenueList;

	/**
	 * 标签列表
	 */
	@ApiListField("tag_list")
	@ApiField("string")
	private List<String> tagList;

	/**
	 * 是否为“测试场馆”。如果上传的场馆为想要进行测试的非正式场馆，则填写“Y”。如上传正式场馆，则不传或填写为N
	 */
	@ApiField("test_venue")
	private String testVenue;

	/**
	 * 交通信息
	 */
	@ApiField("traffic")
	private String traffic;

	/**
	 * 场馆商户pid
	 */
	@ApiField("venue_pid")
	private String venuePid;

	/**
	 * 场馆类型，
01足球；02篮球；03乒乓球；04羽毛球；05台球；06射箭；07哒哒球；08游泳；09网球；10攀岩；11空手道；12跆拳道；14瑜伽；15搏击；16舞蹈；17艺术体操；18太极；19击剑；20水上运动；21滑雪；22健身；23轮滑；24排球；25门球；00其他运动
	 */
	@ApiListField("venue_type")
	@ApiField("string")
	private List<String> venueType;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getAreaCode() {
		return this.areaCode;
	}
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public String getBookable() {
		return this.bookable;
	}
	public void setBookable(String bookable) {
		this.bookable = bookable;
	}

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getLatitude() {
		return this.latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return this.longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getOpeningHours() {
		return this.openingHours;
	}
	public void setOpeningHours(String openingHours) {
		this.openingHours = openingHours;
	}

	public String getOutVenueId() {
		return this.outVenueId;
	}
	public void setOutVenueId(String outVenueId) {
		this.outVenueId = outVenueId;
	}

	public List<String> getPhone() {
		return this.phone;
	}
	public void setPhone(List<String> phone) {
		this.phone = phone;
	}

	public List<String> getPictureList() {
		return this.pictureList;
	}
	public void setPictureList(List<String> pictureList) {
		this.pictureList = pictureList;
	}

	public String getPoi() {
		return this.poi;
	}
	public void setPoi(String poi) {
		this.poi = poi;
	}

	public String getPoster() {
		return this.poster;
	}
	public void setPoster(String poster) {
		this.poster = poster;
	}

	public List<String> getProductTypeList() {
		return this.productTypeList;
	}
	public void setProductTypeList(List<String> productTypeList) {
		this.productTypeList = productTypeList;
	}

	public String getProvinceCode() {
		return this.provinceCode;
	}
	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

	public List<SubVenueCreateInfo> getSubVenueList() {
		return this.subVenueList;
	}
	public void setSubVenueList(List<SubVenueCreateInfo> subVenueList) {
		this.subVenueList = subVenueList;
	}

	public List<String> getTagList() {
		return this.tagList;
	}
	public void setTagList(List<String> tagList) {
		this.tagList = tagList;
	}

	public String getTestVenue() {
		return this.testVenue;
	}
	public void setTestVenue(String testVenue) {
		this.testVenue = testVenue;
	}

	public String getTraffic() {
		return this.traffic;
	}
	public void setTraffic(String traffic) {
		this.traffic = traffic;
	}

	public String getVenuePid() {
		return this.venuePid;
	}
	public void setVenuePid(String venuePid) {
		this.venuePid = venuePid;
	}

	public List<String> getVenueType() {
		return this.venueType;
	}
	public void setVenueType(List<String> venueType) {
		this.venueType = venueType;
	}

}
