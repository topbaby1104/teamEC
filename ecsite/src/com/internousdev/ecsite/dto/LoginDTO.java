package com.internousdev.ecsite.dto;
public class LoginDTO {
	private String loginId;
	private String userName;
	private String loginPassword;
	private Boolean loginFlg;

	public String getLoginId(){
		return loginId;
	}
	public void setLoginId(String loginId){
		this.loginId = loginId;
	}
	public String getUserName(){
		return userName;
	}
	public void setUserName(String userName){
		this.userName=userName;
	}
	public String getLoginPassword(){
		return loginPassword;
	}
	public void setLoginPassword(String loginPassword){
		this.loginPassword = loginPassword;
	}

	public boolean getLoginFlg(){
		return loginFlg;
	}
	public void setLoginFlg(boolean loginFlg){
		this.loginFlg = loginFlg;
	}



}