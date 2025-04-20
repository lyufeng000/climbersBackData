package com.lyufeng.controller;

import com.lyufeng.pojo.Member;
import com.lyufeng.pojo.Result;
import com.lyufeng.service.memberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class memberController {
	
	@Autowired
	private memberService memberService;
	
	//接受查询
	@GetMapping("/members")
	public Result findMembers(){
		List<Member> all = memberService.findAll();
		System.out.println("\033[01;34m");
		all.forEach(System.out::println);
		System.out.println("\033[0m");
		return Result.success(all);
	}
	
	@PutMapping("/members")
	public Result updateMember(Member member){
		memberService.updateMember(member);
		System.out.println("\033[01;33m");
		System.out.println(member);
		System.out.println("\033[0m");
		return Result.success();
	}
}
