package comssg.dojangfarm.domain;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class Normal implements Serializable{
	private int saleNo;
	private String pName;
	private int price;
	private String title;
	private String userName;
	private int userNo;
	private String state;
	private String info;
	private Date RegiDate;
	
	public int getSaleNo() {
		return saleNo;
	}
	public void setSaleNo(int saleNo) {
		this.saleNo = saleNo;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getUserNo() {
		return userNo;
	}
	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public Date getRegiDate() {
		return RegiDate;
	}
	public void setRegiDate(Date regiDate) {
		RegiDate = regiDate;
	}

	
	
}
