package com.ldw.sqlhelper;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlSessionHelper {
	
	private SqlSessionHelper() {		
			
	}
	
	public static SqlSessionHelper getInstance(){		
		return SqlSessionHelperInit.sqlSh;
	}	

	public SqlSessionFactory getSqlSessionFactory(String confPath) throws IOException{
		InputStream is = Resources.getResourceAsStream(confPath);
		SqlSessionFactory sqlSessionFactory = null;
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
		return sqlSessionFactory;
	}
	
	private static class SqlSessionHelperInit{
		final static SqlSessionHelper sqlSh = new SqlSessionHelper();	
	}
	
}
