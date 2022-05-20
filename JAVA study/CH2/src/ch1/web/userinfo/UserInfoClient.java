package ch1.web.userinfo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import ch1.domain.userinfo.Userinfo;
import ch1.domain.userinfo.Dao.UserinfoDao;
import ch1.domain.userinfo.Dao.mysql.UserinfoMysqlDao;
import ch1.domain.userinfo.Dao.oracle.UserinfoOracleDao;

public class UserInfoClient {

	public static void main(String[] args) throws IOException {
		
		
		// TODO Auto-generated method stub

		FileInputStream fis=new FileInputStream("db.properties");
		Properties prop=new Properties();
		prop.load(fis);
		
		String dbType=prop.getProperty("DBTYPE");
		
		Userinfo userInfo=new Userinfo();
		userInfo.setUserId("12345");
		userInfo.setPassword("23456");
		userInfo.setUserName("Lane");
		UserinfoDao userinfoDao=null;
		
		if(dbType.equals("ORACLE")) {
			userinfoDao=new UserinfoOracleDao();
		
			
		}
		else if(dbType.equals("MYSQL")) {
			userinfoDao=new UserinfoMysqlDao();
		}
		else {
			System.out.println("noting db error");
			return;
		}
		
		userinfoDao.insertUserInfo(userInfo);
		userinfoDao.deleteUserInfo(userInfo);
		userinfoDao.updateUserInfo(userInfo);
		
	}

}
