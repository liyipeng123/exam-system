﻿package com.neusoft.root.dao;

import java.util.List;
import java.util.Map;

import com.mysql.cj.protocol.Message;
import com.neusoft.root.domain.Check;
import com.neusoft.root.domain.Class1;
import com.neusoft.root.domain.Course;
import com.neusoft.root.domain.Courseteacher;
import com.neusoft.root.domain.Coursetudent;
import com.neusoft.root.domain.Forum;
import com.neusoft.root.domain.RawItem;
import com.neusoft.root.domain.Log;
import com.neusoft.root.domain.RawPaper;
import com.neusoft.root.domain.Teacher;

public interface TeacherMapper {
	//批阅试卷增删改查
	public void addCheck(Check check);
	public void deleteCheck(Check check);
	public void updateCheck(Map<String, Object> check);
	public List<Check> queryCheck(Check check);
	
	//对班级信息进行查询
	public List<Class1> queryClass(Class1 class1);
	
	//对课程进行查询
	public List<Course> queryCourse(Course course);
	
	//对老师课程查询
	public List<Courseteacher> queryCourseteacher(Courseteacher courseteacher);
	
	//对学生课程查询
	public List<Coursetudent> queryCoursestudent(Coursetudent coursetudent);
	
	//论坛帖子的增加删除查询
	public void addForum(Forum forum);
	public void deleteForum(Forum forum);
	public List<Forum> queryForum(Forum forum);
	
	//题库的增删改查
	public void addItem(RawItem item);
	public void deleteItem(RawItem item);
	public void updateItem(Map<String,Object> item);
	public List<RawItem> queryItem(RawItem item);
	
	//log
	public void  addLog(Log log);
	public List<Log> queryLog(Log log);
	
	//对消息进行增删查操作
	public void addMessage(Message message);
	public void deleteMessage(Message message);
	public List<Message> queryMessage(Message message);
	
	//试卷的增删改查
	public void addPaper(RawPaper paper);
	public void deletePaper(RawPaper paper);
	public void updatePaper(Map<String,Object> paper);
	public List<RawPaper> queryPaper(RawPaper paper);
	
	//老师
	//改密码
	public void updateTeacherPassword(Teacher teacher);
	public List<Teacher> queryteacher(Teacher teacher);
}
