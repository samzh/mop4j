package cn.mop4j.core.forum.service;

import java.util.Collection;

import cn.mop4j.core.forum.vo.Topic;

public interface IForumService {

	/**
	 * 返回最新更新的20个帖子
	 * 
	 * @return 20个帖子的集合
	 */
	Collection getTop20Topics();

	void createTopic(Topic topic);

}
