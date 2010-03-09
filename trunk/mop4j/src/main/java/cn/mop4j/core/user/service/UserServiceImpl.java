package cn.mop4j.core.user.service;

import cn.mop4j.base.service.BaseService;
import cn.mop4j.core.user.dao.UserDao;
import cn.mop4j.core.user.vo.BaseUser;


public class UserServiceImpl extends BaseService implements UserService {

	public UserServiceImpl(Class<BaseUser> persistentClass) {
	}
	
	public UserServiceImpl() {
	}
	
	private UserDao userDao;
	

	public BaseUser findByAccount(String account) {
		return userDao.findByAccount(account);
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public UserDao getUserDao() {
		return userDao;
	}
}
