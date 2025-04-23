package com.lyufeng.service;

import com.lyufeng.pojo.Member;

import java.util.List;

public interface memberService {
	public List<Member> findAll();
	
	public void updateMember(Member member);
	
	public int addMember(Member member);
	
	public void deleteById(Integer id);
}
