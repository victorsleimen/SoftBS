package com.softlynx.bs.mapper.security;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import com.softlynx.bs.domain.usm.Users;

@Mapper
@Component
public interface UserMapper {

	@Select("SELECT * FROM users WHERE enabled = 1 and username like concat('%',#{username},'%')")
	public abstract Users loadUserByUsername(@Param("username") String username);
}
