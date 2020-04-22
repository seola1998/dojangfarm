package com.ssg.dojangfarm.Service;

import java.util.List;


import comssg.dojangfarm.domain.CommonNotice;

import comssg.dojangfarm.domain.Normal;

public interface FarmFacade {
	
	//ComonNoticeDAO
	
	int insertCommonNotice(CommonNotice cn);// throws dataAcception;
	void updateCommonNotice(int CNNo);// throws dataAcception;
	void deleteCommonNotice(int CNNo);// throws dataAcception;
	
	//DiscountDAO
	void newDiscount(Normal normal);// throws dataAcception; //�Һа� �������Ŵ� �ش����
	void deleteDiscount(int saleNo);// throws dataAcception;
	
}
