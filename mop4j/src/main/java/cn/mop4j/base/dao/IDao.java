package cn.mop4j.base.dao;

import cn.mop4j.base.vo.ValueObject;

public interface IDao {
	
	void save(ValueObject vo) throws Exception;
	
	void update(ValueObject vo) throws Exception;
	
	ValueObject query(String pk) throws Exception;
	
	void delete(ValueObject vo) throws Exception;

}
