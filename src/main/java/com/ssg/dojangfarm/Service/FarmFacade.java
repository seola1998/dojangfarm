package com.ssg.dojangfarm.Service;

import java.util.List;

import com.ssg.dojangfarm.dao.CommonDAO;

import comssg.dojangfarm.domain.Common;
import comssg.dojangfarm.domain.Division;
import comssg.dojangfarm.domain.Normal;

public interface FarmFacade {
	//NormalDAO
	int insertSale(int userNo, Normal normal);
	int updateSale(Normal normal);
	Normal getNormalSale(int saleNo) ;
	List<Normal> getAllNormalList();
	List<Normal> getNormalListByUserNo(int userNo);
	int turnSaleOpen(int saleNo);
	int turnSaleClosed(int saleNo) ;
	List<Normal> searchNormal(String title);// throws DataAccessException;
	//add
	String getState(int saleNo);
	
	//DivisionDAO
	void insertSale(Division division);// throws dataAcception;
	void upddateSale(Division division);// throws dataAcception;
	Division getDivisionSale(int saleNo);// throws dataAcception
	List<Division> getAllDivisionList();// throws dataAcception;
	List<Division> getDivisionListByUserNo(int userNo);// throws dataAcception;
	List<Division> searchDivision(String title);// throws dataAcception;
	
	//CommonDAO
	void insertSale(CommonDAO common);// throws dataAcception;
	void upddateSale(CommonDAO common);// throws dataAcception;
	Common getCommonSale(int saleNo);// throws dataAcception
	List<Common> getAllCommonList();// throws dataAcception;
	List<Common> getCommonListByUserNo(int userNo);// throws dataAcception;
	List<Common> searchCommon(String title);// throws dataAcception;
	
	
	
	//ComonNoticeDAO
	
	void insertCommonNotice();// throws dataAcception;
	void updateCommonNotice(int CNNo);// throws dataAcception;
	void deletecommonNotice(int CNNo);// throws dataAcception;
	
	//DiscountDAO
	void newDiscount(Normal normal);// throws dataAcception; //소분과 공동구매는 해당없음
	void deleteDiscount(int saleNo);// throws dataAcception;
	
}
