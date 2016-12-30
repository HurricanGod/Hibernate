package share.area;

import org.hibernate.Session;

import exceptionInfo.RunTimeExceptionLog;

public class ExceptionDispose 
{
	public void saveExceptionInfo(Session session,String info) 
	{
		
		RunTimeExceptionLog record=new RunTimeExceptionLog();
		record.setExceptionInfo(info);
		session.beginTransaction();
		session.save(record);
		session.getTransaction().commit();
		session.close();
	}
}
