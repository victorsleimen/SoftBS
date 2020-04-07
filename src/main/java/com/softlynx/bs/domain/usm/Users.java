package com.softlynx.bs.domain.usm;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

@Alias("users")
public class Users implements Serializable {

	private static final long serialVersionUID = 8191553950415969777L;
	private String username;
	private String password;
	private String authority;
	private int enabled;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	public int getEnabled() {
		return enabled;
	}

	public void setEnabled(int enabled) {
		this.enabled = enabled;
	}

}
