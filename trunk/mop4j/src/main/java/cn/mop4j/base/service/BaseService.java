package cn.mop4j.base.service;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.wideplay.warp.persist.Transactional;

public class BaseService<T, PK extends Serializable> implements IService<T, PK> {

	@Inject
	Provider<EntityManager> emp;

	private Class<T> persistentClass;

	public BaseService(Class<T> persistentClass) {
		this.persistentClass = persistentClass;
	}

	@Transactional
	public void delete(PK id) throws Exception {
		EntityManager em = emp.get();
		em.remove(em.find(this.persistentClass, id));
	}

	@Transactional
	public T save(T vo) throws Exception {
		return emp.get().merge(vo);
	}

	public T find(PK id) throws Exception {
		return emp.get().find(this.persistentClass, id);
	}

	public List<T> query() throws Exception {
		return emp.get().createQuery("from " + this.persistentClass.getSimpleName()).getResultList();
	}
}
