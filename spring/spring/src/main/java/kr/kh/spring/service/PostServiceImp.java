package kr.kh.spring.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.kh.spring.dao.PostDAO;
import kr.kh.spring.model.vo.MemberVO;
import kr.kh.spring.model.vo.PostVO;
import kr.kh.spring.pagination.Criteria;

@Service
public class PostServiceImp implements PostService {

	@Autowired
	private PostDAO postDao;
	
	private boolean checkString(String str) {
		return str!=null && str.length()!=0;
	} 

	@Override
	public ArrayList<PostVO> getPostList(Criteria cri) {
		if(cri==null) {
			cri = new Criteria(1,5);
		}
		return postDao.selectPostList(cri);
	}

	@Override
	public int getPostTotalCount(Criteria cri) {
		if(cri==null) {
			cri = new Criteria(1,5);
		}
		return postDao.selectPostTotalCount(cri); 
	}

	@Override
	public boolean insertPost(PostVO post, MemberVO user) { 
		if(user==null||post==null) {
			return false;
		}
		
		if(!checkString(post.getPo_title())||
		   !checkString(post.getPo_content())) {
			return false;
		}
		String id = user.getMe_id();
		post.setPo_me_id(id);
		return postDao.insertPost(post);
		
	}
}
