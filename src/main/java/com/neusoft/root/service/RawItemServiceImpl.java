package com.neusoft.root.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.neusoft.root.dao.AdminMapper;
import com.neusoft.root.dao.TeacherMapper;
import com.neusoft.root.domain.ParsedItem;
import com.neusoft.root.domain.RawItem;

@Service
public class RawItemServiceImpl implements RawItemService{

	@Autowired
	TeacherMapper mapper;
	@Override
	public List<RawItem> getRawItem(String subjects) {
		// TODO Auto-generated method stub
		List<RawItem> list = new ArrayList<>();
		RawItem rawItem = new RawItem(null, null, null, subjects, null, null, null, null, null, null, null, null);
		list =mapper.queryRawItem(rawItem);
		return list;
	}
	@Override
	public void addRawItem(JSONObject json) {
		// TODO Auto-generated method stub
		int i,j;
		Double diffcult =0.0 ;
		String option =null;
		j= json.getInteger("option_length");
		if(json.getString("difficult").equals("简单"))
		{
			diffcult = 1.0;
		}
		else if(json.getString("difficult").equals("普通"))
		{
			diffcult =3.0;
		}
		else if(json.getString("difficult").equals("困难"))
		{
			diffcult = 5.0;
		}
		for(i=1;i<=j;i++)
		{
			option = option+json.getString("key"+i+"Editor")+"###";
		}
		if(json.getString("itemType").equals("单选题"))
		{
			
			RawItem item = new RawItem((Integer)0,json.getString("createrId"),json.getString("itemDate"), json.getString("subject"), json.getString("itemType"), diffcult, json.getString("questionEditor"), option, json.getString(json.getString("answer")), null, 5.0, json.getString("analysisEditor"));
			mapper.addRawItem(item);
		}
		else if(json.getString("itemType").equals("多选题")){
			int k = 1;
			String answer =null;
			while(json.getString("answer"+k) != null){
				answer = answer+json.getString(json.getString("answer"+k))+"###";
				k++;
			}
			RawItem item = new RawItem((Integer)0,json.getString("createrId"),json.getString("itemDate"), json.getString("subject"), json.getString("itemType"), diffcult, json.getString("questionEditor"), option, answer, null, 6.0, json.getString("analysisEditor"));
			mapper.addRawItem(item);
		}
		else if(json.getString("itemType").equals("填空题"))
		{
			int k=1;
			String answer =null;
			while(json.getString("answer"+k) != null){
				answer = answer+json.getString(json.getString("answer"+k))+"###";
				k++;
			}
			RawItem item = new RawItem((Integer)0,json.getString("createrId"),json.getString("itemDate"), json.getString("subject"), json.getString("itemType"), diffcult, json.getString("questionEditor"), option, answer, null, 7.0, json.getString("analysisEditor"));
			mapper.addRawItem(item);
			
		}
		else if(json.getString("itemType").equals("问答题"))
		{
			RawItem item = new RawItem((Integer)0,json.getString("createrId"),json.getString("itemDate"), json.getString("subject"), json.getString("itemType"), diffcult, json.getString("questionEditor"), option, json.getString("answer"), null, 10.0, json.getString("analysisEditor"));
			mapper.addRawItem(item);
		}
		else {
			System.out.println("无效题目类型！！！");
			System.exit(0);
		}
		
	}
	@Override
	public void deleteRawItem(JSONObject json) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void updateRawItem(JSONObject json) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public List<ParsedItem> queryRawItem(JSONObject json) {
		// TODO Auto-generated method stub
		return null;
	}
	

	
	
}
