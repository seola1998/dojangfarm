package com.ssg.dojangfarm.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ssg.dojangfarm.Service.FarmFacade;

import comssg.dojangfarm.domain.Common	;

public class updateCommoncontroller {
	private FarmFacade farm;
	// ����� ���� ����
//	UserSession userSession = (UserSession) WebItils.getSessionAttribute(request, "userSession");
//	int userNo = farm.getAccount(userSession.getAccount().getUserNo());
//	String userName = farm.getAccount(userSession.getAccount().getUserName());

	@Autowired
	public void setFarm(FarmFacade farm) {
		this.farm = farm;
	}

	// �� ��ְ�ü ����
	@ModelAttribute("Common")
	public Common createCommon() {
		return new Common();
	}

	// DB�� �ִ°���
	// ������ ����normal ��ü�� ������
	@RequestMapping("/shop/DivisionUpdate.do")
	public ModelAndView handleRequest(@ModelAttribute("Common") Common common) throws Exception {
//		normal.setUserNo(userNo);
//		normal.setUserName(userName);

		try {
			
			farm.updateSale(common);
		} catch (Exception e) {
			// ���� ó��
		}
		return new ModelAndView("Common", "common", common);
	}
}
