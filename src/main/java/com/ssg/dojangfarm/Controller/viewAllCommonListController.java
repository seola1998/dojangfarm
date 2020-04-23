package com.ssg.dojangfarm.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ssg.dojangfarm.Service.SaleFacade;

import comssg.dojangfarm.domain.Common;

public class viewAllCommonListController {
	private SaleFacade sale;
	// ����� ���� ����
	
	
	UserSession userSession;
	int userNo;
	String userName;
	

	
	@Autowired
	public void setSale(SaleFacade sale) {
		this.sale = sale;
	}

	@RequestMapping("/shop/NormalView.do")
	public ModelAndView handleRequest() throws Exception {
		List<Common> allCommon = null;
		//Normal normal = null;
		try {
			allCommon = sale.getAllCommonList();
		} catch (Exception e) {
			// ���� ó��
		}
		return new ModelAndView("allCommon", "allCommon", allCommon);
	}
}
