package cn.mop4j.base.vo;

import java.util.Date;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class ValueObject implements IValueObject{
	
	private String id;
	
	private Date created;
	
	private Date updated;

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
	
	public Date getUpdated() {
		return updated;
	}
	
	public void setUpdated(Date updated) {
		this.updated = updated;
	}

}
