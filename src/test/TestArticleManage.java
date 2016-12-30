package blog.management.controller;

import java.util.*;

import org.junit.Test;

import controller.CRUDOperation;

import project.Article;

public class TestArticleManage 
{
	@Test
	public void testInsert() 
	{
		Article article=new Article();
		article.setTitle("Java中运行时异常RuntimeException和异常Exception的关系");
		article.setContent("之前过了一遍java的书籍，现在基本忘得差不多了！……");
		Set<String> comments=new HashSet<String>();
		comments.add("赞一下，楼主所言即是");
		comments.add("学习一门语言的方法是结合一个综合的应用全方面一起学习");
		comments.add("学了没有用出去是最大的失败");
		article.setComment(comments);
		new CRUDOperation().add(article);
	}
	
	@Test
	public void query() 
	{
		Article article=new Article();
		article=(Article)new CRUDOperation().query(article, 1);
		System.out.println(article.toString());
	}
}
