package com.neusoft.root.service;

import java.util.List;


import javax.security.auth.Subject;

import com.alibaba.fastjson.JSONObject;
import com.neusoft.root.domain.ParsedPaper;
import com.neusoft.root.domain.RawPaper;
import com.neusoft.root.domain.Subjects;

public interface PaperService {
	public void addRawPaper(JSONObject json);
	public void deleteRawPaper(JSONObject json);
	public void updateRawPaper(JSONObject json);
	public List<ParsedPaper> queryRawPaper(JSONObject json);
	public List<String> queryAllCourse();
	
}
