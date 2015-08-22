package com.bit2015.mybatis;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bit2015.mybatis.dao.EmailListDao;
import com.bit2015.mybatis.vo.EmailListVo;

import static org.junit.Assert.*;

public class EmailListTest2 {
	
	private ApplicationContext factory;
	
	@Before
	public void setup() {
		factory = 
			new ClassPathXmlApplicationContext( "applicationContext.xml" );
	}
	
	@Test
	public void testGetList1() {
		EmailListDao dao =  
				( EmailListDao ) factory.getBean( "emailListDao" );

		List<EmailListVo> list = dao.getList();
		assertNotNull("조회결과 null", list);
	}
	
	@Test
	public void testGetList2() {
		EmailListDao dao =  
				( EmailListDao ) factory.getBean( "emailListDao" );

		List<EmailListVo> list = dao.getList();
		assertTrue( list.size() > 0 ); 
	}
	
	@Test
	public void testGetList3() {
		EmailListDao dao =  
				( EmailListDao ) factory.getBean( "emailListDao" );

		List<EmailListVo> list = dao.getList();
		assertEquals(3, list.size()); 
	}	
}
