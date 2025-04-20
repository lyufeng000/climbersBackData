package com.lyufeng.controller;

import com.lyufeng.pojo.Member;
import com.lyufeng.pojo.Result;
import com.lyufeng.service.memberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class memberController {
	
	@Autowired
	private memberService memberService;
	
	//接收查询
	@GetMapping("/members")
	public Result findMembers(){
		List<Member> all = memberService.findAll();
		System.out.println("\033[01;34m");
		all.forEach(System.out::println);
		System.out.println("\033[0m");
		return Result.success(all);
	}
	
	//接收修改 ?
	@PutMapping("/members")
	public Result updateMember(Member member){
		memberService.updateMember(member);
		System.out.println("\033[01;33m");
		System.out.println(member);
		System.out.println("\033[0m");
		return Result.success();
	}
	
	//接收删除
	@DeleteMapping("/members")
	public Result deleteMember(Integer id){
		
		return Result.success();
	}
	
	//接收新增
	@PostMapping("/members")
	public Result addMember(Member member){
		int i = memberService.addMember(member);
		System.out.println("\033[01;32m");
		System.out.println("添加成功，影响行数:" + i);
		System.out.println("\033[0m");
		return Result.success();
	}
}
