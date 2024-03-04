package kr.kh.team6.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.kh.team6.model.vo.MemberVO;
import kr.kh.team6.model.vo.PostVO;
import kr.kh.team6.service.PostService;
import kr.kh.team6.service.PostServiceImp;


@WebServlet("/post/insert")
public class PostInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private PostService postService = new PostServiceImp();
   

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 세션에서 회원 정보를 가져옴(이미 로그인 상태겠지만 혹시나 추가)
		MemberVO user =(MemberVO) request.getSession().getAttribute("user");
		if(user==null) {
			request.setAttribute("msg", "로그인이 필요한 서비스입니다.");
			request.setAttribute("url", "login");
			request.getRequestDispatcher("/WEB-INF/views/message.jsp").forward(request, response);
		}else {
		
		request.getRequestDispatcher("/WEB-INF/views/board/insert.jsp").forward(request, response);
	}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String title =request.getParameter("title");
		String content = request.getParameter("content");
		// 세션에서 회원 정보 가져옴(게시글 등록 창을 넘어갈 때는 로그인 상태지만 시간이 많이 지난 경우)
		MemberVO user =(MemberVO) request.getSession().getAttribute("user");
		if(user==null) {
			request.setAttribute("msg", "로그인이 필요한 서비스입니다.");
			request.setAttribute("url", "post/list");
			request.getRequestDispatcher("/WEB-INF/views/message.jsp").forward(request, response);
			return;
		}
		// 게시글 쓰는 게시판 번호 가져오는 역할 있어야 함( 일단은 1번)
		int bo_num=1;
		String writer = user.getMe_id();
		PostVO post = new PostVO(title,content,bo_num,writer);
		if(postService.insertPost(post)) {
			request.setAttribute("msg", "게시글을 등록했습니다.");
		}else {
			request.setAttribute("msg", "게시글을 등록하지 못했습니다.");
		}
		request.setAttribute("url", "post/list");
		request.getRequestDispatcher("/WEB-INF/views/message.jsp").forward(request, response);
	}
}
		
		
		
		

