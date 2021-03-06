package com.lakala.demo.beans.generated;

import com.lakala.demo.util.ReflectUtil;

public class User {
	/**
	 * This field was generated by Apache iBATIS ibator.
	 * This field corresponds to the database column ss_user.id
	 * 
	 * @ibatorgenerated Fri Nov 01 13:36:37 CST 2013
	 */
	private Integer id;

	/**
	 * This field was generated by Apache iBATIS ibator.
	 * This field corresponds to the database column ss_user.login_name
	 * 
	 * @ibatorgenerated Fri Nov 01 13:36:37 CST 2013
	 */
	private String loginName;

	/**
	 * This field was generated by Apache iBATIS ibator.
	 * This field corresponds to the database column ss_user.name
	 * 
	 * @ibatorgenerated Fri Nov 01 13:36:37 CST 2013
	 */
	private String name;

	/**
	 * This field was generated by Apache iBATIS ibator.
	 * This field corresponds to the database column ss_user.password
	 * 
	 * @ibatorgenerated Fri Nov 01 13:36:37 CST 2013
	 */
	private String password;

	/**
	 * This field was generated by Apache iBATIS ibator.
	 * This field corresponds to the database column ss_user.salt
	 * 
	 * @ibatorgenerated Fri Nov 01 13:36:37 CST 2013
	 */
	private String salt;

	/**
	 * This field was generated by Apache iBATIS ibator.
	 * This field corresponds to the database column ss_user.email
	 * 
	 * @ibatorgenerated Fri Nov 01 13:36:37 CST 2013
	 */
	private String email;

	/**
	 * This field was generated by Apache iBATIS ibator.
	 * This field corresponds to the database column ss_user.status
	 * 
	 * @ibatorgenerated Fri Nov 01 13:36:37 CST 2013
	 */
	private String status;

	/**
	 * This field was generated by Apache iBATIS ibator.
	 * This field corresponds to the database column ss_user.team_id
	 * 
	 * @ibatorgenerated Fri Nov 01 13:36:37 CST 2013
	 */
	private Long teamId;

	/**
	 * This method was generated by Apache iBATIS ibator.
	 * This method returns the value of the database column ss_user.id
	 * 
	 * @return the value of ss_user.id
	 * 
	 * @ibatorgenerated Fri Nov 01 13:36:37 CST 2013
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by Apache iBATIS ibator.
	 * This method sets the value of the database column ss_user.id
	 * 
	 * @param id
	 *            the value for ss_user.id
	 * 
	 * @ibatorgenerated Fri Nov 01 13:36:37 CST 2013
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by Apache iBATIS ibator.
	 * This method returns the value of the database column ss_user.login_name
	 * 
	 * @return the value of ss_user.login_name
	 * 
	 * @ibatorgenerated Fri Nov 01 13:36:37 CST 2013
	 */
	public String getLoginName() {
		return loginName;
	}

	/**
	 * This method was generated by Apache iBATIS ibator.
	 * This method sets the value of the database column ss_user.login_name
	 * 
	 * @param loginName
	 *            the value for ss_user.login_name
	 * 
	 * @ibatorgenerated Fri Nov 01 13:36:37 CST 2013
	 */
	public void setLoginName(String loginName) {
		this.loginName = loginName == null ? null : loginName.trim();
	}

	/**
	 * This method was generated by Apache iBATIS ibator.
	 * This method returns the value of the database column ss_user.name
	 * 
	 * @return the value of ss_user.name
	 * 
	 * @ibatorgenerated Fri Nov 01 13:36:37 CST 2013
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method was generated by Apache iBATIS ibator.
	 * This method sets the value of the database column ss_user.name
	 * 
	 * @param name
	 *            the value for ss_user.name
	 * 
	 * @ibatorgenerated Fri Nov 01 13:36:37 CST 2013
	 */
	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	/**
	 * This method was generated by Apache iBATIS ibator.
	 * This method returns the value of the database column ss_user.password
	 * 
	 * @return the value of ss_user.password
	 * 
	 * @ibatorgenerated Fri Nov 01 13:36:37 CST 2013
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * This method was generated by Apache iBATIS ibator.
	 * This method sets the value of the database column ss_user.password
	 * 
	 * @param password
	 *            the value for ss_user.password
	 * 
	 * @ibatorgenerated Fri Nov 01 13:36:37 CST 2013
	 */
	public void setPassword(String password) {
		this.password = password == null ? null : password.trim();
	}

	/**
	 * This method was generated by Apache iBATIS ibator.
	 * This method returns the value of the database column ss_user.salt
	 * 
	 * @return the value of ss_user.salt
	 * 
	 * @ibatorgenerated Fri Nov 01 13:36:37 CST 2013
	 */
	public String getSalt() {
		return salt;
	}

	/**
	 * This method was generated by Apache iBATIS ibator.
	 * This method sets the value of the database column ss_user.salt
	 * 
	 * @param salt
	 *            the value for ss_user.salt
	 * 
	 * @ibatorgenerated Fri Nov 01 13:36:37 CST 2013
	 */
	public void setSalt(String salt) {
		this.salt = salt == null ? null : salt.trim();
	}

	/**
	 * This method was generated by Apache iBATIS ibator.
	 * This method returns the value of the database column ss_user.email
	 * 
	 * @return the value of ss_user.email
	 * 
	 * @ibatorgenerated Fri Nov 01 13:36:37 CST 2013
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * This method was generated by Apache iBATIS ibator.
	 * This method sets the value of the database column ss_user.email
	 * 
	 * @param email
	 *            the value for ss_user.email
	 * 
	 * @ibatorgenerated Fri Nov 01 13:36:37 CST 2013
	 */
	public void setEmail(String email) {
		this.email = email == null ? null : email.trim();
	}

	/**
	 * This method was generated by Apache iBATIS ibator.
	 * This method returns the value of the database column ss_user.status
	 * 
	 * @return the value of ss_user.status
	 * 
	 * @ibatorgenerated Fri Nov 01 13:36:37 CST 2013
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * This method was generated by Apache iBATIS ibator.
	 * This method sets the value of the database column ss_user.status
	 * 
	 * @param status
	 *            the value for ss_user.status
	 * 
	 * @ibatorgenerated Fri Nov 01 13:36:37 CST 2013
	 */
	public void setStatus(String status) {
		this.status = status == null ? null : status.trim();
	}

	/**
	 * This method was generated by Apache iBATIS ibator.
	 * This method returns the value of the database column ss_user.team_id
	 * 
	 * @return the value of ss_user.team_id
	 * 
	 * @ibatorgenerated Fri Nov 01 13:36:37 CST 2013
	 */
	public Long getTeamId() {
		return teamId;
	}

	/**
	 * This method was generated by Apache iBATIS ibator.
	 * This method sets the value of the database column ss_user.team_id
	 * 
	 * @param teamId
	 *            the value for ss_user.team_id
	 * 
	 * @ibatorgenerated Fri Nov 01 13:36:37 CST 2013
	 */
	public void setTeamId(Long teamId) {
		this.teamId = teamId;
	}

	@Override
	public String toString() {
		return ReflectUtil.fieldsToString(this);
	}

}