package exceptionInfo;

import java.text.DateFormat;
import java.util.Date;

public class RunTimeExceptionLog 
{
	private Integer id;
	private String exceptionInfo;
	private String time;
	private String type;
	
	public RunTimeExceptionLog()
	{
		time=DateFormat.getDateTimeInstance().format(new Date());
		
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getExceptionInfo() {
		return exceptionInfo;
	}
	public void setExceptionInfo(String exceptionInfo) {
		this.exceptionInfo = exceptionInfo;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	

}
