package cn.mop4j.base.vo;

import java.util.Date;

public interface IValueObject {
	
	String getId();
	
	void setId(String id);
	
	Date getCreated();
	
	void setCreated(Date created);
	
	Date getUpdated();
	
	void setUpdated(Date updated);

}
