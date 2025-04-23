package com.lyufeng.controller;

import com.lyufeng.pojo.Contact;
import com.lyufeng.pojo.Result;
import com.lyufeng.service.contactService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
public class contactController {
	
	@Autowired
	private contactService service;
	
	
	@GetMapping("/contacts")
	public Result contact(){
		log.info("\033[01;33m收到请求:GET\033[0m");
		log.info("\033[01;34m开始处理...\033[0m");
		List<Contact> contacts = service.contactWho();
		log.info("查询完成");
		return Result.success(contacts);
	}
}
