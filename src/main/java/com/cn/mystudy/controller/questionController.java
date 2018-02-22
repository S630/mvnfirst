package com.cn.mystudy.controller;

import javax.enterprise.inject.Model;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cn.mystudy.service.IQuestService;

@RequestMapping("/question")
@Controller
public class questionController {

	/* 
	 * date:20180222
	 * author:songjk
	 * Dens: 问题相关列表
	 * 工作中遇到的问题，如果但是没有解决，则先记录下来，等到日后有时间在研究解决。
	 * t_questionsolve此表中包含为解决的问题和已解决的问题。
	 * 问题的范围：主要是Oracle，Linux方面的问题，也包括mysql、sqlserver等等。。
	 */
	@Autowired IQuestService iqService;
	
	/*
	 * 问题列表
	 */
	@RequestMapping("/questionlist")
	public void QuestionList(HttpServletRequest request,Model model){
		
	}
	
}
