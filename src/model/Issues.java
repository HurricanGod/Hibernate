package model;

import java.util.Date;



public class Issues 
{
	private Integer issueId;
	private String content;
	private String status;
	private Date commitTime;
	private String solution;
	
	@Override
	public String toString()
	{
		StringBuffer buf=new StringBuffer();
		buf.append("问题：").append(content).append("  问题提出时间为：").append(commitTime.toString());
		return buf.toString();
				
	}
	
	public void printf(String message) 
	{
		System.out.println(message);
	}
	public Integer getIssueId() 
	{
		return issueId;
	}
	public void setIssueId(Integer issueId) 
	{
		this.issueId = issueId;
	}
	public String getContent()
	{
		return content;
	}
	public void setContent(String content) 
	{
		this.content = content;
	}
	public String getStatus() 
	{
		return status;
	}
	public void setStatus(String status) 
	{
		this.status = status;
	}
	public Date getCommitTime() 
	{
		return commitTime;
	}
	public void setCommitTime(Date commitTime) 
	{
		this.commitTime = commitTime;
	}
	public String getSolution() 
	{
		return solution;
	}
	public void setSolution(String solution) 
	{
		this.solution = solution;
	}
	
	
}
