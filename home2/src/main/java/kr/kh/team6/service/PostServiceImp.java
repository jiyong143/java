package kr.kh.team6.service;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import kr.kh.team6.dao.MemberDAO;
import kr.kh.team6.dao.PostDAO;
import kr.kh.team6.model.vo.PostVO;

public class PostServiceImp implements PostService{
	
	private PostDAO postDao;
	InputStream inputStream;
	SqlSession session;

	public PostServiceImp(){
		String resource = "kr/kh/team6/config/mybatis-config.xml";
		try {
			inputStream = Resources.getResourceAsStream(resource);
			SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			session = sessionFactory.openSession(true);
			postDao = session.getMapper(PostDAO.class);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<PostVO> getPost(int bo_num) {
		return postDao.selectPost(bo_num);
		
	}

}
