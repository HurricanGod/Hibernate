package model;

import java.util.LinkedList;
import java.util.List;

public class UserInfo 
{
	private String account;
	private String password;
	private String pwdkey;
	private String role;
	private List<String>questions;
	
	
	public UserInfo() 
	{
		this.pwdkey="***********";
		this.role="普通用户";
		this.questions=new LinkedList<String>();
	}
	
	public String getQuestionString() 
	{
		StringBuffer buffer=new StringBuffer();
		for (int i = 0; i < questions.size(); i++) 
		{
			buffer.append("问题：").append(questions.get(i)).append("\n");
		}
		return buffer.toString();
	}
	public void setQuestions(List<String> questions) {
		this.questions = questions;
	}
	
	
	public List<String> getQuestions() {
		return questions;
	}

	@Override
	public String toString() 
	{
		return account+"\t"+role+"\n"+getQuestionString();
	}
	public String getAccount() 
	{
		return account;
	}
	
	public void setAccount(String account) 
	{
		this.account = account;
	}
	
	public String getPassword() 
	{
		return password;
	}
	
	public void setPassword(String password) 
	{
		this.password = password;
	}
	
	public String getPwdkey() 
	{
		return pwdkey;
	}
	
	public void setPwdkey(String pwdkey)
	{
		this.pwdkey = pwdkey;
	}
	
	public String getRole() 
	{
		return role;
	}
	public void setRole(String role)
	{
		this.role = role;
	}
	
	

}
