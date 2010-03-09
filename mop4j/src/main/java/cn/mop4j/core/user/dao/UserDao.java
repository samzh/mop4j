/**
 * 
 */
package cn.mop4j.core.user.dao;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Query;
import org.hibernate.Session;

import cn.mop4j.base.dao.HibernateBaseDao;
import cn.mop4j.core.user.vo.BaseUser;
import cn.mop4j.util.HibernateUtil;

/**
 * @author Sam
 * 
 */
public class UserDao extends HibernateBaseDao {
	
	public static Log log = LogFactory.getLog(UserDao.class);

	/**
	 * @param clazz
	 */
	public UserDao(Class clazz) {
		super(clazz);
	}

	public UserDao() {
		super(BaseUser.class);
	}

	/**
	 * 根据帐号查找用户
	 * 
	 * @param account
	 *            用户的帐号，帐号字段是唯一的
	 * @return
	 */
	public BaseUser findByAccount(String account) {
		try {
			Session session = HibernateUtil.getSession();
			Query query = session.createQuery("from " + BaseUser.class.getName() + " u where u.account=?");
			query.setString(0, account);
			return (BaseUser) query.uniqueResult();
		} catch (Exception e) {
			e.printStackTrace();
			log.error("查找用户时出错");
			return null;
		}

	}

}
