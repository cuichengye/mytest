package com.itccy.springboot.service;

import java.util.List;
import java.util.Map;

import com.itccy.springboot.entity.Notice;

public interface NoticeService {

	/**
	 * 查询所有公告
	 */
	public List<Notice> findAll();
}
