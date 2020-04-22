package com.ssg.donjangfarm.dao;

import java.util.List;

import comssg.dojangfarm.domain.Normal;

public interface NormalDAO {
	//Normal() throws DataAccessException;
	void insertSale(Normal normal)  ;
	void upddateSale(Normal normal);
	Normal getSale(int saleNo) ;
	List<Normal> getAllNormalList();
	List<Normal> getNormalListByUserNo(int userNo);
	int turnNormalOpen(int saleNo);
	int turnNormalClosed(int sale) ;
	List<Normal> searchNormal(String title);// throws DataAccessException;
}
