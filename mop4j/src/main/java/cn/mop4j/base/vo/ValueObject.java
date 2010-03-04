package cn.mop4j.base.vo;

import java.util.Date;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
/**
 * VO类超类，拥有ValueObject的基本属性
 */
public class ValueObject implements IValueObject {

	private String id;

	private Date created;

	private Date updated;

	/**
	 * 返回ID
	 * 
	 * @return id;
	 */
	public String getId() {
		return id;
	}

	/**
	 * 设置ID
	 * 
	 * @param id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * 返回创建时间
	 * 
	 * @return created 创建时间
	 */
	public Date getCreated() {
		return created;
	}

	/**
	 * 设置创建时间
	 * 
	 * @param created
	 *            创建时间
	 */
	public void setCreated(Date created) {
		this.created = created;
	}

	/**
	 * 返回修改时间
	 * 
	 * @return updated 修改时间
	 */
	public Date getUpdated() {
		return updated;
	}

	/**
	 * 设置修改时间
	 * 
	 * @param updated
	 *            修改时间
	 */
	public void setUpdated(Date updated) {
		this.updated = updated;
	}

}
