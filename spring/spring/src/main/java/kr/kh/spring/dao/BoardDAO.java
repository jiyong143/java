package kr.kh.spring.dao;

import java.util.ArrayList;

import kr.kh.spring.model.vo.BoardVO;

public interface BoardDAO {

	ArrayList<BoardVO> selectBoardList();

}
