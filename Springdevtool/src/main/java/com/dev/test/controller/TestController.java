package com.dev.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

	@RequestMapping("/test")
	@ResponseBody
	public String test()
	{
		int a=10;
		int b=20;
		int c=30;
		int d=40;
		int e=50;
		return "This is Just Dev Tool Demo "+(a+b+c+d+e);
	}
}
