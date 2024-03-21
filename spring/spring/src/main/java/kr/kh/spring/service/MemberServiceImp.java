package kr.kh.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.kh.spring.dao.MemberDAO;
import kr.kh.spring.model.vo.MemberVO;

@Service
public class MemberServiceImp implements MemberService {

	@Autowired
	private MemberDAO memberDao;
	
	private boolean checkString(String str) {
		return str !=null&&str.length()!=0;
	} 

	@Override
	public int testCountMember() {
		
		return memberDao.selectMemberCount();
	}

	@Override
	public MemberVO getMember(String id) {
		return memberDao.selectMemberById(id);  
	}

	MemberVO user;
	@Override
	public boolean insertMember(MemberVO member) {
		if(member==null||
		   !checkString(member.getMe_id())||
		   !checkString(member.getMe_pw())||
		   !checkString(member.getMe_email())||
		   !checkString(member.getMe_address())||
		   !checkString(member.getMe_name())||
		   !checkString(member.getMe_birth())||
		   !checkString(member.getMe_phone())) {
			return false;
		}
		
		// 아이디 중복 체크 
		user = memberDao.selectMemberById(member.getMe_id());
		if(user!=null) {
			return false;
		} 
		// 닉네임 중복 체크 
		user = memberDao.selectMemberByName(member.getMe_name());
		if(user!=null) {
			return false;
		}
		// 이메일 중복 체크 
		user = memberDao.selectMemberByEmail(member.getMe_email());
		if(user!=null) {
			return false;
		}
		// 전화번호 중복 체크 
		user = memberDao.selectMemberByPhone(member.getMe_phone());
		if(user!=null) {
			return false;
		}
		
		return memberDao.insertMember(member);
		   
	}
}
