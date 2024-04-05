package kr.kh.spring3.dao;

import java.util.ArrayList;

import kr.kh.spring3.model.vo.CommunityVO;

public interface CommunityDAO {

	ArrayList<CommunityVO> selectCommunityList();

}
