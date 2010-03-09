/**
 * 
 */
package cn.mop4j.core.user.dao;

import java.util.Date;

import junit.framework.TestCase;
import cn.mop4j.core.user.vo.BaseUser;

/**
 * @author Sam
 * 
 */
public class UserDaoTest extends TestCase {
	public void testSave() {
		try {
			UserDao userDao = new UserDao();

			BaseUser user = new BaseUser();
			user.setAccount("TestUser3");
			user.setPassword("111111");
			user.setCreated(new Date());
			user.setUpdated(new Date());
			user.setNickname("UserTest");
			user.setEmail("@@@");
			userDao.save(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void testFindByAccount() {
		UserDao userDao = new UserDao();
		BaseUser user = userDao.findByAccount("TestUser");
		if (user != null) {
			System.out.println(user.getId());
		} else {
			System.out.println("No such User");
		}
	}
	
	public void testFind() throws Exception {
		UserDao userDao = new UserDao();
		BaseUser user = (BaseUser)userDao.find("40285ce52731f7e9012731f7ec2e0001");
		if (user != null) {
			System.out.println(user.getAccount());
		}
	}
	
	public void testDelete() throws Exception {
		UserDao userDao = new UserDao();
		
		BaseUser user = new BaseUser();
		user.setAccount("TestUser1");
		user.setPassword("111111");
		user.setCreated(new Date());
		user.setUpdated(new Date());
		user.setNickname("UserTest");
		user.setEmail("@@@");
		userDao.save(user);
		
		
		BaseUser oUser = userDao.findByAccount("TestUser1");
		userDao.remove(oUser.getId());
	}
}
