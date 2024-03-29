package cn.mop4j.util;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import cn.mop4j.core.forum.vo.Topic;
import cn.mop4j.core.user.vo.BaseUser;

public class HibernateUtil {

	private static Log log = LogFactory.getLog(HibernateUtil.class);

	private static final SessionFactory sessionFactory;

	static {
		log.info("Initializing Hibernate SesstionFactory.");
		try {
			sessionFactory = new AnnotationConfiguration()
			.addAnnotatedClass(BaseUser.class)
			.addAnnotatedClass(Topic.class)
			.configure().buildSessionFactory();
			log.info("SessionFactory Initialization Succeed");
		} catch (Throwable ex) {
			log.error("Initial SessionFactory creation failed.", ex);
			throw new ExceptionInInitializerError(ex);
		}
	}

	public static final ThreadLocal session = new ThreadLocal();

	/**
	 * 获取Hibernate Session
	 * 
	 * @return session Hibernate 当前线程
	 * @throws HibernateException
	 */
	@SuppressWarnings("unchecked")
	public static Session getSession() throws HibernateException {
		Session s = (Session) session.get();
		// Open a new Session, if this Thread has none yet
		if (s == null) {
			s = sessionFactory.openSession();
			session.set(s);
		}
		return s;
	}

	/**
	 * 关闭Hibernate Session
	 * 
	 * @throws HibernateException
	 */
	@SuppressWarnings("unchecked")
	public static void closeSession() throws HibernateException {
		Session s = (Session) session.get();
		session.set(null);
		if (s != null)
			s.close();
	}

}