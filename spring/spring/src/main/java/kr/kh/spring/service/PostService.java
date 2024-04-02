package kr.kh.spring.service;

import java.util.ArrayList;

import kr.kh.spring.model.vo.MemberVO;
import kr.kh.spring.model.vo.PostVO;
import kr.kh.spring.pagination.Criteria;

public interface PostService {

	ArrayList<PostVO> getPostList(Criteria cri);

	int getPostTotalCount(Criteria cri);

	boolean insertPost(PostVO post, MemberVO user);
	
	

}
