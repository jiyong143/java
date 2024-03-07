package kr.kh.team6.service;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import kr.kh.team6.dao.CommentDAO;
import kr.kh.team6.model.vo.CommentVO;

public class CommentServiceImp implements CommentService {
	
	private CommentDAO commentDao;
	
	public CommentServiceImp() {
		String resource = "kr/kh/team6/config/mybatis-config.xml";

		try {
			InputStream inputStream = Resources.getResourceAsStream(resource);
			SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			SqlSession session = sessionFactory.openSession(true);
			commentDao = session.getMapper(CommentDAO.class);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public boolean insertComment(CommentVO comment) {
		
		return commentDao.insertComment(comment);
	}

	@Override
	public CommentVO getContent(int cNum) {
		if(cNum==0) { 
			return null;
		}
		return commentDao.selectContent(cNum);
	}

	@Override
	public boolean updateComment(int cNum, String content) {
		if(cNum==0||content==null) {
		return false;
	}
		return commentDao.updateComment(cNum,content); 
		
	}

	

}
