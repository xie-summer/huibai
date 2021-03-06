package com.app.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.GenericGenerator;

/**
 * TblUserInfo generated by hbm2java
 */
@Entity
@Table(name = "TBL_USER_INFO", catalog = "shopdata")
public class TblUserInfo implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	
	private String id;
	private String username;
	private String userTel;
	private String userEmail;
	private String password;
	private String regDt;
	private String portrait;
	private Integer pwdErrorNum;
	private String updDt;
	private String nickName;
	
	/*非数据库字段*/
	private String repassword;// 确认密码

	public TblUserInfo() {
	}

	public TblUserInfo(String id) {
		this.id = id;
	}

	public TblUserInfo(String id, String username, String userTel,
			String userEmail, String password, String regDt, String portrait,
			Integer pwdErrorNum, String updDt, String nickName) {
		this.id = id;
		this.username = username;
		this.userTel = userTel;
		this.userEmail = userEmail;
		this.password = password;
		this.regDt = regDt;
		this.portrait = portrait;
		this.pwdErrorNum = pwdErrorNum;
		this.updDt = updDt;
		this.nickName = nickName;
	}

	@Id
//	@GenericGenerator(name="systemUUID",strategy="uuid")
//	@GeneratedValue(generator="systemUUID")
	@Column(name = "id", unique = true, nullable = false, length = 32)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "username", length = 20)
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "userTel", length = 20)
	public String getUserTel() {
		return this.userTel;
	}

	public void setUserTel(String userTel) {
		this.userTel = userTel;
	}

	@Column(name = "userEmail", length = 60)
	public String getUserEmail() {
		return this.userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	@Column(name = "password", length = 100)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "regDt", length = 14)
	public String getRegDt() {
		return this.regDt;
	}

	public void setRegDt(String regDt) {
		this.regDt = regDt;
	}

	@Column(name = "portrait")
	public String getPortrait() {
		return this.portrait;
	}

	public void setPortrait(String portrait) {
		this.portrait = portrait;
	}

	@Column(name = "pwdErrorNum")
	public Integer getPwdErrorNum() {
		return this.pwdErrorNum;
	}

	public void setPwdErrorNum(Integer pwdErrorNum) {
		this.pwdErrorNum = pwdErrorNum;
	}

	@Column(name = "updDt", length = 14)
	public String getUpdDt() {
		return this.updDt;
	}

	public void setUpdDt(String updDt) {
		this.updDt = updDt;
	}

	@Column(name = "nickName", length = 60)
	public String getNickName() {
		return this.nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	
	@Transient
	public String getRepassword() {
		return repassword;
	}

	public void setRepassword(String repassword) {
		this.repassword = repassword;
	}
}
