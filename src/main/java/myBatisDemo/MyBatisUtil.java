/**
 * 
 */
package myBatisDemo;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * @author Wonderkot
 *
 */
public class MyBatisUtil {
	private static SqlSessionFactory factory;

	 private MyBatisUtil() {
	 }

	 static
	 {
	  Reader reader = null;
	  try {
	   reader = Resources.getResourceAsReader("xml/mybatis-config.xml");	   
	  } catch (IOException e) {
	   throw new RuntimeException(e.getMessage());
	  }
	  factory = new SqlSessionFactoryBuilder().build(reader);
	 }

	 public static SqlSessionFactory getSqlSessionFactory() 
	 {
	  return factory;
	 }
}