package com.lyufeng.mapper;

import com.lyufeng.pojo.Member;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface MemberMapper {
	//查询数据库中的成员数据
	@Select("SELECT * FROM member")
	public List<Member> findAll();
	
	@Update("UPDATE member SET name=#{name}, gender=#{gender}, category=#{category}, office=#{office}, phone=#{phone}, email=#{email}, hobby=#{hobby}, status=#{status} WHERE id=#{id}")
	public void updateMember(Member member);
}
