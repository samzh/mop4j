package cn.mop4j.core.user.service;

import cn.mop4j.base.service.BaseService;
import cn.mop4j.base.service.IService;
import cn.mop4j.core.user.vo.BaseUser;

import com.wideplay.warp.persist.dao.Finder;

public class UserServiceImpl extends BaseService<BaseUser, String> implements IService<BaseUser, String> {

	public UserServiceImpl(Class<BaseUser> persistentClass) {
	}
	
	public UserServiceImpl() {
	}

	@Finder(query = "FROM User WHERE name = :name")
	public BaseUser findUserByName(String name) {
		return null;
	}
}
