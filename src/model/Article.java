package project;

import java.util.Date;
import java.util.Set;

public class Article 
{
	private Integer serialNumber;
	private String title;
	private String content;
	private String category;
	private Integer readNumber;
	private Date publishTime;
	private String authority;
	private Set<String> comment;
	
	@Override
	public String toString() 
	{
		StringBuffer buffer=new StringBuffer();
		buffer.append("文章序号为：").append(serialNumber.toString())
		.append("\n标题为：").append(title)
		.append("\n发布时间为").append(publishTime.toString());
		return buffer.toString();
	}
	
	public Article() 
	{
		this.publishTime=new Date();
		this.authority="允许评论";
		this.category="原创";
		this.readNumber=0;
	}
	
	
	public Integer getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(Integer serialNumber) {
		this.serialNumber = serialNumber;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Integer getReadNumber() {
		return readNumber;
	}
	public void setReadNumber(Integer readNumber) {
		this.readNumber = readNumber;
	}
	public Date getPublishTime() {
		return publishTime;
	}
	public void setPublishTime(Date publishTime) {
		this.publishTime = publishTime;
	}
	public String getAuthority() {
		return authority;
	}
	public void setAuthority(String authority) {
		this.authority = authority;
	}
	public Set<String> getComment() {
		return comment;
	}
	public void setComment(Set<String> comment) {
		this.comment = comment;
	}
	

}
