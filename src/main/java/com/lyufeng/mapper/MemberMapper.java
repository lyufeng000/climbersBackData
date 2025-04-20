package com.lyufeng.mapper;

import com.lyufeng.pojo.Member;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface MemberMapper {
	/*查------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
	//查询数据库中的成员数据
	@Select("SELECT * FROM member")
	public List<Member> findAll();
	
	//通过ID查询成员
	@Select("SELECT * FROM member WHERE id = #{id}")
	public Member findById(Integer id);
	
	//通过姓名查询成员
	@Select("SELECT * FROM member WHERE name = #{name}")
	public Member findByName(String name);
	
	/*增------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
	//新增成员
	@Insert("INSERT INTO member (name, gender, category, office, email, phone, hobby, status) VALUES (#{name},#{gender},#{category},#{office},#{email},#{phone},#{hobby},#{status})")
	public int addMember(Member member);
	
	/*改------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
	//修改原有成员
	/*---修改姓名---*/
	@Update("UPDATE member SET name = #{name} WHERE id = #{id}")
	public void updateName(Member newMember);
	
	/*---修改性别---*/
	@Update("UPDATE member SET gender = #{gender} WHERE id = #{id}")
	public void updateGender(Member newMember);
	
	/*---修改部门---*/
	@Update("UPDATE member SET category = #{category} WHERE id = #{id}")
	public void updateCategory(Member newMember);
	
	/*---修改职位---*/
	@Update("UPDATE member SET office = #{office} WHERE id = #{id}")
	public void updateOffice(Member newMember);
	
	/*---修改邮箱---*/
	@Update("UPDATE member SET email = #{email} WHERE id = #{id}")
	public void updateEmail(Member newMember);
	
	/*---修改手机号码---*/
	@Update("UPDATE member SET phone = #{phone} WHERE id = #{id}")
	public void updatePhone(Member newMember);
	
	/*---修改爱好---*/
	@Update("UPDATE member SET hobby = #{hobby} WHERE id = #{id}")
	public void updateHobby(Member newMember);
	
	/*---修改状态---*/
	@Update("UPDATE member SET status = #{status} WHERE id = #{id}")
	public void updateStatus(Member newMember);
}
