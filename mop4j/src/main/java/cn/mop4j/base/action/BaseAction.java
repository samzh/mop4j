package cn.mop4j.base.action;

import java.util.Collection;

import cn.mop4j.base.vo.ValueObject;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author Sam
 * 
 */
public abstract class BaseAction extends ActionSupport implements Action {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1268857716512544533L;

	protected Collection dataList;

	protected ValueObject vo;
	
	public BaseAction (ValueObject vo) {
		this.vo = vo;
	}

	public void setDataList(Collection dataList) {
		this.dataList = dataList;
	}

	public Collection getDataList() {
		return dataList;
	}

	public void setVo(ValueObject vo) {
		this.vo = vo;
	}

	public ValueObject getVo() {
		return vo;
	}

}
