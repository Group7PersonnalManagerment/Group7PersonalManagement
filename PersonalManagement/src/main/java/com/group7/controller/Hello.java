package com.group7.controller;

import com.group7.entity.Emp;
import com.group7.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;


@RestController
public class Hello {
	@Autowired
	private EmpService empService;

	@RequestMapping("/hello")
	public Object print(){

		return "hello springBoot hello springBoot!!!";
	}

	/**
	 * 跳转雇员列表
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/toList")
	public Object toList(Map map){
		List<Emp> list = empService.getList(map);
		return list;
	}

}
