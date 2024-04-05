package kr.kh.spring3.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.kh.spring3.dao.CommunityDAO;
import kr.kh.spring3.model.vo.CommunityVO;

@Service
public class CommunityServiceImp implements CommunityService {
	
	@Autowired
	CommunityDAO communityDao;

	@Override
	public ArrayList<CommunityVO> getCommunityList() {
		
		return communityDao.selectCommunityList();
		
	}
	

}
