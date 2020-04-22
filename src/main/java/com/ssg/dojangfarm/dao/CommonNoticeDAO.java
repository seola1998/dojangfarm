package com.ssg.dojangfarm.dao;

import comssg.dojangfarm.domain.CommonNotice;

public interface CommonNoticeDAO {
	int insertCommonNotice(CommonNotice cn);// throws dataAcception;
	void updateCommonNotice(int CNNo);// throws dataAcception;
	void deleteCommonNotice(int CNNo);// throws dataAcception;
}
