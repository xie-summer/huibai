package com.app.bean;

// Generated 2016-3-26 0:38:12 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * TblActivityInfo generated by hbm2java
 */
@Entity
@Table(name = "tbl_activity_info", catalog = "shopdata")
public class TblActivityInfo implements java.io.Serializable {

	private Long id;
	private String actType;
	private String actName;
	private String actImg;
	private String actUrl;
	private Date instDt;
	private String instOper;
	private Date updateDt;
	private String updateOper;
	private String rev;

	public TblActivityInfo() {
	}

	public TblActivityInfo(String actType, String actName) {
		this.actType = actType;
		this.actName = actName;
	}

	public TblActivityInfo(String actType, String actName, String actImg,
			String actUrl, Date instDt, String instOper, Date updateDt,
			String updateOper, String rev) {
		this.actType = actType;
		this.actName = actName;
		this.actImg = actImg;
		this.actUrl = actUrl;
		this.instDt = instDt;
		this.instOper = instOper;
		this.updateDt = updateDt;
		this.updateOper = updateOper;
		this.rev = rev;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "act_type", nullable = false, length = 4)
	public String getActType() {
		return this.actType;
	}

	public void setActType(String actType) {
		this.actType = actType;
	}

	@Column(name = "act_name", nullable = false, length = 100)
	public String getActName() {
		return this.actName;
	}

	public void setActName(String actName) {
		this.actName = actName;
	}

	@Column(name = "act_img", length = 500)
	public String getActImg() {
		return this.actImg;
	}

	public void setActImg(String actImg) {
		this.actImg = actImg;
	}

	@Column(name = "act_url", length = 500)
	public String getActUrl() {
		return this.actUrl;
	}

	public void setActUrl(String actUrl) {
		this.actUrl = actUrl;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "inst_dt", length = 19)
	public Date getInstDt() {
		return this.instDt;
	}

	public void setInstDt(Date instDt) {
		this.instDt = instDt;
	}

	@Column(name = "inst_oper", length = 20)
	public String getInstOper() {
		return this.instOper;
	}

	public void setInstOper(String instOper) {
		this.instOper = instOper;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "update_dt", length = 19)
	public Date getUpdateDt() {
		return this.updateDt;
	}

	public void setUpdateDt(Date updateDt) {
		this.updateDt = updateDt;
	}

	@Column(name = "update_oper", length = 20)
	public String getUpdateOper() {
		return this.updateOper;
	}

	public void setUpdateOper(String updateOper) {
		this.updateOper = updateOper;
	}

	@Column(name = "rev", length = 100)
	public String getRev() {
		return this.rev;
	}

	public void setRev(String rev) {
		this.rev = rev;
	}

}