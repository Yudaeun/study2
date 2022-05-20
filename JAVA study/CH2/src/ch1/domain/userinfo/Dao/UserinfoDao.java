package ch1.domain.userinfo.Dao;

import ch1.domain.userinfo.Userinfo;

public interface UserinfoDao {
	void insertUserInfo(Userinfo userInfo);
	void updateUserInfo(Userinfo userInfo);
	void deleteUserInfo(Userinfo userInfo);
}
