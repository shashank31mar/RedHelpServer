package org.redhelp.model;

import java.util.Date;

public class UserAccountModel {

    private Long u_id;
    private String email;
    private String name;
    private String passwordEncrypted;
    private String phoneNo;
    private byte[] user_image;
    private Date registerDate;
    private Date lastUpdatedDate;

    public Long getU_id() {
	return u_id;
    }

    public void setU_id(Long u_id) {
	this.u_id = u_id;
    }

    public String getEmail() {
	return email;
    }

    public void setEmail(String email) {
	this.email = email;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getPasswordEncrypted() {
	return passwordEncrypted;
    }

    public void setPasswordEncrypted(String passwordEncrypted) {
	this.passwordEncrypted = passwordEncrypted;
    }

    public String getPhoneNo() {
	return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
	this.phoneNo = phoneNo;
    }

    public Date getRegisterDate() {
	return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
	this.registerDate = registerDate;
    }

    public Date getLastUpdatedDate() {
	return lastUpdatedDate;
    }

    public void setLastUpdatedDate(Date lastUpdatedDate) {
	this.lastUpdatedDate = lastUpdatedDate;
    }

    public byte[] getUser_image() {
	return user_image;
    }

    public void setUser_image(byte[] user_image) {
	this.user_image = user_image;
    }

    @Override
    public String toString() {
	return "UserAccountModel [u_id=" + u_id + ", email=" + email + ", name=" + name + ", passwordEncrypted="
	        + passwordEncrypted + ", phoneNo=" + phoneNo + ", registerDate=" + registerDate + "]";
    }

}
