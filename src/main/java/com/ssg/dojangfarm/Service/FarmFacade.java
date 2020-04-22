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
	void newDiscount(Normal normal);// throws dataAcception; //소분과 공동구매는 해당없음
	void deleteDiscount(int saleNo);// throws dataAcception;
	
}
