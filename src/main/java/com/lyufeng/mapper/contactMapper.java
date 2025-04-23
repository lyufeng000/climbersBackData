package com.lyufeng.mapper;

import com.lyufeng.pojo.Contact;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface contactMapper {
	@Select("SELECT * FROM contact")
	public List<Contact> findAll();
}
