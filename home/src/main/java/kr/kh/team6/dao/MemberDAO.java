package kr.kh.team6.dao;

import org.apache.ibatis.annotations.Param;

import kr.kh.team6.model.vo.MemberVO;

public interface MemberDAO {

	// 문제 없다고 판단된 객체를 member 테이블에 추가하는 메서드 (성공하면 true 반환) 
	boolean insertMember(@Param("member")MemberVO member);

}
