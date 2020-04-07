package com.softlynx.bs.service.usm.impl;

import java.io.Serializable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.softlynx.bs.repository.usm.LoginRepository;
import com.softlynx.bs.service.usm.ILoginService;

@Service("loginService")
@Scope(value = "singleton", proxyMode = ScopedProxyMode.TARGET_CLASS)
@Transactional
public class LoginService implements ILoginService, Serializable {

	private static final long serialVersionUID = -5270248259010536608L;
	private static final Logger log = LoggerFactory.getLogger(LoginService.class);
	
	@Autowired
	private LoginRepository loginRepository;

	@Override
	public int ifUserExists(String username) throws Exception {
		
		log.debug("[UserService] - ifUserExists()........................");
		return loginRepository.ifUserExists(username);
	}

}
