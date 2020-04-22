package com.ssg.dojangfarm.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssg.dojangfarm.dao.CommonDAO;
import com.ssg.dojangfarm.dao.CommonNoticeDAO;
import com.ssg.dojangfarm.dao.DiscountDAO;
import com.ssg.dojangfarm.dao.DivisionDAO;
import com.ssg.dojangfarm.dao.NormalDAO;

import comssg.dojangfarm.domain.Common;
import comssg.dojangfarm.domain.CommonNotice;
import comssg.dojangfarm.domain.Division;
import comssg.dojangfarm.domain.Normal;

@Service

public class FarmImpl {
	@Autowired
	private NormalDAO normalDAO;
	
	@Autowired
	private DivisionDAO divisionDAO;
	
	@Autowired
	private CommonDAO commonDAO;
	
	@Autowired
	private DiscountDAO discountDAO;
	
	@Autowired
	private CommonNoticeDAO cNoticeDAO;
	
	//NormalDAO
	public int insertSale(int userNo, Normal normal) {
		return normalDAO.insertSale(userNo, normal);
	}
	public int updateSale(Normal normal) {
		return normalDAO.updateSale(normal);
	}
	public Normal getNormalSale(int saleNo) {
		return normalDAO.getNormalSale(saleNo);
	}
	public List<Normal> getAllNormalList() {
		return normalDAO.getAllNormalList();
	}
	public List<Normal> getNormalListByUserNo(int userNo) {
		return normalDAO.getNormalListByUserNo(userNo);
	}
	public int turnSaleOpen(int saleNo) {
		return normalDAO.turnSaleOpen(saleNo);
	}
	public int turnSaleClosed(int saleNo) {
		return normalDAO.turnSaleClosed(saleNo);
	}
	public List<Normal> searchNormal(String title) {
		return normalDAO.searchNormal(title);
	}
	
	//DivisionDAO
	public int insertSale(Division division) {
		return divisionDAO.insertSale(division);
	}
	public int updateSale(Division division) {
		return divisionDAO.updateSale(division);
	}
	public Division getDivisionSale(int saleNo) {
		return divisionDAO.getDivisionSale(saleNo);
	}
	public List<Division> getAllDivisionList() {
		return divisionDAO.getAllDivisionList();
	}
	public List<Division> getDivisionListByUserNo(int userNo) {
		return divisionDAO.getDivisionListByUserNo(userNo);
	}
	public List<Division> searchDivision(String title) {
		return divisionDAO.searchDivision(title);
	}
	
	//CommonDAO
	public int insertSale(Common common) {
		return commonDAO.insertSale(common);
	}
	public int updateSale(Common common) {
		return commonDAO.updateSale(common);
	}
	public Common getCommonSale(int saleNo) {
		return commonDAO.getCommonSale(saleNo);
	}
	public List<Common> getAllCommonList() {
		return commonDAO.getAllCommonList();
	}
	public List<Common> getCommonListByUserNo(int userNo) {
		return commonDAO.getCommonListByUserNo(userNo);
	}
	public List<Common> searchCommon(String title) {
		return commonDAO.searchCommon(title);
	}
	
	//CommonNoticeDAO
	public int insertCommonNotice(CommonNotice cn) {
		return cNoticeDAO.insertCommonNotice(cn);
	}
	public void updateCommonNotice(int CNNo) {
		cNoticeDAO.updateCommonNotice(CNNo);
	}
	public void deleteCommonNotice(int CNNo) {
		cNoticeDAO.deleteCommonNotice(CNNo);
	}
	
	//DiscountDAO
	public void newDiscount(Normal normal) {
		discountDAO.newDiscount(normal);
	}
	public void deleteDiscount(int saleNo) {
		discountDAO.deleteDiscount(saleNo);
	}
	
}
