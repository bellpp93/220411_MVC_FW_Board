package com.company.view.board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.company.mvc_fw_board.board.BoardDAO;
import com.company.mvc_fw_board.board.BoardDO;
import com.company.view.controller.Controller;

public class UpdateBoardController implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("게시글 수정 처리됨!");
		
		String seq = request.getParameter("seq");
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		
		BoardDO boardDO = new BoardDO();
		boardDO.setSeq(Integer.parseInt(seq));
		boardDO.setTitle(title);
		boardDO.setContent(content);
		
		BoardDAO boardDAO = new BoardDAO();
		boardDAO.updateBoard(boardDO);
		
		return "getBoardList.do";
	}
}
