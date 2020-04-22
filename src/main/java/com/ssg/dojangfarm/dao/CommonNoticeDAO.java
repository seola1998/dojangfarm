package com.ssg.dojangfarm.dao;

import comssg.dojangfarm.domain.CommonNotice;

public interface CommonNoticeDAO {
	int insertCommonNotice(CommonNotice cn);// throws dataAcception;
	void updateCommonNotice(CommonNotice cn);// throws dataAcception;
	void deleteCommonNotice(CommonNotice cn);// throws dataAcception;
}
