package com.ott.controller.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ott.dao.MemberDAO;
import com.ott.dto.MemberVO;


public class MemberLoginAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String userid = request.getParameter("userid");
		String pwd = request.getParameter("pwd");
		
		MemberDAO mDao = MemberDAO.getInstance();
		String url = "index.jsp";
		
		//-1 : 비밀번호가 틀림" 0 :아이디가 틀림 1 : 로그인성공
		int result = mDao.userCheck(userid,pwd);
		MemberVO mVo = mDao.getMember(userid);
		HttpSession session = request.getSession();
		
		if(result == 1) {
			session.setAttribute("member",mVo);
			session.setAttribute("userId", mVo.getUserId());
			request.setAttribute("message","로그인 성공");
		}else if(result == 0) {
			request.setAttribute("message","존재하지않는 ID");
		}else if(result == -1) {
			request.setAttribute("message","비밀번호가 다릅니다.");
		}
		
		response.sendRedirect(url);
		
		}
}
