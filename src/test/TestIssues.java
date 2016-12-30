package controller;

import model.Issues;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import exceptionInfo.RunTimeExceptionLog;

public class TestIssues 
{
	@Test
	public void add()
	{
		
		Session session=JDBCConnect.openSession();
		Transaction tran=session.beginTransaction();
		try {
			
			for(int i=0;i<20;i++)
			{
				Issues issues=new Issues();
				tran.begin();
				issues.setContent("2+2= "+((Integer)i).toString()+"?");
				issues.setCommitTime(new java.util.Date());
				issues.setSolution("不知道");
				issues.setStatus("未解决");
				session.save(issues);
				tran.commit();
			}
			
			
		} catch (RuntimeException e) {
			tran.rollback();
			session.close();
			System.out.println(e.getMessage());
			throw e;
		}
		
	}
	
	@Test
	public void query()
	{
		Session session=JDBCConnect.openSession();
		Transaction tran=session.beginTransaction();
		try {
			tran.begin();
			Issues issue=(Issues)session.get(Issues.class, 2);
			issue.printf(issue.toString());
			tran.commit();
			
		} catch (Exception e) {
			tran.rollback();
			RunTimeExceptionLog exceptionInfo=new RunTimeExceptionLog();
			exceptionInfo.setExceptionInfo(e.getMessage());
			tran.begin();
			session.save(exceptionInfo);
			tran.commit();
			session.close();
			throw e;
		}
		session.close();
	}
	
	@Test
	public void delete() 
	{
		Session session=JDBCConnect.openSession();
		Transaction tran=session.beginTransaction();
		try {
			Issues issues=new Issues();
			tran.begin();
			issues=(Issues)session.get(Issues.class, 20);
			session.delete(issues);
			tran.commit();
			System.out.println("成功删除记录："+issues.toString());
		} catch (RuntimeException e) {
			System.out.print(e.getMessage());
			tran.rollback();
			RunTimeExceptionLog record=new RunTimeExceptionLog();
			record.setExceptionInfo(e.getMessage());
			tran.begin();
			session.save(record);
			tran.commit();
			session.close();
			throw e;
		}
		
		session.close();
	}
}
