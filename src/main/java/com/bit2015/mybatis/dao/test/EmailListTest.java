package com.bit2015.mybatis.dao.test;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmailListTest {
	
	public static void main(String[] args) {
		try {
			ApplicationContext factory = new ClassPathXmlApplicationContext( "applicationContext.xml" );
			System.out.println( "hello" );
			
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

}
