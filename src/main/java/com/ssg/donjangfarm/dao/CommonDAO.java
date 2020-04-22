package com.ssg.donjangfarm.dao;

import java.util.List;

public interface CommonDAO {
	//Common() throws dataAcception;
	void insertSale(CommonDAO common);// throws dataAcception;
	void upddateSale(CommonDAO common);// throws dataAcception;
	CommonDAO getSale(int saleNo);// throws dataAcception
	List<CommonDAO> getAlCommonList();// throws dataAcception;
	List<CommonDAO> getCommonByUserNo(int userNo);// throws dataAcception;
	int turnCommonOpen(int saleNo);// throws dataAcception;
	int turnCommonClosed(int saleNo);// throws dataAcception; //�Ű�����
	List<CommonDAO> searchCommon(String title);// throws dataAcception;

}
