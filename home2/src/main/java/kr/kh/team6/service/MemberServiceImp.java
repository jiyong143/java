package kr.kh.team6.service;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import kr.kh.team6.dao.MemberDAO;
import kr.kh.team6.model.dto.LoginDTO;
import kr.kh.team6.model.vo.MemberVO;

public class MemberServiceImp implements MemberService {
	
	private MemberDAO memberDao;
	InputStream inputStream;
	SqlSession session;
	
	public MemberServiceImp() {
		
		String resource = "kr/kh/team6/config/mybatis-config.xml";
		try {
			inputStream = Resources.getResourceAsStream(resource);
			SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			session = sessionFactory.openSession(true);
			memberDao = session.getMapper(MemberDAO.class);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// 아이디, 비밀번호 객체에 대응하는 회원을 가져오는 메서드 
	@Override
	public MemberVO login(LoginDTO loginDTO) {
		if(loginDTO==null||
		   loginDTO.getId()==null||
		   loginDTO.getPw()==null) {
			return null;
		}
		MemberVO member = memberDao.selectMember(loginDTO.getId());
		if(member==null) {
			return null;
		}
		if(member.getMe_pw().equals(loginDTO.getPw())) {
			return member;
		}
		
		return null;
	}

	// 회원가입 시 입력한 정보로 이루어진 객체를 문제 유무 판단해서 알려주는 메서드 
	@Override
	public boolean signup(MemberVO memberVO) {
		if(memberVO==null||
		   memberVO.getMe_id()==null||
		   memberVO.getMe_pw()==null||
		   memberVO.getMe_email()==null||
		   memberVO.getMe_name()==null||
		   memberVO.getMe_birth()==null||
		   memberVO.getMe_phone()==null||
		   memberVO.getMe_address()==null) {
		return false;
	}
		// 정규표현식 체크
		
		// 아이디, 이메일 닉네임 전화번호가 중복되면 안되게 하고싶다
		try {
		return memberDao.insertMember(memberVO); 
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}

}
}
