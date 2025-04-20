package com.lyufeng.service.impl;

import com.lyufeng.mapper.MemberMapper;
import com.lyufeng.pojo.Member;
import com.lyufeng.service.memberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class memberServiceImpl implements memberService {
	
	@Autowired
	private MemberMapper memberMapper;
	
	
	//查询所有用户
	@Override
	public List<Member> findAll() {
		return memberMapper.findAll();
	}
	
	@Override
	public void updateMember(Member member) {
		memberMapper.updateMember(member);
	}
	
	
}
