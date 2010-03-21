package cn.mop4j.core.forum.dao.impl;

import java.util.ArrayList;
import java.util.Collection;

import org.hibernate.Query;
import org.hibernate.Session;

import cn.mop4j.base.dao.HibernateBaseDao;
import cn.mop4j.core.forum.dao.IForumDAO;
import cn.mop4j.core.forum.vo.Topic;
import cn.mop4j.util.HibernateUtil;

public class HibernateForumDAO extends HibernateBaseDao implements IForumDAO {

	public HibernateForumDAO(Class clazz) {
		super(clazz);

	}

	public HibernateForumDAO() {
		super(Topic.class);
	}

	@Override
	public Collection getTop20Topics() {

		Session session = HibernateUtil.getSession();

		Query query = session.createQuery("from " + this.get_class().getName() + " vo order by vo.updated desc");
		query.setFetchSize(20);
		return query.list() == null ? new ArrayList() : query.list();
	}

	@Override
	public void createTopic(Topic topic) {
		Session session = HibernateUtil.getSession();
		session.beginTransaction();
		try {
			session.save(topic);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}

	}

}
