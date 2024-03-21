package kr.kh.spring.dao;

import org.apache.ibatis.annotations.Param;

import kr.kh.spring.model.vo.MemberVO;

public interface MemberDAO {

	int selectMemberCount();

	MemberVO selectMemberById(@Param("id")String id);

	boolean insertMember(MemberVO member);

	MemberVO selectMemberByName(@Param("name")String me_name);

	MemberVO selectMemberByEmail(@Param("email")String me_email);

	MemberVO selectMemberByPhone(@Param("phone")String me_phone); 

}
