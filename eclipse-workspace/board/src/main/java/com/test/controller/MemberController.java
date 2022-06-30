package com.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.test.entity.Member;
import com.test.mapper.BoardMapper;

@Controller
public class MemberController {
	
	@Autowired
	BoardMapper mapper;
	//의존성 주입
	//=	public MemberController(BoardMapper mapper) {
	//this.mapper = mapper;
	//매개변수 형태로 클래스에 쓰는것
	
	@GetMapping("/member/memberList")
	public void listMember(Model model) {
		model.addAttribute("list", mapper.selectMemberList());
	}
	@GetMapping("/member/memberRegistry")
	public void getMemberRegistry() {}
	
	@GetMapping("/member/memberRegistry1")
	public String postMemberRegistry(Member member){
		mapper.insertMember(member.getUserid(), member.getUsername(), member.getAge());
		
		return "redirect:/member/memberList";
	}
	
	
	
	
}
