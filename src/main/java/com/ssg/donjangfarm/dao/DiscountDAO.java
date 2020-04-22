package com.ssg.donjangfarm.dao;

import comssg.dojangfarm.domain.Normal;

public interface DiscountDAO {
	void newDiscount(Normal normal);// throws dataAcception; //소분과 공동구매는 해당없음
	void deleteDiscount(int saleNo);// throws dataAcception;

}
