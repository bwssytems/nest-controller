package com.bwssystems.nest.protocol.auth;

public class SessionAuthorization {
	private String user;
	private String access_token;
	private String expires_in;
	private String language;
	private String email;
	private Boolean is_superuser;
	private Boolean is_staff;
	private Urls urls;
	private Limits limits;
	private Weave weave;	
	private String userid;
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getAccess_token() {
		return access_token;
	}
	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}
	public String getExpires_in() {
		return expires_in;
	}
	public void setExpires_in(String expires_in) {
		this.expires_in = expires_in;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Boolean getIs_superuser() {
		return is_superuser;
	}
	public void setIs_superuser(Boolean is_superuser) {
		this.is_superuser = is_superuser;
	}
	public Boolean getIs_staff() {
		return is_staff;
	}
	public void setIs_staff(Boolean is_staff) {
		this.is_staff = is_staff;
	}
	public Urls getUrls() {
		return urls;
	}
	public void setUrls(Urls urls) {
		this.urls = urls;
	}
	public Limits getLimits() {
		return limits;
	}
	public void setLimits(Limits limits) {
		this.limits = limits;
	}
	public Weave getWeave() {
		return weave;
	}
	public void setWeave(Weave weave) {
		this.weave = weave;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
}
