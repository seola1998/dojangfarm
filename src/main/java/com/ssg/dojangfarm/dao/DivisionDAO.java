package com.ssg.dojangfarm.dao;

import java.util.List;

import comssg.dojangfarm.domain.Division;

public interface DivisionDAO extends NormalDAO{
	//추가, 수정, 리스트, user별 리스트
	//Division() throws dataAcception;
	int insertSale(Division division);// throws dataAcception;
	int updateSale(Division division);// throws dataAcception;
	Division getDivisionSale(int saleNo);// throws dataAcception
	List<Division> getAllDivisionList();// throws dataAcception;
	List<Division> getDivisionListByUserNo(int userNo);// throws dataAcception;
	List<Division> searchDivision(String title);// throws dataAcception;
}
