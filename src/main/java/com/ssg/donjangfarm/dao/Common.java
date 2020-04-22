package com.ssg.donjangfarm.dao;

import java.util.List;

public interface Common {
	//Common() throws dataAcception;
	void insertSale(Common common);// throws dataAcception;
	void upddateSale(Common common);// throws dataAcception;
	Common getSale(int saleNo);// throws dataAcception
	List<Common> getAlCommonList();// throws dataAcception;
	List<Common> getCommonByUserNo(int userNo);// throws dataAcception;
	int turnCommonOpen(int saleNo);// throws dataAcception;
	int turnCommonClosed(int saleNo);// throws dataAcception; //매개변수
	List<Common> searchCommon(String title);// throws dataAcception;

}
