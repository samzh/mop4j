package cn.mop4j.core.user.service;

import javax.annotation.Resource;

import junit.framework.TestCase;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.mop4j.core.user.vo.BaseUser;

/**
 * @author Administrator
 * 
 */
public class UserServiceTest extends TestCase {

	protected void setUp() throws Exception {

		new ClassPathXmlApplicationContext("**/**/UserTestContext.xml");
		// userService = (UserService)res.getBean("userService");
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testFindByAccount() throws Exception {
		BaseUser user = userService.findByAccount("Testuser");
		System.out.println(user.getId());
		System.out.println(user.getPassword());
	}

	@Resource(name = "userService", type = UserService.class)
	private UserService userService;

	/**
	 * @return the userService
	 */
	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

}
