package kr.kh.team6.service;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import kr.kh.team6.dao.MemberDAO;
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

	
    // 회원가입 정보를 갖는 객체의 문제 유무를 판단하는 메서드( 문제 없을시 넣어주기까지 함)
	@Override
	public boolean signup(MemberVO member) {
		if(member==null||
		   member.getMe_id()==null||
		   member.getMe_pw()==null||
		   member.getMe_email()==null||
		   member.getMe_name()==null||
		   member.getMe_birth()==null||
		   member.getMe_phone()==null||
		   member.getMe_phone()==null
		   ) {
			return false;
		}
		// 정규 표현식 체크
		
		try {
		return memberDao.insertMember(member);
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	
}
