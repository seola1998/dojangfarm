package com.ssg.dojangfarm.Service;

import java.util.List;

import com.ssg.dojangfarm.dao.CommonDAO;

import comssg.dojangfarm.domain.Common;
import comssg.dojangfarm.domain.CommonNotice;
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
	int insertSale(Division division);// throws dataAcception;
	int updateSale(Division division);// throws dataAcception;
	Division getDivisionSale(int saleNo);// throws dataAcception
	List<Division> getAllDivisionList();// throws dataAcception;
	List<Division> getDivisionListByUserNo(int userNo);// throws dataAcception;
	List<Division> searchDivision(String title);// throws dataAcception;
	
	//CommonDAO
	int insertSale(Common common);// throws dataAcception;
	int updateSale(Common common);// throws dataAcception;
	Common getCommonSale(int saleNo);// throws dataAcception
	List<Common> getAllCommonList();// throws dataAcception;
	List<Common> getCommonListByUserNo(int userNo);// throws dataAcception;
	List<Common> searchCommon(String title);// throws dataAcception;
	
	
	
	//ComonNoticeDAO
	
	int insertCommonNotice(CommonNotice cn);// throws dataAcception;
	void updateCommonNotice(int CNNo);// throws dataAcception;
	void deleteCommonNotice(int CNNo);// throws dataAcception;
	
	//DiscountDAO
	void newDiscount(Normal normal);// throws dataAcception; //�Һа� �������Ŵ� �ش����
	void deleteDiscount(int saleNo);// throws dataAcception;
	
}
