package com.ssg.dojangfarm.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ssg.dojangfarm.Service.FarmFacade;

import comssg.dojangfarm.domain.Division;


public class updateDivisionController {
	private FarmFacade farm;
	// 사용자 세션 정보
//	UserSession userSession = (UserSession) WebItils.getSessionAttribute(request, "userSession");
//	int userNo = farm.getAccount(userSession.getAccount().getUserNo());
//	String userName = farm.getAccount(userSession.getAccount().getUserName());

	@Autowired
	public void setFarm(FarmFacade farm) {
		this.farm = farm;
	}

	// 새 노멀객체 생성
	@ModelAttribute("Division")
	public Division createCommon() {
		return new Division();
	}

	// DB에 넣는과정
	// 위에서 만든normal 객체를 가져옴
	@RequestMapping("/shop/DivisionUpdate.do")
	public ModelAndView handleRequest(@ModelAttribute("Division") Division division) throws Exception {
//		normal.setUserNo(userNo);
//		normal.setUserName(userName);

		try {
			
			farm.updateSale(division);
		} catch (Exception e) {
			// 오류 처리
		}
		return new ModelAndView("Division", "division", division);
	}
}
