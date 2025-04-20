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
	private MemberMapper mapper;
	
	
	//查询所有用户
	@Override
	public List<Member> findAll() {
		return mapper.findAll();
	}
	
	@Override
	public void updateMember(Member newMember) {
		boolean flag = true;
		Member oldMember = mapper.findById(newMember.getId());
		//找出旧数据和新数据之间的不同
		if (!oldMember.getName().equals(newMember.getName())){
			mapper.updateName(newMember);
			System.out.println("姓名修改完成");
			flag = false;
		}
		if (!oldMember.getGender().equals(newMember.getGender())){
			mapper.updateGender(newMember);
			System.out.println("性别修改完成");
			flag = false;
		}
		if (!oldMember.getCategory().equals(newMember.getCategory())) {
			mapper.updateCategory(newMember);
			System.out.println("部门修改完成");
			flag = false;
		}
		if (!oldMember.getOffice().equals(newMember.getOffice())) {
			mapper.updateOffice(newMember);
			System.out.println("职位修改完成");
			flag = false;
		}
		if (!oldMember.getEmail().equals(newMember.getEmail())) {
			mapper.updateEmail(newMember);
			System.out.println("邮箱修改完成");
			flag = false;
		}
		if (!oldMember.getPhone().equals(newMember.getPhone())) {
			mapper.updatePhone(newMember);
			System.out.println("手机号码修改完成");
			flag = false;
		}
		if (!oldMember.getHobby().equals(newMember.getHobby())) {
			mapper.updateHobby(newMember);
			System.out.println("爱好修改完成");
			flag = false;
		}
		if (!oldMember.getStatus().equals(newMember.getStatus())) {
			mapper.updateStatus(newMember);
			System.out.println("状态修改完成");
			flag = false;
		}
		if (flag){
			System.out.println("\033[01;33m没有任何修改\033[0m");
		}
		
	}
	
	@Override
	public int addMember(Member member) {
		return mapper.addMember(member);
	}
	
	
}
