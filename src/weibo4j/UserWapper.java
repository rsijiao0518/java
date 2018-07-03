/*
 * UserObjectWapper.java created on 2010-7-28 ����08:48:35 by bwl (Liu Daoru)
 */

package weibo4j;

import java.io.Serializable;
import java.util.List;

/**
 * ��User�����б���еİ�װ����֧��cursor�����Ϣ����
 * @author liudaoru - daoru at sina.com.cn
 */
public class UserWapper implements Serializable {

	private static final long serialVersionUID = -3119107701303920284L;

	/**
	 * �û������б�
	 */
	private List<User> users;

	/**
	 * ��ǰ��ҳ��cursor
	 */
	private long previousCursor;

	/**
	 * ���ҳ��cursor
	 */
	private long nextCursor;

	public UserWapper(List<User> users, long previousCursor, long nextCursor) {
		this.users = users;
		this.previousCursor = previousCursor;
		this.nextCursor = nextCursor;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public long getPreviousCursor() {
		return previousCursor;
	}

	public void setPreviousCursor(long previousCursor) {
		this.previousCursor = previousCursor;
	}

	public long getNextCursor() {
		return nextCursor;
	}

	public void setNextCursor(long nextCursor) {
		this.nextCursor = nextCursor;
	}

}
