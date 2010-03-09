/**
 * 
 */
package cn.mop4j.base.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author Administrator
 * 
 */
public class BaseAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1268857716512544533L;
	
	private String account;

	public void setAccount(String account) {
		this.account = account;
	}

	public String getAccount() {
		return account;
	}
	
	public String doBegin() {
		return SUCCESS;
	}
	
	

}
