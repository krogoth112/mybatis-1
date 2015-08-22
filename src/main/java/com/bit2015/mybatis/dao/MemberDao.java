package com.bit2015.mybatis.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bit2015.mybatis.vo.MemberVo;

@Repository
public class MemberDao {
	
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;

	public MemberVo get( MemberVo vo ) {
		MemberVo memberVo = ( MemberVo ) sqlSessionTemplate.selectOne( "member.getMember", vo );
		return memberVo;
	}
	
}
