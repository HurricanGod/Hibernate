package controller;

import org.hibernate.Session;

import share.area.ExceptionDispose;

public class CRUDOperation 
{
	public void add(Object obj)
	{
		Session session=JDBCConnect.openSession();
		try {
			session.beginTransaction();
			session.save(obj);
			session.getTransaction().commit();
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
			session.getTransaction().rollback();
			new ExceptionDispose().saveExceptionInfo(session, e.getMessage());
			throw e;
		}finally {
			session.close();
			System.out.println("成功插入数据");
		}	
	}
	
	public void delete(Object obj)
	{
		Session session=JDBCConnect.openSession();
		try {
			session.beginTransaction();
			session.delete(obj);
			session.getTransaction().commit();
				
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
			session.getTransaction().rollback();
			new ExceptionDispose().saveExceptionInfo(session, e.getMessage());
			throw e;
		}finally {
			session.close();
			System.out.println("成功删除数据");
		}	
	}
	
	public Object query(Object obj,Integer index)
	{
		Session session=JDBCConnect.openSession();
		session.beginTransaction();
		Object queryResult=session.get(obj.getClass(), index);
		session.getTransaction().commit();
		session.close();
		System.out.println("查询完成");
		return queryResult;
	}

}
