package com.test.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.test.entity.Member;

@Mapper
public interface BoardMapper {
	@Select("select userid, username, age from tbl_test order by userid")
															//user id 알파벳순으로 정리하라
	public List<Member> selectMemberList();
	
	@Insert("insert into tbl_test(userid,username,age) values ('${userid}','${username}','${age}')")
	public void insertMember(@Param("userid")String userid,
			@Param("username")String username,@Param("age")int age);
	
	@Update("update tbl_test set age = ${age} where userid = '${userid}'")
	//어떤 userid의 나이를 바꿔줘라
	public void updateMember(@Param("age") int age,@Param("userid")String userid);
	//androidcontroller에서 test2의 변경된 나이를 받아 리스트에 적어줌

//	@Update("update tbl_test set age = ${age}, username=${username} where userid = '${userid}'")
//	//어떤 userid의 나이를 바꿔줘라
//	public void updateMember(@Param("userid")String userid, @Param("age") int age);
//	//androidcontroller에서 test2의 변경된 나이를 받아 리스트에 적어줌
	
	

}
