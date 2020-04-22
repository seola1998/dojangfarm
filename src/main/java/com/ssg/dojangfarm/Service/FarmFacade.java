package com.ssg.dojangfarm.Service;

import java.util.List;

import com.ssg.dojangfarm.dao.CommonDAO;

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
	List<Division> getAlDivisionList();// throws dataAcception;
	List<Division> getDivisionListByUserNo(int userNo);// throws dataAcception;
	//int turnDivisionOpen(int saleNo);// throws dataAcception;
	//int turnDivisionClosed(int saleNo);// throws dataAcception; //�Ű�����
	List<Division> searchDivision(String title);// throws dataAcception;
	
	//CommonDAO
	void insertSale(CommonDAO common);// throws dataAcception;
	void upddateSale(CommonDAO common);// throws dataAcception;
	CommonDAO getCommonSale(int saleNo);// throws dataAcception
	List<CommonDAO> getAlCommonList();// throws dataAcception;
	List<CommonDAO> getCommonByUserNo(int userNo);// throws dataAcception;
	//int turnCommonOpen(int saleNo);// throws dataAcception;
	//int turnCommonClosed(int saleNo);// throws dataAcception; //�Ű�����
	List<CommonDAO> searchCommon(String title);// throws dataAcception;

	//ComonNoticeDAO
	
	void insertCommonNotice();// throws dataAcception;
	void updateCommonNotice(int CNNo);// throws dataAcception;
	void deletecommonNotice(int CNNo);// throws dataAcception;
	
	//DiscountDAO
	void newDiscount(Normal normal);// throws dataAcception; //�Һа� �������Ŵ� �ش����
	void deleteDiscount(int saleNo);// throws dataAcception;
	
}
