package com.group7.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * className:Hello
 * discriptoin:
 * author:毛宇
 * createTime:2018-11-21 19:16
 */
@RestController
public class Hello {
	@RequestMapping("/hello")
	public Object print(){
		return "hello springBoot hello springBoot!!!";
	}
}
