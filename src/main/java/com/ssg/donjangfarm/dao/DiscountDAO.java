package com.ssg.donjangfarm.dao;

import comssg.dojangfarm.domain.Normal;

public interface DiscountDAO {
	void newDiscount(Normal normal);// throws dataAcception; //�Һа� �������Ŵ� �ش����
	void deleteDiscount(int saleNo);// throws dataAcception;

}
