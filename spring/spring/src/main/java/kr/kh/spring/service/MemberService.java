package kr.kh.spring.service;

import kr.kh.spring.model.dto.LoginDTO;
import kr.kh.spring.model.vo.MemberVO;

public interface MemberService {

	int testCountMember();

	MemberVO getMember(String string);

	boolean insertMember(MemberVO member);

	MemberVO login(LoginDTO loginDto);

}
