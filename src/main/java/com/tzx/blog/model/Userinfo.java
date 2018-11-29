package com.tzx.blog.model;

import lombok.Data;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

/**
 * 用户实体
 * 
 */
@Data
@Entity
@NamedQuery(name = "Userinfo.findAll", query = "SELECT u FROM Userinfo u")
public class Userinfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "user_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;
	/**
	 * 账号
	 */
	@Column(name = "user_account")
	private String userAccount;
	/**
	 * 邮箱
	 */
	@Column(name = "user_email")
	private String userEmail;
	/**
	 * 用户名
	 */
	@Column(name = "user_name")
	private String userName;
	/**
	 * 密码
	 */
	@Column(name = "user_password")
	private String userPassword;
	/**
	 * 手机号
	 */
	@Column(name = "user_phone")
	private String userPhone;
}