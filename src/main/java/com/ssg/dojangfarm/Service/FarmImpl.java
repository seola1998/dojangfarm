package com.ssg.dojangfarm.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.ssg.dojangfarm.dao.CommonNoticeDAO;

import comssg.dojangfarm.domain.CommonNotice;


@Service

public class FarmImpl {
	
	
	@Autowired
	private CommonNoticeDAO cNoticeDAO;
	
	
	//CommonNoticeDAO
	public int insertCommonNotice(CommonNotice cn) {
		return cNoticeDAO.insertCommonNotice(cn);
	}
	public void updateCommonNotice(CommonNotice cn) {
		cNoticeDAO.updateCommonNotice(cn);
	}
	public void deleteCommonNotice(CommonNotice cn) {
		cNoticeDAO.deleteCommonNotice(cn);
	}
	
	
	
}
