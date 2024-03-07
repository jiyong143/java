package kr.kh.team6.dao;

import org.apache.ibatis.annotations.Param;

import kr.kh.team6.model.vo.CommentVO;

public interface CommentDAO {

	boolean insertComment(@Param("comment")CommentVO comment);

	CommentVO selectContent(@Param("cNum")int cNum);

	boolean updateComment(@Param("cNum")int cNum, @Param("content")String content);


	
}