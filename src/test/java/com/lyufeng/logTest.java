package com.lyufeng;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class logTest {
	
	private static final Logger log =LoggerFactory.getLogger(logTest.class);
	
	@Test
	public void testLog() {
		// 1.获取日志对象
		// 2.打印日志
		log.debug("开始计算...");
		
		int sum = 0;
		
		for (int i = 0; i < 4000; i++) {
			sum += i;
		}
		
		
		log.info("计算结果:" + sum);
		log.debug("结束计算...");
	}
}
