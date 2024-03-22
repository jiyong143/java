package kr.kh.spring.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import kr.kh.spring.model.vo.PostVO;
import kr.kh.spring.pagination.Criteria;
import kr.kh.spring.service.PostService;

@Controller
public class PostController {
	
	@Autowired
	private PostService postService;
	
	@GetMapping("/post/list")
	public String postList(Model model, Criteria cri) { 
		cri.setPerPageNum(5);
		ArrayList <PostVO> postList = postService.getPostList(cri);
		model.addAttribute("postList",postList);
		
		return "/post/list";
	}

}
