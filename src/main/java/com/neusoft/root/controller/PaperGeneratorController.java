package com.neusoft.root.controller;

import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.neusoft.root.domain.Item;
import com.neusoft.root.domain.Subjects;

@Controller
@RequestMapping("/exam")
public class PaperGeneratorController {
	@RequestMapping(value="/add_paper", method=RequestMethod.GET)
	@ResponseBody
	public Set<Item> paperSettings(String paper_name, String paper_type, String method) {
		return null;
	}
	@RequestMapping(value="/get_paper_subjects", method=RequestMethod.GET)
	@ResponseBody
	public String getPaperSubjects(){
		Subjects subjects = new Subjects();
		subjects.add("语文");
		subjects.add("数学");
		subjects.add("英语");
		Gson gson = new Gson();
		return gson.toJson(subjects);
	}
}
