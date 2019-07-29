package com.neusoft.root.service;

import java.util.List;


import javax.security.auth.Subject;

import com.alibaba.fastjson.JSONObject;
import com.neusoft.root.domain.RawPaper;
import com.neusoft.root.domain.Subjects;

public interface PaperService {
	public List<RawPaper> getPaperCourse(JSONObject json);
	public void addRawPaper(RawPaper paper);
	public void deleteRawPaper(RawPaper paper);
	public void updateRawPaper(RawPaper paper);
	public List<RawPaper> queryRawPaper(RawPaper paper);
	
}
