package cn.mop4j.base.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import cn.mop4j.base.vo.ValueObject;

public class HibernateBaseDAO extends BaseDao {

	private static SessionFactory sessionFactory = null;

	@Override
	public void delete(ValueObject vo) throws Exception {
		currentSession().delete(vo);
	}

	@Override
	public ValueObject query(String pk) throws Exception {
		return null;
	}

	@Override
	public void save(ValueObject vo) throws Exception {
		currentSession().saveOrUpdate(vo);
	}

	@Override
	public void update(ValueObject vo) throws Exception {
		currentSession().saveOrUpdate(vo);
	}

	protected static Session currentSession() throws Exception {

		Session s = getSessionFactory().getCurrentSession();

		if (s == null || !s.isOpen()) {
			s = getSessionFactory().openSession();
		}

		return s;
	}

	public static SessionFactory getSessionFactory() throws Exception {
		if (sessionFactory == null) {
			Configuration cfg = new Configuration().configure();
			sessionFactory = cfg.buildSessionFactory();
		}
		return sessionFactory;
	}

}
