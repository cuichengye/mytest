package com.itccy.springboot.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itccy.springboot.dao.NoticeDao;
import com.itccy.springboot.entity.Notice;
import com.itccy.springboot.service.NoticeService;

@Service
@Transactional
public class NoticeServiceImpl implements NoticeService{
	
	@Autowired//注入
	private NoticeDao noticeDao;

	@Override
	public List<Notice> findAll() {
		
		return noticeDao.findAll();
	}
	

}
