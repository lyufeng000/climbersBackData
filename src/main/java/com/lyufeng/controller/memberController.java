package com.lyufeng.controller;

import com.lyufeng.pojo.Member;
import com.lyufeng.pojo.Result;
import com.lyufeng.service.memberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
public class memberController {
	
	@Autowired
	private memberService memberService;
	
	//接收GET请求，查询所有成员
	@GetMapping("/members")
	public Result findMembers() {
		List<Member> members = memberService.findAll();
		log.info("\033[01;34m接收到查询操作\033[0m");
		log.info(Result.success(members).toString());
		return Result.success(members);
	}
	
	//接收PUT请求，修改成员
	@PutMapping("/members")
	public Result updateMember(@RequestBody Member member) {
		memberService.updateMember(member);
		log.info("接收到修改请求，请求方法\033[01;33mPut\033[0m: {}", member.getName());
		return Result.success();
	}
	
	//接收DELETE请求，删除成员
	@DeleteMapping("/members/{id}")
	public Result deleteMember(@PathVariable Integer id) {
		memberService.deleteById(id);
		log.info("接收到删除请求，请求方法\033[01;33mDelete，被删除的id为: \033[01;33m{}\033[0m", id);
		return Result.success();
	}
	
	//接收POST请求，向数据库添加成员
	@PostMapping("/members")
	public Result addMember(@RequestBody Member member) {
		log.info("接收到对象，请求方法\033[01;33mPost\033[0m\n\033[01[34m{}\033[0m", member.toString());
		int i = memberService.addMember(member);
		log.info("添加成功，影响行数:{}", i);
		return Result.success();
	}
}
