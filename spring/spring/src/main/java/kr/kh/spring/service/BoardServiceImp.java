package kr.kh.spring.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.kh.spring.dao.BoardDAO;
import kr.kh.spring.model.vo.BoardVO;

@Service
public class BoardServiceImp implements BoardService {
	
	@Autowired
	private BoardDAO boardDao;

	@Override
	public ArrayList<BoardVO> getBoardList() {
		
		return boardDao.selectBoardList();
	}

}
