package com.company.view.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.company.mvc_fw_board.user.UserDAO;
import com.company.mvc_fw_board.user.UserDO;
import com.company.view.controller.Controller;

public class LoginController implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		// 1. 사용자 입력 정보 추출
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		
		// 2. Model을 이용하여 DB연동 처리
		UserDO userDO = new UserDO();
		userDO.setId(id);
		userDO.setPassword(password);
		
		UserDAO userDAO = new UserDAO();
		UserDO user = userDAO.getUser(userDO);
		
		// 3. 포워딩
		if(user != null) {
//			System.out.println("로그인 성공!!");
			return "getBoardList.do";
		} else {
//			System.out.println("로그인 실패!!");
			return "login";
		}
	}
}
