package kr.kh.spring3.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import kr.kh.spring3.model.vo.BoardVO;
import kr.kh.spring3.model.vo.CommunityVO;
import kr.kh.spring3.model.vo.MemberVO;
import kr.kh.spring3.pagination.Criteria;
import kr.kh.spring3.pagination.PageMaker;
import kr.kh.spring3.service.BoardService;
import kr.kh.spring3.service.CommunityService;
import lombok.extern.log4j.Log4j;

@Log4j
@Controller
@RequestMapping("/post")
public class BoardController { 

	@Autowired
	BoardService boardService;
	
	@Autowired
	CommunityService communityService;
	
	
	
	@GetMapping("/list")
	public String list(Model model, Criteria cri) { 
		ArrayList <BoardVO> list  = boardService.getBoardList(cri);
		int totalCount = boardService.getBoardTotalCount(cri);
		PageMaker pm = new PageMaker(3, cri, totalCount);
		model.addAttribute("pm",pm);
		model.addAttribute("title","게시글 목록");
		model.addAttribute("list",list);
		
		return "/post/list"; 
	}
	
	@GetMapping("/insert")
	public String insert(Model model) {
		
		ArrayList <CommunityVO> communityList = communityService.getCommunityList();
		model.addAttribute("communityList",communityList);
		model.addAttribute("title","게시글 등록");
		
		return "/post/insert";
	}
	
	@PostMapping("/insert")
	public String inserPost(Model model, HttpSession session, BoardVO board, MultipartFile []file) {
		MemberVO user = (MemberVO) session.getAttribute("user");
		boolean res = boardService.insertBoard(board,user,file);
		if(res) {
			model.addAttribute("msg","게시글 등록 완료");
			model.addAttribute("url","/post/list"); // 게시판 번호 전달
		}else {
			model.addAttribute("msg", "게시글 등록 실패");
			model.addAttribute("url","/post/insert");
		}
		
		return "message";
	}
}
