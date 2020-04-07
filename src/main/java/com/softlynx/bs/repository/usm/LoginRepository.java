package com.softlynx.bs.repository.usm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.softlynx.bs.mapper.usm.LoginMapper;

@Repository
public class LoginRepository {

	@Autowired
	private LoginMapper loginMapper;

	public int ifUserExists(String username) {
		return loginMapper.ifUserExists(username);
	}

}
