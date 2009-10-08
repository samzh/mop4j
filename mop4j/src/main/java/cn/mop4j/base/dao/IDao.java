package cn.mop4j.base.dao;

import java.io.Serializable;
import java.util.List;

import com.wideplay.warp.persist.Transactional;

public interface IDao<T, PK extends Serializable> {
	
	@Transactional
	T save(T vo) throws Exception;
	
	List<T> query() throws Exception;
	
	T find(PK id) throws Exception;
	
	@Transactional
	void delete(PK id) throws Exception;

}
