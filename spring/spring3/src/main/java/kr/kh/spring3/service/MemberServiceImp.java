package kr.kh.spring3.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import kr.kh.spring3.dao.MemberDAO;
import kr.kh.spring3.model.dto.LoginDTO;
import kr.kh.spring3.model.vo.MemberVO;

@Service
public class MemberServiceImp implements MemberService {
	
	@Autowired
	MemberDAO memberDao;
	
	@Autowired
	BCryptPasswordEncoder passwordEncoder;
	
	private boolean checkString(String str) {
		return str!=null && str.length()!=0;
	}

	@Override
	public int getMemberCount() {
		return memberDao.selectMemberCount(); 
	}

	@Override
	public boolean signup(MemberVO member) {
		if(member==null||
		   !checkString(member.getMe_id())||
		   !checkString(member.getMe_pw())||
		   !checkString(member.getMe_email())) {
			return false; 
		}
		
		MemberVO user = memberDao.selectMember(member.getMe_id());
		if(user!=null) {
			return false; 
		}
		
		if(member.getMe_pw()==null|| member.getMe_pw().length()==0) { 
			return false;
		}
		
		// 비밀번호 암호화
		String encodePw = passwordEncoder.encode(member.getMe_pw());
		
		member.setMe_pw(encodePw);
		
		try {
		return memberDao.insertMember(member);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return true;
	}

	@Override 
	public MemberVO login(MemberVO member) { 
		if(member==null||
		   !checkString(member.getMe_id())||
		   !checkString(member.getMe_pw())) {
			return null;
		}
		MemberVO user = memberDao.selectMember(member.getMe_id());
		
		if(user==null) {
			return null;
		}
		
		if(passwordEncoder.matches(member.getMe_pw(), user.getMe_pw())) {
			return user;
		}
		
		return null;
	}

}
