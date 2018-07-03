/*
 * ListUserCount.java created on 2010-8-19 ����02:16:15 by bwl (Liu Daoru)
 */

package weibo4j;

import java.io.Serializable;

import org.w3c.dom.Element;

import weibo4j.http.Response;
import weibo4j.org.json.JSONException;
import weibo4j.org.json.JSONObject;

/**
 * List�û�ͳ�ƶ���
 * 
 * @author		bwl (������)
 */
public class ListUserCount extends WeiboResponse implements Serializable {

	/**
	 * rand serial id
	 */
	private static final long serialVersionUID = 2638697034012299545L;

	/**
	 * �û�������List��
	 */
	private int listCount;

	/**
	 * �û����ĵ�List��
	 */
	private int subscriberCount;

	/**
	 * �û������ΪList��Ա�Ĵ���
	 */
	private int listedCount;

	/**
	 * ��JSON���ؽ�������л�ΪListUserCount����Ĺ��췽��
	 * @param uid		�û�ID
	 * @param json		���json����
	 * @throws WeiboException
	 * @throws JSONException
	 */
	public ListUserCount(JSONObject json) throws WeiboException, JSONException {
		this.listCount = json.getInt("lists");
		this.subscriberCount = json.getInt("subscriptions");
		this.listedCount = json.getInt("listed");
	}

	/**
	 * ��XML���ؽ�������л�ΪListUserCount����Ĺ��췽��
	 * @param uid		�û�ID
	 * @param res		���XML����
	 * @throws WeiboException
	 */
	public ListUserCount(Response res) throws WeiboException {
		Element elem = res.asDocument().getDocumentElement();
		ensureRootNodeNameIs("count", elem);
		this.listCount = getChildInt("lists", elem);
		this.subscriberCount = getChildInt("subscriptions", elem);
		this.listedCount = getChildInt("listed", elem);
	}

	@Override
	public int hashCode() {
		return (int) (listCount * 100 + subscriberCount * 10 + listedCount);
	}

	@Override
	public boolean equals(Object obj) {
		if (null == obj) {
			return false;
		}
		if (this == obj) {
			return true;
		}
		return obj instanceof ListUserCount && ((ListUserCount) obj).hashCode() == this.hashCode();
	}

	public int getListCount() {
		return listCount;
	}

	public void setListCount(int listCount) {
		this.listCount = listCount;
	}

	public int getSubscriberCount() {
		return subscriberCount;
	}

	public void setSubscriberCount(int subscriberCount) {
		this.subscriberCount = subscriberCount;
	}

	public int getListedCount() {
		return listedCount;
	}

	public void setListedCount(int listedCount) {
		this.listedCount = listedCount;
	}

	@Override
	public String toString() {
		return "ListUserCount{listCount=" + listCount + ", subscriberCount=" + subscriberCount + ", listedCount="
				+ listedCount + '}';
	}

}
