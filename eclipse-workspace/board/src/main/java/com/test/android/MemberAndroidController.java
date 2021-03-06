package com.test.android;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.test.entity.Member;
import com.test.mapper.BoardMapper;

@RestController
public class MemberAndroidController {
	
	@Autowired
	BoardMapper mapper;
	//의존성 주입(DI : Dependency Injection)
	
	@GetMapping("/android/memberList")
	List<Member>getMemberList(){
		
		return mapper.selectMemberList();
	}
	@GetMapping("/android/updateAge/{age}")
	void getUpdateAge(@PathVariable("age") int age) {
		//웹 url상에서 /android/updateAge/23을 적으면 23을 받아와서 int age라는 변수에 넣는다
		String userid = "테스트1";
		mapper.updateMember(age, userid);
	
//	@GetMapping("/android/updateAge/{username}/{age}")
//	void getUpdateAge(@PathVariable("username")String username, @PathVariable("age") int age) {
//		//웹 url상에서 /android/updateAge/23을 적으면 23을 받아와서 int age라는 변수에 넣는다
//		String useridString = "zzz";
//		mapper.updateMember(username, age);
		
		//return "redirect:/android/memberList";
		
	}
	
	
	

}
