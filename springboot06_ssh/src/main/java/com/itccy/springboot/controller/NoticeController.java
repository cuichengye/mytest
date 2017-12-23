package com.itccy.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itccy.springboot.entity.Notice;
import com.itccy.springboot.service.NoticeService;

@RestController
public class NoticeController {
	
	@Autowired
	private NoticeService noticeService;
	
	/**
	 * 查询所有公告
	 */
	@GetMapping("/findAll")
	public List<Notice> findAll() {
		return noticeService.findAll();
	}

}
