package test.area;

import model.UserInfo;

import org.junit.Test;

import controller.CRUDOperation;

public class TestUserInfo 
{
	@Test
	public void TestInsert()
	{
		UserInfo userInfo=new UserInfo();
		userInfo.setPassword("123456");
		userInfo.getQuestions().add("世界上最好的语言是什么语言？");
		userInfo.getQuestions().add("C++中构造函数可以调用虚函数吗？");
		userInfo.getQuestions().add("C++是怎样实现多态的？");
		userInfo.getQuestions().add("C++多态实现机制，内存是怎样布局的？");
		userInfo.getQuestions().add("Tcp/Ip原理？");
		userInfo.getQuestions().add("怎样实现最小堆插入与删除？");
		userInfo.getQuestions().add("Linux操作系统的作用？");
		userInfo.getQuestions().add("Linux内存管理在哪个目录？");
		userInfo.getQuestions().add("Linux进程调度实现机制？");
		new CRUDOperation().add(userInfo);
		
	}
	
	

}
