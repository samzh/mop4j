package cn.mop4j.core.forum.dao;

import java.util.Collection;

import cn.mop4j.core.forum.vo.Topic;

public interface IForumDAO {

	/**
	 * 获取最新的20个话题
	 * 
	 * @return
	 */
	Collection getTop20Topics();

	/**
	 * 保存新话题
	 * 
	 * @param topic
	 */
	void createTopic(Topic topic);

}
