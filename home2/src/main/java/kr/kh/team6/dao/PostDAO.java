package kr.kh.team6.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import kr.kh.team6.model.vo.PostVO;

public interface PostDAO {

	List<PostVO> selectPost(@Param("bo_num")int bo_num);

	

}
