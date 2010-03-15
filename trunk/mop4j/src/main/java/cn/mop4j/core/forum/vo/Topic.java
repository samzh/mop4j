package cn.mop4j.core.forum.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import cn.mop4j.base.vo.ValueObject;

@Entity
@Table(name = "M_TOPIC")
public class Topic extends ValueObject {
	
	private String title;
	
	private String content;

	
	public void setContent(String content) {
		this.content = content;
	}

	@Column(nullable = false, name="content")
	public String getContent() {
		return content;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Column(nullable = false, name="title")
	public String getTitle() {
		return title;
	}
	
	

}
