package cn.mop4j.base.dao;

import java.util.Collection;
import java.util.Date;

import org.hibernate.Session;
import org.springframework.transaction.annotation.Transactional;

import cn.mop4j.base.vo.ValueObject;
import cn.mop4j.util.HibernateUtil;

@Transactional
public class HibernateBaseDao extends BaseDao {

	public HibernateBaseDao(Class clazz) {
		this._class = clazz;
	}

	private Class _class = null;

	public void set_class(Class _class) {
		this._class = _class;
	}

	public Class get_class() {
		return _class;
	}

	/**
	 * 保存VO
	 * 
	 * @throws Exception
	 */
	public void save(ValueObject vo) throws Exception {
		Session session = HibernateUtil.getSession();
		session.beginTransaction();
		try {
			vo.setCreated(new Date());
			session.saveOrUpdate(vo);

			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
	}

	/**
	 * 查找单个VO
	 * 
	 * @param id
	 * @return 与ID对应的VO
	 * @throws Exceptoin
	 */
	public ValueObject find(String id) throws Exception {
		return (ValueObject) HibernateUtil.getSession().load(get_class(), id);
	}

	/**
	 * 返回所有VO
	 * 
	 * @return
	 * @throws Exception
	 */
	public Collection<ValueObject> queryAll() throws Exception {
		return null;
	}

	/**
	 * 删除VO
	 * 
	 * @param id
	 * @throws Exception
	 */
	@Transactional
	public void remove(String id) throws Exception {
		Session session = HibernateUtil.getSession();
		session.beginTransaction();
		try {
			ValueObject vo = find(id);
			if (vo != null)
				session.delete(vo);
			
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
	}

}
