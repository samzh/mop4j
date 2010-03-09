package cn.mop4j.core.user.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import cn.mop4j.base.vo.ValueObject;

/**
 * 基本用户
 * 
 * @author Sam
 * 
 */
@Entity
@Table(name = "M_USER")
public class BaseUser extends ValueObject {

	private String account;
	
	private String nickname;

	private String password;

	@Column(nullable = false, name="account")
	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	@Column(nullable = false, name="nickname")
	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	@Column(nullable = false, name="password")
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name="email")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	private String email;

}
