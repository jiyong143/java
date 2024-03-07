package kr.kh.team6.service;

import kr.kh.team6.model.vo.CommentVO;

public interface CommentService {

	boolean insertComment(CommentVO comment);

    CommentVO getContent(int cNum);

	boolean updateComment(int cNum, String content);

	
}