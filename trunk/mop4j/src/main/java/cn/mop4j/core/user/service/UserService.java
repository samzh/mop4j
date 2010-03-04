package cn.mop4j.core.user.service;

import java.io.Serializable;

import cn.mop4j.base.service.IService;

public interface UserService<T, PK extends Serializable> extends IService<T, PK> {

	T findUserByName(String name);

}
