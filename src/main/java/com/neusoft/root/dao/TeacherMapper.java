package com.neusoft.root.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import com.mysql.cj.protocol.Message;
import com.neusoft.root.domain.Check;
import com.neusoft.root.domain.Courseteacher;
import com.neusoft.root.domain.Coursestudent;
import com.neusoft.root.domain.Forum;
import com.neusoft.root.domain.Manageteacher;
import com.neusoft.root.domain.RawItem;
import com.neusoft.root.domain.MyLog;
import com.neusoft.root.domain.RawPaper;
import com.neusoft.root.domain.Student;
import com.neusoft.root.domain.Teacher;

@Mapper 
public interface TeacherMapper {
	//批阅试卷增删改查
	public void addCheck(Check check);
	public void deleteCheck(Check check);
	public void updateCheck(Check check);
	public List<Check> queryCheck(Check check);
	
	//对老师课程查询 
	public List<Courseteacher> queryCourseteacher(Courseteacher courseteacher);
	
	//对学生课程查询
	public List<Coursestudent> queryCoursestudent(Coursestudent coursestudent);
	
	//论坛帖子的增加删除查询
	public void addForum(Forum forum);
	public void deleteForum(Forum forum);
	public List<Forum> queryForum(Forum forum);
	
	
	//题库的增删改查
	public void addRawItem(RawItem item);
	public void deleteRawItem(RawItem item);
	public void updateRawItem(RawItem item);
	public List<RawItem> queryRawItem(RawItem item);
	
	//log
	public void addMyLog(MyLog log);
	public List<MyLog> queryMyLog(MyLog log);
	
	//对消息进行增删查操作
	public void addMessage(Message message);
	public void deleteMessage(Message message);
	public List<Message> queryMessage(Message message);
	
	//试卷的增删改查
	public void addRawPaper(RawPaper paper);
	public void deleteRawPaper(RawPaper paper);
	public void updateRawPaper(RawPaper paper);
	public List<RawPaper> queryRawPaper(RawPaper paper);
	
	//老师
	//改密码
	//查询
	public void updateTeacher(Teacher teacher);
	public List<Teacher> queryTeacher(Teacher teacher);
	public List<Student> queryStudent(Student student);
	
	//管理老师
	public List<Manageteacher> queryManageteacher(Manageteacher manageteacher);

}
