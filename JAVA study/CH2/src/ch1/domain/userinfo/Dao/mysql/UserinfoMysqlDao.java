package ch1.domain.userinfo.Dao.mysql;

import ch1.domain.userinfo.Userinfo;
import ch1.domain.userinfo.Dao.UserinfoDao;

public class UserinfoMysqlDao implements UserinfoDao{

	@Override
	public void insertUserInfo(Userinfo userInfo) {
		// TODO Auto-generated method stub
		System.out.println("Insert into Mysql DB userID= "+userInfo.getUserId());
		
	}

	@Override
	public void updateUserInfo(Userinfo userInfo) {
		// TODO Auto-generated method stub
		System.out.println("update into Mysql DB userID="+userInfo.getUserId());
		
	}

	@Override
	public void deleteUserInfo(Userinfo userInfo) {
		// TODO Auto-generated method stub

		System.out.println("delete into Mysql DB userID= "+userInfo.getUserId());
	}

}
