package com.neusoft.root.dao;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.javassist.expr.NewArray;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.neusoft.root.domain.Admin;
import com.neusoft.root.domain.Managestudent;
import com.neusoft.root.domain.Manageteacher;
import com.neusoft.root.domain.Student;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentMapperTestForum 
{
	@Autowired
	private StudentMapper sm;
	
	@Test
	public void testAddForum() 
	{
		
	}
	
	@Test
	public void testQueryManagestudent()
	{
		/*try 
		{
			Managestudent student = new Managestudent("", "117371", "1", "1");
			List<Managestudent> list = sm.queryManagestudent(student);
			for (Managestudent ms : list) 
			{
				System.out.println(ms);
			}
		} 
		catch (Exception e) 
		{
			System.out.println(e);
		}
		*/
	}
}
