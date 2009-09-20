package cn.mop4j.base.dao;

import cn.mop4j.base.vo.ValueObject;

public abstract class BaseDao implements IDao {

	@Override
	public abstract void delete(ValueObject vo) throws Exception;

	@Override
	public abstract void save(ValueObject vo) throws Exception;

	@Override
	public abstract void update(ValueObject vo) throws Exception;

	@Override
	public abstract ValueObject query(String pk) throws Exception;

}
