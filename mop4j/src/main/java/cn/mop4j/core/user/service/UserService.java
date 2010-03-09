package cn.mop4j.core.user.service;

import cn.mop4j.base.service.IService;
import cn.mop4j.core.user.vo.BaseUser;

public interface UserService extends IService {

	public BaseUser findByAccount(String account);

}
