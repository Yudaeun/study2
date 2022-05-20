package ch1.domain.userinfo.Dao.oracle;

import ch1.domain.userinfo.Userinfo;
import ch1.domain.userinfo.Dao.UserinfoDao;

public class UserinfoOracleDao implements UserinfoDao{

	@Override
	public void insertUserInfo(Userinfo userInfo) {
		// TODO Auto-generated method stub
		System.out.println("Insert into Oracle DB userID= "+userInfo.getUserId());
		
	}

	@Override
	public void updateUserInfo(Userinfo userInfo) {
		// TODO Auto-generated method stub

		System.out.println("update into Oracle DB userId= "+userInfo.getUserId());
	}

	@Override
	public void deleteUserInfo(Userinfo userInfo) {
		// TODO Auto-generated method stub

		System.out.println("delete into Oracle DB userID= "+userInfo.getUserId());
	}

}
