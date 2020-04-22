package com.ssg.dojangfarm.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ssg.dojangfarm.Service.FarmFacade;

import comssg.dojangfarm.domain.Normal;

public class updateNormalController {
	// �̰� �´���.. �𸣰ھ�� �켱 �ẽ
		private FarmFacade farm;
		// ����� ���� ����
//		UserSession userSession = (UserSession) WebItils.getSessionAttribute(request, "userSession");
//		int userNo = farm.getAccount(userSession.getAccount().getUserNo());
//		String userName = farm.getAccount(userSession.getAccount().getUserName());

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
		@RequestMapping("/shop/Normal.do")
		public ModelAndView handleRequest(@ModelAttribute("Normal") Normal normal) throws Exception {
//			normal.setUserNo(userNo);
//			normal.setUserName(userName);

			try {
				
				farm.updateSale(normal);
				
			} catch (Exception e) {
				// ���� ó��
			}
			return new ModelAndView("Normal", "normal", normal);
		}
}
