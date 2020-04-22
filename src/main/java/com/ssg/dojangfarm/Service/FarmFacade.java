package com.ssg.dojangfarm.Service;

import java.util.List;


import comssg.dojangfarm.domain.CommonNotice;

import comssg.dojangfarm.domain.Normal;

public interface FarmFacade {
	
	//ComonNoticeDAO
	
	int insertCommonNotice(CommonNotice cn);// throws dataAcception;
	void updateCommonNotice(CommonNotice cn);// throws dataAcception;
	void deleteCommonNotice(CommonNotice cn);// throws dataAcception;
	
	//DiscountDAO
	void newDiscount(Normal normal);// throws dataAcception; //�Һа� �������Ŵ� �ش����
	void deleteDiscount(int saleNo);// throws dataAcception;
	
}
