package cn.mop4j.base.dao;

import java.util.Collection;

import cn.mop4j.base.vo.ValueObject;
import cn.mop4j.util.HibernateUtil;

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
		HibernateUtil.Session().save(vo);
	}

	/**
	 * 查找单个VO
	 * 
	 * @param id
	 * @return 与ID对应的VO
	 * @throws Exceptoin
	 */
	public ValueObject find(String id) throws Exception {
		return (ValueObject) HibernateUtil.Session().load(get_class(), id);
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
	public void remove(String id) throws Exception {
		ValueObject vo = find(id);
		if (vo != null)
			HibernateUtil.Session().delete(vo);
	}

}