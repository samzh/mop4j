package cn.mop4j.base.vo;

import java.util.Date;

public class ValueObject {
	
	private String id;
	
	private Date created;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

}
