package com.ssg.dojangfarm.dao;

import java.util.List;

import comssg.dojangfarm.domain.Common;

public interface CommonDAO {
	//Common() throws dataAcception;
	int insertSale(Common common);// throws dataAcception;
	int updateSale(Common common);// throws dataAcception;
	Common getCommonSale(int saleNo);// throws dataAcception
	List<Common> getAllCommonList();// throws dataAcception;
	List<Common> getCommonListByUserNo(int userNo);// throws dataAcception;
	List<Common> searchCommon(String title);// throws dataAcception;

}
