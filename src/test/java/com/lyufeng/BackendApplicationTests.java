package com.lyufeng;

import com.lyufeng.mapper.MemberMapper;
import com.lyufeng.pojo.Member;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class BackendApplicationTests {
	
	@Autowired
	private MemberMapper mapper;
	
	@Test
	public void test(){
		List<Member> all = mapper.findAll();
		System.out.println(all);
	}
	
}
