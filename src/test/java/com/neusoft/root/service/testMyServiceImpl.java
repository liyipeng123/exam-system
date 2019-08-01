package com.neusoft.root.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.alibaba.fastjson.JSONObject;
import com.neusoft.root.domain.ParsedPaper;
import com.neusoft.root.domain.RawItem;
import com.neusoft.root.domain.RawResult;
import com.neusoft.root.domain.StudentResult;

@RunWith(SpringRunner.class)
@SpringBootTest
public class testMyServiceImpl {

	@Autowired
	private MyService test;
	
	/*@Test
	public void queryPaperChecking()
	{
		JSONObject json = new JSONObject();
		json.put("studentId", 117371);
		json.put("paperId", 1);
		json.put("teacherId", 227371);
	}*/
	
	@Test
	public void queryStudentResult()
	{
		for (StudentResult sr : test.queryStudentResult(1)) 
		{
			System.out.println(sr);
		}
	}
}
