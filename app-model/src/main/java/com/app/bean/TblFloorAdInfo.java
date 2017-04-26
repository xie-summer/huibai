package com.app.bean;
// Generated 2016-12-24 17:29:07 by Hibernate Tools 3.5.0.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TblFloorAdInfo generated by hbm2java
 */
@Entity
@Table(name = "tbl_floor_ad_info", catalog = "shopdata")
public class TblFloorAdInfo implements java.io.Serializable {

	private String FAdId;
	private String FType;
	private String FId;
	private String adType;
	private String title;
	private String resId;
	private String url;
	private String status;
	private String remarks;
	private String instoper;
	private String instdt;
	private String midfoper;
	private String midfdt;
	private String rev;

	public TblFloorAdInfo() {
	}

	public TblFloorAdInfo(String FAdId, String FId) {
		this.FAdId = FAdId;
		this.FId = FId;
	}

	public TblFloorAdInfo(String FAdId, String FType, String FId, String adType, String title, String resId, String url,
			String status, String remarks, String instoper, String instdt, String midfoper, String midfdt, String rev) {
		this.FAdId = FAdId;
		this.FType = FType;
		this.FId = FId;
		this.adType = adType;
		this.title = title;
		this.resId = resId;
		this.url = url;
		this.status = status;
		this.remarks = remarks;
		this.instoper = instoper;
		this.instdt = instdt;
		this.midfoper = midfoper;
		this.midfdt = midfdt;
		this.rev = rev;
	}

	@Id

	@Column(name = "f_ad_id", unique = true, nullable = false, length = 32)
	public String getFAdId() {
		return this.FAdId;
	}

	public void setFAdId(String FAdId) {
		this.FAdId = FAdId;
	}

	@Column(name = "f_type", length = 4)
	public String getFType() {
		return this.FType;
	}

	public void setFType(String FType) {
		this.FType = FType;
	}

	@Column(name = "f_id", nullable = false, length = 6)
	public String getFId() {
		return this.FId;
	}

	public void setFId(String FId) {
		this.FId = FId;
	}

	@Column(name = "ad_type", length = 2)
	public String getAdType() {
		return this.adType;
	}

	public void setAdType(String adType) {
		this.adType = adType;
	}

	@Column(name = "title", length = 30)
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name = "res_id", length = 32)
	public String getResId() {
		return this.resId;
	}

	public void setResId(String resId) {
		this.resId = resId;
	}

	@Column(name = "url", length = 200)
	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Column(name = "status", length = 1)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "remarks", length = 50)
	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	@Column(name = "instoper", length = 30)
	public String getInstoper() {
		return this.instoper;
	}

	public void setInstoper(String instoper) {
		this.instoper = instoper;
	}

	@Column(name = "instdt", length = 14)
	public String getInstdt() {
		return this.instdt;
	}

	public void setInstdt(String instdt) {
		this.instdt = instdt;
	}

	@Column(name = "midfoper", length = 30)
	public String getMidfoper() {
		return this.midfoper;
	}

	public void setMidfoper(String midfoper) {
		this.midfoper = midfoper;
	}

	@Column(name = "midfdt", length = 14)
	public String getMidfdt() {
		return this.midfdt;
	}

	public void setMidfdt(String midfdt) {
		this.midfdt = midfdt;
	}

	@Column(name = "rev", length = 100)
	public String getRev() {
		return this.rev;
	}

	public void setRev(String rev) {
		this.rev = rev;
	}

}