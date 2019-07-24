package com.neusoft.root.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.neusoft.root.domain.student;

@Controller
@RequestMapping("/register")
public class RegisterController {
	@RequestMapping(value="/checkAccount", method=RequestMethod.POST)
	@ResponseBody
	public String checkAccount(String account) {
		if(account.equals("admin")) {
			return "ok";
		}
		else{
			return "用户名被占用";
		}
	}
	@RequestMapping(value="/commitAccount", method=RequestMethod.POST)
	@ResponseBody
	public String commitAccount(@RequestBody student st) {
		System.out.print("commmitAccount" + st);
		return "ok";
	}
	
}