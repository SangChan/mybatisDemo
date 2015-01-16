package demo.persistence;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import demo.domain.User;

public interface UserMapper {
	@Select("select *from user where id = #{userId}")
	public User getUser(long userId);
	@Insert("insert into user (email,userName) values(#{email},#{userName})")
	public int addUser(User user);
}
