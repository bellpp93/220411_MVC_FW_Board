package com.company.view.controller;

public class ViewResolver {
	// 멤버필드 선언
	public String prefix;  // 접두사 "./"
	public String suffix;  // 접미사 ".jsp"
	
	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}
	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}
	
	/*
	 * (예) 포워딩 할 때 => ./getBoardList.jsp
	 * 		./ => 접두사	setPrefix("./");
	 * 		getBoardList => viewName
	 * 		.jsp => 접미사   setSuffix(".jsp");
	 */
	// 사용자(개발자) 정의 메소드 구현
	public String getView(String viewName) {
		return prefix + viewName + suffix;  // "./login.jsp"
	}
}
