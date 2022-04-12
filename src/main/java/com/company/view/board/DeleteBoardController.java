package com.company.view.board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.company.mvc_fw_board.board.BoardDAO;
import com.company.mvc_fw_board.board.BoardDO;
import com.company.view.controller.Controller;

public class DeleteBoardController implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("게시글 삭제 처리됨!");
		
		String seq = request.getParameter("seq");  // 삭제는 게시글 번호만 필요함!
		
		BoardDO boardDO = new BoardDO();
		boardDO.setSeq(Integer.parseInt(seq));
		
		BoardDAO boardDAO = new BoardDAO();
		boardDAO.deleteBoard(boardDO);
		
		return "getBoardList.do";
	}
}
