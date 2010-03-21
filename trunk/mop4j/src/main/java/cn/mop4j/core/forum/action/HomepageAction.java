package cn.mop4j.core.forum.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import cn.mop4j.base.action.BaseAction;
import cn.mop4j.core.forum.service.IForumService;
import cn.mop4j.core.forum.vo.Topic;

public class HomepageAction extends BaseAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1779786653139487508L;

	public HomepageAction() {
		super(new Topic());
	}

	@Action(results = { @Result(name = "success", location = "/index.jsp"),
			@Result(name = "input", location = "/begin.htm") }, value = "homepage")
	public String doShowHomepage() {
		return SUCCESS;
	}

	/**
	 * 在论坛的左边显示帖子
	 * 
	 * @return
	 */
	@Action(results = { @Result(name = "success", location = "/topic/list.jsp"),
			@Result(name = "input", location = "/error.jsp") }, value = "/topic/list")
	public String doShowTopic() {

		this.setDataList(forumService.getTop20Topics());
		return SUCCESS;
	}

	/**
	 * 显示论坛头顶信息（我来组成头部！）
	 * 
	 * @return
	 */
	@Action(results = { @Result(name = "success", location = "/forum/top.jsp"),
			@Result(name = "input", location = "/error.jsp") }, value = "/forum/top")
	public String doShowForumTop() {
		return SUCCESS;
	}

	/**
	 * 首页打开时右边部分为欢迎信息
	 * 
	 * @return
	 */
	@Action(results = { @Result(name = "success", location = "/welcome.jsp"),
			@Result(name = "input", location = "/error.jsp") }, value = "/welcome")
	public String doShowWelcome() {
		return SUCCESS;
	}

	@Action(results = { @Result(name = "success", location = "/topic/content.jsp"),
			@Result(name = "input", location = "/error.jsp") }, value = "/new")
	public String doNew() {
		return SUCCESS;
	}

	@Action(results = { @Result(name = "success", location = "/welcome.jsp", params={"refresh", "true"}, type="redirect"),
			@Result(name = "input", location = "/topic/content.jsp") }, value = "/save")
	public String doSave() {
		Topic topic = (Topic) getVo();
		try {
			forumService.createTopic(topic);
		} catch (Exception e) {
			return INPUT;
		}
		return SUCCESS;

	}

	public void setForumService(IForumService forumService) {
		this.forumService = forumService;
	}

	public IForumService getForumService() {
		return forumService;
	}

	private IForumService forumService;

}
