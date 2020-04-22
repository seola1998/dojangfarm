package com.ssg.donjangfarm.dao;

import java.util.List;

import comssg.dojangfarm.domain.Division;

public interface DivisionDAO extends NormalDAO{
	//�߰�, ����, ����Ʈ, user�� ����Ʈ
	//Division() throws dataAcception;
	void insertSale(Division division);// throws dataAcception;
	void upddateSale(Division division);// throws dataAcception;
	Division getSale(int saleNo);// throws dataAcception
	List<Division> getAlDivisionList();// throws dataAcception;
	List<Division> getDivisionListByUserNo(int userNo);// throws dataAcception;
	int turnDivisionOpen(int saleNo);// throws dataAcception;
	int turnDivisionClosed(int sale);// throws dataAcception; //�Ű�����
	List<Division> searchDivision(String title);// throws dataAcception;

}
