package kr.kh.spring.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;

import kr.kh.spring.model.vo.PostVO;
import kr.kh.spring.pagination.Criteria;

public interface PostDAO { 

	
  ArrayList<PostVO> selectPostList(@Param("cri")Criteria cri)
  
  ;
}
