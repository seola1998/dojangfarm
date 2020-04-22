package com.ssg.donjangfarm.Normal;

import java.util.List;

import comssg.dojangfarm.domain.Division;

public interface DivisionDAO extends NormalDAO{
	//추가, 수정, 리스트, user별 리스트
	//Division() throws dataAcception;
	void insertSale(Division division);// throws dataAcception;
	void upddateSale(Division division);// throws dataAcception;
	Division getSale(int saleNo);// throws dataAcception
	List<Division> getAlDivisionList();// throws dataAcception;
	List<Division> getDivisionListByUserNo(int userNo);// throws dataAcception;
	int turnDivisionOpen(int saleNo);// throws dataAcception;
	int turnDivisionClosed(int sale);// throws dataAcception; //매개변수
	List<Division> searchDivision(String title);// throws dataAcception;

}
