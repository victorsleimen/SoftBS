package com.softlynx.bs.mapper.usm;

import java.util.List;
import java.util.Optional;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;

import com.softlynx.bs.domain.usm.Users;

@Mapper
@Component
public interface LoginMapper {

	@Select("select * from users")
	public abstract List<Users> getAllUsers();

	@Select("SELECT count(*) FROM users WHERE enabled = 1 and username like concat('%',#{username},'%')")
	public abstract int ifUserExists(@Param("username") String username);
	
	@Insert("INSERT INTO users (username, password, authority, enabled) VALUES (#{username}, #{password}, #{authority}, #{enabled})")
    //@Options(useGeneratedKeys = true, keyColumn = "id", keyProperty = "id")
	public abstract void insertUser(Users users);
	
	@Update("update users set username=#{username}, password=#{password} where username like concat('%',#{username},'%')")
	public abstract void updateByUserName(String username);

	@Delete("delete from users where username like concat('%',#{username},'%')")
	public abstract void deleteByUsername(String username);

	@Select("SELECT count(*) FROM users WHERE enabled = 1 and username like concat('%',#{username},'%')")
	public abstract Optional<Users> getUserByName(String username);
	
	/*
	 * If you need to separate and write your queries in UserMapper.XML
	 * the below code should be in your UserMapper.java, and your related XML file should be located in the same folder (path)
	 * add the following line to your application.properties file: mybatis.mapper-locations=classpath:mapper/*.xml
	 */
	/*
	List<Users> getAllUser();
	Integer addUser(Users user);
	Integer updateByUsername(Users user);
	Integer deleteByUsername(String username);
	*/
}
