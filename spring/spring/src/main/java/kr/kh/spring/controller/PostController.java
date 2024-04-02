package kr.kh.spring.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.kh.spring.model.vo.BoardVO;
import kr.kh.spring.model.vo.MemberVO;
import kr.kh.spring.model.vo.PostVO;
import kr.kh.spring.pagination.Criteria;
import kr.kh.spring.pagination.PageMaker;
import kr.kh.spring.service.BoardService;
import kr.kh.spring.service.PostService;

@Controller
public class PostController {
	
	@Autowired
	private PostService postService;
	
	@Autowired
	private BoardService boardService;
	
	@GetMapping("/post/list")
	public String postList(Model model, Criteria cri) { 
		cri.setPerPageNum(5);
		ArrayList <PostVO> postList = postService.getPostList(cri); 
		int totalCount = postService.getPostTotalCount(cri);
		PageMaker pm = new PageMaker(3,cri,totalCount);
		model.addAttribute("postList",postList);
		model.addAttribute("pm",pm);
		
		return "/post/list";
	}
	
	/*@ResponseBody
	@GetMapping("/api/post/list")
	public Map<String, Object>apiPostList(){
		HashMap<String,Object> map = new HashMap<String,Object>();
		ArrayList<PostVO>list = postService.getPostList(new Criteria());
	}*/
	
	@GetMapping("/post/insert")
	public String postInsert(Model model) {
		// 게시판 리스트를 가져와서 화면에 전달
		ArrayList <BoardVO> boardList = boardService.getBoardList();
		model.addAttribute("boardList", boardList);
		return "/post/insert";
	}
	
	@PostMapping("/post/insert")
	public String postInsertPost(Model model, PostVO post, HttpServletRequest request) {
		MemberVO user = (MemberVO)request.getSession().getAttribute("user");
		if(postService.insertPost(post,user)) {
			model.addAttribute("msg","게시글이 등록됐습니다.");
			model.addAttribute("url","/post/list");
		}else {
			model.addAttribute("msg","게시글 등록이 실패했습니다.");
			model.addAttribute("url","/post/insert");
		}
		return "message";
	}
	


}
