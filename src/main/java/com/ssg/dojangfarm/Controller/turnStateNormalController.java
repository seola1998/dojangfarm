package com.ssg.dojangfarm.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ssg.dojangfarm.Service.FarmFacade;

import comssg.dojangfarm.domain.Normal;

public class turnStateNormalController {
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
	@ModelAttribute("Normal")
	public Normal createNormal() {
		return new Normal();
	}

	// DB�� �ִ°���
	// ������ ����normal ��ü�� ������
	/**
	 * 
	 * @param normal
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/shop/myPage.do")
	public ModelAndView handleRequest(@ModelAttribute("Normal") Normal normal) throws Exception {
		// getState
		String state = farm.getState(normal.getSaleNo());
		int result = 0;
		;
		if (state == "OPEN") {
			try {

				result = farm.turnSaleClosed(normal.getSaleNo());

			} catch (Exception e) {
				// exception
			}
		} else { //state == "CLOSE"
			try  {
				result = farm.turnSaleOpen(normal.getSaleNo());
			} catch (Exception e) {
				// exception
			}
		}
		return new ModelAndView("Normal", "normal", normal);
	}
}
