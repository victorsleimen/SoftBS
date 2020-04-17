package com.softlynx.bs.repository.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.softlynx.bs.mapper.security.UserMapper;

@Repository
public class UserRepository {

	@Autowired
	private UserMapper userMapper;
	
//	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
//		return userMapper.loadUserByUsername(username);
//	};
	
}
