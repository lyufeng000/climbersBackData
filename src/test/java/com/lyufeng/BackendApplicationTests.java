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
	
	@Test
	public void addTest(){
		Member member = new Member(12,"万瑞阳","男","成员","电控开发","???","???????????","???",true);
		int i = mapper.addMember(member);
		System.out.println("添加成功，影响行数:" + i);
	}
	
}
