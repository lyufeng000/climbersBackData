package com.lyufeng.service.impl;

import com.lyufeng.mapper.MemberMapper;
import com.lyufeng.pojo.Member;
import com.lyufeng.service.memberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class memberServiceImpl implements memberService {
	@Autowired
	private MemberMapper mapper;
	
	/*查--------------------------------------------------------------------------*/
	//查询所有用户
	@Override
	public List<Member> findAll() {
		return mapper.findAll();
	}
	
	/*改--------------------------------------------------------------------------*/
	@Override
	public void updateMember(Member newMember) {
		boolean flag = true;
		Member oldMember = mapper.findById(newMember.getId());
		//找出旧数据和新数据之间的不同
		if (!oldMember.getName().equals(newMember.getName())){
			mapper.updateName(newMember);
			log.info("姓名修改完成");
			flag = false;
		}
		if (!oldMember.getGender().equals(newMember.getGender())){
			mapper.updateGender(newMember);
			log.info("性别修改完成");
			flag = false;
		}
		if (!oldMember.getDept().equals(newMember.getDept())) {
			mapper.updateDept(newMember);
			log.info("部门修改完成");
			flag = false;
		}
		if (!oldMember.getOffice().equals(newMember.getOffice())) {
			mapper.updateOffice(newMember);
			log.info("职位修改完成");
			flag = false;
		}
		//首先邮箱和手机号时可以为空的
		//如果老数据为空且新数据也为空，跳过查询避免异常
		//如果老数据为空，新数据存在，进入
		//a
		//a
		/*if (oldMember.getEmail() != null && !oldMember.getEmail().equals(newMember.getEmail()) || newMember.getEmail() != null) {
			mapper.updateEmail(newMember);
			log.info("邮箱修改完成");
			flag = false;
		}*/
		if (newMember.getEmail() != null && newMember.equals(oldMember.getEmail())) {
			mapper.updateEmail(newMember);
			log.info("邮箱修改完成");
			flag = false;
		}
		if (oldMember.getPhone() != null && !oldMember.getPhone().equals(newMember.getPhone()) || newMember.getPhone() != null) {
			mapper.updatePhone(newMember);
			log.info("手机号码修改完成");
			flag = false;
		}
		
		
		if (oldMember.getHobby() != null && !oldMember.getHobby().equals(newMember.getHobby()) || newMember.getHobby() != null) {
			mapper.updateHobby(newMember);
			log.info("爱好修改完成");
			flag = false;
		}
		if (!oldMember.getStatus().equals(newMember.getStatus())) {
			mapper.updateStatus(newMember);
			log.info("状态修改完成");
			flag = false;
		}
		if (flag){
			log.info("没有数据修改");
		}
		
	}
	
	/*增--------------------------------------------------------------------------*/
	@Override
	public int addMember(Member member) {
		return mapper.addMember(member);
	}
	
	/*删--------------------------------------------------------------------------*/
	@Override
	public void deleteById(Integer id){
		if (mapper.deleteById(id) != 0){
			log.info("删除成功");
		}
	}
}
