package com.ssg.dojangfarm.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssg.dojangfarm.dao.CommonDAO;
import com.ssg.dojangfarm.dao.CommonNoticeDAO;
import com.ssg.dojangfarm.dao.DiscountDAO;
import com.ssg.dojangfarm.dao.DivisionDAO;
import com.ssg.dojangfarm.dao.NormalDAO;

@Service

public class FarmImpl {
	@Autowired
	private NormalDAO normalDAO;
	
	@Autowired
	private DivisionDAO divisionDAO;
	
	@Autowired
	private CommonDAO commonDAO;
	
	@Autowired
	private DiscountDAO discountDAO;
	
	@Autowired
	private CommonNoticeDAO cNoticeDAO;
	
	
}
