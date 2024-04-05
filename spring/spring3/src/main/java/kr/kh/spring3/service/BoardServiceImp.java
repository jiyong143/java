package kr.kh.spring3.service;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import kr.kh.spring3.dao.BoardDAO;
import kr.kh.spring3.model.vo.BoardVO;
import kr.kh.spring3.model.vo.FileVO;
import kr.kh.spring3.model.vo.MemberVO;
import kr.kh.spring3.pagination.Criteria;
import kr.kh.spring3.utils.UploadFileUtils;
import lombok.extern.log4j.Log4j;

@Log4j 
@Service
public class BoardServiceImp implements BoardService {

	@Autowired
	BoardDAO boardDao;
	
	@Resource 
	private String uploadPath;
	
	private boolean checkString(String str) {
		return str!=null && str.length()!=0;
	}
	
	private void uploadFile(int bo_num, MultipartFile file) {
		
		try {
			String originalFileName = file.getOriginalFilename();
			// 선택하지 않은 파일은 파일명이 없어서 예외처리 됨
			if(originalFileName.length()==0) {
				return;
			}
			String fileName = UploadFileUtils.uploadFile(uploadPath, originalFileName ,file.getBytes());
			FileVO fileVo = new FileVO(bo_num, fileName, originalFileName);
			boardDao.insertFile(fileVo);
		}catch(Exception e) {
			e.printStackTrace();
		}
	} 

	@Override
	public ArrayList<BoardVO> getBoardList(Criteria cri) {
		if(cri==null) {
			cri = new Criteria();
		}
		return boardDao.selectBoardList(cri); 
	}

	@Override
	public int getBoardTotalCount(Criteria cri) {
		return boardDao.selectBoardTotalCount(cri);
	}
 
	@Override
	public boolean insertBoard(BoardVO board, MemberVO user, MultipartFile[] files) {
		if(user==null||
			board==null||
		   !checkString(board.getBo_title())||
		   !checkString(board.getBo_content())) {
			return false;
		}
		board.setBo_me_id(user.getMe_id());
		boolean res = boardDao.insertBoard(board); 
		// 게시글 등록 실패
		if(!res) {
			return false;
		}
		// 첨부파일 업로드 작업
		if(files==null||files.length==0) {
			return true;
		}
		// 있으면 업로드
		
		for(MultipartFile file : files) {
			uploadFile(board.getBo_num(),file);
		}
		
		return true;
		   
	}

	
}
