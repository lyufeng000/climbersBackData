package com.lyufeng.service.impl;

import com.lyufeng.mapper.contactMapper;
import com.lyufeng.pojo.Contact;
import com.lyufeng.service.contactService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class contactServiceImpl implements contactService {
	
	@Autowired
	private contactMapper mapper;
	
	@Override
	public List<Contact> contactWho() {
		return mapper.findAll();
	}
}
