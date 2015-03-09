/**
 * 
 */
package myBatisDemo;

import org.apache.ibatis.session.SqlSession;

/**
 * @author Wonderkot
 *
 */
public class Action {

	public String getTitle() {
		SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory()
				.openSession();
		try {
			BooksMapper userMapper = sqlSession.getMapper(BooksMapper.class);
			return userMapper.getTitle(1);
		} finally {
			sqlSession.close();
		}
	}

}
